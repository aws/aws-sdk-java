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
 * An object that sets information about a component type create or update request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ComponentRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the component request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the component type.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * An object that maps strings to the properties to set in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     */
    private java.util.Map<String, PropertyRequest> properties;
    /**
     * <p>
     * The property groups.
     * </p>
     */
    private java.util.Map<String, ComponentPropertyGroupRequest> propertyGroups;

    /**
     * <p>
     * The description of the component request.
     * </p>
     * 
     * @param description
     *        The description of the component request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component request.
     * </p>
     * 
     * @return The description of the component request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component request.
     * </p>
     * 
     * @param description
     *        The description of the component request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @return The ID of the component type.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the properties to set in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     * 
     * @return An object that maps strings to the properties to set in the component type. Each string in the mapping
     *         must be unique to this object.
     */

    public java.util.Map<String, PropertyRequest> getProperties() {
        return properties;
    }

    /**
     * <p>
     * An object that maps strings to the properties to set in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     * 
     * @param properties
     *        An object that maps strings to the properties to set in the component type. Each string in the mapping
     *        must be unique to this object.
     */

    public void setProperties(java.util.Map<String, PropertyRequest> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * An object that maps strings to the properties to set in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     * 
     * @param properties
     *        An object that maps strings to the properties to set in the component type. Each string in the mapping
     *        must be unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest withProperties(java.util.Map<String, PropertyRequest> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see ComponentRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest addPropertiesEntry(String key, PropertyRequest value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, PropertyRequest>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The property groups.
     * </p>
     * 
     * @return The property groups.
     */

    public java.util.Map<String, ComponentPropertyGroupRequest> getPropertyGroups() {
        return propertyGroups;
    }

    /**
     * <p>
     * The property groups.
     * </p>
     * 
     * @param propertyGroups
     *        The property groups.
     */

    public void setPropertyGroups(java.util.Map<String, ComponentPropertyGroupRequest> propertyGroups) {
        this.propertyGroups = propertyGroups;
    }

    /**
     * <p>
     * The property groups.
     * </p>
     * 
     * @param propertyGroups
     *        The property groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest withPropertyGroups(java.util.Map<String, ComponentPropertyGroupRequest> propertyGroups) {
        setPropertyGroups(propertyGroups);
        return this;
    }

    /**
     * Add a single PropertyGroups entry
     *
     * @see ComponentRequest#withPropertyGroups
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest addPropertyGroupsEntry(String key, ComponentPropertyGroupRequest value) {
        if (null == this.propertyGroups) {
            this.propertyGroups = new java.util.HashMap<String, ComponentPropertyGroupRequest>();
        }
        if (this.propertyGroups.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyGroups.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyGroups.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentRequest clearPropertyGroupsEntries() {
        this.propertyGroups = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getPropertyGroups() != null)
            sb.append("PropertyGroups: ").append(getPropertyGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentRequest == false)
            return false;
        ComponentRequest other = (ComponentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getPropertyGroups() == null ^ this.getPropertyGroups() == null)
            return false;
        if (other.getPropertyGroups() != null && other.getPropertyGroups().equals(this.getPropertyGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertyGroups() == null) ? 0 : getPropertyGroups().hashCode());
        return hashCode;
    }

    @Override
    public ComponentRequest clone() {
        try {
            return (ComponentRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ComponentRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
