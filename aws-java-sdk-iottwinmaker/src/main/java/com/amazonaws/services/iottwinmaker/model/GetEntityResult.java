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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The ARN of the entity.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The current status of the entity.
     * </p>
     */
    private Status status;
    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The description of the entity.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this
     * object.
     * </p>
     */
    private java.util.Map<String, ComponentResponse> components;
    /**
     * <p>
     * The ID of the parent entity for this entity.
     * </p>
     */
    private String parentEntityId;
    /**
     * <p>
     * A Boolean value that specifies whether the entity has associated child entities.
     * </p>
     */
    private Boolean hasChildEntities;
    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the entity was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;
    /**
     * <p>
     * The syncSource of the sync job, if this entity was created by a sync job.
     * </p>
     */
    private String syncSource;

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

    public GetEntityResult withEntityId(String entityId) {
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

    public GetEntityResult withEntityName(String entityName) {
        setEntityName(entityName);
        return this;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @param arn
     *        The ARN of the entity.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @return The ARN of the entity.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the entity.
     * </p>
     * 
     * @param arn
     *        The ARN of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The current status of the entity.
     * </p>
     * 
     * @param status
     *        The current status of the entity.
     */

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the entity.
     * </p>
     * 
     * @return The current status of the entity.
     */

    public Status getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the entity.
     * </p>
     * 
     * @param status
     *        The current status of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withStatus(Status status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @return The ID of the workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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

    public GetEntityResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this
     * object.
     * </p>
     * 
     * @return An object that maps strings to the components in the entity. Each string in the mapping must be unique to
     *         this object.
     */

    public java.util.Map<String, ComponentResponse> getComponents() {
        return components;
    }

    /**
     * <p>
     * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this
     * object.
     * </p>
     * 
     * @param components
     *        An object that maps strings to the components in the entity. Each string in the mapping must be unique to
     *        this object.
     */

    public void setComponents(java.util.Map<String, ComponentResponse> components) {
        this.components = components;
    }

    /**
     * <p>
     * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this
     * object.
     * </p>
     * 
     * @param components
     *        An object that maps strings to the components in the entity. Each string in the mapping must be unique to
     *        this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withComponents(java.util.Map<String, ComponentResponse> components) {
        setComponents(components);
        return this;
    }

    /**
     * Add a single Components entry
     *
     * @see GetEntityResult#withComponents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult addComponentsEntry(String key, ComponentResponse value) {
        if (null == this.components) {
            this.components = new java.util.HashMap<String, ComponentResponse>();
        }
        if (this.components.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.components.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Components.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult clearComponentsEntries() {
        this.components = null;
        return this;
    }

    /**
     * <p>
     * The ID of the parent entity for this entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the parent entity for this entity.
     */

    public void setParentEntityId(String parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    /**
     * <p>
     * The ID of the parent entity for this entity.
     * </p>
     * 
     * @return The ID of the parent entity for this entity.
     */

    public String getParentEntityId() {
        return this.parentEntityId;
    }

    /**
     * <p>
     * The ID of the parent entity for this entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the parent entity for this entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withParentEntityId(String parentEntityId) {
        setParentEntityId(parentEntityId);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has associated child entities.
     * </p>
     * 
     * @param hasChildEntities
     *        A Boolean value that specifies whether the entity has associated child entities.
     */

    public void setHasChildEntities(Boolean hasChildEntities) {
        this.hasChildEntities = hasChildEntities;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has associated child entities.
     * </p>
     * 
     * @return A Boolean value that specifies whether the entity has associated child entities.
     */

    public Boolean getHasChildEntities() {
        return this.hasChildEntities;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has associated child entities.
     * </p>
     * 
     * @param hasChildEntities
     *        A Boolean value that specifies whether the entity has associated child entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withHasChildEntities(Boolean hasChildEntities) {
        setHasChildEntities(hasChildEntities);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the entity has associated child entities.
     * </p>
     * 
     * @return A Boolean value that specifies whether the entity has associated child entities.
     */

    public Boolean isHasChildEntities() {
        return this.hasChildEntities;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the entity was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @return The date and time when the entity was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the entity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the entity was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the entity was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was last updated.
     * </p>
     * 
     * @return The date and time when the entity was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the entity was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the entity was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntityResult withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
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

    public GetEntityResult withSyncSource(String syncSource) {
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityName() != null)
            sb.append("EntityName: ").append(getEntityName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getParentEntityId() != null)
            sb.append("ParentEntityId: ").append(getParentEntityId()).append(",");
        if (getHasChildEntities() != null)
            sb.append("HasChildEntities: ").append(getHasChildEntities()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime()).append(",");
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

        if (obj instanceof GetEntityResult == false)
            return false;
        GetEntityResult other = (GetEntityResult) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityName() == null ^ this.getEntityName() == null)
            return false;
        if (other.getEntityName() != null && other.getEntityName().equals(this.getEntityName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getParentEntityId() == null ^ this.getParentEntityId() == null)
            return false;
        if (other.getParentEntityId() != null && other.getParentEntityId().equals(this.getParentEntityId()) == false)
            return false;
        if (other.getHasChildEntities() == null ^ this.getHasChildEntities() == null)
            return false;
        if (other.getHasChildEntities() != null && other.getHasChildEntities().equals(this.getHasChildEntities()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
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

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getParentEntityId() == null) ? 0 : getParentEntityId().hashCode());
        hashCode = prime * hashCode + ((getHasChildEntities() == null) ? 0 : getHasChildEntities().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        return hashCode;
    }

    @Override
    public GetEntityResult clone() {
        try {
            return (GetEntityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
