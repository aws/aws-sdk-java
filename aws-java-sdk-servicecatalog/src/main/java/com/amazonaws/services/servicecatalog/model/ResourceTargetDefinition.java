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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a change to a resource attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ResourceTargetDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceTargetDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute to be changed.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value is null.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If the attribute is <code>Properties</code>, indicates whether a change to this property causes the resource to
     * be re-created.
     * </p>
     */
    private String requiresRecreation;

    /**
     * <p>
     * The attribute to be changed.
     * </p>
     * 
     * @param attribute
     *        The attribute to be changed.
     * @see ResourceAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute to be changed.
     * </p>
     * 
     * @return The attribute to be changed.
     * @see ResourceAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute to be changed.
     * </p>
     * 
     * @param attribute
     *        The attribute to be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceTargetDefinition withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute to be changed.
     * </p>
     * 
     * @param attribute
     *        The attribute to be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceTargetDefinition withAttribute(ResourceAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value is null.
     * </p>
     * 
     * @param name
     *        If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value
     *        is null.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value is null.
     * </p>
     * 
     * @return If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value
     *         is null.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value is null.
     * </p>
     * 
     * @param name
     *        If the attribute is <code>Properties</code>, the value is the name of the property. Otherwise, the value
     *        is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTargetDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, indicates whether a change to this property causes the resource to
     * be re-created.
     * </p>
     * 
     * @param requiresRecreation
     *        If the attribute is <code>Properties</code>, indicates whether a change to this property causes the
     *        resource to be re-created.
     * @see RequiresRecreation
     */

    public void setRequiresRecreation(String requiresRecreation) {
        this.requiresRecreation = requiresRecreation;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, indicates whether a change to this property causes the resource to
     * be re-created.
     * </p>
     * 
     * @return If the attribute is <code>Properties</code>, indicates whether a change to this property causes the
     *         resource to be re-created.
     * @see RequiresRecreation
     */

    public String getRequiresRecreation() {
        return this.requiresRecreation;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, indicates whether a change to this property causes the resource to
     * be re-created.
     * </p>
     * 
     * @param requiresRecreation
     *        If the attribute is <code>Properties</code>, indicates whether a change to this property causes the
     *        resource to be re-created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiresRecreation
     */

    public ResourceTargetDefinition withRequiresRecreation(String requiresRecreation) {
        setRequiresRecreation(requiresRecreation);
        return this;
    }

    /**
     * <p>
     * If the attribute is <code>Properties</code>, indicates whether a change to this property causes the resource to
     * be re-created.
     * </p>
     * 
     * @param requiresRecreation
     *        If the attribute is <code>Properties</code>, indicates whether a change to this property causes the
     *        resource to be re-created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiresRecreation
     */

    public ResourceTargetDefinition withRequiresRecreation(RequiresRecreation requiresRecreation) {
        this.requiresRecreation = requiresRecreation.toString();
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequiresRecreation() != null)
            sb.append("RequiresRecreation: ").append(getRequiresRecreation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTargetDefinition == false)
            return false;
        ResourceTargetDefinition other = (ResourceTargetDefinition) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequiresRecreation() == null ^ this.getRequiresRecreation() == null)
            return false;
        if (other.getRequiresRecreation() != null && other.getRequiresRecreation().equals(this.getRequiresRecreation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequiresRecreation() == null) ? 0 : getRequiresRecreation().hashCode());
        return hashCode;
    }

    @Override
    public ResourceTargetDefinition clone() {
        try {
            return (ResourceTargetDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ResourceTargetDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
