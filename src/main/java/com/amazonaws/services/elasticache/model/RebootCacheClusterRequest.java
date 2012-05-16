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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#rebootCacheCluster(RebootCacheClusterRequest) RebootCacheCluster operation}.
 * <p>
 * Reboots some (or all) of the cache cluster nodes within a previously provisioned ElastiCache cluster. This API results in the application of modified
 * CacheParameterGroup parameters to the cache cluster. This action is taken as soon as possible, and results in a momentary outage to the cache cluster
 * during which the cache cluster status is set to rebooting. During that momentary outage, the contents of the cache (for each cache cluster node being
 * rebooted) are lost. A CacheCluster event is created when the reboot is completed.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#rebootCacheCluster(RebootCacheClusterRequest)
 */
public class RebootCacheClusterRequest extends AmazonWebServiceRequest {

    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string.
     */
    private String cacheClusterId;

    /**
     * A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     * cluster, specify all cache cluster node Ids.
     */
    private java.util.List<String> cacheNodeIdsToReboot;

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
     * @param cacheClusterId The Cache Cluster identifier. This parameter is
     * stored as a lowercase string.
     * @param cacheNodeIdsToReboot A list of Cache Cluster Node Ids to
     * reboot. To reboot an entire cache cluster, specify all cache cluster
     * node Ids.
     */
    public RebootCacheClusterRequest(String cacheClusterId, java.util.List<String> cacheNodeIdsToReboot) {
        this.cacheClusterId = cacheClusterId;
        this.cacheNodeIdsToReboot = cacheNodeIdsToReboot;
    }

    
    
    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string.
     *
     * @return The Cache Cluster identifier. This parameter is stored as a lowercase
     *         string.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string.
     *
     * @param cacheClusterId The Cache Cluster identifier. This parameter is stored as a lowercase
     *         string.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * The Cache Cluster identifier. This parameter is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId The Cache Cluster identifier. This parameter is stored as a lowercase
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
     * A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     * cluster, specify all cache cluster node Ids.
     *
     * @return A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     *         cluster, specify all cache cluster node Ids.
     */
    public java.util.List<String> getCacheNodeIdsToReboot() {
        
        if (cacheNodeIdsToReboot == null) {
            cacheNodeIdsToReboot = new java.util.ArrayList<String>();
        }
        return cacheNodeIdsToReboot;
    }
    
    /**
     * A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     * cluster, specify all cache cluster node Ids.
     *
     * @param cacheNodeIdsToReboot A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     *         cluster, specify all cache cluster node Ids.
     */
    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }

        java.util.List<String> cacheNodeIdsToRebootCopy = new java.util.ArrayList<String>(cacheNodeIdsToReboot.size());
        cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
        this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;
    }
    
    /**
     * A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     * cluster, specify all cache cluster node Ids.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     *         cluster, specify all cache cluster node Ids.
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
     * A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     * cluster, specify all cache cluster node Ids.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of Cache Cluster Node Ids to reboot. To reboot an entire cache
     *         cluster, specify all cache cluster node Ids.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RebootCacheClusterRequest withCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
        } else {
            java.util.List<String> cacheNodeIdsToRebootCopy = new java.util.ArrayList<String>(cacheNodeIdsToReboot.size());
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
        if (cacheClusterId != null) sb.append("CacheClusterId: " + cacheClusterId + ", ");
        if (cacheNodeIdsToReboot != null) sb.append("CacheNodeIdsToReboot: " + cacheNodeIdsToReboot + ", ");
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
    