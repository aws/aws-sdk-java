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

/**
 * <p>
 * Represents an individual cache node in a snapshot of a cache cluster.
 * </p>
 */
public class NodeSnapshot implements Serializable, Cloneable {

    /**
     * The cache node identifier for the node in the source cache cluster.
     */
    private String cacheNodeId;

    /**
     * The size of the cache on the source cache node.
     */
    private String cacheSize;

    /**
     * The date and time when the cache node was created in the source cache
     * cluster.
     */
    private java.util.Date cacheNodeCreateTime;

    /**
     * The date and time when the source node's metadata and cache data set
     * was obtained for the snapshot.
     */
    private java.util.Date snapshotCreateTime;

    /**
     * The cache node identifier for the node in the source cache cluster.
     *
     * @return The cache node identifier for the node in the source cache cluster.
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }
    
    /**
     * The cache node identifier for the node in the source cache cluster.
     *
     * @param cacheNodeId The cache node identifier for the node in the source cache cluster.
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }
    
    /**
     * The cache node identifier for the node in the source cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeId The cache node identifier for the node in the source cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NodeSnapshot withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }

    /**
     * The size of the cache on the source cache node.
     *
     * @return The size of the cache on the source cache node.
     */
    public String getCacheSize() {
        return cacheSize;
    }
    
    /**
     * The size of the cache on the source cache node.
     *
     * @param cacheSize The size of the cache on the source cache node.
     */
    public void setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
    }
    
    /**
     * The size of the cache on the source cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSize The size of the cache on the source cache node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NodeSnapshot withCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }

    /**
     * The date and time when the cache node was created in the source cache
     * cluster.
     *
     * @return The date and time when the cache node was created in the source cache
     *         cluster.
     */
    public java.util.Date getCacheNodeCreateTime() {
        return cacheNodeCreateTime;
    }
    
    /**
     * The date and time when the cache node was created in the source cache
     * cluster.
     *
     * @param cacheNodeCreateTime The date and time when the cache node was created in the source cache
     *         cluster.
     */
    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }
    
    /**
     * The date and time when the cache node was created in the source cache
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeCreateTime The date and time when the cache node was created in the source cache
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NodeSnapshot withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
        return this;
    }

    /**
     * The date and time when the source node's metadata and cache data set
     * was obtained for the snapshot.
     *
     * @return The date and time when the source node's metadata and cache data set
     *         was obtained for the snapshot.
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }
    
    /**
     * The date and time when the source node's metadata and cache data set
     * was obtained for the snapshot.
     *
     * @param snapshotCreateTime The date and time when the source node's metadata and cache data set
     *         was obtained for the snapshot.
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }
    
    /**
     * The date and time when the source node's metadata and cache data set
     * was obtained for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotCreateTime The date and time when the source node's metadata and cache data set
     *         was obtained for the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NodeSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
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
        if (getCacheSize() != null) sb.append("CacheSize: " + getCacheSize() + ",");
        if (getCacheNodeCreateTime() != null) sb.append("CacheNodeCreateTime: " + getCacheNodeCreateTime() + ",");
        if (getSnapshotCreateTime() != null) sb.append("SnapshotCreateTime: " + getSnapshotCreateTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheNodeId() == null) ? 0 : getCacheNodeId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSize() == null) ? 0 : getCacheSize().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeCreateTime() == null) ? 0 : getCacheNodeCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NodeSnapshot == false) return false;
        NodeSnapshot other = (NodeSnapshot)obj;
        
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null) return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false) return false; 
        if (other.getCacheSize() == null ^ this.getCacheSize() == null) return false;
        if (other.getCacheSize() != null && other.getCacheSize().equals(this.getCacheSize()) == false) return false; 
        if (other.getCacheNodeCreateTime() == null ^ this.getCacheNodeCreateTime() == null) return false;
        if (other.getCacheNodeCreateTime() != null && other.getCacheNodeCreateTime().equals(this.getCacheNodeCreateTime()) == false) return false; 
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null) return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false) return false; 
        return true;
    }
    
    @Override
    public NodeSnapshot clone() {
        try {
            return (NodeSnapshot) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    