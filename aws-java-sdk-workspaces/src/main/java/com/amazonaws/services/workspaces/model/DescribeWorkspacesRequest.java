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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> workspaceIds;
    /**
     * <p>
     * The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     * <code>UserName</code>). You cannot combine this parameter with any other filter.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine
     * this parameter with any other filter.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * 
     * @return The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.</p>
     *         <p>
     *         Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not
     *         immediately available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information is returned.
     */

    public java.util.List<String> getWorkspaceIds() {
        if (workspaceIds == null) {
            workspaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return workspaceIds;
    }

    /**
     * <p>
     * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * 
     * @param workspaceIds
     *        The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.</p>
     *        <p>
     *        Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not
     *        immediately available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *        information is returned.
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
     * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkspaceIds(java.util.Collection)} or {@link #withWorkspaceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workspaceIds
     *        The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.</p>
     *        <p>
     *        Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not
     *        immediately available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *        information is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withWorkspaceIds(String... workspaceIds) {
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
     * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * 
     * @param workspaceIds
     *        The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter.</p>
     *        <p>
     *        Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not
     *        immediately available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *        information is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withWorkspaceIds(java.util.Collection<String> workspaceIds) {
        setWorkspaceIds(workspaceIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     * <code>UserName</code>). You cannot combine this parameter with any other filter.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     *        <code>UserName</code>). You cannot combine this parameter with any other filter.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     * <code>UserName</code>). You cannot combine this parameter with any other filter.
     * </p>
     * 
     * @return The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     *         <code>UserName</code>). You cannot combine this parameter with any other filter.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     * <code>UserName</code>). You cannot combine this parameter with any other filter.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory. In addition, you can optionally specify a specific directory user (see
     *        <code>UserName</code>). You cannot combine this parameter with any other filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     * </p>
     * 
     * @param userName
     *        The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     * </p>
     * 
     * @return The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     * </p>
     * 
     * @param userName
     *        The name of the directory user. You must specify this parameter with <code>DirectoryId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine
     * this parameter with any other filter.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot
     *        combine this parameter with any other filter.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine
     * this parameter with any other filter.
     * </p>
     * 
     * @return The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot
     *         combine this parameter with any other filter.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine
     * this parameter with any other filter.
     * </p>
     * 
     * @param bundleId
     *        The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot
     *        combine this parameter with any other filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @return The maximum number of items to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withLimit(Integer limit) {
        setLimit(limit);
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

    public DescribeWorkspacesRequest withNextToken(String nextToken) {
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof DescribeWorkspacesRequest == false)
            return false;
        DescribeWorkspacesRequest other = (DescribeWorkspacesRequest) obj;
        if (other.getWorkspaceIds() == null ^ this.getWorkspaceIds() == null)
            return false;
        if (other.getWorkspaceIds() != null && other.getWorkspaceIds().equals(this.getWorkspaceIds()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspacesRequest clone() {
        return (DescribeWorkspacesRequest) super.clone();
    }

}
