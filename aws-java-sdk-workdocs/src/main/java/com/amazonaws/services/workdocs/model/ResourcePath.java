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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the path information of a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ResourcePath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The components of the resource path.
     * </p>
     */
    private java.util.List<ResourcePathComponent> components;

    /**
     * <p>
     * The components of the resource path.
     * </p>
     * 
     * @return The components of the resource path.
     */

    public java.util.List<ResourcePathComponent> getComponents() {
        return components;
    }

    /**
     * <p>
     * The components of the resource path.
     * </p>
     * 
     * @param components
     *        The components of the resource path.
     */

    public void setComponents(java.util.Collection<ResourcePathComponent> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<ResourcePathComponent>(components);
    }

    /**
     * <p>
     * The components of the resource path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     *        The components of the resource path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePath withComponents(ResourcePathComponent... components) {
        if (this.components == null) {
            setComponents(new java.util.ArrayList<ResourcePathComponent>(components.length));
        }
        for (ResourcePathComponent ele : components) {
            this.components.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The components of the resource path.
     * </p>
     * 
     * @param components
     *        The components of the resource path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePath withComponents(java.util.Collection<ResourcePathComponent> components) {
        setComponents(components);
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
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePath == false)
            return false;
        ResourcePath other = (ResourcePath) obj;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePath clone() {
        try {
            return (ResourcePath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.ResourcePathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
