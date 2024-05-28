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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of UsersID associated with the specified collection.
     * </p>
     */
    private java.util.List<User> users;
    /**
     * <p>
     * A pagination token to be used with the subsequent request if the response is truncated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of UsersID associated with the specified collection.
     * </p>
     * 
     * @return List of UsersID associated with the specified collection.
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * <p>
     * List of UsersID associated with the specified collection.
     * </p>
     * 
     * @param users
     *        List of UsersID associated with the specified collection.
     */

    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<User>(users);
    }

    /**
     * <p>
     * List of UsersID associated with the specified collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        List of UsersID associated with the specified collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(User... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<User>(users.length));
        }
        for (User ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of UsersID associated with the specified collection.
     * </p>
     * 
     * @param users
     *        List of UsersID associated with the specified collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(java.util.Collection<User> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * A pagination token to be used with the subsequent request if the response is truncated.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to be used with the subsequent request if the response is truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to be used with the subsequent request if the response is truncated.
     * </p>
     * 
     * @return A pagination token to be used with the subsequent request if the response is truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to be used with the subsequent request if the response is truncated.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to be used with the subsequent request if the response is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withNextToken(String nextToken) {
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

        if (obj instanceof ListUsersResult == false)
            return false;
        ListUsersResult other = (ListUsersResult) obj;
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
    public ListUsersResult clone() {
        try {
            return (ListUsersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
