/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CreateSnapshot</code> operation.
 * </p>
 */
public class CreateSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created from this replication group.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created from this replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier of an existing replication group. The snapshot is created from this replication group.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created from this replication group.
     * </p>
     * 
     * @return The identifier of an existing replication group. The snapshot is created from this replication group.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The identifier of an existing replication group. The snapshot is created from this replication group.
     * </p>
     * 
     * @param replicationGroupId
     *        The identifier of an existing replication group. The snapshot is created from this replication group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     * </p>
     * 
     * @return The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     * </p>
     * 
     * @param cacheClusterId
     *        The identifier of an existing cache cluster. The snapshot is created from this cache cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     * 
     * @param snapshotName
     *        A name for the snapshot being created.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     * 
     * @return A name for the snapshot being created.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * A name for the snapshot being created.
     * </p>
     * 
     * @param snapshotName
     *        A name for the snapshot being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotRequest == false)
            return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotRequest clone() {
        return (CreateSnapshotRequest) super.clone();
    }
}
