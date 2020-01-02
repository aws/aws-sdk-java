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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListInvitations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInvitationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of behavior graphs for which the member account has open or accepted invitations.
     * </p>
     */
    private java.util.List<MemberDetail> invitations;
    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of behavior graphs for which the member account has open or accepted invitations.
     * </p>
     * 
     * @return The list of behavior graphs for which the member account has open or accepted invitations.
     */

    public java.util.List<MemberDetail> getInvitations() {
        return invitations;
    }

    /**
     * <p>
     * The list of behavior graphs for which the member account has open or accepted invitations.
     * </p>
     * 
     * @param invitations
     *        The list of behavior graphs for which the member account has open or accepted invitations.
     */

    public void setInvitations(java.util.Collection<MemberDetail> invitations) {
        if (invitations == null) {
            this.invitations = null;
            return;
        }

        this.invitations = new java.util.ArrayList<MemberDetail>(invitations);
    }

    /**
     * <p>
     * The list of behavior graphs for which the member account has open or accepted invitations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvitations(java.util.Collection)} or {@link #withInvitations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param invitations
     *        The list of behavior graphs for which the member account has open or accepted invitations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvitationsResult withInvitations(MemberDetail... invitations) {
        if (this.invitations == null) {
            setInvitations(new java.util.ArrayList<MemberDetail>(invitations.length));
        }
        for (MemberDetail ele : invitations) {
            this.invitations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of behavior graphs for which the member account has open or accepted invitations.
     * </p>
     * 
     * @param invitations
     *        The list of behavior graphs for which the member account has open or accepted invitations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvitationsResult withInvitations(java.util.Collection<MemberDetail> invitations) {
        setInvitations(invitations);
        return this;
    }

    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     * 
     * @param nextToken
     *        If there are more behavior graphs remaining in the results, then this is the pagination token to use to
     *        request the next page of behavior graphs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     * 
     * @return If there are more behavior graphs remaining in the results, then this is the pagination token to use to
     *         request the next page of behavior graphs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request
     * the next page of behavior graphs.
     * </p>
     * 
     * @param nextToken
     *        If there are more behavior graphs remaining in the results, then this is the pagination token to use to
     *        request the next page of behavior graphs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInvitationsResult withNextToken(String nextToken) {
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
        if (getInvitations() != null)
            sb.append("Invitations: ").append(getInvitations()).append(",");
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

        if (obj instanceof ListInvitationsResult == false)
            return false;
        ListInvitationsResult other = (ListInvitationsResult) obj;
        if (other.getInvitations() == null ^ this.getInvitations() == null)
            return false;
        if (other.getInvitations() != null && other.getInvitations().equals(this.getInvitations()) == false)
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

        hashCode = prime * hashCode + ((getInvitations() == null) ? 0 : getInvitations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInvitationsResult clone() {
        try {
            return (ListInvitationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
