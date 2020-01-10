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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociateSigninDelegateGroupsWithAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateSigninDelegateGroupsWithAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     */
    private java.util.List<SigninDelegateGroup> signinDelegateGroups;

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

    public AssociateSigninDelegateGroupsWithAccountRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     * 
     * @return The sign-in delegate groups.
     */

    public java.util.List<SigninDelegateGroup> getSigninDelegateGroups() {
        return signinDelegateGroups;
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     * 
     * @param signinDelegateGroups
     *        The sign-in delegate groups.
     */

    public void setSigninDelegateGroups(java.util.Collection<SigninDelegateGroup> signinDelegateGroups) {
        if (signinDelegateGroups == null) {
            this.signinDelegateGroups = null;
            return;
        }

        this.signinDelegateGroups = new java.util.ArrayList<SigninDelegateGroup>(signinDelegateGroups);
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSigninDelegateGroups(java.util.Collection)} or {@link #withSigninDelegateGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param signinDelegateGroups
     *        The sign-in delegate groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSigninDelegateGroupsWithAccountRequest withSigninDelegateGroups(SigninDelegateGroup... signinDelegateGroups) {
        if (this.signinDelegateGroups == null) {
            setSigninDelegateGroups(new java.util.ArrayList<SigninDelegateGroup>(signinDelegateGroups.length));
        }
        for (SigninDelegateGroup ele : signinDelegateGroups) {
            this.signinDelegateGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sign-in delegate groups.
     * </p>
     * 
     * @param signinDelegateGroups
     *        The sign-in delegate groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateSigninDelegateGroupsWithAccountRequest withSigninDelegateGroups(java.util.Collection<SigninDelegateGroup> signinDelegateGroups) {
        setSigninDelegateGroups(signinDelegateGroups);
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
        if (getSigninDelegateGroups() != null)
            sb.append("SigninDelegateGroups: ").append(getSigninDelegateGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateSigninDelegateGroupsWithAccountRequest == false)
            return false;
        AssociateSigninDelegateGroupsWithAccountRequest other = (AssociateSigninDelegateGroupsWithAccountRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSigninDelegateGroups() == null ^ this.getSigninDelegateGroups() == null)
            return false;
        if (other.getSigninDelegateGroups() != null && other.getSigninDelegateGroups().equals(this.getSigninDelegateGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSigninDelegateGroups() == null) ? 0 : getSigninDelegateGroups().hashCode());
        return hashCode;
    }

    @Override
    public AssociateSigninDelegateGroupsWithAccountRequest clone() {
        return (AssociateSigninDelegateGroupsWithAccountRequest) super.clone();
    }

}
