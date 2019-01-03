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
 * The relationship of the related resource to the main resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/Relationship" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Relationship implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type of the related resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The custom name of the related resource, if available.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The type of relationship with the related resource.
     * </p>
     */
    private String relationshipName;

    /**
     * <p>
     * The resource type of the related resource.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the related resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the related resource.
     * </p>
     * 
     * @return The resource type of the related resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the related resource.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the related resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Relationship withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the related resource.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the related resource.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The resource type of the related resource.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the related resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Relationship withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @return The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the related resource (for example, <code>sg-xxxxxx</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The custom name of the related resource, if available.
     * </p>
     * 
     * @param resourceName
     *        The custom name of the related resource, if available.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The custom name of the related resource, if available.
     * </p>
     * 
     * @return The custom name of the related resource, if available.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The custom name of the related resource, if available.
     * </p>
     * 
     * @param resourceName
     *        The custom name of the related resource, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The type of relationship with the related resource.
     * </p>
     * 
     * @param relationshipName
     *        The type of relationship with the related resource.
     */

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    /**
     * <p>
     * The type of relationship with the related resource.
     * </p>
     * 
     * @return The type of relationship with the related resource.
     */

    public String getRelationshipName() {
        return this.relationshipName;
    }

    /**
     * <p>
     * The type of relationship with the related resource.
     * </p>
     * 
     * @param relationshipName
     *        The type of relationship with the related resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withRelationshipName(String relationshipName) {
        setRelationshipName(relationshipName);
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
        if (getRelationshipName() != null)
            sb.append("RelationshipName: ").append(getRelationshipName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relationship == false)
            return false;
        Relationship other = (Relationship) obj;
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
        if (other.getRelationshipName() == null ^ this.getRelationshipName() == null)
            return false;
        if (other.getRelationshipName() != null && other.getRelationshipName().equals(this.getRelationshipName()) == false)
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
        hashCode = prime * hashCode + ((getRelationshipName() == null) ? 0 : getRelationshipName().hashCode());
        return hashCode;
    }

    @Override
    public Relationship clone() {
        try {
            return (Relationship) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RelationshipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
