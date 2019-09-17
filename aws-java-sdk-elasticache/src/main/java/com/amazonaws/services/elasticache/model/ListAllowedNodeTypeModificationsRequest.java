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
 * The input parameters for the <code>ListAllowedNodeTypeModifications</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ListAllowedNodeTypeModifications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAllowedNodeTypeModificationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to
     * identify the current node type of this cluster and from that to create a list of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group
     * id to identify the current node type being used by this replication group, and from that to create a list of node
     * types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to
     * identify the current node type of this cluster and from that to create a list of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * 
     * @param cacheClusterId
     *        The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster
     *        id to identify the current node type of this cluster and from that to create a list of node types you can
     *        scale up to.</p> <important>
     *        <p>
     *        You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>
     *        .
     *        </p>
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to
     * identify the current node type of this cluster and from that to create a list of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * 
     * @return The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the
     *         cluster id to identify the current node type of this cluster and from that to create a list of node types
     *         you can scale up to.</p> <important>
     *         <p>
     *         You must provide a value for either the <code>CacheClusterId</code> or the
     *         <code>ReplicationGroupId</code>.
     *         </p>
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster id to
     * identify the current node type of this cluster and from that to create a list of node types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * 
     * @param cacheClusterId
     *        The name of the cluster you want to scale up to a larger node instanced type. ElastiCache uses the cluster
     *        id to identify the current node type of this cluster and from that to create a list of node types you can
     *        scale up to.</p> <important>
     *        <p>
     *        You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>
     *        .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group
     * id to identify the current node type being used by this replication group, and from that to create a list of node
     * types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * 
     * @param replicationGroupId
     *        The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication
     *        group id to identify the current node type being used by this replication group, and from that to create a
     *        list of node types you can scale up to.</p> <important>
     *        <p>
     *        You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>
     *        .
     *        </p>
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group
     * id to identify the current node type being used by this replication group, and from that to create a list of node
     * types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * 
     * @return The name of the replication group want to scale up to a larger node type. ElastiCache uses the
     *         replication group id to identify the current node type being used by this replication group, and from
     *         that to create a list of node types you can scale up to.</p> <important>
     *         <p>
     *         You must provide a value for either the <code>CacheClusterId</code> or the
     *         <code>ReplicationGroupId</code>.
     *         </p>
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication group
     * id to identify the current node type being used by this replication group, and from that to create a list of node
     * types you can scale up to.
     * </p>
     * <important>
     * <p>
     * You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>.
     * </p>
     * </important>
     * 
     * @param replicationGroupId
     *        The name of the replication group want to scale up to a larger node type. ElastiCache uses the replication
     *        group id to identify the current node type being used by this replication group, and from that to create a
     *        list of node types you can scale up to.</p> <important>
     *        <p>
     *        You must provide a value for either the <code>CacheClusterId</code> or the <code>ReplicationGroupId</code>
     *        .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAllowedNodeTypeModificationsRequest == false)
            return false;
        ListAllowedNodeTypeModificationsRequest other = (ListAllowedNodeTypeModificationsRequest) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        return true;
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
    public ListAllowedNodeTypeModificationsRequest clone() {
        return (ListAllowedNodeTypeModificationsRequest) super.clone();
    }

}
