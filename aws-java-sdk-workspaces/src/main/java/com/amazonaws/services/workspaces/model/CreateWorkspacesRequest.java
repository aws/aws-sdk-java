/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#createWorkspaces(CreateWorkspacesRequest) CreateWorkspaces operation}.
 * <p>
 * Creates one or more WorkSpaces.
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is asynchronous and returns before the
 * WorkSpaces are created.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#createWorkspaces(CreateWorkspacesRequest)
 */
public class CreateWorkspacesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of structures that specify the WorkSpaces to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceRequest> workspaces;

    /**
     * An array of structures that specify the WorkSpaces to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of structures that specify the WorkSpaces to create.
     */
    public java.util.List<WorkspaceRequest> getWorkspaces() {
        if (workspaces == null) {
              workspaces = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceRequest>();
              workspaces.setAutoConstruct(true);
        }
        return workspaces;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param workspaces An array of structures that specify the WorkSpaces to create.
     */
    public void setWorkspaces(java.util.Collection<WorkspaceRequest> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceRequest> workspacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceRequest>(workspaces.size());
        workspacesCopy.addAll(workspaces);
        this.workspaces = workspacesCopy;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param workspaces An array of structures that specify the WorkSpaces to create.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateWorkspacesRequest withWorkspaces(WorkspaceRequest... workspaces) {
        if (getWorkspaces() == null) setWorkspaces(new java.util.ArrayList<WorkspaceRequest>(workspaces.length));
        for (WorkspaceRequest value : workspaces) {
            getWorkspaces().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param workspaces An array of structures that specify the WorkSpaces to create.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateWorkspacesRequest withWorkspaces(java.util.Collection<WorkspaceRequest> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceRequest> workspacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceRequest>(workspaces.size());
            workspacesCopy.addAll(workspaces);
            this.workspaces = workspacesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkspaces() != null) sb.append("Workspaces: " + getWorkspaces() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkspaces() == null) ? 0 : getWorkspaces().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateWorkspacesRequest == false) return false;
        CreateWorkspacesRequest other = (CreateWorkspacesRequest)obj;
        
        if (other.getWorkspaces() == null ^ this.getWorkspaces() == null) return false;
        if (other.getWorkspaces() != null && other.getWorkspaces().equals(this.getWorkspaces()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateWorkspacesRequest clone() {
        
            return (CreateWorkspacesRequest) super.clone();
    }

}
    