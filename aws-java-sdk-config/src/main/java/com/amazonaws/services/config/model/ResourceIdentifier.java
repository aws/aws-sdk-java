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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that identify a resource that is discovered by AWS Config, including the resource type, ID, and (if
 * available) the custom resource name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ResourceIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The custom name of the resource (if available).
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The time that the resource was deleted.
     * </p>
     */
    private java.util.Date resourceDeletionTime;

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceIdentifier withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceIdentifier withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource (for example, <code>sg-xxxxxx</code>).
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @return The ID of the resource (for example, <code>sg-xxxxxx</code>).
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The custom name of the resource (if available).
     * </p>
     * 
     * @param resourceName
     *        The custom name of the resource (if available).
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The custom name of the resource (if available).
     * </p>
     * 
     * @return The custom name of the resource (if available).
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The custom name of the resource (if available).
     * </p>
     * 
     * @param resourceName
     *        The custom name of the resource (if available).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The time that the resource was deleted.
     * </p>
     * 
     * @param resourceDeletionTime
     *        The time that the resource was deleted.
     */

    public void setResourceDeletionTime(java.util.Date resourceDeletionTime) {
        this.resourceDeletionTime = resourceDeletionTime;
    }

    /**
     * <p>
     * The time that the resource was deleted.
     * </p>
     * 
     * @return The time that the resource was deleted.
     */

    public java.util.Date getResourceDeletionTime() {
        return this.resourceDeletionTime;
    }

    /**
     * <p>
     * The time that the resource was deleted.
     * </p>
     * 
     * @param resourceDeletionTime
     *        The time that the resource was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withResourceDeletionTime(java.util.Date resourceDeletionTime) {
        setResourceDeletionTime(resourceDeletionTime);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceDeletionTime() != null)
            sb.append("ResourceDeletionTime: ").append(getResourceDeletionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIdentifier == false)
            return false;
        ResourceIdentifier other = (ResourceIdentifier) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceDeletionTime() == null ^ this.getResourceDeletionTime() == null)
            return false;
        if (other.getResourceDeletionTime() != null && other.getResourceDeletionTime().equals(this.getResourceDeletionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceDeletionTime() == null) ? 0 : getResourceDeletionTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceIdentifier clone() {
        try {
            return (ResourceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ResourceIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
