/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents an individual cache node within a cache cluster. Each cache node runs its own instance of the cluster's
 * protocol-compliant caching software - either Memcached or Redis.
 * </p>
 * <p>
 * Valid node types are as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * General purpose:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
 * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
 * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
 * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
 * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Compute optimized: <code>cache.c1.xlarge</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Memory optimized:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
 * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Notes:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
 * </p>
 * </li>
 * <li>
 * <p>
 * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
 * supported on Redis (cluster mode enabled) T2 instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For a complete listing of node types and specifications, see <a
 * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either <a
 * href=
 * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
 * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
 * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
 * >Cache Node Type-Specific Parameters for Redis</a>.
 * </p>
 */
public class CacheNode implements Serializable, Cloneable {

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID
     * and node ID uniquely identifies every cache node used in a customer's AWS account.
     * </p>
     */
    private String cacheNodeId;
    /**
     * <p>
     * The current state of this cache node.
     * </p>
     */
    private String cacheNodeStatus;
    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     */
    private java.util.Date cacheNodeCreateTime;
    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     */
    private Endpoint endpoint;
    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     */
    private String parameterGroupStatus;
    /**
     * <p>
     * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is
     * not associated with a primary cache cluster.
     * </p>
     */
    private String sourceCacheNodeId;
    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     */
    private String customerAvailabilityZone;

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID
     * and node ID uniquely identifies every cache node used in a customer's AWS account.
     * </p>
     * 
     * @param cacheNodeId
     *        The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of
     *        cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
     */

    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID
     * and node ID uniquely identifies every cache node used in a customer's AWS account.
     * </p>
     * 
     * @return The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of
     *         cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
     */

    public String getCacheNodeId() {
        return this.cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of cluster ID
     * and node ID uniquely identifies every cache node used in a customer's AWS account.
     * </p>
     * 
     * @param cacheNodeId
     *        The cache node identifier. A node ID is a numeric identifier (0001, 0002, etc.). The combination of
     *        cluster ID and node ID uniquely identifies every cache node used in a customer's AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withCacheNodeId(String cacheNodeId) {
        setCacheNodeId(cacheNodeId);
        return this;
    }

    /**
     * <p>
     * The current state of this cache node.
     * </p>
     * 
     * @param cacheNodeStatus
     *        The current state of this cache node.
     */

