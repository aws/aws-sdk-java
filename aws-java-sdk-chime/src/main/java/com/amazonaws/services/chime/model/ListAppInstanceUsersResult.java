/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInstanceUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The information for each requested <code>AppInstanceUser</code>.
     * </p>
     */
    private java.util.List<AppInstanceUserSummary> appInstanceUsers;
    /**
     * <p>
     * The token passed by previous API calls until all requested users are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstance</code>.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUsersResult withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUser</code>.
     * </p>
     * 
     * @return The information for each requested <code>AppInstanceUser</code>.
     */

    public java.util.List<AppInstanceUserSummary> getAppInstanceUsers() {
        return appInstanceUsers;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUsers
     *        The information for each requested <code>AppInstanceUser</code>.
     */

    public void setAppInstanceUsers(java.util.Collection<AppInstanceUserSummary> appInstanceUsers) {
        if (appInstanceUsers == null) {
            this.appInstanceUsers = null;
            return;
        }

        this.appInstanceUsers = new java.util.ArrayList<AppInstanceUserSummary>(appInstanceUsers);
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstanceUsers(java.util.Collection)} or {@link #withAppInstanceUsers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param appInstanceUsers
     *        The information for each requested <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUsersResult withAppInstanceUsers(AppInstanceUserSummary... appInstanceUsers) {
        if (this.appInstanceUsers == null) {
            setAppInstanceUsers(new java.util.ArrayList<AppInstanceUserSummary>(appInstanceUsers.length));
        }
        for (AppInstanceUserSummary ele : appInstanceUsers) {
            this.appInstanceUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUsers
     *        The information for each requested <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUsersResult withAppInstanceUsers(java.util.Collection<AppInstanceUserSummary> appInstanceUsers) {
        setAppInstanceUsers(appInstanceUsers);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested users are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested users are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested users are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested users are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInstanceUsersResult withNextToken(String nextToken) {
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getAppInstanceUsers() != null)
            sb.append("AppInstanceUsers: ").append(getAppInstanceUsers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppInstanceUsersResult == false)
            return false;
        ListAppInstanceUsersResult other = (ListAppInstanceUsersResult) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceUsers() == null ^ this.getAppInstanceUsers() == null)
            return false;
        if (other.getAppInstanceUsers() != null && other.getAppInstanceUsers().equals(this.getAppInstanceUsers()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceUsers() == null) ? 0 : getAppInstanceUsers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInstanceUsersResult clone() {
        try {
            return (ListAppInstanceUsersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
