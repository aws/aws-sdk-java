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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#deleteReplicationGroup(DeleteReplicationGroupRequest) DeleteReplicationGroup operation}.
 * <p>
 * The <i>DeleteReplicationGroup</i> operation deletes an existing replication group. <i>DeleteReplicationGroup</i> deletes the primary cache cluster and
 * all of the read replicas in the replication group. When you receive a successful response from this operation, Amazon ElastiCache immediately begins
 * deleting the entire replication group; you cannot cancel or revert this operation.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#deleteReplicationGroup(DeleteReplicationGroupRequest)
 */
public class DeleteReplicationGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier for the replication group to be deleted. This parameter
     * is not case sensitive.
     */
    private String replicationGroupId;

    /**
     * The identifier for the replication group to be deleted. This parameter
     * is not case sensitive.
     *
     * @return The identifier for the replication group to be deleted. This parameter
     *         is not case sensitive.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The identifier for the replication group to be deleted. This parameter
     * is not case sensitive.
     *
     * @param replicationGroupId The identifier for the replication group to be deleted. This parameter
     *         is not case sensitive.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The identifier for the replication group to be deleted. This parameter
     * is not case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The identifier for the replication group to be deleted. This parameter
     *         is not case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteReplicationGroupRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
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
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
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
        return true;
    }
    
}
    