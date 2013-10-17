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
 * Represents the output of a DescribeCacheEngineVersions operation.
 * </p>
 */
public class DescribeCacheEngineVersionsResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of cache engine version details. Each element in the list
     * contains detailed information about once cache engine version.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheEngineVersion> cacheEngineVersions;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @return Provides an identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of cache engine version details. Each element in the list
     * contains detailed information about once cache engine version.
     *
     * @return A list of cache engine version details. Each element in the list
     *         contains detailed information about once cache engine version.
     */
    public java.util.List<CacheEngineVersion> getCacheEngineVersions() {
        if (cacheEngineVersions == null) {
              cacheEngineVersions = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheEngineVersion>();
              cacheEngineVersions.setAutoConstruct(true);
        }
        return cacheEngineVersions;
    }
    
    /**
     * A list of cache engine version details. Each element in the list
     * contains detailed information about once cache engine version.
     *
     * @param cacheEngineVersions A list of cache engine version details. Each element in the list
     *         contains detailed information about once cache engine version.
     */
    public void setCacheEngineVersions(java.util.Collection<CacheEngineVersion> cacheEngineVersions) {
        if (cacheEngineVersions == null) {
            this.cacheEngineVersions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheEngineVersion> cacheEngineVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheEngineVersion>(cacheEngineVersions.size());
        cacheEngineVersionsCopy.addAll(cacheEngineVersions);
        this.cacheEngineVersions = cacheEngineVersionsCopy;
    }
    
    /**
     * A list of cache engine version details. Each element in the list
     * contains detailed information about once cache engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheEngineVersions A list of cache engine version details. Each element in the list
     *         contains detailed information about once cache engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsResult withCacheEngineVersions(CacheEngineVersion... cacheEngineVersions) {
        if (getCacheEngineVersions() == null) setCacheEngineVersions(new java.util.ArrayList<CacheEngineVersion>(cacheEngineVersions.length));
        for (CacheEngineVersion value : cacheEngineVersions) {
            getCacheEngineVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache engine version details. Each element in the list
     * contains detailed information about once cache engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheEngineVersions A list of cache engine version details. Each element in the list
     *         contains detailed information about once cache engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheEngineVersionsResult withCacheEngineVersions(java.util.Collection<CacheEngineVersion> cacheEngineVersions) {
        if (cacheEngineVersions == null) {
            this.cacheEngineVersions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheEngineVersion> cacheEngineVersionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheEngineVersion>(cacheEngineVersions.size());
            cacheEngineVersionsCopy.addAll(cacheEngineVersions);
            this.cacheEngineVersions = cacheEngineVersionsCopy;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getCacheEngineVersions() != null) sb.append("CacheEngineVersions: " + getCacheEngineVersions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getCacheEngineVersions() == null) ? 0 : getCacheEngineVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheEngineVersionsResult == false) return false;
        DescribeCacheEngineVersionsResult other = (DescribeCacheEngineVersionsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getCacheEngineVersions() == null ^ this.getCacheEngineVersions() == null) return false;
        if (other.getCacheEngineVersions() != null && other.getCacheEngineVersions().equals(this.getCacheEngineVersions()) == false) return false; 
        return true;
    }
    
}
    