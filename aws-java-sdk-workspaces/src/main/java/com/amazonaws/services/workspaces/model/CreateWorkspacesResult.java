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
 * Contains the result of the <a>CreateWorkspaces</a> operation.
 * </p>
 */
public class CreateWorkspacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that could not be created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedCreateWorkspaceRequest> failedRequests;
    /**
     * <p>
     * An array of structures that represent the WorkSpaces that were created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately available.
     * If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Workspace> pendingRequests;

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that could not be created.
     * </p>
     * 
     * @return An array of structures that represent the WorkSpaces that could not be created.
     */

    public java.util.List<FailedCreateWorkspaceRequest> getFailedRequests() {
        if (failedRequests == null) {
            failedRequests = new com.amazonaws.internal.SdkInternalList<FailedCreateWorkspaceRequest>();
        }
        return failedRequests;
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that could not be created.
     * </p>
     * 
     * @param failedRequests
     *        An array of structures that represent the WorkSpaces that could not be created.
     */

    public void setFailedRequests(java.util.Collection<FailedCreateWorkspaceRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
            return;
        }

        this.failedRequests = new com.amazonaws.internal.SdkInternalList<FailedCreateWorkspaceRequest>(failedRequests);
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that could not be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedRequests(java.util.Collection)} or {@link #withFailedRequests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedRequests
     *        An array of structures that represent the WorkSpaces that could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspacesResult withFailedRequests(FailedCreateWorkspaceRequest... failedRequests) {
        if (this.failedRequests == null) {
            setFailedRequests(new com.amazonaws.internal.SdkInternalList<FailedCreateWorkspaceRequest>(failedRequests.length));
        }
        for (FailedCreateWorkspaceRequest ele : failedRequests) {
            this.failedRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that could not be created.
     * </p>
     * 
     * @param failedRequests
     *        An array of structures that represent the WorkSpaces that could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspacesResult withFailedRequests(java.util.Collection<FailedCreateWorkspaceRequest> failedRequests) {
        setFailedRequests(failedRequests);
        return this;
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that were created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately available.
     * If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be returned.
     * </p>
     * 
     * @return An array of structures that represent the WorkSpaces that were created.</p>
     *         <p>
     *         Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately
     *         available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be
     *         returned.
     */

    public java.util.List<Workspace> getPendingRequests() {
        if (pendingRequests == null) {
            pendingRequests = new com.amazonaws.internal.SdkInternalList<Workspace>();
        }
        return pendingRequests;
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that were created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately available.
     * If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be returned.
     * </p>
     * 
     * @param pendingRequests
     *        An array of structures that represent the WorkSpaces that were created.</p>
     *        <p>
     *        Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately
     *        available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be
     *        returned.
     */

    public void setPendingRequests(java.util.Collection<Workspace> pendingRequests) {
        if (pendingRequests == null) {
            this.pendingRequests = null;
            return;
        }

        this.pendingRequests = new com.amazonaws.internal.SdkInternalList<Workspace>(pendingRequests);
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that were created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately available.
     * If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingRequests(java.util.Collection)} or {@link #withPendingRequests(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pendingRequests
     *        An array of structures that represent the WorkSpaces that were created.</p>
     *        <p>
     *        Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately
     *        available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspacesResult withPendingRequests(Workspace... pendingRequests) {
        if (this.pendingRequests == null) {
            setPendingRequests(new com.amazonaws.internal.SdkInternalList<Workspace>(pendingRequests.length));
        }
        for (Workspace ele : pendingRequests) {
            this.pendingRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that represent the WorkSpaces that were created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately available.
     * If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be returned.
     * </p>
     * 
     * @param pendingRequests
     *        An array of structures that represent the WorkSpaces that were created.</p>
     *        <p>
     *        Because this operation is asynchronous, the identifier in <code>WorkspaceId</code> is not immediately
     *        available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information will be
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspacesResult withPendingRequests(java.util.Collection<Workspace> pendingRequests) {
        setPendingRequests(pendingRequests);
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
        if (getFailedRequests() != null)
            sb.append("FailedRequests: " + getFailedRequests() + ",");
        if (getPendingRequests() != null)
            sb.append("PendingRequests: " + getPendingRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspacesResult == false)
            return false;
        CreateWorkspacesResult other = (CreateWorkspacesResult) obj;
        if (other.getFailedRequests() == null ^ this.getFailedRequests() == null)
            return false;
        if (other.getFailedRequests() != null && other.getFailedRequests().equals(this.getFailedRequests()) == false)
            return false;
        if (other.getPendingRequests() == null ^ this.getPendingRequests() == null)
            return false;
        if (other.getPendingRequests() != null && other.getPendingRequests().equals(this.getPendingRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedRequests() == null) ? 0 : getFailedRequests().hashCode());
        hashCode = prime * hashCode + ((getPendingRequests() == null) ? 0 : getPendingRequests().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspacesResult clone() {
        try {
            return (CreateWorkspacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
