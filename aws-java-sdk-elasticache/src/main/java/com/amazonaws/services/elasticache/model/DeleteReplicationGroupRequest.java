/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DeleteReplicationGroup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteReplicationGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     * </p>
     */
    private Boolean retainPrimaryCluster;
    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the
     * cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final
     * snapshot is taken, the replication group is immediately deleted.
     * </p>
     */
    private String finalSnapshotIdentifier;

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier for the cluster to be deleted. This parameter is not case sensitive.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     * 
     * @return The identifier for the cluster to be deleted. This parameter is not case sensitive.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier for the cluster to be deleted. This parameter is not case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     * </p>
     * 
     * @param retainPrimaryCluster
     *        If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     */

    public void setRetainPrimaryCluster(Boolean retainPrimaryCluster) {
        this.retainPrimaryCluster = retainPrimaryCluster;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     * </p>
     * 
     * @return If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     */

    public Boolean getRetainPrimaryCluster() {
        return this.retainPrimaryCluster;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     * </p>
     * 
     * @param retainPrimaryCluster
     *        If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationGroupRequest withRetainPrimaryCluster(Boolean retainPrimaryCluster) {
        setRetainPrimaryCluster(retainPrimaryCluster);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     * </p>
     * 
     * @return If set to <code>true</code>, all of the read replicas are deleted, but the primary node is retained.
     */

    public Boolean isRetainPrimaryCluster() {
        return this.retainPrimaryCluster;
    }

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the
     * cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final
     * snapshot is taken, the replication group is immediately deleted.
     * </p>
     * 
     * @param finalSnapshotIdentifier
     *        The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in
     *        the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After
     *        the final snapshot is taken, the replication group is immediately deleted.
     */

    public void setFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the
     * cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final
     * snapshot is taken, the replication group is immediately deleted.
     * </p>
     * 
     * @return The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node
     *         in the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data.
     *         After the final snapshot is taken, the replication group is immediately deleted.
     */

    public String getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in the
     * cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After the final
     * snapshot is taken, the replication group is immediately deleted.
     * </p>
     * 
     * @param finalSnapshotIdentifier
     *        The name of a final node group (shard) snapshot. ElastiCache creates the snapshot from the primary node in
     *        the cluster, rather than one of the replicas; this is to ensure that it captures the freshest data. After
     *        the final snapshot is taken, the replication group is immediately deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationGroupRequest withFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        setFinalSnapshotIdentifier(finalSnapshotIdentifier);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getRetainPrimaryCluster() != null)
            sb.append("RetainPrimaryCluster: ").append(getRetainPrimaryCluster()).append(",");
        if (getFinalSnapshotIdentifier() != null)
            sb.append("FinalSnapshotIdentifier: ").append(getFinalSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationGroupRequest == false)
            return false;
        DeleteReplicationGroupRequest other = (DeleteReplicationGroupRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getRetainPrimaryCluster() == null ^ this.getRetainPrimaryCluster() == null)
            return false;
        if (other.getRetainPrimaryCluster() != null && other.getRetainPrimaryCluster().equals(this.getRetainPrimaryCluster()) == false)
            return false;
        if (other.getFinalSnapshotIdentifier() == null ^ this.getFinalSnapshotIdentifier() == null)
            return false;
        if (other.getFinalSnapshotIdentifier() != null && other.getFinalSnapshotIdentifier().equals(this.getFinalSnapshotIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getRetainPrimaryCluster() == null) ? 0 : getRetainPrimaryCluster().hashCode());
        hashCode = prime * hashCode + ((getFinalSnapshotIdentifier() == null) ? 0 : getFinalSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationGroupRequest clone() {
        return (DeleteReplicationGroupRequest) super.clone();
    }

}
