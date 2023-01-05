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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes a resource type supported by Amazon Web Services Resource Explorer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/SupportedResourceType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedResourceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Web Service that is associated with the resource type. This is the primary service that lets you
     * create and interact with resources of this type.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The unique identifier of the resource type.
     * </p>
     * 
     * @param resourceType
     *        The unique identifier of the resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The unique identifier of the resource type.
     * </p>
     * 
     * @return The unique identifier of the resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The unique identifier of the resource type.
     * </p>
     * 
     * @param resourceType
     *        The unique identifier of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedResourceType withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Service that is associated with the resource type. This is the primary service that lets you
     * create and interact with resources of this type.
     * </p>
     * 
     * @param service
     *        The Amazon Web Service that is associated with the resource type. This is the primary service that lets
     *        you create and interact with resources of this type.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The Amazon Web Service that is associated with the resource type. This is the primary service that lets you
     * create and interact with resources of this type.
     * </p>
     * 
     * @return The Amazon Web Service that is associated with the resource type. This is the primary service that lets
     *         you create and interact with resources of this type.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The Amazon Web Service that is associated with the resource type. This is the primary service that lets you
     * create and interact with resources of this type.
     * </p>
     * 
     * @param service
     *        The Amazon Web Service that is associated with the resource type. This is the primary service that lets
     *        you create and interact with resources of this type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedResourceType withService(String service) {
        setService(service);
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
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedResourceType == false)
            return false;
        SupportedResourceType other = (SupportedResourceType) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public SupportedResourceType clone() {
        try {
            return (SupportedResourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.SupportedResourceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
