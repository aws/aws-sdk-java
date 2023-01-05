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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEntityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * An object that maps strings to the components in the entity. Each string in the mapping must be unique to this
     * object.
     * </p>
     */
    private java.util.Map<String, ComponentRequest> components;
    /**
     * <p>
     * The ID of the entity's parent entity.
     * </p>
     */
    private String parentEntityId;
    /**
     * <p>
     * Metadata that you can use to manage the entity.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateEntityRequest withWorkspaceId(String workspaceId) {
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

    public CreateEntityRequest withEntityId(String entityId) {
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

    public CreateEntityRequest withEntityName(String entityName) {
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

    public CreateEntityRequest withDescription(String description) {
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

    public java.util.Map<String, ComponentRequest> getComponents() {
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

    public void setComponents(java.util.Map<String, ComponentRequest> components) {
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

    public CreateEntityRequest withComponents(java.util.Map<String, ComponentRequest> components) {
        setComponents(components);
        return this;
    }

    /**
     * Add a single Components entry
     *
     * @see CreateEntityRequest#withComponents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRequest addComponentsEntry(String key, ComponentRequest value) {
        if (null == this.components) {
            this.components = new java.util.HashMap<String, ComponentRequest>();
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

    public CreateEntityRequest clearComponentsEntries() {
        this.components = null;
        return this;
    }

    /**
     * <p>
     * The ID of the entity's parent entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the entity's parent entity.
     */

    public void setParentEntityId(String parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    /**
     * <p>
     * The ID of the entity's parent entity.
     * </p>
     * 
     * @return The ID of the entity's parent entity.
     */

    public String getParentEntityId() {
        return this.parentEntityId;
    }

    /**
     * <p>
     * The ID of the entity's parent entity.
     * </p>
     * 
     * @param parentEntityId
     *        The ID of the entity's parent entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRequest withParentEntityId(String parentEntityId) {
        setParentEntityId(parentEntityId);
        return this;
    }

    /**
     * <p>
     * Metadata that you can use to manage the entity.
     * </p>
     * 
     * @return Metadata that you can use to manage the entity.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that you can use to manage the entity.
     * </p>
     * 
     * @param tags
     *        Metadata that you can use to manage the entity.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata that you can use to manage the entity.
     * </p>
     * 
     * @param tags
     *        Metadata that you can use to manage the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEntityRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEntityRequest clearTagsEntries() {
        this.tags = null;
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
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getParentEntityId() != null)
            sb.append("ParentEntityId: ").append(getParentEntityId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEntityRequest == false)
            return false;
        CreateEntityRequest other = (CreateEntityRequest) obj;
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
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getParentEntityId() == null ^ this.getParentEntityId() == null)
            return false;
        if (other.getParentEntityId() != null && other.getParentEntityId().equals(this.getParentEntityId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getParentEntityId() == null) ? 0 : getParentEntityId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEntityRequest clone() {
        return (CreateEntityRequest) super.clone();
    }

}
