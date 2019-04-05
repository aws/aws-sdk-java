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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListUsers" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Required. The unique ID that Amazon MQ generates for the broker. */
    private String brokerId;
    /**
     * Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     */
    private Integer maxResults;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;
    /** Required. The list of all ActiveMQ usernames for the specified broker. */
    private java.util.List<UserSummary> users;

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @return Required. The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * Required. The unique ID that Amazon MQ generates for the broker.
     * 
     * @param brokerId
     *        Required. The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     * 
     * @param maxResults
     *        Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     * 
     * @return Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value
     *         must be an integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     * 
     * @param maxResults
     *        Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @return The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *         leave nextToken empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Required. The list of all ActiveMQ usernames for the specified broker.
     * 
     * @return Required. The list of all ActiveMQ usernames for the specified broker.
     */

    public java.util.List<UserSummary> getUsers() {
        return users;
    }

    /**
     * Required. The list of all ActiveMQ usernames for the specified broker.
     * 
     * @param users
     *        Required. The list of all ActiveMQ usernames for the specified broker.
     */

    public void setUsers(java.util.Collection<UserSummary> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<UserSummary>(users);
    }

    /**
     * Required. The list of all ActiveMQ usernames for the specified broker.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        Required. The list of all ActiveMQ usernames for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(UserSummary... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<UserSummary>(users.length));
        }
        for (UserSummary ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * Required. The list of all ActiveMQ usernames for the specified broker.
     * 
     * @param users
     *        Required. The list of all ActiveMQ usernames for the specified broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUsers(java.util.Collection<UserSummary> users) {
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
