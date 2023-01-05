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
 * An object that filters items in a list of entities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListEntitiesFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parent of the entities in the list.
     * </p>
     */
    private String parentEntityId;
    /**
     * <p>
     * The ID of the component type in the entities in the list.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * The external-Id property of a component. The external-Id property is the primary key of an external storage
     * system.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The parent of the entities in the list.
     * </p>
     * 
     * @param parentEntityId
     *        The parent of the entities in the list.
     */

    public void setParentEntityId(String parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    /**
     * <p>
     * The parent of the entities in the list.
     * </p>
     * 
     * @return The parent of the entities in the list.
     */

    public String getParentEntityId() {
        return this.parentEntityId;
    }

    /**
     * <p>
     * The parent of the entities in the list.
     * </p>
     * 
     * @param parentEntityId
     *        The parent of the entities in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesFilter withParentEntityId(String parentEntityId) {
        setParentEntityId(parentEntityId);
        return this;
    }

    /**
     * <p>
     * The ID of the component type in the entities in the list.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type in the entities in the list.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type in the entities in the list.
     * </p>
     * 
     * @return The ID of the component type in the entities in the list.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type in the entities in the list.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type in the entities in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesFilter withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * The external-Id property of a component. The external-Id property is the primary key of an external storage
     * system.
     * </p>
     * 
     * @param externalId
     *        The external-Id property of a component. The external-Id property is the primary key of an external
     *        storage system.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external-Id property of a component. The external-Id property is the primary key of an external storage
     * system.
     * </p>
     * 
     * @return The external-Id property of a component. The external-Id property is the primary key of an external
     *         storage system.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external-Id property of a component. The external-Id property is the primary key of an external storage
     * system.
     * </p>
     * 
     * @param externalId
     *        The external-Id property of a component. The external-Id property is the primary key of an external
     *        storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesFilter withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getParentEntityId() != null)
            sb.append("ParentEntityId: ").append(getParentEntityId()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitiesFilter == false)
            return false;
        ListEntitiesFilter other = (ListEntitiesFilter) obj;
        if (other.getParentEntityId() == null ^ this.getParentEntityId() == null)
            return false;
        if (other.getParentEntityId() != null && other.getParentEntityId().equals(this.getParentEntityId()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentEntityId() == null) ? 0 : getParentEntityId().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitiesFilter clone() {
        try {
            return (ListEntitiesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ListEntitiesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
