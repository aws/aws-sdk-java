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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of members returned by the ListMembers operation.
     * </p>
     */
    private java.util.List<MemberSummary> memberSummaries;

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

    public ListMembersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of members returned by the ListMembers operation.
     * </p>
     * 
     * @return The list of members returned by the ListMembers operation.
     */

    public java.util.List<MemberSummary> getMemberSummaries() {
        return memberSummaries;
    }

    /**
     * <p>
     * The list of members returned by the ListMembers operation.
     * </p>
     * 
     * @param memberSummaries
     *        The list of members returned by the ListMembers operation.
     */

    public void setMemberSummaries(java.util.Collection<MemberSummary> memberSummaries) {
        if (memberSummaries == null) {
            this.memberSummaries = null;
            return;
        }

        this.memberSummaries = new java.util.ArrayList<MemberSummary>(memberSummaries);
    }

    /**
     * <p>
     * The list of members returned by the ListMembers operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberSummaries(java.util.Collection)} or {@link #withMemberSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param memberSummaries
     *        The list of members returned by the ListMembers operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersResult withMemberSummaries(MemberSummary... memberSummaries) {
        if (this.memberSummaries == null) {
            setMemberSummaries(new java.util.ArrayList<MemberSummary>(memberSummaries.length));
        }
        for (MemberSummary ele : memberSummaries) {
            this.memberSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of members returned by the ListMembers operation.
     * </p>
     * 
     * @param memberSummaries
     *        The list of members returned by the ListMembers operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersResult withMemberSummaries(java.util.Collection<MemberSummary> memberSummaries) {
        setMemberSummaries(memberSummaries);
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
        if (getMemberSummaries() != null)
            sb.append("MemberSummaries: ").append(getMemberSummaries());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMemberSummaries() == null ^ this.getMemberSummaries() == null)
            return false;
        if (other.getMemberSummaries() != null && other.getMemberSummaries().equals(this.getMemberSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMemberSummaries() == null) ? 0 : getMemberSummaries().hashCode());
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
