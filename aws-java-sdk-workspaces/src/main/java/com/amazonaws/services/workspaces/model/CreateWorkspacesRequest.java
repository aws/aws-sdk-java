/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WorkspaceRequest> workspaces;

    /**
     * <p>
     * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @return The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     */

    public java.util.List<WorkspaceRequest> getWorkspaces() {
        if (workspaces == null) {
            workspaces = new com.amazonaws.internal.SdkInternalList<WorkspaceRequest>();
        }
        return workspaces;
    }

    /**
     * <p>
     * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param workspaces
     *        The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     */

    public void setWorkspaces(java.util.Collection<WorkspaceRequest> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
            return;
        }

        this.workspaces = new com.amazonaws.internal.SdkInternalList<WorkspaceRequest>(workspaces);
    }

    /**
     * <p>
     * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaces(java.util.Collection)} or {@link #withWorkspaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workspaces
     *        The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspacesRequest withWorkspaces(WorkspaceRequest... workspaces) {
        if (this.workspaces == null) {
            setWorkspaces(new com.amazonaws.internal.SdkInternalList<WorkspaceRequest>(workspaces.length));
        }
        for (WorkspaceRequest ele : workspaces) {
            this.workspaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param workspaces
     *        The WorkSpaces to create. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspacesRequest withWorkspaces(java.util.Collection<WorkspaceRequest> workspaces) {
        setWorkspaces(workspaces);
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
        if (getWorkspaces() != null)
            sb.append("Workspaces: ").append(getWorkspaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspacesRequest == false)
            return false;
        CreateWorkspacesRequest other = (CreateWorkspacesRequest) obj;
        if (other.getWorkspaces() == null ^ this.getWorkspaces() == null)
            return false;
        if (other.getWorkspaces() != null && other.getWorkspaces().equals(this.getWorkspaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaces() == null) ? 0 : getWorkspaces().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspacesRequest clone() {
        return (CreateWorkspacesRequest) super.clone();
    }

}
