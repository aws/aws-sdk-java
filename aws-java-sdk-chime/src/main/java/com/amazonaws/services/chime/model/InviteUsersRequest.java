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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/InviteUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InviteUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The user email addresses to which to send the invite.
     * </p>
     */
    private java.util.List<String> userEmailList;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteUsersRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The user email addresses to which to send the invite.
     * </p>
     * 
     * @return The user email addresses to which to send the invite.
     */

    public java.util.List<String> getUserEmailList() {
        return userEmailList;
    }

    /**
     * <p>
     * The user email addresses to which to send the invite.
     * </p>
     * 
     * @param userEmailList
     *        The user email addresses to which to send the invite.
     */

    public void setUserEmailList(java.util.Collection<String> userEmailList) {
        if (userEmailList == null) {
            this.userEmailList = null;
            return;
        }

        this.userEmailList = new java.util.ArrayList<String>(userEmailList);
    }

    /**
     * <p>
     * The user email addresses to which to send the invite.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserEmailList(java.util.Collection)} or {@link #withUserEmailList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userEmailList
     *        The user email addresses to which to send the invite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteUsersRequest withUserEmailList(String... userEmailList) {
        if (this.userEmailList == null) {
            setUserEmailList(new java.util.ArrayList<String>(userEmailList.length));
        }
        for (String ele : userEmailList) {
            this.userEmailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user email addresses to which to send the invite.
     * </p>
     * 
     * @param userEmailList
     *        The user email addresses to which to send the invite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteUsersRequest withUserEmailList(java.util.Collection<String> userEmailList) {
        setUserEmailList(userEmailList);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getUserEmailList() != null)
            sb.append("UserEmailList: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteUsersRequest == false)
            return false;
        InviteUsersRequest other = (InviteUsersRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserEmailList() == null ^ this.getUserEmailList() == null)
            return false;
        if (other.getUserEmailList() != null && other.getUserEmailList().equals(this.getUserEmailList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserEmailList() == null) ? 0 : getUserEmailList().hashCode());
        return hashCode;
    }

    @Override
    public InviteUsersRequest clone() {
        return (InviteUsersRequest) super.clone();
    }

}
