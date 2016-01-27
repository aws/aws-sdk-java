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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#deleteReplicationGroup(DeleteReplicationGroupRequest) DeleteReplicationGroup operation}.
 * <p>
 * The <i>DeleteReplicationGroup</i> action deletes an existing
 * replication group. By default, this action deletes the entire
 * replication group, including the primary cluster and all of the read
 * replicas. You can optionally delete only the read replicas, while
 * retaining the primary cluster.
 * </p>
 * <p>
 * When you receive a successful response from this action, Amazon
 * ElastiCache immediately begins deleting the selected resources; you
 * cannot cancel or revert this action.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#deleteReplicationGroup(DeleteReplicationGroupRequest)
 */
public class DeleteReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier for the cluster to be deleted. This parameter is not
     * case sensitive.
     */
    private String replicationGroupId;

    /**
     * If set to <i>true</i>, all of the read replicas will be deleted, but
     * the primary node will be retained.
     */
    private Boolean retainPrimaryCluster;

    /**
     * The name of a final node group snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After
     * the final snapshot is taken, the cluster is immediately deleted.
     */
    private String finalSnapshotIdentifier;

    /**
     * The identifier for the cluster to be deleted. This parameter is not
     * case sensitive.
     *
     * @return The identifier for the cluster to be deleted. This parameter is not
     *         case sensitive.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The identifier for the cluster to be deleted. This parameter is not
     * case sensitive.
     *
     * @param replicationGroupId The identifier for the cluster to be deleted. This parameter is not
     *         case sensitive.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The identifier for the cluster to be deleted. This parameter is not
     * case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The identifier for the cluster to be deleted. This parameter is not
     *         case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * If set to <i>true</i>, all of the read replicas will be deleted, but
     * the primary node will be retained.
     *
     * @return If set to <i>true</i>, all of the read replicas will be deleted, but
     *         the primary node will be retained.
     */
    public Boolean isRetainPrimaryCluster() {
        return retainPrimaryCluster;
    }
    
    /**
     * If set to <i>true</i>, all of the read replicas will be deleted, but
     * the primary node will be retained.
     *
     * @param retainPrimaryCluster If set to <i>true</i>, all of the read replicas will be deleted, but
     *         the primary node will be retained.
     */
    public void setRetainPrimaryCluster(Boolean retainPrimaryCluster) {
        this.retainPrimaryCluster = retainPrimaryCluster;
    }
    
    /**
     * If set to <i>true</i>, all of the read replicas will be deleted, but
     * the primary node will be retained.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retainPrimaryCluster If set to <i>true</i>, all of the read replicas will be deleted, but
     *         the primary node will be retained.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteReplicationGroupRequest withRetainPrimaryCluster(Boolean retainPrimaryCluster) {
        this.retainPrimaryCluster = retainPrimaryCluster;
        return this;
    }

    /**
     * If set to <i>true</i>, all of the read replicas will be deleted, but
     * the primary node will be retained.
     *
     * @return If set to <i>true</i>, all of the read replicas will be deleted, but
     *         the primary node will be retained.
     */
    public Boolean getRetainPrimaryCluster() {
        return retainPrimaryCluster;
    }

    /**
     * The name of a final node group snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After
     * the final snapshot is taken, the cluster is immediately deleted.
     *
     * @return The name of a final node group snapshot. ElastiCache creates the
     *         snapshot from the primary node in the cluster, rather than one of the
     *         replicas; this is to ensure that it captures the freshest data. After
     *         the final snapshot is taken, the cluster is immediately deleted.
     */
    public String getFinalSnapshotIdentifier() {
        return finalSnapshotIdentifier;
    }
    
    /**
     * The name of a final node group snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After
     * the final snapshot is taken, the cluster is immediately deleted.
     *
     * @param finalSnapshotIdentifier The name of a final node group snapshot. ElastiCache creates the
     *         snapshot from the primary node in the cluster, rather than one of the
     *         replicas; this is to ensure that it captures the freshest data. After
     *         the final snapshot is taken, the cluster is immediately deleted.
     */
    public void setFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
    }
    
    /**
     * The name of a final node group snapshot. ElastiCache creates the
     * snapshot from the primary node in the cluster, rather than one of the
     * replicas; this is to ensure that it captures the freshest data. After
     * the final snapshot is taken, the cluster is immediately deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalSnapshotIdentifier The name of a final node group snapshot. ElastiCache creates the
     *         snapshot from the primary node in the cluster, rather than one of the
     *         replicas; this is to ensure that it captures the freshest data. After
     *         the final snapshot is taken, the cluster is immediately deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteReplicationGroupRequest withFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
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
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (isRetainPrimaryCluster() != null) sb.append("RetainPrimaryCluster: " + isRetainPrimaryCluster() + ",");
        if (getFinalSnapshotIdentifier() != null) sb.append("FinalSnapshotIdentifier: " + getFinalSnapshotIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        hashCode = prime * hashCode + ((isRetainPrimaryCluster() == null) ? 0 : isRetainPrimaryCluster().hashCode()); 
        hashCode = prime * hashCode + ((getFinalSnapshotIdentifier() == null) ? 0 : getFinalSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteReplicationGroupRequest == false) return false;
        DeleteReplicationGroupRequest other = (DeleteReplicationGroupRequest)obj;
        
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        if (other.isRetainPrimaryCluster() == null ^ this.isRetainPrimaryCluster() == null) return false;
        if (other.isRetainPrimaryCluster() != null && other.isRetainPrimaryCluster().equals(this.isRetainPrimaryCluster()) == false) return false; 
        if (other.getFinalSnapshotIdentifier() == null ^ this.getFinalSnapshotIdentifier() == null) return false;
        if (other.getFinalSnapshotIdentifier() != null && other.getFinalSnapshotIdentifier().equals(this.getFinalSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteReplicationGroupRequest clone() {
        
            return (DeleteReplicationGroupRequest) super.clone();
    }

}
    