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

/**
 * <p>
 * A group of settings that are applied to the cluster in the future, or that are currently being applied.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PendingModifiedValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedValues implements Serializable, Cloneable {

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     */
    private Integer numCacheNodes;
    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheNodeIdsToRemove;
    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The new number of cache nodes for the cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     */

    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @return The new number of cache nodes for the cluster.</p>
     *         <p>
     *         For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *         between 1 and 20.
     */

    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }

    /**
     * <p>
     * The new number of cache nodes for the cluster.
     * </p>
     * <p>
     * For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1
     * and 20.
     * </p>
     * 
     * @param numCacheNodes
     *        The new number of cache nodes for the cluster.</p>
     *        <p>
     *        For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be
     *        between 1 and 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withNumCacheNodes(Integer numCacheNodes) {
        setNumCacheNodes(numCacheNodes);
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @return A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *         4-digit numeric identifier (0001, 0002, etc.).
     */

    public java.util.List<String> getCacheNodeIdsToRemove() {
        if (cacheNodeIdsToRemove == null) {
            cacheNodeIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheNodeIdsToRemove;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeIdsToRemove
     *        A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *        4-digit numeric identifier (0001, 0002, etc.).
     */

    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }

        this.cacheNodeIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToRemove);
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodeIdsToRemove(java.util.Collection)} or {@link #withCacheNodeIdsToRemove(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheNodeIdsToRemove
     *        A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *        4-digit numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCacheNodeIdsToRemove(String... cacheNodeIdsToRemove) {
        if (this.cacheNodeIdsToRemove == null) {
            setCacheNodeIdsToRemove(new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToRemove.length));
        }
        for (String ele : cacheNodeIdsToRemove) {
            this.cacheNodeIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeIdsToRemove
     *        A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a
     *        4-digit numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        setCacheNodeIdsToRemove(cacheNodeIdsToRemove);
        return this;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * 
     * @param engineVersion
     *        The new cache engine version that the cluster runs.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * 
     * @return The new cache engine version that the cluster runs.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The new cache engine version that the cluster runs.
     * </p>
     * 
     * @param engineVersion
     *        The new cache engine version that the cluster runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type that this cluster or replication group is scaled to.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * 
     * @return The cache node type that this cluster or replication group is scaled to.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type that this cluster or replication group is scaled to.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type that this cluster or replication group is scaled to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedValues withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
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
        if (getNumCacheNodes() != null)
            sb.append("NumCacheNodes: ").append(getNumCacheNodes()).append(",");
        if (getCacheNodeIdsToRemove() != null)
            sb.append("CacheNodeIdsToRemove: ").append(getCacheNodeIdsToRemove()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null)
            return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false)
            return false;
        if (other.getCacheNodeIdsToRemove() == null ^ this.getCacheNodeIdsToRemove() == null)
            return false;
        if (other.getCacheNodeIdsToRemove() != null && other.getCacheNodeIdsToRemove().equals(this.getCacheNodeIdsToRemove()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeIdsToRemove() == null) ? 0 : getCacheNodeIdsToRemove().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        return hashCode;
    }

    @Override
    public PendingModifiedValues clone() {
        try {
            return (PendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
