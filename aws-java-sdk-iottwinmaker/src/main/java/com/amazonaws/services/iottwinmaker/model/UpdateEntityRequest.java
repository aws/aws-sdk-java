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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEntityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the entity.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ID of the entity.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The name of the entity.
     * </p>
     */
    private String entityName;
    /**
     * <p>
     * The description of the entity.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object that maps strings to the component updates in the request. Each string in the mapping must be unique to
     * this object.
     * </p>
     */
    private java.util.Map<String, ComponentUpdateRequest> componentUpdates;
    /**
     * <p>
     * An object that describes the update request for a parent entity.
     * </p>
     */
    private ParentEntityUpdateRequest parentEntityUpdate;

    /**
     * <p>
     * The ID of the workspace that contains the entity.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the entity.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the entity.
     * </p>
     * 
     * @return The ID of the workspace that contains the entity.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the entity.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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

    public UpdateEntityRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param entityName
     *        The name of the entity.
     */

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @return The name of the entity.
     */

    public String getEntityName() {
        return this.entityName;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param entityName
     *        The name of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest withEntityName(String entityName) {
        setEntityName(entityName);
        return this;
    }

    /**
     * <p>
     * The description of the entity.
     * </p>
     * 
     * @param description
     *        The description of the entity.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the entity.
     * </p>
     * 
     * @return The description of the entity.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the entity.
     * </p>
     * 
     * @param description
     *        The description of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the component updates in the request. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @return An object that maps strings to the component updates in the request. Each string in the mapping must be
     *         unique to this object.
     */

    public java.util.Map<String, ComponentUpdateRequest> getComponentUpdates() {
        return componentUpdates;
    }

    /**
     * <p>
     * An object that maps strings to the component updates in the request. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @param componentUpdates
     *        An object that maps strings to the component updates in the request. Each string in the mapping must be
     *        unique to this object.
     */

    public void setComponentUpdates(java.util.Map<String, ComponentUpdateRequest> componentUpdates) {
        this.componentUpdates = componentUpdates;
    }

    /**
     * <p>
     * An object that maps strings to the component updates in the request. Each string in the mapping must be unique to
     * this object.
     * </p>
     * 
     * @param componentUpdates
     *        An object that maps strings to the component updates in the request. Each string in the mapping must be
     *        unique to this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest withComponentUpdates(java.util.Map<String, ComponentUpdateRequest> componentUpdates) {
        setComponentUpdates(componentUpdates);
        return this;
    }

    /**
     * Add a single ComponentUpdates entry
     *
     * @see UpdateEntityRequest#withComponentUpdates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest addComponentUpdatesEntry(String key, ComponentUpdateRequest value) {
        if (null == this.componentUpdates) {
            this.componentUpdates = new java.util.HashMap<String, ComponentUpdateRequest>();
        }
        if (this.componentUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.componentUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ComponentUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest clearComponentUpdatesEntries() {
        this.componentUpdates = null;
        return this;
    }

    /**
     * <p>
     * An object that describes the update request for a parent entity.
     * </p>
     * 
     * @param parentEntityUpdate
     *        An object that describes the update request for a parent entity.
     */

    public void setParentEntityUpdate(ParentEntityUpdateRequest parentEntityUpdate) {
        this.parentEntityUpdate = parentEntityUpdate;
    }

    /**
     * <p>
     * An object that describes the update request for a parent entity.
     * </p>
     * 
     * @return An object that describes the update request for a parent entity.
     */

    public ParentEntityUpdateRequest getParentEntityUpdate() {
        return this.parentEntityUpdate;
    }

    /**
     * <p>
     * An object that describes the update request for a parent entity.
     * </p>
     * 
     * @param parentEntityUpdate
     *        An object that describes the update request for a parent entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEntityRequest withParentEntityUpdate(ParentEntityUpdateRequest parentEntityUpdate) {
        setParentEntityUpdate(parentEntityUpdate);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityName() != null)
            sb.append("EntityName: ").append(getEntityName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComponentUpdates() != null)
            sb.append("ComponentUpdates: ").append(getComponentUpdates()).append(",");
        if (getParentEntityUpdate() != null)
            sb.append("ParentEntityUpdate: ").append(getParentEntityUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEntityRequest == false)
            return false;
        UpdateEntityRequest other = (UpdateEntityRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComponentUpdates() == null ^ this.getComponentUpdates() == null)
            return false;
        if (other.getComponentUpdates() != null && other.getComponentUpdates().equals(this.getComponentUpdates()) == false)
            return false;
        if (other.getParentEntityUpdate() == null ^ this.getParentEntityUpdate() == null)
            return false;
        if (other.getParentEntityUpdate() != null && other.getParentEntityUpdate().equals(this.getParentEntityUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComponentUpdates() == null) ? 0 : getComponentUpdates().hashCode());
        hashCode = prime * hashCode + ((getParentEntityUpdate() == null) ? 0 : getParentEntityUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEntityRequest clone() {
        return (UpdateEntityRequest) super.clone();
    }

}
