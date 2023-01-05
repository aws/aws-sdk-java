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
 * The component update request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ComponentUpdateRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentUpdateRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The update type of the component update request.
     * </p>
     */
    private String updateType;
    /**
     * <p>
     * The description of the component type.
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
     * An object that maps strings to the properties to set in the component type update. Each string in the mapping
     * must be unique to this object.
     * </p>
     */
    private java.util.Map<String, PropertyRequest> propertyUpdates;
    /**
     * <p>
     * The property group updates.
     * </p>
     */
    private java.util.Map<String, ComponentPropertyGroupRequest> propertyGroupUpdates;

    /**
     * <p>
     * The update type of the component update request.
     * </p>
     * 
     * @param updateType
     *        The update type of the component update request.
     * @see ComponentUpdateType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The update type of the component update request.
     * </p>
     * 
     * @return The update type of the component update request.
     * @see ComponentUpdateType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The update type of the component update request.
     * </p>
     * 
     * @param updateType
     *        The update type of the component update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentUpdateType
     */

    public ComponentUpdateRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The update type of the component update request.
     * </p>
     * 
     * @param updateType
     *        The update type of the component update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentUpdateType
     */

    public ComponentUpdateRequest withUpdateType(ComponentUpdateType updateType) {
        this.updateType = updateType.toString();
        return this;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @param description
     *        The description of the component type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @return The description of the component type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component type.
     * </p>
     * 
     * @param description
     *        The description of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest withDescription(String description) {
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

    public ComponentUpdateRequest withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the properties to set in the component type update. Each string in the mapping
     * must be unique to this object.
     * </p>
     * 
     * @return An object that maps strings to the properties to set in the component type update. Each string in the
     *         mapping must be unique to this object.
     */

    public java.util.Map<String, PropertyRequest> getPropertyUpdates() {
        return propertyUpdates;
    }

    /**
     * <p>
     * An object that maps strings to the properties to set in the component type update. Each string in the mapping
     * must be unique to this object.
     * </p>
     * 
     * @param propertyUpdates
     *        An object that maps strings to the properties to set in the component type update. Each string in the
     *        mapping must be unique to this object.
     */

    public void setPropertyUpdates(java.util.Map<String, PropertyRequest> propertyUpdates) {
        this.propertyUpdates = propertyUpdates;
    }

    /**
     * <p>
     * An object that maps strings to the properties to set in the component type update. Each string in the mapping
     * must be unique to this object.
     * </p>
     * 
     * @param propertyUpdates
     *        An object that maps strings to the properties to set in the component type update. Each string in the
     *        mapping must be unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest withPropertyUpdates(java.util.Map<String, PropertyRequest> propertyUpdates) {
        setPropertyUpdates(propertyUpdates);
        return this;
    }

    /**
     * Add a single PropertyUpdates entry
     *
     * @see ComponentUpdateRequest#withPropertyUpdates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest addPropertyUpdatesEntry(String key, PropertyRequest value) {
        if (null == this.propertyUpdates) {
            this.propertyUpdates = new java.util.HashMap<String, PropertyRequest>();
        }
        if (this.propertyUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest clearPropertyUpdatesEntries() {
        this.propertyUpdates = null;
        return this;
    }

    /**
     * <p>
     * The property group updates.
     * </p>
     * 
     * @return The property group updates.
     */

    public java.util.Map<String, ComponentPropertyGroupRequest> getPropertyGroupUpdates() {
        return propertyGroupUpdates;
    }

    /**
     * <p>
     * The property group updates.
     * </p>
     * 
     * @param propertyGroupUpdates
     *        The property group updates.
     */

    public void setPropertyGroupUpdates(java.util.Map<String, ComponentPropertyGroupRequest> propertyGroupUpdates) {
        this.propertyGroupUpdates = propertyGroupUpdates;
    }

    /**
     * <p>
     * The property group updates.
     * </p>
     * 
     * @param propertyGroupUpdates
     *        The property group updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest withPropertyGroupUpdates(java.util.Map<String, ComponentPropertyGroupRequest> propertyGroupUpdates) {
        setPropertyGroupUpdates(propertyGroupUpdates);
        return this;
    }

    /**
     * Add a single PropertyGroupUpdates entry
     *
     * @see ComponentUpdateRequest#withPropertyGroupUpdates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest addPropertyGroupUpdatesEntry(String key, ComponentPropertyGroupRequest value) {
        if (null == this.propertyGroupUpdates) {
            this.propertyGroupUpdates = new java.util.HashMap<String, ComponentPropertyGroupRequest>();
        }
        if (this.propertyGroupUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.propertyGroupUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PropertyGroupUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentUpdateRequest clearPropertyGroupUpdatesEntries() {
        this.propertyGroupUpdates = null;
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
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getPropertyUpdates() != null)
            sb.append("PropertyUpdates: ").append(getPropertyUpdates()).append(",");
        if (getPropertyGroupUpdates() != null)
            sb.append("PropertyGroupUpdates: ").append(getPropertyGroupUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentUpdateRequest == false)
            return false;
        ComponentUpdateRequest other = (ComponentUpdateRequest) obj;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getPropertyUpdates() == null ^ this.getPropertyUpdates() == null)
            return false;
        if (other.getPropertyUpdates() != null && other.getPropertyUpdates().equals(this.getPropertyUpdates()) == false)
            return false;
        if (other.getPropertyGroupUpdates() == null ^ this.getPropertyGroupUpdates() == null)
            return false;
        if (other.getPropertyGroupUpdates() != null && other.getPropertyGroupUpdates().equals(this.getPropertyGroupUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getPropertyUpdates() == null) ? 0 : getPropertyUpdates().hashCode());
        hashCode = prime * hashCode + ((getPropertyGroupUpdates() == null) ? 0 : getPropertyGroupUpdates().hashCode());
        return hashCode;
    }

    @Override
    public ComponentUpdateRequest clone() {
        try {
            return (ComponentUpdateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ComponentUpdateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
