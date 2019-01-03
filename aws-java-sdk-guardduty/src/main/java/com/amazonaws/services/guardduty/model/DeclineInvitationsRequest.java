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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * DeclineInvitations request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeclineInvitationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to
     * decline invitations from.
     */
    private java.util.List<String> accountIds;

    /**
     * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to
     * decline invitations from.
     * 
     * @return A list of account IDs of the AWS accounts that sent invitations to the current member account that you
     *         want to decline invitations from.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to
     * decline invitations from.
     * 
     * @param accountIds
     *        A list of account IDs of the AWS accounts that sent invitations to the current member account that you
     *        want to decline invitations from.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to
     * decline invitations from.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the AWS accounts that sent invitations to the current member account that you
     *        want to decline invitations from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeclineInvitationsRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * A list of account IDs of the AWS accounts that sent invitations to the current member account that you want to
     * decline invitations from.
     * 
     * @param accountIds
     *        A list of account IDs of the AWS accounts that sent invitations to the current member account that you
     *        want to decline invitations from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeclineInvitationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeclineInvitationsRequest == false)
            return false;
        DeclineInvitationsRequest other = (DeclineInvitationsRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public DeclineInvitationsRequest clone() {
        return (DeclineInvitationsRequest) super.clone();
    }

}
