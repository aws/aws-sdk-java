/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>RebootCacheCluster</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RebootCacheCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootCacheClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire
     * cluster, specify all of the cache node IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheNodeIdsToReboot;

    /**
     * Default constructor for RebootCacheClusterRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public RebootCacheClusterRequest() {
    }

    /**
     * Constructs a new RebootCacheClusterRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param cacheClusterId
     *        The cluster identifier. This parameter is stored as a lowercase string.
     * @param cacheNodeIdsToReboot
     *        A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an
     *        entire cluster, specify all of the cache node IDs.
     */
    public RebootCacheClusterRequest(String cacheClusterId, java.util.List<String> cacheNodeIdsToReboot) {
        setCacheClusterId(cacheClusterId);
        setCacheNodeIdsToReboot(cacheNodeIdsToReboot);
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param cacheClusterId
     *        The cluster identifier. This parameter is stored as a lowercase string.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The cluster identifier. This parameter is stored as a lowercase string.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param cacheClusterId
     *        The cluster identifier. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire
     * cluster, specify all of the cache node IDs.
     * </p>
     * 
     * @return A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an
     *         entire cluster, specify all of the cache node IDs.
     */

    public java.util.List<String> getCacheNodeIdsToReboot() {
        if (cacheNodeIdsToReboot == null) {
            cacheNodeIdsToReboot = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheNodeIdsToReboot;
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire
     * cluster, specify all of the cache node IDs.
     * </p>
     * 
     * @param cacheNodeIdsToReboot
     *        A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an
     *        entire cluster, specify all of the cache node IDs.
     */

    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }

        this.cacheNodeIdsToReboot = new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToReboot);
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire
     * cluster, specify all of the cache node IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodeIdsToReboot(java.util.Collection)} or {@link #withCacheNodeIdsToReboot(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheNodeIdsToReboot
     *        A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an
     *        entire cluster, specify all of the cache node IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootCacheClusterRequest withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (this.cacheNodeIdsToReboot == null) {
            setCacheNodeIdsToReboot(new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToReboot.length));
        }
        for (String ele : cacheNodeIdsToReboot) {
            this.cacheNodeIdsToReboot.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire
     * cluster, specify all of the cache node IDs.
     * </p>
     * 
     * @param cacheNodeIdsToReboot
     *        A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an
     *        entire cluster, specify all of the cache node IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootCacheClusterRequest withCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        setCacheNodeIdsToReboot(cacheNodeIdsToReboot);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getCacheNodeIdsToReboot() != null)
            sb.append("CacheNodeIdsToReboot: ").append(getCacheNodeIdsToReboot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootCacheClusterRequest == false)
            return false;
        RebootCacheClusterRequest other = (RebootCacheClusterRequest) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getCacheNodeIdsToReboot() == null ^ this.getCacheNodeIdsToReboot() == null)
            return false;
        if (other.getCacheNodeIdsToReboot() != null && other.getCacheNodeIdsToReboot().equals(this.getCacheNodeIdsToReboot()) == false)
            return false;
        return true;
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
    public RebootCacheClusterRequest clone() {
        return (RebootCacheClusterRequest) super.clone();
    }

}
