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
 * An object that contains the resource type and the number of resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ResourceCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The number of resources.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @return The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceCount withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * </p>
     * 
     * @param resourceType
     *        The resource type (for example, <code>"AWS::EC2::Instance"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceCount withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @param count
     *        The number of resources.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @return The number of resources.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of resources.
     * </p>
     * 
     * @param count
     *        The number of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCount withCount(Long count) {
        setCount(count);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceCount == false)
            return false;
        ResourceCount other = (ResourceCount) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public ResourceCount clone() {
        try {
            return (ResourceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ResourceCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
