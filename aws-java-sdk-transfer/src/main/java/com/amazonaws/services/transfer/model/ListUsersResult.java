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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that the users are assigned to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     */
    private java.util.List<ListedUser> users;

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     *        parameter to continue listing additional users.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code>
     *         parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     *         parameter to continue listing additional users.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code> parameter is
     * returned in the output. You can then pass in a subsequent command the <code>NextToken</code> parameter to
     * continue listing additional users.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListUsers</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command the <code>NextToken</code>
     *        parameter to continue listing additional users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that the users are assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server that the users are assigned to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that the users are assigned to.
     * </p>
     * 
     * @return A system-assigned unique identifier for an SFTP server that the users are assigned to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for an SFTP server that the users are assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for an SFTP server that the users are assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * 
     * @return Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     */

    public java.util.List<ListedUser> getUsers() {
        return users;
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * 
     * @param users
     *        Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     */

    public void setUsers(java.util.Collection<ListedUser> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<ListedUser>(users);
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(ListedUser... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<ListedUser>(users.length));
        }
        for (ListedUser ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * 
     * @param users
     *        Returns the user accounts and their properties for the <code>ServerId</code> value that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(java.util.Collection<ListedUser> users) {
        setUsers(users);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
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
