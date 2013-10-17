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
 * A group of settings that will be applied to the cache cluster in the future, or that are currently being applied.
 * </p>
 */
public class PendingModifiedValues implements Serializable {

    /**
     * The new number of cache nodes for the cache cluster.
     */
    private Integer numCacheNodes;

    /**
     * A list of cache node IDs that are being removed (or will be removed)
     * from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemove;

    /**
     * The new cache engine version that the cache cluster will run.
     */
    private String engineVersion;

    /**
     * Default constructor for a new PendingModifiedValues object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PendingModifiedValues() {}
    
    /**
     * The new number of cache nodes for the cache cluster.
     *
     * @return The new number of cache nodes for the cache cluster.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * The new number of cache nodes for the cache cluster.
     *
     * @param numCacheNodes The new number of cache nodes for the cache cluster.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * The new number of cache nodes for the cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes The new number of cache nodes for the cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }

    /**
     * A list of cache node IDs that are being removed (or will be removed)
     * from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     *
     * @return A list of cache node IDs that are being removed (or will be removed)
     *         from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     */
    public java.util.List<String> getCacheNodeIdsToRemove() {
        if (cacheNodeIdsToRemove == null) {
              cacheNodeIdsToRemove = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheNodeIdsToRemove.setAutoConstruct(true);
        }
        return cacheNodeIdsToRemove;
    }
    
    /**
     * A list of cache node IDs that are being removed (or will be removed)
     * from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs that are being removed (or will be removed)
     *         from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     */
    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToRemove.size());
        cacheNodeIdsToRemoveCopy.addAll(cacheNodeIdsToRemove);
        this.cacheNodeIdsToRemove = cacheNodeIdsToRemoveCopy;
    }
    
    /**
     * A list of cache node IDs that are being removed (or will be removed)
     * from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs that are being removed (or will be removed)
     *         from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withCacheNodeIdsToRemove(String... cacheNodeIdsToRemove) {
        if (getCacheNodeIdsToRemove() == null) setCacheNodeIdsToRemove(new java.util.ArrayList<String>(cacheNodeIdsToRemove.length));
        for (String value : cacheNodeIdsToRemove) {
            getCacheNodeIdsToRemove().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache node IDs that are being removed (or will be removed)
     * from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove A list of cache node IDs that are being removed (or will be removed)
     *         from the cache cluster. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToRemove.size());
            cacheNodeIdsToRemoveCopy.addAll(cacheNodeIdsToRemove);
            this.cacheNodeIdsToRemove = cacheNodeIdsToRemoveCopy;
        }

        return this;
    }

    /**
     * The new cache engine version that the cache cluster will run.
     *
     * @return The new cache engine version that the cache cluster will run.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The new cache engine version that the cache cluster will run.
     *
     * @param engineVersion The new cache engine version that the cache cluster will run.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The new cache engine version that the cache cluster will run.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The new cache engine version that the cache cluster will run.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PendingModifiedValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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
        if (getNumCacheNodes() != null) sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getCacheNodeIdsToRemove() != null) sb.append("CacheNodeIdsToRemove: " + getCacheNodeIdsToRemove() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeIdsToRemove() == null) ? 0 : getCacheNodeIdsToRemove().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PendingModifiedValues == false) return false;
        PendingModifiedValues other = (PendingModifiedValues)obj;
        
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null) return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false) return false; 
        if (other.getCacheNodeIdsToRemove() == null ^ this.getCacheNodeIdsToRemove() == null) return false;
        if (other.getCacheNodeIdsToRemove() != null && other.getCacheNodeIdsToRemove().equals(this.getCacheNodeIdsToRemove()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        return true;
    }
    
}
    