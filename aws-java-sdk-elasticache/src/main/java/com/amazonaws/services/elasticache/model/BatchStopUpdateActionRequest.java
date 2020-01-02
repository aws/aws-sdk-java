/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/BatchStopUpdateAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopUpdateActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The replication group IDs
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replicationGroupIds;
    /**
     * <p>
     * The cache cluster IDs
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheClusterIds;
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

    /**
     * <p>
     * The replication group IDs
     * </p>
     * 
     * @return The replication group IDs
     */

    public java.util.List<String> getReplicationGroupIds() {
        if (replicationGroupIds == null) {
            replicationGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replicationGroupIds;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * 
     * @param replicationGroupIds
     *        The replication group IDs
     */

    public void setReplicationGroupIds(java.util.Collection<String> replicationGroupIds) {
        if (replicationGroupIds == null) {
            this.replicationGroupIds = null;
            return;
        }

        this.replicationGroupIds = new com.amazonaws.internal.SdkInternalList<String>(replicationGroupIds);
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationGroupIds(java.util.Collection)} or {@link #withReplicationGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param replicationGroupIds
     *        The replication group IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionRequest withReplicationGroupIds(String... replicationGroupIds) {
        if (this.replicationGroupIds == null) {
            setReplicationGroupIds(new com.amazonaws.internal.SdkInternalList<String>(replicationGroupIds.length));
        }
        for (String ele : replicationGroupIds) {
            this.replicationGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replication group IDs
     * </p>
     * 
     * @param replicationGroupIds
     *        The replication group IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionRequest withReplicationGroupIds(java.util.Collection<String> replicationGroupIds) {
        setReplicationGroupIds(replicationGroupIds);
        return this;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * 
     * @return The cache cluster IDs
     */

    public java.util.List<String> getCacheClusterIds() {
        if (cacheClusterIds == null) {
            cacheClusterIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheClusterIds;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * 
     * @param cacheClusterIds
     *        The cache cluster IDs
     */

    public void setCacheClusterIds(java.util.Collection<String> cacheClusterIds) {
        if (cacheClusterIds == null) {
            this.cacheClusterIds = null;
            return;
        }

        this.cacheClusterIds = new com.amazonaws.internal.SdkInternalList<String>(cacheClusterIds);
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheClusterIds(java.util.Collection)} or {@link #withCacheClusterIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cacheClusterIds
     *        The cache cluster IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionRequest withCacheClusterIds(String... cacheClusterIds) {
        if (this.cacheClusterIds == null) {
            setCacheClusterIds(new com.amazonaws.internal.SdkInternalList<String>(cacheClusterIds.length));
        }
        for (String ele : cacheClusterIds) {
            this.cacheClusterIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cache cluster IDs
     * </p>
     * 
     * @param cacheClusterIds
     *        The cache cluster IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionRequest withCacheClusterIds(java.util.Collection<String> cacheClusterIds) {
        setCacheClusterIds(cacheClusterIds);
        return this;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopUpdateActionRequest withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
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
        if (getReplicationGroupIds() != null)
            sb.append("ReplicationGroupIds: ").append(getReplicationGroupIds()).append(",");
        if (getCacheClusterIds() != null)
            sb.append("CacheClusterIds: ").append(getCacheClusterIds()).append(",");
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopUpdateActionRequest == false)
            return false;
        BatchStopUpdateActionRequest other = (BatchStopUpdateActionRequest) obj;
        if (other.getReplicationGroupIds() == null ^ this.getReplicationGroupIds() == null)
            return false;
        if (other.getReplicationGroupIds() != null && other.getReplicationGroupIds().equals(this.getReplicationGroupIds()) == false)
            return false;
        if (other.getCacheClusterIds() == null ^ this.getCacheClusterIds() == null)
            return false;
        if (other.getCacheClusterIds() != null && other.getCacheClusterIds().equals(this.getCacheClusterIds()) == false)
            return false;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupIds() == null) ? 0 : getReplicationGroupIds().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterIds() == null) ? 0 : getCacheClusterIds().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        return hashCode;
    }

    @Override
    public BatchStopUpdateActionRequest clone() {
        return (BatchStopUpdateActionRequest) super.clone();
    }

}
