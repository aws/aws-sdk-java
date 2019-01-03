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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspacesConnectionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the connection status of the WorkSpace.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WorkspaceConnectionStatus> workspacesConnectionStatus;
    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the connection status of the WorkSpace.
     * </p>
     * 
     * @return Information about the connection status of the WorkSpace.
     */

    public java.util.List<WorkspaceConnectionStatus> getWorkspacesConnectionStatus() {
        if (workspacesConnectionStatus == null) {
            workspacesConnectionStatus = new com.amazonaws.internal.SdkInternalList<WorkspaceConnectionStatus>();
        }
        return workspacesConnectionStatus;
    }

    /**
     * <p>
     * Information about the connection status of the WorkSpace.
     * </p>
     * 
     * @param workspacesConnectionStatus
     *        Information about the connection status of the WorkSpace.
     */

    public void setWorkspacesConnectionStatus(java.util.Collection<WorkspaceConnectionStatus> workspacesConnectionStatus) {
        if (workspacesConnectionStatus == null) {
            this.workspacesConnectionStatus = null;
            return;
        }

        this.workspacesConnectionStatus = new com.amazonaws.internal.SdkInternalList<WorkspaceConnectionStatus>(workspacesConnectionStatus);
    }

    /**
     * <p>
     * Information about the connection status of the WorkSpace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspacesConnectionStatus(java.util.Collection)} or
     * {@link #withWorkspacesConnectionStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param workspacesConnectionStatus
     *        Information about the connection status of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesConnectionStatusResult withWorkspacesConnectionStatus(WorkspaceConnectionStatus... workspacesConnectionStatus) {
        if (this.workspacesConnectionStatus == null) {
            setWorkspacesConnectionStatus(new com.amazonaws.internal.SdkInternalList<WorkspaceConnectionStatus>(workspacesConnectionStatus.length));
        }
        for (WorkspaceConnectionStatus ele : workspacesConnectionStatus) {
            this.workspacesConnectionStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the connection status of the WorkSpace.
     * </p>
     * 
     * @param workspacesConnectionStatus
     *        Information about the connection status of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesConnectionStatusResult withWorkspacesConnectionStatus(java.util.Collection<WorkspaceConnectionStatus> workspacesConnectionStatus) {
        setWorkspacesConnectionStatus(workspacesConnectionStatus);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @return The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesConnectionStatusResult withNextToken(String nextToken) {
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
        if (getWorkspacesConnectionStatus() != null)
            sb.append("WorkspacesConnectionStatus: ").append(getWorkspacesConnectionStatus()).append(",");
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

        if (obj instanceof DescribeWorkspacesConnectionStatusResult == false)
            return false;
        DescribeWorkspacesConnectionStatusResult other = (DescribeWorkspacesConnectionStatusResult) obj;
        if (other.getWorkspacesConnectionStatus() == null ^ this.getWorkspacesConnectionStatus() == null)
            return false;
        if (other.getWorkspacesConnectionStatus() != null && other.getWorkspacesConnectionStatus().equals(this.getWorkspacesConnectionStatus()) == false)
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

        hashCode = prime * hashCode + ((getWorkspacesConnectionStatus() == null) ? 0 : getWorkspacesConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspacesConnectionStatusResult clone() {
        try {
            return (DescribeWorkspacesConnectionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
