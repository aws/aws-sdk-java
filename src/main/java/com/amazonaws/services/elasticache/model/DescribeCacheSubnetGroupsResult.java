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
 * Represents the output of a <i>DescribeCacheSubnetGroups</i> operation.
 * </p>
 */
public class DescribeCacheSubnetGroupsResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of cache subnet groups. Each element in the list contains
     * detailed information about one group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheSubnetGroup> cacheSubnetGroups;

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
    public DescribeCacheSubnetGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of cache subnet groups. Each element in the list contains
     * detailed information about one group.
     *
     * @return A list of cache subnet groups. Each element in the list contains
     *         detailed information about one group.
     */
    public java.util.List<CacheSubnetGroup> getCacheSubnetGroups() {
        if (cacheSubnetGroups == null) {
              cacheSubnetGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSubnetGroup>();
              cacheSubnetGroups.setAutoConstruct(true);
        }
        return cacheSubnetGroups;
    }
    
    /**
     * A list of cache subnet groups. Each element in the list contains
     * detailed information about one group.
     *
     * @param cacheSubnetGroups A list of cache subnet groups. Each element in the list contains
     *         detailed information about one group.
     */
    public void setCacheSubnetGroups(java.util.Collection<CacheSubnetGroup> cacheSubnetGroups) {
        if (cacheSubnetGroups == null) {
            this.cacheSubnetGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheSubnetGroup> cacheSubnetGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSubnetGroup>(cacheSubnetGroups.size());
        cacheSubnetGroupsCopy.addAll(cacheSubnetGroups);
        this.cacheSubnetGroups = cacheSubnetGroupsCopy;
    }
    
    /**
     * A list of cache subnet groups. Each element in the list contains
     * detailed information about one group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroups A list of cache subnet groups. Each element in the list contains
     *         detailed information about one group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSubnetGroupsResult withCacheSubnetGroups(CacheSubnetGroup... cacheSubnetGroups) {
        if (getCacheSubnetGroups() == null) setCacheSubnetGroups(new java.util.ArrayList<CacheSubnetGroup>(cacheSubnetGroups.length));
        for (CacheSubnetGroup value : cacheSubnetGroups) {
            getCacheSubnetGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache subnet groups. Each element in the list contains
     * detailed information about one group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroups A list of cache subnet groups. Each element in the list contains
     *         detailed information about one group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSubnetGroupsResult withCacheSubnetGroups(java.util.Collection<CacheSubnetGroup> cacheSubnetGroups) {
        if (cacheSubnetGroups == null) {
            this.cacheSubnetGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheSubnetGroup> cacheSubnetGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSubnetGroup>(cacheSubnetGroups.size());
            cacheSubnetGroupsCopy.addAll(cacheSubnetGroups);
            this.cacheSubnetGroups = cacheSubnetGroupsCopy;
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
        if (getCacheSubnetGroups() != null) sb.append("CacheSubnetGroups: " + getCacheSubnetGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSubnetGroups() == null) ? 0 : getCacheSubnetGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheSubnetGroupsResult == false) return false;
        DescribeCacheSubnetGroupsResult other = (DescribeCacheSubnetGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getCacheSubnetGroups() == null ^ this.getCacheSubnetGroups() == null) return false;
        if (other.getCacheSubnetGroups() != null && other.getCacheSubnetGroups().equals(this.getCacheSubnetGroups()) == false) return false; 
        return true;
    }
    
}
    