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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspacesConnectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspacesConnectionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> workspaceIds;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @return The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     */

    public java.util.List<String> getWorkspaceIds() {
        if (workspaceIds == null) {
            workspaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return workspaceIds;
    }

    /**
     * <p>
     * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param workspaceIds
     *        The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     */

    public void setWorkspaceIds(java.util.Collection<String> workspaceIds) {
        if (workspaceIds == null) {
            this.workspaceIds = null;
            return;
        }

        this.workspaceIds = new com.amazonaws.internal.SdkInternalList<String>(workspaceIds);
    }

    /**
     * <p>
     * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceIds(java.util.Collection)} or {@link #withWorkspaceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workspaceIds
     *        The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesConnectionStatusRequest withWorkspaceIds(String... workspaceIds) {
        if (this.workspaceIds == null) {
            setWorkspaceIds(new com.amazonaws.internal.SdkInternalList<String>(workspaceIds.length));
        }
        for (String ele : workspaceIds) {
            this.workspaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param workspaceIds
     *        The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesConnectionStatusRequest withWorkspaceIds(java.util.Collection<String> workspaceIds) {
        setWorkspaceIds(workspaceIds);
        return this;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @return If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesConnectionStatusRequest withNextToken(String nextToken) {
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
        if (getWorkspaceIds() != null)
            sb.append("WorkspaceIds: ").append(getWorkspaceIds()).append(",");
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

        if (obj instanceof DescribeWorkspacesConnectionStatusRequest == false)
            return false;
        DescribeWorkspacesConnectionStatusRequest other = (DescribeWorkspacesConnectionStatusRequest) obj;
        if (other.getWorkspaceIds() == null ^ this.getWorkspaceIds() == null)
            return false;
        if (other.getWorkspaceIds() != null && other.getWorkspaceIds().equals(this.getWorkspaceIds()) == false)
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

        hashCode = prime * hashCode + ((getWorkspaceIds() == null) ? 0 : getWorkspaceIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspacesConnectionStatusRequest clone() {
        return (DescribeWorkspacesConnectionStatusRequest) super.clone();
    }

}
