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
 * An object that uniquely identifies an entity property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/EntityPropertyReference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityPropertyReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * A mapping of external IDs to property names. External IDs uniquely identify properties from external data stores.
     * </p>
     */
    private java.util.Map<String, String> externalIdProperty;
    /**
     * <p>
     * The ID of the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The name of the property.
     * </p>
     */
    private String propertyName;

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

    public EntityPropertyReference withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * A mapping of external IDs to property names. External IDs uniquely identify properties from external data stores.
     * </p>
     * 
     * @return A mapping of external IDs to property names. External IDs uniquely identify properties from external data
     *         stores.
     */

    public java.util.Map<String, String> getExternalIdProperty() {
        return externalIdProperty;
    }

    /**
     * <p>
     * A mapping of external IDs to property names. External IDs uniquely identify properties from external data stores.
     * </p>
     * 
     * @param externalIdProperty
     *        A mapping of external IDs to property names. External IDs uniquely identify properties from external data
     *        stores.
     */

    public void setExternalIdProperty(java.util.Map<String, String> externalIdProperty) {
        this.externalIdProperty = externalIdProperty;
    }

    /**
     * <p>
     * A mapping of external IDs to property names. External IDs uniquely identify properties from external data stores.
     * </p>
     * 
     * @param externalIdProperty
     *        A mapping of external IDs to property names. External IDs uniquely identify properties from external data
     *        stores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityPropertyReference withExternalIdProperty(java.util.Map<String, String> externalIdProperty) {
        setExternalIdProperty(externalIdProperty);
        return this;
    }

    /**
     * Add a single ExternalIdProperty entry
     *
     * @see EntityPropertyReference#withExternalIdProperty
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EntityPropertyReference addExternalIdPropertyEntry(String key, String value) {
        if (null == this.externalIdProperty) {
            this.externalIdProperty = new java.util.HashMap<String, String>();
        }
        if (this.externalIdProperty.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.externalIdProperty.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExternalIdProperty.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityPropertyReference clearExternalIdPropertyEntries() {
        this.externalIdProperty = null;
        return this;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @return The ID of the entity.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityPropertyReference withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param propertyName
     *        The name of the property.
     */

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @return The name of the property.
     */

    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param propertyName
     *        The name of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityPropertyReference withPropertyName(String propertyName) {
        setPropertyName(propertyName);
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
        if (getExternalIdProperty() != null)
            sb.append("ExternalIdProperty: ").append(getExternalIdProperty()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getPropertyName() != null)
            sb.append("PropertyName: ").append(getPropertyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityPropertyReference == false)
            return false;
        EntityPropertyReference other = (EntityPropertyReference) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getExternalIdProperty() == null ^ this.getExternalIdProperty() == null)
            return false;
        if (other.getExternalIdProperty() != null && other.getExternalIdProperty().equals(this.getExternalIdProperty()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null && other.getPropertyName().equals(this.getPropertyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getExternalIdProperty() == null) ? 0 : getExternalIdProperty().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        return hashCode;
    }

    @Override
    public EntityPropertyReference clone() {
        try {
            return (EntityPropertyReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.EntityPropertyReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
