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
 * Represents an individual cache node in a snapshot of a cache cluster.
 * </p>
 */
public class NodeSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The cache node identifier for the node in the source cache cluster.
     * </p>
     */
    private String cacheNodeId;
    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     */
    private String cacheSize;
    /**
     * <p>
     * The date and time when the cache node was created in the source cache cluster.
     * </p>
     */
    private java.util.Date cacheNodeCreateTime;
    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     * </p>
     */
    private java.util.Date snapshotCreateTime;

    /**
     * <p>
     * The cache node identifier for the node in the source cache cluster.
     * </p>
     * 
     * @param cacheNodeId
     *        The cache node identifier for the node in the source cache cluster.
     */

    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier for the node in the source cache cluster.
     * </p>
     * 
     * @return The cache node identifier for the node in the source cache cluster.
     */

    public String getCacheNodeId() {
        return this.cacheNodeId;
    }

    /**
     * <p>
     * The cache node identifier for the node in the source cache cluster.
     * </p>
     * 
     * @param cacheNodeId
     *        The cache node identifier for the node in the source cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeSnapshot withCacheNodeId(String cacheNodeId) {
        setCacheNodeId(cacheNodeId);
        return this;
    }

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     * 
     * @param cacheSize
     *        The size of the cache on the source cache node.
     */

    public void setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
    }

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     * 
     * @return The size of the cache on the source cache node.
     */

    public String getCacheSize() {
        return this.cacheSize;
    }

    /**
     * <p>
     * The size of the cache on the source cache node.
     * </p>
     * 
     * @param cacheSize
     *        The size of the cache on the source cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeSnapshot withCacheSize(String cacheSize) {
        setCacheSize(cacheSize);
        return this;
    }

    /**
     * <p>
     * The date and time when the cache node was created in the source cache cluster.
     * </p>
     * 
     * @param cacheNodeCreateTime
     *        The date and time when the cache node was created in the source cache cluster.
     */

    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created in the source cache cluster.
     * </p>
     * 
     * @return The date and time when the cache node was created in the source cache cluster.
     */

    public java.util.Date getCacheNodeCreateTime() {
        return this.cacheNodeCreateTime;
    }

    /**
     * <p>
     * The date and time when the cache node was created in the source cache cluster.
     * </p>
     * 
     * @param cacheNodeCreateTime
     *        The date and time when the cache node was created in the source cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeSnapshot withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        setCacheNodeCreateTime(cacheNodeCreateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     * </p>
     * 
     * @param snapshotCreateTime
     *        The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     */

    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     * </p>
     * 
     * @return The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     */

    public java.util.Date getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     * </p>
     * 
     * @param snapshotCreateTime
     *        The date and time when the source node's metadata and cache data set was obtained for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
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
        if (getCacheSize() != null)
            sb.append("CacheSize: " + getCacheSize() + ",");
        if (getCacheNodeCreateTime() != null)
            sb.append("CacheNodeCreateTime: " + getCacheNodeCreateTime() + ",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: " + getSnapshotCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeSnapshot == false)
            return false;
        NodeSnapshot other = (NodeSnapshot) obj;
        if (other.getCacheNodeId() == null ^ this.getCacheNodeId() == null)
            return false;
        if (other.getCacheNodeId() != null && other.getCacheNodeId().equals(this.getCacheNodeId()) == false)
            return false;
        if (other.getCacheSize() == null ^ this.getCacheSize() == null)
            return false;
        if (other.getCacheSize() != null && other.getCacheSize().equals(this.getCacheSize()) == false)
            return false;
        if (other.getCacheNodeCreateTime() == null ^ this.getCacheNodeCreateTime() == null)
            return false;
        if (other.getCacheNodeCreateTime() != null && other.getCacheNodeCreateTime().equals(this.getCacheNodeCreateTime()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        return true;
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
    public NodeSnapshot clone() {
        try {
            return (NodeSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
