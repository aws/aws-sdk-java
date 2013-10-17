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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#deleteCacheCluster(DeleteCacheClusterRequest) DeleteCacheCluster operation}.
 * <p>
 * The <i>DeleteCacheCluster</i> operation deletes a previously provisioned cache cluster. <i>DeleteCacheCluster</i> deletes all associated cache nodes,
 * node endpoints and the cache cluster itself. When you receive a successful response from this operation, Amazon ElastiCache immediately begins
 * deleting the cache cluster; you cannot cancel or revert this operation.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#deleteCacheCluster(DeleteCacheClusterRequest)
 */
public class DeleteCacheClusterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The cache cluster identifier for the cluster to be deleted. This
     * parameter is not case sensitive.
     */
    private String cacheClusterId;

    /**
     * Default constructor for a new DeleteCacheClusterRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteCacheClusterRequest() {}
    
    /**
     * Constructs a new DeleteCacheClusterRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheClusterId The cache cluster identifier for the cluster to
     * be deleted. This parameter is not case sensitive.
     */
    public DeleteCacheClusterRequest(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
    }

    /**
     * The cache cluster identifier for the cluster to be deleted. This
     * parameter is not case sensitive.
     *
     * @return The cache cluster identifier for the cluster to be deleted. This
     *         parameter is not case sensitive.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The cache cluster identifier for the cluster to be deleted. This
     * parameter is not case sensitive.
     *
     * @param cacheClusterId The cache cluster identifier for the cluster to be deleted. This
     *         parameter is not case sensitive.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The cache cluster identifier for the cluster to be deleted. This
     * parameter is not case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The cache cluster identifier for the cluster to be deleted. This
     *         parameter is not case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteCacheClusterRequest == false) return false;
        DeleteCacheClusterRequest other = (DeleteCacheClusterRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        return true;
    }
    
}
    