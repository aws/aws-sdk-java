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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of member accounts in the behavior graph.
     * </p>
     * <p>
     * The results include member accounts that did not pass verification and member accounts that have not yet accepted
     * the invitation to the behavior graph. The results do not include member accounts that were removed from the
     * behavior graph.
     * </p>
     */
    private java.util.List<MemberDetail> memberDetails;
    /**
     * <p>
     * If there are more member accounts remaining in the results, then this is the pagination token to use to request
     * the next page of member accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of member accounts in the behavior graph.
     * </p>
     * <p>
     * The results include member accounts that did not pass verification and member accounts that have not yet accepted
     * the invitation to the behavior graph. The results do not include member accounts that were removed from the
     * behavior graph.
     * </p>
     * 
     * @return The list of member accounts in the behavior graph.</p>
     *         <p>
     *         The results include member accounts that did not pass verification and member accounts that have not yet
     *         accepted the invitation to the behavior graph. The results do not include member accounts that were
     *         removed from the behavior graph.
     */

    public java.util.List<MemberDetail> getMemberDetails() {
        return memberDetails;
    }

    /**
     * <p>
     * The list of member accounts in the behavior graph.
     * </p>
     * <p>
     * The results include member accounts that did not pass verification and member accounts that have not yet accepted
     * the invitation to the behavior graph. The results do not include member accounts that were removed from the
     * behavior graph.
     * </p>
     * 
     * @param memberDetails
     *        The list of member accounts in the behavior graph.</p>
     *        <p>
     *        The results include member accounts that did not pass verification and member accounts that have not yet
     *        accepted the invitation to the behavior graph. The results do not include member accounts that were
     *        removed from the behavior graph.
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
     * The list of member accounts in the behavior graph.
     * </p>
     * <p>
     * The results include member accounts that did not pass verification and member accounts that have not yet accepted
     * the invitation to the behavior graph. The results do not include member accounts that were removed from the
     * behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDetails(java.util.Collection)} or {@link #withMemberDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memberDetails
     *        The list of member accounts in the behavior graph.</p>
     *        <p>
     *        The results include member accounts that did not pass verification and member accounts that have not yet
     *        accepted the invitation to the behavior graph. The results do not include member accounts that were
     *        removed from the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersResult withMemberDetails(MemberDetail... memberDetails) {
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
     * The list of member accounts in the behavior graph.
     * </p>
     * <p>
     * The results include member accounts that did not pass verification and member accounts that have not yet accepted
     * the invitation to the behavior graph. The results do not include member accounts that were removed from the
     * behavior graph.
     * </p>
     * 
     * @param memberDetails
     *        The list of member accounts in the behavior graph.</p>
     *        <p>
     *        The results include member accounts that did not pass verification and member accounts that have not yet
     *        accepted the invitation to the behavior graph. The results do not include member accounts that were
     *        removed from the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersResult withMemberDetails(java.util.Collection<MemberDetail> memberDetails) {
        setMemberDetails(memberDetails);
        return this;
    }

    /**
     * <p>
     * If there are more member accounts remaining in the results, then this is the pagination token to use to request
     * the next page of member accounts.
     * </p>
     * 
     * @param nextToken
     *        If there are more member accounts remaining in the results, then this is the pagination token to use to
     *        request the next page of member accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more member accounts remaining in the results, then this is the pagination token to use to request
     * the next page of member accounts.
     * </p>
     * 
     * @return If there are more member accounts remaining in the results, then this is the pagination token to use to
     *         request the next page of member accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more member accounts remaining in the results, then this is the pagination token to use to request
     * the next page of member accounts.
     * </p>
     * 
     * @param nextToken
     *        If there are more member accounts remaining in the results, then this is the pagination token to use to
     *        request the next page of member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersResult withNextToken(String nextToken) {
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
        if (getMemberDetails() != null)
            sb.append("MemberDetails: ").append(getMemberDetails()).append(",");
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

        if (obj instanceof ListMembersResult == false)
            return false;
        ListMembersResult other = (ListMembersResult) obj;
        if (other.getMemberDetails() == null ^ this.getMemberDetails() == null)
            return false;
        if (other.getMemberDetails() != null && other.getMemberDetails().equals(this.getMemberDetails()) == false)
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

        hashCode = prime * hashCode + ((getMemberDetails() == null) ? 0 : getMemberDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMembersResult clone() {
        try {
            return (ListMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
