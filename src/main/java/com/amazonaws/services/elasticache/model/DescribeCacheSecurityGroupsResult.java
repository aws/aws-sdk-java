/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains a list of CacheSecurityGroups.
 * </p>
 */
public class DescribeCacheSecurityGroupsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>CacheSecurityGroup</a> instances.
     */
    private java.util.List<CacheSecurityGroup> cacheSecurityGroups;

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
    public DescribeCacheSecurityGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>CacheSecurityGroup</a> instances.
     *
     * @return A list of <a>CacheSecurityGroup</a> instances.
     */
    public java.util.List<CacheSecurityGroup> getCacheSecurityGroups() {
        
        if (cacheSecurityGroups == null) {
            cacheSecurityGroups = new java.util.ArrayList<CacheSecurityGroup>();
        }
        return cacheSecurityGroups;
    }
    
    /**
     * A list of <a>CacheSecurityGroup</a> instances.
     *
     * @param cacheSecurityGroups A list of <a>CacheSecurityGroup</a> instances.
     */
    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroup> cacheSecurityGroups) {
        java.util.List<CacheSecurityGroup> cacheSecurityGroupsCopy = new java.util.ArrayList<CacheSecurityGroup>();
        if (cacheSecurityGroups != null) {
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        }
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;
    }
    
    /**
     * A list of <a>CacheSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups A list of <a>CacheSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheSecurityGroupsResult withCacheSecurityGroups(CacheSecurityGroup... cacheSecurityGroups) {
        if (getCacheSecurityGroups() == null) setCacheSecurityGroups(new java.util.ArrayList<CacheSecurityGroup>());
        for (CacheSecurityGroup value : cacheSecurityGroups) {
            getCacheSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>CacheSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups A list of <a>CacheSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheSecurityGroupsResult withCacheSecurityGroups(java.util.Collection<CacheSecurityGroup> cacheSecurityGroups) {
        java.util.List<CacheSecurityGroup> cacheSecurityGroupsCopy = new java.util.ArrayList<CacheSecurityGroup>();
        if (cacheSecurityGroups != null) {
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        }
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;

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
        sb.append("Marker: " + marker + ", ");
        sb.append("CacheSecurityGroups: " + cacheSecurityGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    