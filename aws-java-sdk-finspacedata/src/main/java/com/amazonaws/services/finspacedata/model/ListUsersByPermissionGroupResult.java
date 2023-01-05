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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsersByPermissionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersByPermissionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists details of all users in a specific permission group.
     * </p>
     */
    private java.util.List<UserByPermissionGroup> users;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists details of all users in a specific permission group.
     * </p>
     * 
     * @return Lists details of all users in a specific permission group.
     */

    public java.util.List<UserByPermissionGroup> getUsers() {
        return users;
    }

    /**
     * <p>
     * Lists details of all users in a specific permission group.
     * </p>
     * 
     * @param users
     *        Lists details of all users in a specific permission group.
     */

    public void setUsers(java.util.Collection<UserByPermissionGroup> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<UserByPermissionGroup>(users);
    }

    /**
     * <p>
     * Lists details of all users in a specific permission group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        Lists details of all users in a specific permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersByPermissionGroupResult withUsers(UserByPermissionGroup... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<UserByPermissionGroup>(users.length));
        }
        for (UserByPermissionGroup ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists details of all users in a specific permission group.
     * </p>
     * 
     * @param users
     *        Lists details of all users in a specific permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersByPermissionGroupResult withUsers(java.util.Collection<UserByPermissionGroup> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersByPermissionGroupResult withNextToken(String nextToken) {
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
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers()).append(",");
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

        if (obj instanceof ListUsersByPermissionGroupResult == false)
            return false;
        ListUsersByPermissionGroupResult other = (ListUsersByPermissionGroupResult) obj;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
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

        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersByPermissionGroupResult clone() {
        try {
            return (ListUsersByPermissionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
