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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest) DeleteCacheSubnetGroup operation}.
 * <p>
 * The <i>DeleteCacheSubnetGroup</i> operation deletes a cache subnet group.
 * </p>
 * <p>
 * <b>NOTE:</b>You cannot delete a cache subnet group if it is associated with any cache clusters.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest)
 */
public class DeleteCacheSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cache subnet group to delete. <p>Constraints: Must
     * contain no more than 255 alphanumeric characters or hyphens.
     */
    private String cacheSubnetGroupName;

    /**
     * The name of the cache subnet group to delete. <p>Constraints: Must
     * contain no more than 255 alphanumeric characters or hyphens.
     *
     * @return The name of the cache subnet group to delete. <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters or hyphens.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group to delete. <p>Constraints: Must
     * contain no more than 255 alphanumeric characters or hyphens.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group to delete. <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters or hyphens.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * The name of the cache subnet group to delete. <p>Constraints: Must
     * contain no more than 255 alphanumeric characters or hyphens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName The name of the cache subnet group to delete. <p>Constraints: Must
     *         contain no more than 255 alphanumeric characters or hyphens.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteCacheSubnetGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
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
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteCacheSubnetGroupRequest == false) return false;
        DeleteCacheSubnetGroupRequest other = (DeleteCacheSubnetGroupRequest)obj;
        
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        return true;
    }
    
}
    