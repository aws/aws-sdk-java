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

/**
 * <p>
 * Update action that has been processed for the corresponding apply/stop request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ProcessedUpdateAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessedUpdateAction implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the replication group
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     */
    private String updateActionStatus;

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * 
     * @return The ID of the replication group
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * 
     * @param replicationGroupId
     *        The ID of the replication group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessedUpdateAction withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * 
     * @param cacheClusterId
     *        The ID of the cache cluster
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * 
     * @return The ID of the cache cluster
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * 
     * @param cacheClusterId
     *        The ID of the cache cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessedUpdateAction withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
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

    public ProcessedUpdateAction withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action on the Redis cluster
     * @see UpdateActionStatus
     */

    public void setUpdateActionStatus(String updateActionStatus) {
        this.updateActionStatus = updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * 
     * @return The status of the update action on the Redis cluster
     * @see UpdateActionStatus
     */

    public String getUpdateActionStatus() {
        return this.updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action on the Redis cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public ProcessedUpdateAction withUpdateActionStatus(String updateActionStatus) {
        setUpdateActionStatus(updateActionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the update action on the Redis cluster
     * </p>
     * 
     * @param updateActionStatus
     *        The status of the update action on the Redis cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateActionStatus
     */

    public ProcessedUpdateAction withUpdateActionStatus(UpdateActionStatus updateActionStatus) {
        this.updateActionStatus = updateActionStatus.toString();
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getUpdateActionStatus() != null)
            sb.append("UpdateActionStatus: ").append(getUpdateActionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessedUpdateAction == false)
            return false;
        ProcessedUpdateAction other = (ProcessedUpdateAction) obj;
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getUpdateActionStatus() == null ^ this.getUpdateActionStatus() == null)
            return false;
        if (other.getUpdateActionStatus() != null && other.getUpdateActionStatus().equals(this.getUpdateActionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getUpdateActionStatus() == null) ? 0 : getUpdateActionStatus().hashCode());
        return hashCode;
    }

    @Override
    public ProcessedUpdateAction clone() {
        try {
            return (ProcessedUpdateAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
