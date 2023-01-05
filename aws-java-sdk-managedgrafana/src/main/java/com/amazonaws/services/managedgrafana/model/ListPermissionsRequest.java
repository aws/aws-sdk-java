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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) Limits the results to only the group that matches this ID.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListPermissions</code> operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) Limits the results to only the user that matches this ID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users are
     * returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups are returned.
     * </p>
     */
    private String userType;
    /**
     * <p>
     * The ID of the workspace to list permissions for. This parameter is required.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * (Optional) Limits the results to only the group that matches this ID.
     * </p>
     * 
     * @param groupId
     *        (Optional) Limits the results to only the group that matches this ID.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * (Optional) Limits the results to only the group that matches this ID.
     * </p>
     * 
     * @return (Optional) Limits the results to only the group that matches this ID.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * (Optional) Limits the results to only the group that matches this ID.
     * </p>
     * 
     * @param groupId
     *        (Optional) Limits the results to only the group that matches this ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     * 
     * @return The maximum number of results to include in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListPermissions</code> operation.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of results. You received this token from a previous
     *        <code>ListPermissions</code> operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListPermissions</code> operation.
     * </p>
     * 
     * @return The token to use when requesting the next set of results. You received this token from a previous
     *         <code>ListPermissions</code> operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListPermissions</code> operation.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of results. You received this token from a previous
     *        <code>ListPermissions</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) Limits the results to only the user that matches this ID.
     * </p>
     * 
     * @param userId
     *        (Optional) Limits the results to only the user that matches this ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * (Optional) Limits the results to only the user that matches this ID.
     * </p>
     * 
     * @return (Optional) Limits the results to only the user that matches this ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * (Optional) Limits the results to only the user that matches this ID.
     * </p>
     * 
     * @param userId
     *        (Optional) Limits the results to only the user that matches this ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users are
     * returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups are returned.
     * </p>
     * 
     * @param userType
     *        (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users
     *        are returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups
     *        are returned.
     * @see UserType
     */

    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * <p>
     * (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users are
     * returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups are returned.
     * </p>
     * 
     * @return (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users
     *         are returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups
     *         are returned.
     * @see UserType
     */

    public String getUserType() {
        return this.userType;
    }

    /**
     * <p>
     * (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users are
     * returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups are returned.
     * </p>
     * 
     * @param userType
     *        (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users
     *        are returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public ListPermissionsRequest withUserType(String userType) {
        setUserType(userType);
        return this;
    }

    /**
     * <p>
     * (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users are
     * returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups are returned.
     * </p>
     * 
     * @param userType
     *        (Optional) If you specify <code>SSO_USER</code>, then only the permissions of IAM Identity Center users
     *        are returned. If you specify <code>SSO_GROUP</code>, only the permissions of IAM Identity Center groups
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public ListPermissionsRequest withUserType(UserType userType) {
        this.userType = userType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to list permissions for. This parameter is required.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to list permissions for. This parameter is required.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to list permissions for. This parameter is required.
     * </p>
     * 
     * @return The ID of the workspace to list permissions for. This parameter is required.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to list permissions for. This parameter is required.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to list permissions for. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserType() != null)
            sb.append("UserType: ").append(getUserType()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPermissionsRequest == false)
            return false;
        ListPermissionsRequest other = (ListPermissionsRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionsRequest clone() {
        return (ListPermissionsRequest) super.clone();
    }

}
