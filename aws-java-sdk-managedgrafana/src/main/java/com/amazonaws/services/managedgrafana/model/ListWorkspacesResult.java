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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use when requesting the next set of workspaces.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of structures that contain some information about the workspaces in the account.
     * </p>
     */
    private java.util.List<WorkspaceSummary> workspaces;

    /**
     * <p>
     * The token to use when requesting the next set of workspaces.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of workspaces.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of workspaces.
     * </p>
     * 
     * @return The token to use when requesting the next set of workspaces.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of workspaces.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of workspaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of structures that contain some information about the workspaces in the account.
     * </p>
     * 
     * @return An array of structures that contain some information about the workspaces in the account.
     */

    public java.util.List<WorkspaceSummary> getWorkspaces() {
        return workspaces;
    }

    /**
     * <p>
     * An array of structures that contain some information about the workspaces in the account.
     * </p>
     * 
     * @param workspaces
     *        An array of structures that contain some information about the workspaces in the account.
     */

    public void setWorkspaces(java.util.Collection<WorkspaceSummary> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
            return;
        }

        this.workspaces = new java.util.ArrayList<WorkspaceSummary>(workspaces);
    }

    /**
     * <p>
     * An array of structures that contain some information about the workspaces in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaces(java.util.Collection)} or {@link #withWorkspaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workspaces
     *        An array of structures that contain some information about the workspaces in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesResult withWorkspaces(WorkspaceSummary... workspaces) {
        if (this.workspaces == null) {
            setWorkspaces(new java.util.ArrayList<WorkspaceSummary>(workspaces.length));
        }
        for (WorkspaceSummary ele : workspaces) {
            this.workspaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain some information about the workspaces in the account.
     * </p>
     * 
     * @param workspaces
     *        An array of structures that contain some information about the workspaces in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesResult withWorkspaces(java.util.Collection<WorkspaceSummary> workspaces) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListWorkspacesResult == false)
            return false;
        ListWorkspacesResult other = (ListWorkspacesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkspaces() == null) ? 0 : getWorkspaces().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkspacesResult clone() {
        try {
            return (ListWorkspacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
