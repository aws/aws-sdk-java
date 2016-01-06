/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createSnapshot(CreateSnapshotRequest) CreateSnapshot operation}.
 * <p>
 * The <i>CreateSnapshot</i> action creates a copy of an entire cache
 * cluster at a specific moment in time.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createSnapshot(CreateSnapshotRequest)
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of an existing cache cluster. The snapshot will be
     * created from this cache cluster.
     */
    private String cacheClusterId;

    /**
     * A name for the snapshot being created.
     */
    private String snapshotName;

    /**
     * The identifier of an existing cache cluster. The snapshot will be
     * created from this cache cluster.
     *
     * @return The identifier of an existing cache cluster. The snapshot will be
     *         created from this cache cluster.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The identifier of an existing cache cluster. The snapshot will be
     * created from this cache cluster.
     *
     * @param cacheClusterId The identifier of an existing cache cluster. The snapshot will be
     *         created from this cache cluster.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The identifier of an existing cache cluster. The snapshot will be
     * created from this cache cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The identifier of an existing cache cluster. The snapshot will be
     *         created from this cache cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateSnapshotRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * A name for the snapshot being created.
     *
     * @return A name for the snapshot being created.
     */
    public String getSnapshotName() {
        return snapshotName;
    }
    
    /**
     * A name for the snapshot being created.
     *
     * @param snapshotName A name for the snapshot being created.
     */
    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }
    
    /**
     * A name for the snapshot being created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotName A name for the snapshot being created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateSnapshotRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotName() != null) sb.append("SnapshotName: " + getSnapshotName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSnapshotRequest == false) return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null) return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateSnapshotRequest clone() {
        
            return (CreateSnapshotRequest) super.clone();
    }

}
    