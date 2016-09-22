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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DescribeWorkspaces</a> operation.
 * </p>
 */
public class DescribeWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     * parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> workspaceIds;
    /**
     * <p>
     * Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a specific
     * directory user with the <code>UserName</code> parameter. This parameter cannot be combined with any other filter
     * parameter.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the WorkSpace.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle will be
     * retrieved. This parameter cannot be combined with any other filter parameter.
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
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     * parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * 
     * @return An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information.
     *         This parameter cannot be combined with any other filter parameter.</p>
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
     * An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     * parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * 
     * @param workspaceIds
     *        An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     *        parameter cannot be combined with any other filter parameter.</p>
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
     * An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     * parameter cannot be combined with any other filter parameter.
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
     *        An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     *        parameter cannot be combined with any other filter parameter.</p>
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
     * An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     * parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * Because the <a>CreateWorkspaces</a> operation is asynchronous, the identifier it returns is not immediately
     * available. If you immediately call <a>DescribeWorkspaces</a> with this identifier, no information is returned.
     * </p>
     * 
     * @param workspaceIds
     *        An array of strings that contain the identifiers of the WorkSpaces for which to retrieve information. This
     *        parameter cannot be combined with any other filter parameter.</p>
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
     * Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a specific
     * directory user with the <code>UserName</code> parameter. This parameter cannot be combined with any other filter
     * parameter.
     * </p>
     * 
     * @param directoryId
     *        Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a
     *        specific directory user with the <code>UserName</code> parameter. This parameter cannot be combined with
     *        any other filter parameter.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a specific
     * directory user with the <code>UserName</code> parameter. This parameter cannot be combined with any other filter
     * parameter.
     * </p>
     * 
     * @return Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a
     *         specific directory user with the <code>UserName</code> parameter. This parameter cannot be combined with
     *         any other filter parameter.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a specific
     * directory user with the <code>UserName</code> parameter. This parameter cannot be combined with any other filter
     * parameter.
     * </p>
     * 
     * @param directoryId
     *        Specifies the directory identifier to which to limit the WorkSpaces. Optionally, you can specify a
     *        specific directory user with the <code>UserName</code> parameter. This parameter cannot be combined with
     *        any other filter parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the WorkSpace.
     * </p>
     * 
     * @param userName
     *        Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the
     *        WorkSpace.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the WorkSpace.
     * </p>
     * 
     * @return Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the
     *         WorkSpace.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the WorkSpace.
     * </p>
     * 
     * @param userName
     *        Used with the <code>DirectoryId</code> parameter to specify the directory user for whom to obtain the
     *        WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle will be
     * retrieved. This parameter cannot be combined with any other filter parameter.
     * </p>
     * 
     * @param bundleId
     *        The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle
     *        will be retrieved. This parameter cannot be combined with any other filter parameter.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle will be
     * retrieved. This parameter cannot be combined with any other filter parameter.
     * </p>
     * 
     * @return The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle
     *         will be retrieved. This parameter cannot be combined with any other filter parameter.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle will be
     * retrieved. This parameter cannot be combined with any other filter parameter.
     * </p>
     * 
     * @param bundleId
     *        The identifier of a bundle to obtain the WorkSpaces for. All WorkSpaces that are created from this bundle
     *        will be retrieved. This parameter cannot be combined with any other filter parameter.
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
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *        call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @return The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *         call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *        call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspacesRequest withNextToken(String nextToken) {
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
        if (getWorkspaceIds() != null)
            sb.append("WorkspaceIds: " + getWorkspaceIds() + ",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
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
