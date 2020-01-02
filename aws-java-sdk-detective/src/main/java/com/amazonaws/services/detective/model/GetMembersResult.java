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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The member account details that Detective is returning in response to the request.
     * </p>
     */
    private java.util.List<MemberDetail> memberDetails;
    /**
     * <p>
     * The requested member accounts for which Detective was unable to return member details.
     * </p>
     * <p>
     * For each account, provides the reason why the request could not be processed.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * The member account details that Detective is returning in response to the request.
     * </p>
     * 
     * @return The member account details that Detective is returning in response to the request.
     */

    public java.util.List<MemberDetail> getMemberDetails() {
        return memberDetails;
    }

    /**
     * <p>
     * The member account details that Detective is returning in response to the request.
     * </p>
     * 
     * @param memberDetails
     *        The member account details that Detective is returning in response to the request.
     */

    public void setMemberDetails(java.util.Collection<MemberDetail> memberDetails) {
        if (memberDetails == null) {
            this.memberDetails = null;
            return;
        }

        this.memberDetails = new java.util.ArrayList<MemberDetail>(memberDetails);
    }

    /**
     * <p>
     * The member account details that Detective is returning in response to the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDetails(java.util.Collection)} or {@link #withMemberDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memberDetails
     *        The member account details that Detective is returning in response to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withMemberDetails(MemberDetail... memberDetails) {
        if (this.memberDetails == null) {
            setMemberDetails(new java.util.ArrayList<MemberDetail>(memberDetails.length));
        }
        for (MemberDetail ele : memberDetails) {
            this.memberDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The member account details that Detective is returning in response to the request.
     * </p>
     * 
     * @param memberDetails
     *        The member account details that Detective is returning in response to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withMemberDetails(java.util.Collection<MemberDetail> memberDetails) {
        setMemberDetails(memberDetails);
        return this;
    }

    /**
     * <p>
     * The requested member accounts for which Detective was unable to return member details.
     * </p>
     * <p>
     * For each account, provides the reason why the request could not be processed.
     * </p>
     * 
     * @return The requested member accounts for which Detective was unable to return member details.</p>
     *         <p>
     *         For each account, provides the reason why the request could not be processed.
     */

    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * The requested member accounts for which Detective was unable to return member details.
     * </p>
     * <p>
     * For each account, provides the reason why the request could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The requested member accounts for which Detective was unable to return member details.</p>
     *        <p>
     *        For each account, provides the reason why the request could not be processed.
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
     * The requested member accounts for which Detective was unable to return member details.
     * </p>
     * <p>
     * For each account, provides the reason why the request could not be processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The requested member accounts for which Detective was unable to return member details.</p>
     *        <p>
     *        For each account, provides the reason why the request could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withUnprocessedAccounts(UnprocessedAccount... unprocessedAccounts) {
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
     * The requested member accounts for which Detective was unable to return member details.
     * </p>
     * <p>
     * For each account, provides the reason why the request could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The requested member accounts for which Detective was unable to return member details.</p>
     *        <p>
     *        For each account, provides the reason why the request could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
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
        if (getMemberDetails() != null)
            sb.append("MemberDetails: ").append(getMemberDetails()).append(",");
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

        if (obj instanceof GetMembersResult == false)
            return false;
        GetMembersResult other = (GetMembersResult) obj;
        if (other.getMemberDetails() == null ^ this.getMemberDetails() == null)
            return false;
        if (other.getMemberDetails() != null && other.getMemberDetails().equals(this.getMemberDetails()) == false)
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

        hashCode = prime * hashCode + ((getMemberDetails() == null) ? 0 : getMemberDetails().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public GetMembersResult clone() {
        try {
            return (GetMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
