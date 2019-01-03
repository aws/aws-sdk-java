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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * </p>
     */
    private java.util.List<UserSummary> userSummaryList;
    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * </p>
     * 
     * @return An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     */

    public java.util.List<UserSummary> getUserSummaryList() {
        return userSummaryList;
    }

    /**
     * <p>
     * An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * </p>
     * 
     * @param userSummaryList
     *        An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     */

    public void setUserSummaryList(java.util.Collection<UserSummary> userSummaryList) {
        if (userSummaryList == null) {
            this.userSummaryList = null;
            return;
        }

        this.userSummaryList = new java.util.ArrayList<UserSummary>(userSummaryList);
    }

    /**
     * <p>
     * An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserSummaryList(java.util.Collection)} or {@link #withUserSummaryList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param userSummaryList
     *        An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUserSummaryList(UserSummary... userSummaryList) {
        if (this.userSummaryList == null) {
            setUserSummaryList(new java.util.ArrayList<UserSummary>(userSummaryList.length));
        }
        for (UserSummary ele : userSummaryList) {
            this.userSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * </p>
     * 
     * @param userSummaryList
     *        An array of <code>UserSummary</code> objects that contain information about the users in your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersResult withUserSummaryList(java.util.Collection<UserSummary> userSummaryList) {
        setUserSummaryList(userSummaryList);
        return this;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @return A string returned in the response. Use the value returned in the response as the value of the NextToken
     *         in a subsequent request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.
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
        if (getUserSummaryList() != null)
            sb.append("UserSummaryList: ").append(getUserSummaryList()).append(",");
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
        if (other.getUserSummaryList() == null ^ this.getUserSummaryList() == null)
            return false;
        if (other.getUserSummaryList() != null && other.getUserSummaryList().equals(this.getUserSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getUserSummaryList() == null) ? 0 : getUserSummaryList().hashCode());
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
