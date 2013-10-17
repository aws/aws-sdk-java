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
 * Represents the output of a <i>DescribeCacheSecurityGroups</i> operation.
 * </p>
 */
public class DescribeCacheSecurityGroupsResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of cache security groups. Each element in the list contains
     * detailed information about one group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroup> cacheSecurityGroups;

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
    public DescribeCacheSecurityGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of cache security groups. Each element in the list contains
     * detailed information about one group.
     *
     * @return A list of cache security groups. Each element in the list contains
     *         detailed information about one group.
     */
    public java.util.List<CacheSecurityGroup> getCacheSecurityGroups() {
        if (cacheSecurityGroups == null) {
              cacheSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroup>();
              cacheSecurityGroups.setAutoConstruct(true);
        }
        return cacheSecurityGroups;
    }
    
    /**
     * A list of cache security groups. Each element in the list contains
     * detailed information about one group.
     *
     * @param cacheSecurityGroups A list of cache security groups. Each element in the list contains
     *         detailed information about one group.
     */
    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroup> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroup> cacheSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroup>(cacheSecurityGroups.size());
        cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;
    }
    
    /**
     * A list of cache security groups. Each element in the list contains
     * detailed information about one group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups A list of cache security groups. Each element in the list contains
     *         detailed information about one group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSecurityGroupsResult withCacheSecurityGroups(CacheSecurityGroup... cacheSecurityGroups) {
        if (getCacheSecurityGroups() == null) setCacheSecurityGroups(new java.util.ArrayList<CacheSecurityGroup>(cacheSecurityGroups.length));
        for (CacheSecurityGroup value : cacheSecurityGroups) {
            getCacheSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache security groups. Each element in the list contains
     * detailed information about one group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups A list of cache security groups. Each element in the list contains
     *         detailed information about one group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSecurityGroupsResult withCacheSecurityGroups(java.util.Collection<CacheSecurityGroup> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroup> cacheSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroup>(cacheSecurityGroups.size());
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
            this.cacheSecurityGroups = cacheSecurityGroupsCopy;
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
        if (getCacheSecurityGroups() != null) sb.append("CacheSecurityGroups: " + getCacheSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroups() == null) ? 0 : getCacheSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheSecurityGroupsResult == false) return false;
        DescribeCacheSecurityGroupsResult other = (DescribeCacheSecurityGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getCacheSecurityGroups() == null ^ this.getCacheSecurityGroups() == null) return false;
        if (other.getCacheSecurityGroups() != null && other.getCacheSecurityGroups().equals(this.getCacheSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    