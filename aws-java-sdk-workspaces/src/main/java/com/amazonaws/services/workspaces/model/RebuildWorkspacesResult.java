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
 * Contains the results of the <a>RebuildWorkspaces</a> operation.
 * </p>
 */
public class RebuildWorkspacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures representing any WorkSpaces that could not be rebuilt.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedWorkspaceChangeRequest> failedRequests;

    /**
     * <p>
     * An array of structures representing any WorkSpaces that could not be rebuilt.
     * </p>
     * 
     * @return An array of structures representing any WorkSpaces that could not be rebuilt.
     */

    public java.util.List<FailedWorkspaceChangeRequest> getFailedRequests() {
        if (failedRequests == null) {
            failedRequests = new com.amazonaws.internal.SdkInternalList<FailedWorkspaceChangeRequest>();
        }
        return failedRequests;
    }

    /**
     * <p>
     * An array of structures representing any WorkSpaces that could not be rebuilt.
     * </p>
     * 
     * @param failedRequests
     *        An array of structures representing any WorkSpaces that could not be rebuilt.
     */

    public void setFailedRequests(java.util.Collection<FailedWorkspaceChangeRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
            return;
        }

        this.failedRequests = new com.amazonaws.internal.SdkInternalList<FailedWorkspaceChangeRequest>(failedRequests);
    }

    /**
     * <p>
     * An array of structures representing any WorkSpaces that could not be rebuilt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedRequests(java.util.Collection)} or {@link #withFailedRequests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedRequests
     *        An array of structures representing any WorkSpaces that could not be rebuilt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesResult withFailedRequests(FailedWorkspaceChangeRequest... failedRequests) {
        if (this.failedRequests == null) {
            setFailedRequests(new com.amazonaws.internal.SdkInternalList<FailedWorkspaceChangeRequest>(failedRequests.length));
        }
        for (FailedWorkspaceChangeRequest ele : failedRequests) {
            this.failedRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures representing any WorkSpaces that could not be rebuilt.
     * </p>
     * 
     * @param failedRequests
     *        An array of structures representing any WorkSpaces that could not be rebuilt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesResult withFailedRequests(java.util.Collection<FailedWorkspaceChangeRequest> failedRequests) {
        setFailedRequests(failedRequests);
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
            sb.append("FailedRequests: " + getFailedRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebuildWorkspacesResult == false)
            return false;
        RebuildWorkspacesResult other = (RebuildWorkspacesResult) obj;
        if (other.getFailedRequests() == null ^ this.getFailedRequests() == null)
            return false;
        if (other.getFailedRequests() != null && other.getFailedRequests().equals(this.getFailedRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedRequests() == null) ? 0 : getFailedRequests().hashCode());
        return hashCode;
    }

    @Override
    public RebuildWorkspacesResult clone() {
        try {
            return (RebuildWorkspacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
