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


/**
 * <p>
 * Represents an individual cache node within a cache cluster. Each cache node runs its own instance of the cluster's protocol-compliant caching software
 * - either Memcached or Redis.
 * </p>
 */
public class CacheNode implements Serializable {

    /**
     * The cache node identifier. A node ID is a numeric identifier (0001,
     * 0002, etc.). The combination of cluster ID and node ID uniquely
     * identifies every cache node used in a customer's AWS account.
     */
    private String cacheNodeId;

    /**
     * The current state of this cache node.
     */
    private String cacheNodeStatus;

    /**
     * The date and time the cache node was created.
     */
    private java.util.Date cacheNodeCreateTime;

    /**
     * The hostname and IP address for connecting to this cache node.
     */
    private Endpoint endpoint;

    /**
     * The status of the parameter group applied to this cache node.
     */
    private String parameterGroupStatus;

    /**
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, then this node is not associated
     * with a primary cache cluster.
     */
    private String sourceCacheNodeId;

    /**
     * Default constructor for a new CacheNode object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheNode() {}
    
    /**
     * The cache node identifier. A node ID is a numeric identifier (0001,
     * 0002, etc.). The combination of cluster ID and node ID uniquely
     * identifies every cache node used in a customer's AWS account.
     *
     * @return The cache node identifier. A node ID is a numeric identifier (0001,
     *         0002, etc.). The combination of cluster ID and node ID uniquely
     *         identifies every cache node used in a customer's AWS account.
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }
    
    /**
     * The cache node identifier. A node ID is a numeric identifier (0001,
     * 0002, etc.). The combination of cluster ID and node ID uniquely
     * identifies every cache node used in a customer's AWS account.
     *
     * @param cacheNodeId The cache node identifier. A node ID is a numeric identifier (0001,
     *         0002, etc.). The combination of cluster ID and node ID uniquely
     *         identifies every cache node used in a customer's AWS account.
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }
    
    /**
     * The cache node identifier. A node ID is a numeric identifier (0001,
     * 0002, etc.). The combination of cluster ID and node ID uniquely
     * identifies every cache node used in a customer's AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeId The cache node identifier. A node ID is a numeric identifier (0001,
     *         0002, etc.). The combination of cluster ID and node ID uniquely
     *         identifies every cache node used in a customer's AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNode withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * The current state of this cache node.
     *
     * @return The current state of this cache node.
     */
    public String getCacheNodeStatus() {
        return cacheNodeStatus;
    }
    
    /**
     * The current state of this cache node.
     *
     * @param cacheNodeStatus The current state of this cache node.
     */
    public void setCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
    }
    
    /**
     * The current state of this cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeStatus The current state of this cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNode withCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
        return this;
    }

    /**
     * The date and time the cache node was created.
     *
     * @return The date and time the cache node was created.
     */
    public java.util.Date getCacheNodeCreateTime() {
        return cacheNodeCreateTime;
    }
    
    /**
     * The date and time the cache node was created.
     *
     * @param cacheNodeCreateTime The date and time the cache node was created.
     */
    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }
    
    /**
     * The date and time the cache node was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeCreateTime The date and time the cache node was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNode withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
        return this;
    }

    /**
     * The hostname and IP address for connecting to this cache node.
     *
     * @return The hostname and IP address for connecting to this cache node.
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }
    
    /**
     * The hostname and IP address for connecting to this cache node.
     *
     * @param endpoint The hostname and IP address for connecting to this cache node.
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * The hostname and IP address for connecting to this cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint The hostname and IP address for connecting to this cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNode withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * The status of the parameter group applied to this cache node.
     *
     * @return The status of the parameter group applied to this cache node.
     */
    public String getParameterGroupStatus() {
        return parameterGroupStatus;
    }
    
    /**
     * The status of the parameter group applied to this cache node.
     *
     * @param parameterGroupStatus The status of the parameter group applied to this cache node.
     */
    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }
    
    /**
     * The status of the parameter group applied to this cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupStatus The status of the parameter group applied to this cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNode withParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
        return this;
    }

    /**
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, then this node is not associated
     * with a primary cache cluster.
     *
     * @return The ID of the primary node to which this read replica node is
     *         synchronized. If this field is empty, then this node is not associated
     *         with a primary cache cluster.
     */
    public String getSourceCacheNodeId() {
        return sourceCacheNodeId;
    }
    
    /**
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, then this node is not associated
     * with a primary cache cluster.
     *
     * @param sourceCacheNodeId The ID of the primary node to which this read replica node is
     *         synchronized. If this field is empty, then this node is not associated
     *         with a primary cache cluster.
     */
    public void setSourceCacheNodeId(String sourceCacheNodeId) {
        this.sourceCacheNodeId = sourceCacheNodeId;
    }
    
    /**
     * The ID of the primary node to which this read replica node is
     * synchronized. If this field is empty, then this node is not associated
     * with a primary cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceCacheNodeId The ID of the primary node to which this read replica node is
     *         synchronized. If this field is empty, then this node is not associated
     *         with a primary cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheNode withSourceCacheNodeId(String sourceCacheNodeId) {
        this.sourceCacheNodeId = sourceCacheNodeId;
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
        if (getCacheNodeId() != null) sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getCacheNodeStatus() != null) sb.append("CacheNodeStatus: " + getCacheNodeStatus() + ",");
        if (getCacheNodeCreateTime() != null) sb.append("CacheNodeCreateTime: " + getCacheNodeCreateTime() + ",");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() + ",");
        if (getParameterGroupStatus() != null) sb.append("ParameterGroupStatus: " + getParameterGroupStatus() + ",");
        if (getSourceCacheNodeId() != null) sb.append("SourceCacheNodeId: " + getSourceCacheNodeId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeStatus() == null) ? 0 : getCacheNodeStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeCreateTime() == null) ? 0 : getCacheNodeCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getParameterGroupStatus() == null) ? 0 : getParameterGroupStatus().hashCode()); 
        hashCode = prime * hashCode + ((getSourceCacheNodeId() == null) ? 0 : getSourceCacheNodeId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheNode == false) return false;
        CacheNode other = (CacheNode)obj;
        
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null) return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false) return false; 
        if (other.getCacheNodeStatus() == null ^ this.getCacheNodeStatus() == null) return false;
        if (other.getCacheNodeStatus() != null && other.getCacheNodeStatus().equals(this.getCacheNodeStatus()) == false) return false; 
        if (other.getCacheNodeCreateTime() == null ^ this.getCacheNodeCreateTime() == null) return false;
        if (other.getCacheNodeCreateTime() != null && other.getCacheNodeCreateTime().equals(this.getCacheNodeCreateTime()) == false) return false; 
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        if (other.getParameterGroupStatus() == null ^ this.getParameterGroupStatus() == null) return false;
        if (other.getParameterGroupStatus() != null && other.getParameterGroupStatus().equals(this.getParameterGroupStatus()) == false) return false; 
        if (other.getSourceCacheNodeId() == null ^ this.getSourceCacheNodeId() == null) return false;
        if (other.getSourceCacheNodeId() != null && other.getSourceCacheNodeId().equals(this.getSourceCacheNodeId()) == false) return false; 
        return true;
    }
    
}
    