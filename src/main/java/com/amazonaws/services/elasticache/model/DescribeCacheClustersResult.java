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
 * Contains one or more Cache Clusters.
 * </p>
 */
public class DescribeCacheClustersResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of CacheClusters.
     */
    private java.util.List<CacheCluster> cacheClusters;

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
    public DescribeCacheClustersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of CacheClusters.
     *
     * @return A list of CacheClusters.
     */
    public java.util.List<CacheCluster> getCacheClusters() {
        
        if (cacheClusters == null) {
            cacheClusters = new java.util.ArrayList<CacheCluster>();
        }
        return cacheClusters;
    }
    
    /**
     * A list of CacheClusters.
     *
     * @param cacheClusters A list of CacheClusters.
     */
    public void setCacheClusters(java.util.Collection<CacheCluster> cacheClusters) {
        if (cacheClusters == null) {
            this.cacheClusters = null;
            return;
        }

        java.util.List<CacheCluster> cacheClustersCopy = new java.util.ArrayList<CacheCluster>(cacheClusters.size());
        cacheClustersCopy.addAll(cacheClusters);
        this.cacheClusters = cacheClustersCopy;
    }
    
    /**
     * A list of CacheClusters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusters A list of CacheClusters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheClustersResult withCacheClusters(CacheCluster... cacheClusters) {
        if (getCacheClusters() == null) setCacheClusters(new java.util.ArrayList<CacheCluster>(cacheClusters.length));
        for (CacheCluster value : cacheClusters) {
            getCacheClusters().add(value);
        }
        return this;
    }
    
    /**
     * A list of CacheClusters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusters A list of CacheClusters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheClustersResult withCacheClusters(java.util.Collection<CacheCluster> cacheClusters) {
        if (cacheClusters == null) {
            this.cacheClusters = null;
        } else {
            java.util.List<CacheCluster> cacheClustersCopy = new java.util.ArrayList<CacheCluster>(cacheClusters.size());
            cacheClustersCopy.addAll(cacheClusters);
            this.cacheClusters = cacheClustersCopy;
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
        if (cacheClusters != null) sb.append("CacheClusters: " + cacheClusters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getCacheClusters() == null) ? 0 : getCacheClusters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeCacheClustersResult == false) return false;
        DescribeCacheClustersResult other = (DescribeCacheClustersResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getCacheClusters() == null ^ this.getCacheClusters() == null) return false;
        if (other.getCacheClusters() != null && other.getCacheClusters().equals(this.getCacheClusters()) == false) return false; 
        return true;
    }
    
}
    