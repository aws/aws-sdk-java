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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The set of member account invitation requests that Detective was able to process. This includes accounts that are
     * being verified, that failed verification, and that passed verification and are being sent an invitation.
     * </p>
     */
    private java.util.List<MemberDetail> members;
    /**
     * <p>
     * The list of accounts for which Detective was unable to process the invitation request. For each account, the list
     * provides the reason why the request could not be processed. The list includes accounts that are already member
     * accounts in the behavior graph.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * The set of member account invitation requests that Detective was able to process. This includes accounts that are
     * being verified, that failed verification, and that passed verification and are being sent an invitation.
     * </p>
     * 
     * @return The set of member account invitation requests that Detective was able to process. This includes accounts
     *         that are being verified, that failed verification, and that passed verification and are being sent an
     *         invitation.
     */

    public java.util.List<MemberDetail> getMembers() {
        return members;
    }

    /**
     * <p>
     * The set of member account invitation requests that Detective was able to process. This includes accounts that are
     * being verified, that failed verification, and that passed verification and are being sent an invitation.
     * </p>
     * 
     * @param members
     *        The set of member account invitation requests that Detective was able to process. This includes accounts
     *        that are being verified, that failed verification, and that passed verification and are being sent an
     *        invitation.
     */

    public void setMembers(java.util.Collection<MemberDetail> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<MemberDetail>(members);
    }

    /**
     * <p>
     * The set of member account invitation requests that Detective was able to process. This includes accounts that are
     * being verified, that failed verification, and that passed verification and are being sent an invitation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        The set of member account invitation requests that Detective was able to process. This includes accounts
     *        that are being verified, that failed verification, and that passed verification and are being sent an
     *        invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersResult withMembers(MemberDetail... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<MemberDetail>(members.length));
        }
        for (MemberDetail ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of member account invitation requests that Detective was able to process. This includes accounts that are
     * being verified, that failed verification, and that passed verification and are being sent an invitation.
     * </p>
     * 
     * @param members
     *        The set of member account invitation requests that Detective was able to process. This includes accounts
     *        that are being verified, that failed verification, and that passed verification and are being sent an
     *        invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersResult withMembers(java.util.Collection<MemberDetail> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The list of accounts for which Detective was unable to process the invitation request. For each account, the list
     * provides the reason why the request could not be processed. The list includes accounts that are already member
     * accounts in the behavior graph.
     * </p>
     * 
     * @return The list of accounts for which Detective was unable to process the invitation request. For each account,
     *         the list provides the reason why the request could not be processed. The list includes accounts that are
     *         already member accounts in the behavior graph.
     */

    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * The list of accounts for which Detective was unable to process the invitation request. For each account, the list
     * provides the reason why the request could not be processed. The list includes accounts that are already member
     * accounts in the behavior graph.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The list of accounts for which Detective was unable to process the invitation request. For each account,
     *        the list provides the reason why the request could not be processed. The list includes accounts that are
     *        already member accounts in the behavior graph.
     */

    public void setUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts);
    }

    /**
     * <p>
     * The list of accounts for which Detective was unable to process the invitation request. For each account, the list
     * provides the reason why the request could not be processed. The list includes accounts that are already member
     * accounts in the behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The list of accounts for which Detective was unable to process the invitation request. For each account,
     *        the list provides the reason why the request could not be processed. The list includes accounts that are
     *        already member accounts in the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersResult withUnprocessedAccounts(UnprocessedAccount... unprocessedAccounts) {
        if (this.unprocessedAccounts == null) {
            setUnprocessedAccounts(new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts.length));
        }
        for (UnprocessedAccount ele : unprocessedAccounts) {
            this.unprocessedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of accounts for which Detective was unable to process the invitation request. For each account, the list
     * provides the reason why the request could not be processed. The list includes accounts that are already member
     * accounts in the behavior graph.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The list of accounts for which Detective was unable to process the invitation request. For each account,
     *        the list provides the reason why the request could not be processed. The list includes accounts that are
     *        already member accounts in the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersResult withUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        setUnprocessedAccounts(unprocessedAccounts);
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
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
        if (getUnprocessedAccounts() != null)
            sb.append("UnprocessedAccounts: ").append(getUnprocessedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembersResult == false)
            return false;
        CreateMembersResult other = (CreateMembersResult) obj;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getUnprocessedAccounts() == null ^ this.getUnprocessedAccounts() == null)
            return false;
        if (other.getUnprocessedAccounts() != null && other.getUnprocessedAccounts().equals(this.getUnprocessedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public CreateMembersResult clone() {
        try {
            return (CreateMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
