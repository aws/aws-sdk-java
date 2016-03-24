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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest) ListAllowedNodeTypeModifications operation}.
 * <p>
 * The <code>ListAllowedNodeTypeModifications</code> action lists all
 * available node types that you can scale your Redis cluster's or
 * replication group's current node type up to.
 * </p>
 * <p>
 * When you use the <code>ModifyCacheCluster</code> or
 * <code>ModifyReplicationGroup</code> APIs to scale up your cluster or
 * replication group, the value of the <i>CacheNodeType</i> parameter
 * must be one of the node types returned by this action.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest)
 */
public class ListAllowedNodeTypeModificationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the cache cluster you want to scale up to a larger node
     * instanced type. ElastiCache uses the cluster id to identify the
     * current node type of this cluster and from that to to create a list of
     * node types you can scale up to. <p><b>Important:</b><br/> You must
     * provide a value for either the <i>CacheClusterId</i> or the
     * <i>ReplicationGroupId</i>.
     */
    private String cacheClusterId;

    /**
     * The name of the replication group want to scale up to a larger node
     * type. ElastiCache uses the replication group id to identify the
     * current node type being used by this replication group, and from that
     * to create a list of node types you can scale up to.
     * <p><b>Important:</b><br/> You must provide a value for either the
     * <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     */
    private String replicationGroupId;

    /**
     * The name of the cache cluster you want to scale up to a larger node
     * instanced type. ElastiCache uses the cluster id to identify the
     * current node type of this cluster and from that to to create a list of
     * node types you can scale up to. <p><b>Important:</b><br/> You must
     * provide a value for either the <i>CacheClusterId</i> or the
     * <i>ReplicationGroupId</i>.
     *
     * @return The name of the cache cluster you want to scale up to a larger node
     *         instanced type. ElastiCache uses the cluster id to identify the
     *         current node type of this cluster and from that to to create a list of
     *         node types you can scale up to. <p><b>Important:</b><br/> You must
     *         provide a value for either the <i>CacheClusterId</i> or the
     *         <i>ReplicationGroupId</i>.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The name of the cache cluster you want to scale up to a larger node
     * instanced type. ElastiCache uses the cluster id to identify the
     * current node type of this cluster and from that to to create a list of
     * node types you can scale up to. <p><b>Important:</b><br/> You must
     * provide a value for either the <i>CacheClusterId</i> or the
     * <i>ReplicationGroupId</i>.
     *
     * @param cacheClusterId The name of the cache cluster you want to scale up to a larger node
     *         instanced type. ElastiCache uses the cluster id to identify the
     *         current node type of this cluster and from that to to create a list of
     *         node types you can scale up to. <p><b>Important:</b><br/> You must
     *         provide a value for either the <i>CacheClusterId</i> or the
     *         <i>ReplicationGroupId</i>.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The name of the cache cluster you want to scale up to a larger node
     * instanced type. ElastiCache uses the cluster id to identify the
     * current node type of this cluster and from that to to create a list of
     * node types you can scale up to. <p><b>Important:</b><br/> You must
     * provide a value for either the <i>CacheClusterId</i> or the
     * <i>ReplicationGroupId</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The name of the cache cluster you want to scale up to a larger node
     *         instanced type. ElastiCache uses the cluster id to identify the
     *         current node type of this cluster and from that to to create a list of
     *         node types you can scale up to. <p><b>Important:</b><br/> You must
     *         provide a value for either the <i>CacheClusterId</i> or the
     *         <i>ReplicationGroupId</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAllowedNodeTypeModificationsRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * The name of the replication group want to scale up to a larger node
     * type. ElastiCache uses the replication group id to identify the
     * current node type being used by this replication group, and from that
     * to create a list of node types you can scale up to.
     * <p><b>Important:</b><br/> You must provide a value for either the
     * <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     *
     * @return The name of the replication group want to scale up to a larger node
     *         type. ElastiCache uses the replication group id to identify the
     *         current node type being used by this replication group, and from that
     *         to create a list of node types you can scale up to.
     *         <p><b>Important:</b><br/> You must provide a value for either the
     *         <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }
    
    /**
     * The name of the replication group want to scale up to a larger node
     * type. ElastiCache uses the replication group id to identify the
     * current node type being used by this replication group, and from that
     * to create a list of node types you can scale up to.
     * <p><b>Important:</b><br/> You must provide a value for either the
     * <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     *
     * @param replicationGroupId The name of the replication group want to scale up to a larger node
     *         type. ElastiCache uses the replication group id to identify the
     *         current node type being used by this replication group, and from that
     *         to create a list of node types you can scale up to.
     *         <p><b>Important:</b><br/> You must provide a value for either the
     *         <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }
    
    /**
     * The name of the replication group want to scale up to a larger node
     * type. ElastiCache uses the replication group id to identify the
     * current node type being used by this replication group, and from that
     * to create a list of node types you can scale up to.
     * <p><b>Important:</b><br/> You must provide a value for either the
     * <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replicationGroupId The name of the replication group want to scale up to a larger node
     *         type. ElastiCache uses the replication group id to identify the
     *         current node type being used by this replication group, and from that
     *         to create a list of node types you can scale up to.
     *         <p><b>Important:</b><br/> You must provide a value for either the
     *         <i>CacheClusterId</i> or the <i>ReplicationGroupId</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAllowedNodeTypeModificationsRequest withReplicationGroupId(String replicationGroupId) {
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getReplicationGroupId() != null) sb.append("ReplicationGroupId: " + getReplicationGroupId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAllowedNodeTypeModificationsRequest == false) return false;
        ListAllowedNodeTypeModificationsRequest other = (ListAllowedNodeTypeModificationsRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null) return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false) return false; 
        return true;
    }
    
    @Override
    public ListAllowedNodeTypeModificationsRequest clone() {
        
            return (ListAllowedNodeTypeModificationsRequest) super.clone();
    }

}
    