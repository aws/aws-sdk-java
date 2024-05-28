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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateSyncBlocker" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSyncBlockerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource name for the sync blocker.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The parent resource name for the sync blocker.
     * </p>
     */
    private String parentResourceName;
    /**
     * <p>
     * Information about the sync blocker to be updated.
     * </p>
     */
    private SyncBlocker syncBlocker;

    /**
     * <p>
     * The resource name for the sync blocker.
     * </p>
     * 
     * @param resourceName
     *        The resource name for the sync blocker.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name for the sync blocker.
     * </p>
     * 
     * @return The resource name for the sync blocker.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The resource name for the sync blocker.
     * </p>
     * 
     * @param resourceName
     *        The resource name for the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSyncBlockerResult withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The parent resource name for the sync blocker.
     * </p>
     * 
     * @param parentResourceName
     *        The parent resource name for the sync blocker.
     */

    public void setParentResourceName(String parentResourceName) {
        this.parentResourceName = parentResourceName;
    }

    /**
     * <p>
     * The parent resource name for the sync blocker.
     * </p>
     * 
     * @return The parent resource name for the sync blocker.
     */

    public String getParentResourceName() {
        return this.parentResourceName;
    }

    /**
     * <p>
     * The parent resource name for the sync blocker.
     * </p>
     * 
     * @param parentResourceName
     *        The parent resource name for the sync blocker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSyncBlockerResult withParentResourceName(String parentResourceName) {
        setParentResourceName(parentResourceName);
        return this;
    }

    /**
     * <p>
     * Information about the sync blocker to be updated.
     * </p>
     * 
     * @param syncBlocker
     *        Information about the sync blocker to be updated.
     */

    public void setSyncBlocker(SyncBlocker syncBlocker) {
        this.syncBlocker = syncBlocker;
    }

    /**
     * <p>
     * Information about the sync blocker to be updated.
     * </p>
     * 
     * @return Information about the sync blocker to be updated.
     */

    public SyncBlocker getSyncBlocker() {
        return this.syncBlocker;
    }

    /**
     * <p>
     * Information about the sync blocker to be updated.
     * </p>
     * 
     * @param syncBlocker
     *        Information about the sync blocker to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSyncBlockerResult withSyncBlocker(SyncBlocker syncBlocker) {
        setSyncBlocker(syncBlocker);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getParentResourceName() != null)
            sb.append("ParentResourceName: ").append(getParentResourceName()).append(",");
        if (getSyncBlocker() != null)
            sb.append("SyncBlocker: ").append(getSyncBlocker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSyncBlockerResult == false)
            return false;
        UpdateSyncBlockerResult other = (UpdateSyncBlockerResult) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getParentResourceName() == null ^ this.getParentResourceName() == null)
            return false;
        if (other.getParentResourceName() != null && other.getParentResourceName().equals(this.getParentResourceName()) == false)
            return false;
        if (other.getSyncBlocker() == null ^ this.getSyncBlocker() == null)
            return false;
        if (other.getSyncBlocker() != null && other.getSyncBlocker().equals(this.getSyncBlocker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getParentResourceName() == null) ? 0 : getParentResourceName().hashCode());
        hashCode = prime * hashCode + ((getSyncBlocker() == null) ? 0 : getSyncBlocker().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSyncBlockerResult clone() {
        try {
            return (UpdateSyncBlockerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
