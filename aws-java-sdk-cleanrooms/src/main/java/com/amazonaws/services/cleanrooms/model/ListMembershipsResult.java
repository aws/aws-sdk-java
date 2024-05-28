/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMemberships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembershipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of memberships returned from the ListMemberships operation.
     * </p>
     */
    private java.util.List<MembershipSummary> membershipSummaries;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembershipsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of memberships returned from the ListMemberships operation.
     * </p>
     * 
     * @return The list of memberships returned from the ListMemberships operation.
     */

    public java.util.List<MembershipSummary> getMembershipSummaries() {
        return membershipSummaries;
    }

    /**
     * <p>
     * The list of memberships returned from the ListMemberships operation.
     * </p>
     * 
     * @param membershipSummaries
     *        The list of memberships returned from the ListMemberships operation.
     */

    public void setMembershipSummaries(java.util.Collection<MembershipSummary> membershipSummaries) {
        if (membershipSummaries == null) {
            this.membershipSummaries = null;
            return;
        }

        this.membershipSummaries = new java.util.ArrayList<MembershipSummary>(membershipSummaries);
    }

    /**
     * <p>
     * The list of memberships returned from the ListMemberships operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembershipSummaries(java.util.Collection)} or {@link #withMembershipSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param membershipSummaries
     *        The list of memberships returned from the ListMemberships operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembershipsResult withMembershipSummaries(MembershipSummary... membershipSummaries) {
        if (this.membershipSummaries == null) {
            setMembershipSummaries(new java.util.ArrayList<MembershipSummary>(membershipSummaries.length));
        }
        for (MembershipSummary ele : membershipSummaries) {
            this.membershipSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of memberships returned from the ListMemberships operation.
     * </p>
     * 
     * @param membershipSummaries
     *        The list of memberships returned from the ListMemberships operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembershipsResult withMembershipSummaries(java.util.Collection<MembershipSummary> membershipSummaries) {
        setMembershipSummaries(membershipSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMembershipSummaries() != null)
            sb.append("MembershipSummaries: ").append(getMembershipSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembershipsResult == false)
            return false;
        ListMembershipsResult other = (ListMembershipsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMembershipSummaries() == null ^ this.getMembershipSummaries() == null)
            return false;
        if (other.getMembershipSummaries() != null && other.getMembershipSummaries().equals(this.getMembershipSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMembershipSummaries() == null) ? 0 : getMembershipSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListMembershipsResult clone() {
        try {
            return (ListMembershipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
