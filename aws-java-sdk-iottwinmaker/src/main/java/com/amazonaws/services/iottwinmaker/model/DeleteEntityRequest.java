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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/DeleteEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEntityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the entity to delete.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ID of the entity to delete.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * A Boolean value that specifies whether the operation deletes child entities.
     * </p>
     */
    private Boolean isRecursive;

    /**
     * <p>
     * The ID of the workspace that contains the entity to delete.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the entity to delete.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the entity to delete.
     * </p>
     * 
     * @return The ID of the workspace that contains the entity to delete.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the entity to delete.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the entity to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEntityRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the entity to delete.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity to delete.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The ID of the entity to delete.
     * </p>
     * 
     * @return The ID of the entity to delete.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The ID of the entity to delete.
     * </p>
     * 
     * @param entityId
     *        The ID of the entity to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEntityRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the operation deletes child entities.
     * </p>
     * 
     * @param isRecursive
     *        A Boolean value that specifies whether the operation deletes child entities.
     */

    public void setIsRecursive(Boolean isRecursive) {
        this.isRecursive = isRecursive;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the operation deletes child entities.
     * </p>
     * 
     * @return A Boolean value that specifies whether the operation deletes child entities.
     */

    public Boolean getIsRecursive() {
        return this.isRecursive;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the operation deletes child entities.
     * </p>
     * 
     * @param isRecursive
     *        A Boolean value that specifies whether the operation deletes child entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEntityRequest withIsRecursive(Boolean isRecursive) {
        setIsRecursive(isRecursive);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the operation deletes child entities.
     * </p>
     * 
     * @return A Boolean value that specifies whether the operation deletes child entities.
     */

    public Boolean isRecursive() {
        return this.isRecursive;
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
        if (getIsRecursive() != null)
            sb.append("IsRecursive: ").append(getIsRecursive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEntityRequest == false)
            return false;
        DeleteEntityRequest other = (DeleteEntityRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getIsRecursive() == null ^ this.getIsRecursive() == null)
            return false;
        if (other.getIsRecursive() != null && other.getIsRecursive().equals(this.getIsRecursive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getIsRecursive() == null) ? 0 : getIsRecursive().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEntityRequest clone() {
        return (DeleteEntityRequest) super.clone();
    }

}
