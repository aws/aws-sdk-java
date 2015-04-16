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

/**
 * <p>
 * Contains the result of the CreateWorkspaces operation.
 * </p>
 */
public class CreateWorkspacesResult implements Serializable, Cloneable {

    /**
     * An array of structures that represent the WorkSpaces that could not be
     * created.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateWorkspaceRequest> failedRequests;

    /**
     * An array of structures that represent the WorkSpaces that were
     * created. <p>Because this operation is asynchronous, the identifier in
     * <code>WorkspaceId</code> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Workspace> pendingRequests;

    /**
     * An array of structures that represent the WorkSpaces that could not be
     * created.
     *
     * @return An array of structures that represent the WorkSpaces that could not be
     *         created.
     */
    public java.util.List<FailedCreateWorkspaceRequest> getFailedRequests() {
        if (failedRequests == null) {
              failedRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateWorkspaceRequest>();
              failedRequests.setAutoConstruct(true);
        }
        return failedRequests;
    }
    
    /**
     * An array of structures that represent the WorkSpaces that could not be
     * created.
     *
     * @param failedRequests An array of structures that represent the WorkSpaces that could not be
     *         created.
     */
    public void setFailedRequests(java.util.Collection<FailedCreateWorkspaceRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateWorkspaceRequest> failedRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateWorkspaceRequest>(failedRequests.size());
        failedRequestsCopy.addAll(failedRequests);
        this.failedRequests = failedRequestsCopy;
    }
    
    /**
     * An array of structures that represent the WorkSpaces that could not be
     * created.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFailedRequests(java.util.Collection)} or {@link
     * #withFailedRequests(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failedRequests An array of structures that represent the WorkSpaces that could not be
     *         created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateWorkspacesResult withFailedRequests(FailedCreateWorkspaceRequest... failedRequests) {
        if (getFailedRequests() == null) setFailedRequests(new java.util.ArrayList<FailedCreateWorkspaceRequest>(failedRequests.length));
        for (FailedCreateWorkspaceRequest value : failedRequests) {
            getFailedRequests().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that represent the WorkSpaces that could not be
     * created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failedRequests An array of structures that represent the WorkSpaces that could not be
     *         created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateWorkspacesResult withFailedRequests(java.util.Collection<FailedCreateWorkspaceRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateWorkspaceRequest> failedRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedCreateWorkspaceRequest>(failedRequests.size());
            failedRequestsCopy.addAll(failedRequests);
            this.failedRequests = failedRequestsCopy;
        }

        return this;
    }

    /**
     * An array of structures that represent the WorkSpaces that were
     * created. <p>Because this operation is asynchronous, the identifier in
     * <code>WorkspaceId</code> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     *
     * @return An array of structures that represent the WorkSpaces that were
     *         created. <p>Because this operation is asynchronous, the identifier in
     *         <code>WorkspaceId</code> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     */
    public java.util.List<Workspace> getPendingRequests() {
        if (pendingRequests == null) {
              pendingRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<Workspace>();
              pendingRequests.setAutoConstruct(true);
        }
        return pendingRequests;
    }
    
    /**
     * An array of structures that represent the WorkSpaces that were
     * created. <p>Because this operation is asynchronous, the identifier in
     * <code>WorkspaceId</code> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     *
     * @param pendingRequests An array of structures that represent the WorkSpaces that were
     *         created. <p>Because this operation is asynchronous, the identifier in
     *         <code>WorkspaceId</code> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     */
    public void setPendingRequests(java.util.Collection<Workspace> pendingRequests) {
        if (pendingRequests == null) {
            this.pendingRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Workspace> pendingRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Workspace>(pendingRequests.size());
        pendingRequestsCopy.addAll(pendingRequests);
        this.pendingRequests = pendingRequestsCopy;
    }
    
    /**
     * An array of structures that represent the WorkSpaces that were
     * created. <p>Because this operation is asynchronous, the identifier in
     * <code>WorkspaceId</code> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPendingRequests(java.util.Collection)} or {@link
     * #withPendingRequests(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingRequests An array of structures that represent the WorkSpaces that were
     *         created. <p>Because this operation is asynchronous, the identifier in
     *         <code>WorkspaceId</code> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateWorkspacesResult withPendingRequests(Workspace... pendingRequests) {
        if (getPendingRequests() == null) setPendingRequests(new java.util.ArrayList<Workspace>(pendingRequests.length));
        for (Workspace value : pendingRequests) {
            getPendingRequests().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that represent the WorkSpaces that were
     * created. <p>Because this operation is asynchronous, the identifier in
     * <code>WorkspaceId</code> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingRequests An array of structures that represent the WorkSpaces that were
     *         created. <p>Because this operation is asynchronous, the identifier in
     *         <code>WorkspaceId</code> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateWorkspacesResult withPendingRequests(java.util.Collection<Workspace> pendingRequests) {
        if (pendingRequests == null) {
            this.pendingRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Workspace> pendingRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Workspace>(pendingRequests.size());
            pendingRequestsCopy.addAll(pendingRequests);
            this.pendingRequests = pendingRequestsCopy;
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
        if (getFailedRequests() != null) sb.append("FailedRequests: " + getFailedRequests() + ",");
        if (getPendingRequests() != null) sb.append("PendingRequests: " + getPendingRequests() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateWorkspacesResult == false) return false;
        CreateWorkspacesResult other = (CreateWorkspacesResult)obj;
        
        if (other.getFailedRequests() == null ^ this.getFailedRequests() == null) return false;
        if (other.getFailedRequests() != null && other.getFailedRequests().equals(this.getFailedRequests()) == false) return false; 
        if (other.getPendingRequests() == null ^ this.getPendingRequests() == null) return false;
        if (other.getPendingRequests() != null && other.getPendingRequests().equals(this.getPendingRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateWorkspacesResult clone() {
        try {
            return (CreateWorkspacesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    