/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/UpdateAttributeGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAttributeGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     */
    private String attributeGroup;
    /**
     * <p>
     * The new name of the attribute group. The name must be unique in the region in which you are updating the
     * attribute group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     */
    private String attributes;

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     * 
     * @param attributeGroup
     *        The name or ID of the attribute group that holds the attributes to describe the application.
     */

    public void setAttributeGroup(String attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     * 
     * @return The name or ID of the attribute group that holds the attributes to describe the application.
     */

    public String getAttributeGroup() {
        return this.attributeGroup;
    }

    /**
     * <p>
     * The name or ID of the attribute group that holds the attributes to describe the application.
     * </p>
     * 
     * @param attributeGroup
     *        The name or ID of the attribute group that holds the attributes to describe the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttributeGroupRequest withAttributeGroup(String attributeGroup) {
        setAttributeGroup(attributeGroup);
        return this;
    }

    /**
     * <p>
     * The new name of the attribute group. The name must be unique in the region in which you are updating the
     * attribute group.
     * </p>
     * 
     * @param name
     *        The new name of the attribute group. The name must be unique in the region in which you are updating the
     *        attribute group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name of the attribute group. The name must be unique in the region in which you are updating the
     * attribute group.
     * </p>
     * 
     * @return The new name of the attribute group. The name must be unique in the region in which you are updating the
     *         attribute group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name of the attribute group. The name must be unique in the region in which you are updating the
     * attribute group.
     * </p>
     * 
     * @param name
     *        The new name of the attribute group. The name must be unique in the region in which you are updating the
     *        attribute group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttributeGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     * 
     * @param description
     *        The description of the attribute group that the user provides.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     * 
     * @return The description of the attribute group that the user provides.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the attribute group that the user provides.
     * </p>
     * 
     * @param description
     *        The description of the attribute group that the user provides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttributeGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     * 
     * @param attributes
     *        A JSON string in the form of nested key-value pairs that represent the attributes in the group and
     *        describes an application and its components.
     */

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     * 
     * @return A JSON string in the form of nested key-value pairs that represent the attributes in the group and
     *         describes an application and its components.
     */

    public String getAttributes() {
        return this.attributes;
    }

    /**
     * <p>
     * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an
     * application and its components.
     * </p>
     * 
     * @param attributes
     *        A JSON string in the form of nested key-value pairs that represent the attributes in the group and
     *        describes an application and its components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAttributeGroupRequest withAttributes(String attributes) {
        setAttributes(attributes);
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
        if (getAttributeGroup() != null)
            sb.append("AttributeGroup: ").append(getAttributeGroup()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAttributeGroupRequest == false)
            return false;
        UpdateAttributeGroupRequest other = (UpdateAttributeGroupRequest) obj;
        if (other.getAttributeGroup() == null ^ this.getAttributeGroup() == null)
            return false;
        if (other.getAttributeGroup() != null && other.getAttributeGroup().equals(this.getAttributeGroup()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeGroup() == null) ? 0 : getAttributeGroup().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAttributeGroupRequest clone() {
        return (UpdateAttributeGroupRequest) super.clone();
    }

}
