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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that contain the permission updates to make.
     * </p>
     */
    private java.util.List<UpdateInstruction> updateInstructionBatch;
    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * An array of structures that contain the permission updates to make.
     * </p>
     * 
     * @return An array of structures that contain the permission updates to make.
     */

    public java.util.List<UpdateInstruction> getUpdateInstructionBatch() {
        return updateInstructionBatch;
    }

    /**
     * <p>
     * An array of structures that contain the permission updates to make.
     * </p>
     * 
     * @param updateInstructionBatch
     *        An array of structures that contain the permission updates to make.
     */

    public void setUpdateInstructionBatch(java.util.Collection<UpdateInstruction> updateInstructionBatch) {
        if (updateInstructionBatch == null) {
            this.updateInstructionBatch = null;
            return;
        }

        this.updateInstructionBatch = new java.util.ArrayList<UpdateInstruction>(updateInstructionBatch);
    }

    /**
     * <p>
     * An array of structures that contain the permission updates to make.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateInstructionBatch(java.util.Collection)} or
     * {@link #withUpdateInstructionBatch(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param updateInstructionBatch
     *        An array of structures that contain the permission updates to make.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionsRequest withUpdateInstructionBatch(UpdateInstruction... updateInstructionBatch) {
        if (this.updateInstructionBatch == null) {
            setUpdateInstructionBatch(new java.util.ArrayList<UpdateInstruction>(updateInstructionBatch.length));
        }
        for (UpdateInstruction ele : updateInstructionBatch) {
            this.updateInstructionBatch.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the permission updates to make.
     * </p>
     * 
     * @param updateInstructionBatch
     *        An array of structures that contain the permission updates to make.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionsRequest withUpdateInstructionBatch(java.util.Collection<UpdateInstruction> updateInstructionBatch) {
        setUpdateInstructionBatch(updateInstructionBatch);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @return The ID of the workspace to update.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to update.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionsRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getUpdateInstructionBatch() != null)
            sb.append("UpdateInstructionBatch: ").append(getUpdateInstructionBatch()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePermissionsRequest == false)
            return false;
        UpdatePermissionsRequest other = (UpdatePermissionsRequest) obj;
        if (other.getUpdateInstructionBatch() == null ^ this.getUpdateInstructionBatch() == null)
            return false;
        if (other.getUpdateInstructionBatch() != null && other.getUpdateInstructionBatch().equals(this.getUpdateInstructionBatch()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateInstructionBatch() == null) ? 0 : getUpdateInstructionBatch().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePermissionsRequest clone() {
        return (UpdatePermissionsRequest) super.clone();
    }

}
