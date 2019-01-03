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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The users.
     * </p>
     */
    private java.util.List<User> users;
    /**
     * <p>
     * The total number of users included in the results.
     * </p>
     */
    @Deprecated
    private Long totalNumberOfUsers;
    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The users.
     * </p>
     * 
     * @return The users.
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * <p>
     * The users.
     * </p>
     * 
     * @param users
     *        The users.
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
     * The users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        The users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersResult withUsers(User... users) {
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
     * The users.
     * </p>
     * 
     * @param users
     *        The users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersResult withUsers(java.util.Collection<User> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * The total number of users included in the results.
     * </p>
     * 
     * @param totalNumberOfUsers
     *        The total number of users included in the results.
     */
    @Deprecated
    public void setTotalNumberOfUsers(Long totalNumberOfUsers) {
        this.totalNumberOfUsers = totalNumberOfUsers;
    }

    /**
     * <p>
     * The total number of users included in the results.
     * </p>
     * 
     * @return The total number of users included in the results.
     */
    @Deprecated
    public Long getTotalNumberOfUsers() {
        return this.totalNumberOfUsers;
    }

    /**
     * <p>
     * The total number of users included in the results.
     * </p>
     * 
     * @param totalNumberOfUsers
     *        The total number of users included in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DescribeUsersResult withTotalNumberOfUsers(Long totalNumberOfUsers) {
        setTotalNumberOfUsers(totalNumberOfUsers);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param marker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @return The marker to use when requesting the next set of results. If there are no additional results, the string
     *         is empty.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param marker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUsersResult withMarker(String marker) {
        setMarker(marker);
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
        if (getTotalNumberOfUsers() != null)
            sb.append("TotalNumberOfUsers: ").append(getTotalNumberOfUsers()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUsersResult == false)
            return false;
        DescribeUsersResult other = (DescribeUsersResult) obj;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        if (other.getTotalNumberOfUsers() == null ^ this.getTotalNumberOfUsers() == null)
            return false;
        if (other.getTotalNumberOfUsers() != null && other.getTotalNumberOfUsers().equals(this.getTotalNumberOfUsers()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfUsers() == null) ? 0 : getTotalNumberOfUsers().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUsersResult clone() {
        try {
            return (DescribeUsersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
