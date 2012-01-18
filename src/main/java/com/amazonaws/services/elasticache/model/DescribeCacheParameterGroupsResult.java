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
 * Contains a list of CacheParameterGroups.
 * </p>
 */
public class DescribeCacheParameterGroupsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>CacheParameterGroup</a> instances.
     */
    private java.util.List<CacheParameterGroup> cacheParameterGroups;

    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParameterGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>CacheParameterGroup</a> instances.
     *
     * @return A list of <a>CacheParameterGroup</a> instances.
     */
    public java.util.List<CacheParameterGroup> getCacheParameterGroups() {
        
        if (cacheParameterGroups == null) {
            cacheParameterGroups = new java.util.ArrayList<CacheParameterGroup>();
        }
        return cacheParameterGroups;
    }
    
    /**
     * A list of <a>CacheParameterGroup</a> instances.
     *
     * @param cacheParameterGroups A list of <a>CacheParameterGroup</a> instances.
     */
    public void setCacheParameterGroups(java.util.Collection<CacheParameterGroup> cacheParameterGroups) {
        if (cacheParameterGroups == null) {
            this.cacheParameterGroups = null;
            return;
        }

        java.util.List<CacheParameterGroup> cacheParameterGroupsCopy = new java.util.ArrayList<CacheParameterGroup>(cacheParameterGroups.size());
        cacheParameterGroupsCopy.addAll(cacheParameterGroups);
        this.cacheParameterGroups = cacheParameterGroupsCopy;
    }
    
    /**
     * A list of <a>CacheParameterGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroups A list of <a>CacheParameterGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParameterGroupsResult withCacheParameterGroups(CacheParameterGroup... cacheParameterGroups) {
        if (getCacheParameterGroups() == null) setCacheParameterGroups(new java.util.ArrayList<CacheParameterGroup>(cacheParameterGroups.length));
        for (CacheParameterGroup value : cacheParameterGroups) {
            getCacheParameterGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>CacheParameterGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroups A list of <a>CacheParameterGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParameterGroupsResult withCacheParameterGroups(java.util.Collection<CacheParameterGroup> cacheParameterGroups) {
        if (cacheParameterGroups == null) {
            this.cacheParameterGroups = null;
        } else {
            java.util.List<CacheParameterGroup> cacheParameterGroupsCopy = new java.util.ArrayList<CacheParameterGroup>(cacheParameterGroups.size());
            cacheParameterGroupsCopy.addAll(cacheParameterGroups);
            this.cacheParameterGroups = cacheParameterGroupsCopy;
        }

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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (cacheParameterGroups != null) sb.append("CacheParameterGroups: " + cacheParameterGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroups() == null) ? 0 : getCacheParameterGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeCacheParameterGroupsResult == false) return false;
        DescribeCacheParameterGroupsResult other = (DescribeCacheParameterGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getCacheParameterGroups() == null ^ this.getCacheParameterGroups() == null) return false;
        if (other.getCacheParameterGroups() != null && other.getCacheParameterGroups().equals(this.getCacheParameterGroups()) == false) return false; 
        return true;
    }
    
}
    