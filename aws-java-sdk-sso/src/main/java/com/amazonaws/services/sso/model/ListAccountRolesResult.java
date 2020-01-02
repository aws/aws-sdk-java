/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccountRoles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountRolesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A paginated response with the list of roles and the next token if more results are available.
     * </p>
     */
    private java.util.List<RoleInfo> roleList;

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     * 
     * @param nextToken
     *        The page token client that is used to retrieve the list of accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     * 
     * @return The page token client that is used to retrieve the list of accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     * 
     * @param nextToken
     *        The page token client that is used to retrieve the list of accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountRolesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A paginated response with the list of roles and the next token if more results are available.
     * </p>
     * 
     * @return A paginated response with the list of roles and the next token if more results are available.
     */

    public java.util.List<RoleInfo> getRoleList() {
        return roleList;
    }

    /**
     * <p>
     * A paginated response with the list of roles and the next token if more results are available.
     * </p>
     * 
     * @param roleList
     *        A paginated response with the list of roles and the next token if more results are available.
     */

    public void setRoleList(java.util.Collection<RoleInfo> roleList) {
        if (roleList == null) {
            this.roleList = null;
            return;
        }

        this.roleList = new java.util.ArrayList<RoleInfo>(roleList);
    }

    /**
     * <p>
     * A paginated response with the list of roles and the next token if more results are available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleList(java.util.Collection)} or {@link #withRoleList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param roleList
     *        A paginated response with the list of roles and the next token if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountRolesResult withRoleList(RoleInfo... roleList) {
        if (this.roleList == null) {
            setRoleList(new java.util.ArrayList<RoleInfo>(roleList.length));
        }
        for (RoleInfo ele : roleList) {
            this.roleList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A paginated response with the list of roles and the next token if more results are available.
     * </p>
     * 
     * @param roleList
     *        A paginated response with the list of roles and the next token if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountRolesResult withRoleList(java.util.Collection<RoleInfo> roleList) {
        setRoleList(roleList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRoleList() != null)
            sb.append("RoleList: ").append(getRoleList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountRolesResult == false)
            return false;
        ListAccountRolesResult other = (ListAccountRolesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRoleList() == null ^ this.getRoleList() == null)
            return false;
        if (other.getRoleList() != null && other.getRoleList().equals(this.getRoleList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRoleList() == null) ? 0 : getRoleList().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountRolesResult clone() {
        try {
            return (ListAccountRolesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
