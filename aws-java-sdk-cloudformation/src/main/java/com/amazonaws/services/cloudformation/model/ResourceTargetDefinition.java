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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The field that AWS CloudFormation will change, such as the name of a resource's property, and whether the resource
 * will be recreated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ResourceTargetDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceTargetDefinition implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     * attributes, the value is null.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this property
     * causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see the
     * update behavior for that <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     */
    private String requiresRecreation;

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param attribute
     *        Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     *        <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @see ResourceAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @return Indicates which resource attribute is triggering this update, such as a change in the resource
     *         attribute's <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @see ResourceAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param attribute
     *        Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     *        <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceTargetDefinition withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param attribute
     *        Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     *        <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @see ResourceAttribute
     */

    public void setAttribute(ResourceAttribute attribute) {
        withAttribute(attribute);
    }

    /**
     * <p>
     * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     * <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * </p>
     * 
     * @param attribute
     *        Indicates which resource attribute is triggering this update, such as a change in the resource attribute's
     *        <code>Metadata</code>, <code>Properties</code>, or <code>Tags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceAttribute
     */

    public ResourceTargetDefinition withAttribute(ResourceAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     * attributes, the value is null.
     * </p>
     * 
     * @param name
     *        If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     *        attributes, the value is null.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     * attributes, the value is null.
     * </p>
     * 
     * @return If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     *         attributes, the value is null.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     * attributes, the value is null.
     * </p>
     * 
     * @param name
     *        If the <code>Attribute</code> value is <code>Properties</code>, the name of the property. For all other
     *        attributes, the value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTargetDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this property
     * causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see the
     * update behavior for that <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param requiresRecreation
     *        If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this
     *        property causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     *        <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see
     *        the update behavior for that <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >property</a> in the AWS CloudFormation User Guide.
     * @see RequiresRecreation
     */

    public void setRequiresRecreation(String requiresRecreation) {
        this.requiresRecreation = requiresRecreation;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this property
     * causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see the
     * update behavior for that <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @return If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this
     *         property causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>,
     *         or <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation,
     *         see the update behavior for that <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >property</a> in the AWS CloudFormation User Guide.
     * @see RequiresRecreation
     */

    public String getRequiresRecreation() {
        return this.requiresRecreation;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this property
     * causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see the
     * update behavior for that <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param requiresRecreation
     *        If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this
     *        property causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     *        <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see
     *        the update behavior for that <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >property</a> in the AWS CloudFormation User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiresRecreation
     */

    public ResourceTargetDefinition withRequiresRecreation(String requiresRecreation) {
        setRequiresRecreation(requiresRecreation);
        return this;
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this property
     * causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see the
     * update behavior for that <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param requiresRecreation
     *        If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this
     *        property causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     *        <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see
     *        the update behavior for that <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >property</a> in the AWS CloudFormation User Guide.
     * @see RequiresRecreation
     */

    public void setRequiresRecreation(RequiresRecreation requiresRecreation) {
        withRequiresRecreation(requiresRecreation);
    }

    /**
     * <p>
     * If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this property
     * causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     * <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see the
     * update behavior for that <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * >property</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param requiresRecreation
     *        If the <code>Attribute</code> value is <code>Properties</code>, indicates whether a change to this
     *        property causes the resource to be recreated. The value can be <code>Never</code>, <code>Always</code>, or
     *        <code>Conditionally</code>. To determine the conditions for a <code>Conditionally</code> recreation, see
     *        the update behavior for that <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >property</a> in the AWS CloudFormation User Guide.
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

}
