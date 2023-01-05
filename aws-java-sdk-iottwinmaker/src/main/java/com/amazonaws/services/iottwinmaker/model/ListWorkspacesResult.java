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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about the workspaces.
     * </p>
     */
    private java.util.List<WorkspaceSummary> workspaceSummaries;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about the workspaces.
     * </p>
     * 
     * @return A list of objects that contain information about the workspaces.
     */

    public java.util.List<WorkspaceSummary> getWorkspaceSummaries() {
        return workspaceSummaries;
    }

    /**
     * <p>
     * A list of objects that contain information about the workspaces.
     * </p>
     * 
     * @param workspaceSummaries
     *        A list of objects that contain information about the workspaces.
     */

    public void setWorkspaceSummaries(java.util.Collection<WorkspaceSummary> workspaceSummaries) {
        if (workspaceSummaries == null) {
            this.workspaceSummaries = null;
            return;
        }

        this.workspaceSummaries = new java.util.ArrayList<WorkspaceSummary>(workspaceSummaries);
    }

    /**
     * <p>
     * A list of objects that contain information about the workspaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceSummaries(java.util.Collection)} or {@link #withWorkspaceSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param workspaceSummaries
     *        A list of objects that contain information about the workspaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesResult withWorkspaceSummaries(WorkspaceSummary... workspaceSummaries) {
        if (this.workspaceSummaries == null) {
            setWorkspaceSummaries(new java.util.ArrayList<WorkspaceSummary>(workspaceSummaries.length));
        }
        for (WorkspaceSummary ele : workspaceSummaries) {
            this.workspaceSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the workspaces.
     * </p>
     * 
     * @param workspaceSummaries
     *        A list of objects that contain information about the workspaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesResult withWorkspaceSummaries(java.util.Collection<WorkspaceSummary> workspaceSummaries) {
        setWorkspaceSummaries(workspaceSummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getWorkspaceSummaries() != null)
            sb.append("WorkspaceSummaries: ").append(getWorkspaceSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getWorkspaceSummaries() == null ^ this.getWorkspaceSummaries() == null)
            return false;
        if (other.getWorkspaceSummaries() != null && other.getWorkspaceSummaries().equals(this.getWorkspaceSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceSummaries() == null) ? 0 : getWorkspaceSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
