/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the results for the <a>DescribeWorkspaces</a> operation.
 * </p>
 */
public class DescribeWorkspacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that contain the information about the WorkSpaces.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Workspace> workspaces;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items. This token is valid for one day and must be used within
     * that time frame.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures that contain the information about the WorkSpaces.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * </p>
     * 
     * @return An array of structures that contain the information about the WorkSpaces.</p>
     *         <p>
     *         Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete
     *         for a newly-created WorkSpace.
     */

    public java.util.List<Workspace> getWorkspaces() {
        if (workspaces == null) {
            workspaces = new com.amazonaws.internal.SdkInternalList<Workspace>();
        }
        return workspaces;
    }

    /**
     * <p>
     * An array of structures that contain the information about the WorkSpaces.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * </p>
     * 
     * @param workspaces
     *        An array of structures that contain the information about the WorkSpaces.</p>
     *        <p>
     *        Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete
     *        for a newly-created WorkSpace.
     */

    public void setWorkspaces(java.util.Collection<Workspace> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
            return;
        }

        this.workspaces = new com.amazonaws.internal.SdkInternalList<Workspace>(workspaces);
    }

    /**
     * <p>
     * An array of structures that contain the information about the WorkSpaces.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaces(java.util.Collection)} or {@link #withWorkspaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workspaces
     *        An array of structures that contain the information about the WorkSpaces.</p>
     *        <p>
     *        Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete
     *        for a newly-created WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesResult withWorkspaces(Workspace... workspaces) {
        if (this.workspaces == null) {
            setWorkspaces(new com.amazonaws.internal.SdkInternalList<Workspace>(workspaces.length));
        }
        for (Workspace ele : workspaces) {
            this.workspaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the information about the WorkSpaces.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * </p>
     * 
     * @param workspaces
     *        An array of structures that contain the information about the WorkSpaces.</p>
     *        <p>
     *        Because the <a>CreateWorkspaces</a> operation is asynchronous, some of this information may be incomplete
     *        for a newly-created WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesResult withWorkspaces(java.util.Collection<Workspace> workspaces) {
        setWorkspaces(workspaces);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items. This token is valid for one day and must be used within
     * that time frame.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to this operation to retrieve the next set of items. This token is valid for one day and
     *        must be used within that time frame.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items. This token is valid for one day and must be used within
     * that time frame.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *         subsequent call to this operation to retrieve the next set of items. This token is valid for one day and
     *         must be used within that time frame.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items. This token is valid for one day and must be used within
     * that time frame.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <code>NextToken</code> parameter in a
     *        subsequent call to this operation to retrieve the next set of items. This token is valid for one day and
     *        must be used within that time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Workspaces: " + getWorkspaces() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspacesResult == false)
            return false;
        DescribeWorkspacesResult other = (DescribeWorkspacesResult) obj;
        if (other.getWorkspaces() == null ^ this.getWorkspaces() == null)
            return false;
        if (other.getWorkspaces() != null && other.getWorkspaces().equals(this.getWorkspaces()) == false)
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

        hashCode = prime * hashCode + ((getWorkspaces() == null) ? 0 : getWorkspaces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspacesResult clone() {
        try {
            return (DescribeWorkspacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
