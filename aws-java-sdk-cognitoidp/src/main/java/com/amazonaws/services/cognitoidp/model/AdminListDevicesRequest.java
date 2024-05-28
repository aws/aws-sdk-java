/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to list devices, as an administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminListDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The limit of the devices request.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * This API operation returns a limited number of results. The pagination token is an identifier that you can
     * present in an additional API request with the same parameters. When you include the pagination token, Amazon
     * Cognito returns the next set of items after the current list. Subsequent requests return a new pagination token.
     * By use of this token, you can paginate through the full list of items.
     * </p>
     */
    private String paginationToken;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     * 
     * @param username
     *        The username of the user that you want to query or modify. The value of this parameter is typically your
     *        user's username, but it can be any of their alias attributes. If <code>username</code> isn't an alias
     *        attribute in your user pool, this value must be the <code>sub</code> of a local user or the username of a
     *        user from a third-party IdP.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     * 
     * @return The username of the user that you want to query or modify. The value of this parameter is typically your
     *         user's username, but it can be any of their alias attributes. If <code>username</code> isn't an alias
     *         attribute in your user pool, this value must be the <code>sub</code> of a local user or the username of a
     *         user from a third-party IdP.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     * 
     * @param username
     *        The username of the user that you want to query or modify. The value of this parameter is typically your
     *        user's username, but it can be any of their alias attributes. If <code>username</code> isn't an alias
     *        attribute in your user pool, this value must be the <code>sub</code> of a local user or the username of a
     *        user from a third-party IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The limit of the devices request.
     * </p>
     * 
     * @param limit
     *        The limit of the devices request.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit of the devices request.
     * </p>
     * 
     * @return The limit of the devices request.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The limit of the devices request.
     * </p>
     * 
     * @param limit
     *        The limit of the devices request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * This API operation returns a limited number of results. The pagination token is an identifier that you can
     * present in an additional API request with the same parameters. When you include the pagination token, Amazon
     * Cognito returns the next set of items after the current list. Subsequent requests return a new pagination token.
     * By use of this token, you can paginate through the full list of items.
     * </p>
     * 
     * @param paginationToken
     *        This API operation returns a limited number of results. The pagination token is an identifier that you can
     *        present in an additional API request with the same parameters. When you include the pagination token,
     *        Amazon Cognito returns the next set of items after the current list. Subsequent requests return a new
     *        pagination token. By use of this token, you can paginate through the full list of items.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * This API operation returns a limited number of results. The pagination token is an identifier that you can
     * present in an additional API request with the same parameters. When you include the pagination token, Amazon
     * Cognito returns the next set of items after the current list. Subsequent requests return a new pagination token.
     * By use of this token, you can paginate through the full list of items.
     * </p>
     * 
     * @return This API operation returns a limited number of results. The pagination token is an identifier that you
     *         can present in an additional API request with the same parameters. When you include the pagination token,
     *         Amazon Cognito returns the next set of items after the current list. Subsequent requests return a new
     *         pagination token. By use of this token, you can paginate through the full list of items.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * This API operation returns a limited number of results. The pagination token is an identifier that you can
     * present in an additional API request with the same parameters. When you include the pagination token, Amazon
     * Cognito returns the next set of items after the current list. Subsequent requests return a new pagination token.
     * By use of this token, you can paginate through the full list of items.
     * </p>
     * 
     * @param paginationToken
     *        This API operation returns a limited number of results. The pagination token is an identifier that you can
     *        present in an additional API request with the same parameters. When you include the pagination token,
     *        Amazon Cognito returns the next set of items after the current list. Subsequent requests return a new
     *        pagination token. By use of this token, you can paginate through the full list of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListDevicesRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminListDevicesRequest == false)
            return false;
        AdminListDevicesRequest other = (AdminListDevicesRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public AdminListDevicesRequest clone() {
        return (AdminListDevicesRequest) super.clone();
    }

}
