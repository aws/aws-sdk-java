/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains values that will be applied to the Cache Cluster in the future.
 * </p>
 */
public class PendingModifiedValues {

    /**
     * Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     * be applied or is in progress.
     */
    private Integer numCacheNodes;

    /**
     * Contains the list of node Ids to remove from the Cache Cluster that
     * will be applied or is in progress.
     */
    private java.util.List<String> cacheNodeIdsToRemove;

    /**
     * Contains the new version of the Cache Engine the Cache Cluster will be
     * upgraded to.
     */
    private String engineVersion;

    /**
     * Default constructor for a new PendingModifiedValues object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PendingModifiedValues() {}
    
    /**
     * Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     * be applied or is in progress.
     *
     * @return Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     *         be applied or is in progress.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     * be applied or is in progress.
     *
     * @param numCacheNodes Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     *         be applied or is in progress.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     * be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes Contains the new <i>NumCacheNodes</i> for the Cache Cluster that will
     *         be applied or is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }
    
    
    /**
     * Contains the list of node Ids to remove from the Cache Cluster that
     * will be applied or is in progress.
     *
     * @return Contains the list of node Ids to remove from the Cache Cluster that
     *         will be applied or is in progress.
     */
    public java.util.List<String> getCacheNodeIdsToRemove() {
        
        if (cacheNodeIdsToRemove == null) {
            cacheNodeIdsToRemove = new java.util.ArrayList<String>();
        }
        return cacheNodeIdsToRemove;
    }
    
    /**
     * Contains the list of node Ids to remove from the Cache Cluster that
     * will be applied or is in progress.
     *
     * @param cacheNodeIdsToRemove Contains the list of node Ids to remove from the Cache Cluster that
     *         will be applied or is in progress.
     */
    public void setCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
            return;
        }

        java.util.List<String> cacheNodeIdsToRemoveCopy = new java.util.ArrayList<String>(cacheNodeIdsToRemove.size());
        cacheNodeIdsToRemoveCopy.addAll(cacheNodeIdsToRemove);
        this.cacheNodeIdsToRemove = cacheNodeIdsToRemoveCopy;
    }
    
    /**
     * Contains the list of node Ids to remove from the Cache Cluster that
     * will be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove Contains the list of node Ids to remove from the Cache Cluster that
     *         will be applied or is in progress.
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
     * Contains the list of node Ids to remove from the Cache Cluster that
     * will be applied or is in progress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToRemove Contains the list of node Ids to remove from the Cache Cluster that
     *         will be applied or is in progress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PendingModifiedValues withCacheNodeIdsToRemove(java.util.Collection<String> cacheNodeIdsToRemove) {
        if (cacheNodeIdsToRemove == null) {
            this.cacheNodeIdsToRemove = null;
        } else {
            java.util.List<String> cacheNodeIdsToRemoveCopy = new java.util.ArrayList<String>(cacheNodeIdsToRemove.size());
            cacheNodeIdsToRemoveCopy.addAll(cacheNodeIdsToRemove);
            this.cacheNodeIdsToRemove = cacheNodeIdsToRemoveCopy;
        }

        return this;
    }
    
    /**
     * Contains the new version of the Cache Engine the Cache Cluster will be
     * upgraded to.
     *
     * @return Contains the new version of the Cache Engine the Cache Cluster will be
     *         upgraded to.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Contains the new version of the Cache Engine the Cache Cluster will be
     * upgraded to.
     *
     * @param engineVersion Contains the new version of the Cache Engine the Cache Cluster will be
     *         upgraded to.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Contains the new version of the Cache Engine the Cache Cluster will be
     * upgraded to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Contains the new version of the Cache Engine the Cache Cluster will be
     *         upgraded to.
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
        if (numCacheNodes != null) sb.append("NumCacheNodes: " + numCacheNodes + ", ");
        if (cacheNodeIdsToRemove != null) sb.append("CacheNodeIdsToRemove: " + cacheNodeIdsToRemove + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
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
    