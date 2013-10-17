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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#rebootCacheCluster(RebootCacheClusterRequest) RebootCacheCluster operation}.
 * <p>
 * The <i>RebootCacheCluster</i> operation reboots some, or all, of the cache cluster nodes within a provisioned cache cluster. This API will apply any
 * modified cache parameter groups to the cache cluster. The reboot action takes place as soon as possible, and results in a momentary outage to the
 * cache cluster. During the reboot, the cache cluster status is set to REBOOTING.
 * </p>
 * <p>
 * The reboot causes the contents of the cache (for each cache cluster node being rebooted) to be lost.
 * </p>
 * <p>
 * When the reboot is complete, a cache cluster event is created.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#rebootCacheCluster(RebootCacheClusterRequest)
 */
public class RebootCacheClusterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The cache cluster identifier. This parameter is stored as a lowercase
     * string.
     */
    private String cacheClusterId;

    /**
     * A list of cache cluster node IDs to reboot. A node ID is a numeric
     * identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     * specify all of the cache cluster node IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToReboot;

    /**
     * Default constructor for a new RebootCacheClusterRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RebootCacheClusterRequest() {}
    
    /**
     * Constructs a new RebootCacheClusterRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheClusterId The cache cluster identifier. This parameter is
     * stored as a lowercase string.
     * @param cacheNodeIdsToReboot A list of cache cluster node IDs to
     * reboot. A node ID is a numeric identifier (0001, 0002, etc.). To
     * reboot an entire cache cluster, specify all of the cache cluster node
     * IDs.
     */
    public RebootCacheClusterRequest(String cacheClusterId, java.util.List<String> cacheNodeIdsToReboot) {
        setCacheClusterId(cacheClusterId);
        setCacheNodeIdsToReboot(cacheNodeIdsToReboot);
    }

    /**
     * The cache cluster identifier. This parameter is stored as a lowercase
     * string.
     *
     * @return The cache cluster identifier. This parameter is stored as a lowercase
     *         string.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The cache cluster identifier. This parameter is stored as a lowercase
     * string.
     *
     * @param cacheClusterId The cache cluster identifier. This parameter is stored as a lowercase
     *         string.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The cache cluster identifier. This parameter is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The cache cluster identifier. This parameter is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RebootCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * A list of cache cluster node IDs to reboot. A node ID is a numeric
     * identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     * specify all of the cache cluster node IDs.
     *
     * @return A list of cache cluster node IDs to reboot. A node ID is a numeric
     *         identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     *         specify all of the cache cluster node IDs.
     */
    public java.util.List<String> getCacheNodeIdsToReboot() {
        if (cacheNodeIdsToReboot == null) {
              cacheNodeIdsToReboot = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheNodeIdsToReboot.setAutoConstruct(true);
        }
        return cacheNodeIdsToReboot;
    }
    
    /**
     * A list of cache cluster node IDs to reboot. A node ID is a numeric
     * identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     * specify all of the cache cluster node IDs.
     *
     * @param cacheNodeIdsToReboot A list of cache cluster node IDs to reboot. A node ID is a numeric
     *         identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     *         specify all of the cache cluster node IDs.
     */
    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRebootCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToReboot.size());
        cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
        this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;
    }
    
    /**
     * A list of cache cluster node IDs to reboot. A node ID is a numeric
     * identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     * specify all of the cache cluster node IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of cache cluster node IDs to reboot. A node ID is a numeric
     *         identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     *         specify all of the cache cluster node IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RebootCacheClusterRequest withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (getCacheNodeIdsToReboot() == null) setCacheNodeIdsToReboot(new java.util.ArrayList<String>(cacheNodeIdsToReboot.length));
        for (String value : cacheNodeIdsToReboot) {
            getCacheNodeIdsToReboot().add(value);
        }
        return this;
    }
    
    /**
     * A list of cache cluster node IDs to reboot. A node ID is a numeric
     * identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     * specify all of the cache cluster node IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of cache cluster node IDs to reboot. A node ID is a numeric
     *         identifier (0001, 0002, etc.). To reboot an entire cache cluster,
     *         specify all of the cache cluster node IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RebootCacheClusterRequest withCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRebootCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToReboot.size());
            cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
            this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;
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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getCacheNodeIdsToReboot() != null) sb.append("CacheNodeIdsToReboot: " + getCacheNodeIdsToReboot() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeIdsToReboot() == null) ? 0 : getCacheNodeIdsToReboot().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RebootCacheClusterRequest == false) return false;
        RebootCacheClusterRequest other = (RebootCacheClusterRequest)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getCacheNodeIdsToReboot() == null ^ this.getCacheNodeIdsToReboot() == null) return false;
        if (other.getCacheNodeIdsToReboot() != null && other.getCacheNodeIdsToReboot().equals(this.getCacheNodeIdsToReboot()) == false) return false; 
        return true;
    }
    
}
    