    public void setCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
    }

    /**
     * <p>
     * The current state of this cache node.
     * </p>
     * 
     * @return The current state of this cache node.
     */

    public String getCacheNodeStatus() {
        return this.cacheNodeStatus;
    }

    /**
     * <p>
     * The current state of this cache node.
     * </p>
     * 
     * @param cacheNodeStatus
     *        The current state of this cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withCacheNodeStatus(String cacheNodeStatus) {
        setCacheNodeStatus(cacheNodeStatus);
        return this;
    }

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     * 
     * @param cacheNodeCreateTime
     *        The date and time when the cache node was created.
     */

    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     * 
     * @return The date and time when the cache node was created.
     */

    public java.util.Date getCacheNodeCreateTime() {
        return this.cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created.
     * </p>
     * 
     * @param cacheNodeCreateTime
     *        The date and time when the cache node was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        setCacheNodeCreateTime(cacheNodeCreateTime);
        return this;
    }

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     * 
     * @param endpoint
     *        The hostname for connecting to this cache node.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     * 
     * @return The hostname for connecting to this cache node.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The hostname for connecting to this cache node.
     * </p>
     * 
     * @param endpoint
     *        The hostname for connecting to this cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group applied to this cache node.
     */

    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     * 
     * @return The status of the parameter group applied to this cache node.
     */

    public String getParameterGroupStatus() {
        return this.parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group applied to this cache node.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group applied to this cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withParameterGroupStatus(String parameterGroupStatus) {
        setParameterGroupStatus(parameterGroupStatus);
        return this;
    }

    /**
     * <p>
     * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is
     * not associated with a primary cache cluster.
     * </p>
     * 
     * @param sourceCacheNodeId
     *        The ID of the primary node to which this read replica node is synchronized. If this field is empty, this
     *        node is not associated with a primary cache cluster.
     */

    public void setSourceCacheNodeId(String sourceCacheNodeId) {
        this.sourceCacheNodeId = sourceCacheNodeId;
    }

    /**
     * <p>
     * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is
     * not associated with a primary cache cluster.
     * </p>
     * 
     * @return The ID of the primary node to which this read replica node is synchronized. If this field is empty, this
     *         node is not associated with a primary cache cluster.
     */

    public String getSourceCacheNodeId() {
        return this.sourceCacheNodeId;
    }

    /**
     * <p>
     * The ID of the primary node to which this read replica node is synchronized. If this field is empty, this node is
     * not associated with a primary cache cluster.
     * </p>
     * 
     * @param sourceCacheNodeId
     *        The ID of the primary node to which this read replica node is synchronized. If this field is empty, this
     *        node is not associated with a primary cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withSourceCacheNodeId(String sourceCacheNodeId) {
        setSourceCacheNodeId(sourceCacheNodeId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     * 
     * @param customerAvailabilityZone
     *        The Availability Zone where this node was created and now resides.
     */

    public void setCustomerAvailabilityZone(String customerAvailabilityZone) {
        this.customerAvailabilityZone = customerAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     * 
     * @return The Availability Zone where this node was created and now resides.
     */

    public String getCustomerAvailabilityZone() {
        return this.customerAvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where this node was created and now resides.
     * </p>
     * 
     * @param customerAvailabilityZone
     *        The Availability Zone where this node was created and now resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheNode withCustomerAvailabilityZone(String customerAvailabilityZone) {
        setCustomerAvailabilityZone(customerAvailabilityZone);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheNodeId() != null)
            sb.append("CacheNodeId: " + getCacheNodeId() + ",");
        if (getCacheNodeStatus() != null)
            sb.append("CacheNodeStatus: " + getCacheNodeStatus() + ",");
        if (getCacheNodeCreateTime() != null)
            sb.append("CacheNodeCreateTime: " + getCacheNodeCreateTime() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getParameterGroupStatus() != null)
            sb.append("ParameterGroupStatus: " + getParameterGroupStatus() + ",");
        if (getSourceCacheNodeId() != null)
            sb.append("SourceCacheNodeId: " + getSourceCacheNodeId() + ",");
        if (getCustomerAvailabilityZone() != null)
            sb.append("CustomerAvailabilityZone: " + getCustomerAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheNode == false)
            return false;
        CacheNode other = (CacheNode) obj;
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getCacheNodeStatus() == null ^ this.getCacheNodeStatus() == null)
            return false;
        if (other.getCacheNodeStatus() != null && other.getCacheNodeStatus().equals(this.getCacheNodeStatus()) == false)
            return false;
        if (other.getCacheNodeCreateTime() == null ^ this.getCacheNodeCreateTime() == null)
            return false;
        if (other.getCacheNodeCreateTime() != null && other.getCacheNodeCreateTime().equals(this.getCacheNodeCreateTime()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getParameterGroupStatus() == null ^ this.getParameterGroupStatus() == null)
            return false;
        if (other.getParameterGroupStatus() != null && other.getParameterGroupStatus().equals(this.getParameterGroupStatus()) == false)
            return false;
        if (other.getSourceCacheNodeId() == null ^ this.getSourceCacheNodeId() == null)
            return false;
        if (other.getSourceCacheNodeId() != null && other.getSourceCacheNodeId().equals(this.getSourceCacheNodeId()) == false)
            return false;
        if (other.getCustomerAvailabilityZone() == null ^ this.getCustomerAvailabilityZone() == null)
            return false;
        if (other.getCustomerAvailabilityZone() != null && other.getCustomerAvailabilityZone().equals(this.getCustomerAvailabilityZone()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getCustomerAvailabilityZone() == null) ? 0 : getCustomerAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public CacheNode clone() {
        try {
            return (CacheNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
