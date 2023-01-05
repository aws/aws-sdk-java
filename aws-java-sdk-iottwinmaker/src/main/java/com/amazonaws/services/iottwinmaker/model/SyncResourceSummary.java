/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sync resource summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/SyncResourceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The external Id.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The resource Id.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The sync resource summary status.
     * </p>
     */
    private SyncResourceStatus status;
    /**
     * <p>
     * The update date and time.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @see SyncResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see SyncResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncResourceType
     */

    public SyncResourceSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncResourceType
     */

    public SyncResourceSummary withResourceType(SyncResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The external Id.
     * </p>
     * 
     * @param externalId
     *        The external Id.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external Id.
     * </p>
     * 
     * @return The external Id.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external Id.
     * </p>
     * 
     * @param externalId
     *        The external Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncResourceSummary withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The resource Id.
     * </p>
     * 
     * @param resourceId
     *        The resource Id.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource Id.
     * </p>
     * 
     * @return The resource Id.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource Id.
     * </p>
     * 
     * @param resourceId
     *        The resource Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncResourceSummary withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The sync resource summary status.
     * </p>
     * 
     * @param status
     *        The sync resource summary status.
     */

    public void setStatus(SyncResourceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The sync resource summary status.
     * </p>
     * 
     * @return The sync resource summary status.
     */

    public SyncResourceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The sync resource summary status.
     * </p>
     * 
     * @param status
     *        The sync resource summary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncResourceSummary withStatus(SyncResourceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The update date and time.
     * </p>
     * 
     * @param updateDateTime
     *        The update date and time.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The update date and time.
     * </p>
     * 
     * @return The update date and time.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The update date and time.
     * </p>
     * 
     * @param updateDateTime
     *        The update date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncResourceSummary withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncResourceSummary == false)
            return false;
        SyncResourceSummary other = (SyncResourceSummary) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SyncResourceSummary clone() {
        try {
            return (SyncResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.SyncResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
