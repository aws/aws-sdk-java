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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Lightsail resource that <code>SetupHistory</code> was ran on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetupHistoryResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetupHistoryResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Lightsail resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lightsail resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;

    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type. For example, <code>Instance</code>.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The name of the Lightsail resource.
     * </p>
     * 
     * @param name
     *        The name of the Lightsail resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Lightsail resource.
     * </p>
     * 
     * @return The name of the Lightsail resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Lightsail resource.
     * </p>
     * 
     * @param name
     *        The name of the Lightsail resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistoryResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lightsail resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Lightsail resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lightsail resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lightsail resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lightsail resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Lightsail resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistoryResource withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp for when the resource was created.
     * </p>
     * 
     * @return The timestamp for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistoryResource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * @return
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistoryResource withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type. For example, <code>Instance</code>.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type. For example, <code>Instance</code>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type. For example, <code>Instance</code>.
     * </p>
     * 
     * @return The Lightsail resource type. For example, <code>Instance</code>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type. For example, <code>Instance</code>.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type. For example, <code>Instance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SetupHistoryResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type. For example, <code>Instance</code>.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type. For example, <code>Instance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SetupHistoryResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetupHistoryResource == false)
            return false;
        SetupHistoryResource other = (SetupHistoryResource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public SetupHistoryResource clone() {
        try {
            return (SetupHistoryResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.SetupHistoryResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
