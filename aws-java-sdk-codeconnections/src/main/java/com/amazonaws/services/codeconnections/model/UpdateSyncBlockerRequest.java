/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateSyncBlocker" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSyncBlockerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the sync blocker to be updated.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The sync type of the sync blocker to be updated.
     * </p>
     */
    private String syncType;
    /**
     * <p>
     * The name of the resource for the sync blocker to be updated.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The reason for resolving the sync blocker.
     * </p>
     */
    private String resolvedReason;

    /**
     * <p>
     * The ID of the sync blocker to be updated.
     * </p>
     * 
     * @param id
     *        The ID of the sync blocker to be updated.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the sync blocker to be updated.
     * </p>
     * 
     * @return The ID of the sync blocker to be updated.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the sync blocker to be updated.
     * </p>
     * 
     * @param id
     *        The ID of the sync blocker to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSyncBlockerRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The sync type of the sync blocker to be updated.
     * </p>
     * 
     * @param syncType
     *        The sync type of the sync blocker to be updated.
     * @see SyncConfigurationType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The sync type of the sync blocker to be updated.
     * </p>
     * 
     * @return The sync type of the sync blocker to be updated.
     * @see SyncConfigurationType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The sync type of the sync blocker to be updated.
     * </p>
     * 
     * @param syncType
     *        The sync type of the sync blocker to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public UpdateSyncBlockerRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The sync type of the sync blocker to be updated.
     * </p>
     * 
     * @param syncType
     *        The sync type of the sync blocker to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public UpdateSyncBlockerRequest withSyncType(SyncConfigurationType syncType) {
        this.syncType = syncType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource for the sync blocker to be updated.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource for the sync blocker to be updated.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource for the sync blocker to be updated.
     * </p>
     * 
     * @return The name of the resource for the sync blocker to be updated.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource for the sync blocker to be updated.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource for the sync blocker to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSyncBlockerRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The reason for resolving the sync blocker.
     * </p>
     * 
     * @param resolvedReason
     *        The reason for resolving the sync blocker.
     */

    public void setResolvedReason(String resolvedReason) {
        this.resolvedReason = resolvedReason;
    }

    /**
     * <p>
     * The reason for resolving the sync blocker.
     * </p>
     * 
     * @return The reason for resolving the sync blocker.
     */

    public String getResolvedReason() {
        return this.resolvedReason;
    }

    /**
     * <p>
     * The reason for resolving the sync blocker.
     * </p>
     * 
     * @param resolvedReason
     *        The reason for resolving the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSyncBlockerRequest withResolvedReason(String resolvedReason) {
        setResolvedReason(resolvedReason);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSyncType() != null)
            sb.append("SyncType: ").append(getSyncType()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResolvedReason() != null)
            sb.append("ResolvedReason: ").append(getResolvedReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSyncBlockerRequest == false)
            return false;
        UpdateSyncBlockerRequest other = (UpdateSyncBlockerRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResolvedReason() == null ^ this.getResolvedReason() == null)
            return false;
        if (other.getResolvedReason() != null && other.getResolvedReason().equals(this.getResolvedReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResolvedReason() == null) ? 0 : getResolvedReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSyncBlockerRequest clone() {
        return (UpdateSyncBlockerRequest) super.clone();
    }

}
