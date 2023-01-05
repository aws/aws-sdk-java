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
 * An object that returns information about a component type create or update request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ComponentResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
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
     * The status of the component type.
     * </p>
     */
    private Status status;
    /**
     * <p>
     * The name of the property definition set in the request.
     * </p>
     */
    private String definedIn;
    /**
     * <p>
     * An object that maps strings to the properties to set in the component type. Each string in the mapping must be
     * unique to this object.
     * </p>
     */
    private java.util.Map<String, PropertyResponse> properties;
    /**
     * <p>
     * The property groups.
     * </p>
     */
    private java.util.Map<String, ComponentPropertyGroupResponse> propertyGroups;
    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     */
    private String syncSource;

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentResponse withComponentName(String componentName) {
        setComponentName(componentName);
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

    public ComponentResponse withDescription(String description) {
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

    public ComponentResponse withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * The status of the component type.
     * </p>
     * 
     * @param status
     *        The status of the component type.
     */

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component type.
     * </p>
     * 
     * @return The status of the component type.
     */

    public Status getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the component type.
     * </p>
     * 
     * @param status
     *        The status of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentResponse withStatus(Status status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The name of the property definition set in the request.
     * </p>
     * 
     * @param definedIn
     *        The name of the property definition set in the request.
     */

    public void setDefinedIn(String definedIn) {
        this.definedIn = definedIn;
    }

    /**
     * <p>
     * The name of the property definition set in the request.
     * </p>
     * 
     * @return The name of the property definition set in the request.
     */

    public String getDefinedIn() {
        return this.definedIn;
    }

    /**
     * <p>
     * The name of the property definition set in the request.
     * </p>
     * 
     * @param definedIn
     *        The name of the property definition set in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentResponse withDefinedIn(String definedIn) {
        setDefinedIn(definedIn);
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

    public java.util.Map<String, PropertyResponse> getProperties() {
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

    public void setProperties(java.util.Map<String, PropertyResponse> properties) {
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

    public ComponentResponse withProperties(java.util.Map<String, PropertyResponse> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see ComponentResponse#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentResponse addPropertiesEntry(String key, PropertyResponse value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, PropertyResponse>();
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

    public ComponentResponse clearPropertiesEntries() {
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

    public java.util.Map<String, ComponentPropertyGroupResponse> getPropertyGroups() {
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

    public void setPropertyGroups(java.util.Map<String, ComponentPropertyGroupResponse> propertyGroups) {
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

    public ComponentResponse withPropertyGroups(java.util.Map<String, ComponentPropertyGroupResponse> propertyGroups) {
        setPropertyGroups(propertyGroups);
        return this;
    }

    /**
     * Add a single PropertyGroups entry
     *
     * @see ComponentResponse#withPropertyGroups
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentResponse addPropertyGroupsEntry(String key, ComponentPropertyGroupResponse value) {
        if (null == this.propertyGroups) {
            this.propertyGroups = new java.util.HashMap<String, ComponentPropertyGroupResponse>();
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

    public ComponentResponse clearPropertyGroupsEntries() {
        this.propertyGroups = null;
        return this;
    }

    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     * 
     * @param syncSource
     *        The syncSource of the sync job, if this entity was created by a sync job.
     */

    public void setSyncSource(String syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     * 
     * @return The syncSource of the sync job, if this entity was created by a sync job.
     */

    public String getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     * 
     * @param syncSource
     *        The syncSource of the sync job, if this entity was created by a sync job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentResponse withSyncSource(String syncSource) {
        setSyncSource(syncSource);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDefinedIn() != null)
            sb.append("DefinedIn: ").append(getDefinedIn()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getPropertyGroups() != null)
            sb.append("PropertyGroups: ").append(getPropertyGroups()).append(",");
        if (getSyncSource() != null)
            sb.append("SyncSource: ").append(getSyncSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentResponse == false)
            return false;
        ComponentResponse other = (ComponentResponse) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDefinedIn() == null ^ this.getDefinedIn() == null)
            return false;
        if (other.getDefinedIn() != null && other.getDefinedIn().equals(this.getDefinedIn()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getPropertyGroups() == null ^ this.getPropertyGroups() == null)
            return false;
        if (other.getPropertyGroups() != null && other.getPropertyGroups().equals(this.getPropertyGroups()) == false)
            return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null)
            return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDefinedIn() == null) ? 0 : getDefinedIn().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertyGroups() == null) ? 0 : getPropertyGroups().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        return hashCode;
    }

    @Override
    public ComponentResponse clone() {
        try {
            return (ComponentResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ComponentResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
