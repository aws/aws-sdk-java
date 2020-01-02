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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListProposalVotes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProposalVotesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The listing of votes.
     * </p>
     */
    private java.util.List<VoteSummary> proposalVotes;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The listing of votes.
     * </p>
     * 
     * @return The listing of votes.
     */

    public java.util.List<VoteSummary> getProposalVotes() {
        return proposalVotes;
    }

    /**
     * <p>
     * The listing of votes.
     * </p>
     * 
     * @param proposalVotes
     *        The listing of votes.
     */

    public void setProposalVotes(java.util.Collection<VoteSummary> proposalVotes) {
        if (proposalVotes == null) {
            this.proposalVotes = null;
            return;
        }

        this.proposalVotes = new java.util.ArrayList<VoteSummary>(proposalVotes);
    }

    /**
     * <p>
     * The listing of votes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProposalVotes(java.util.Collection)} or {@link #withProposalVotes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param proposalVotes
     *        The listing of votes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProposalVotesResult withProposalVotes(VoteSummary... proposalVotes) {
        if (this.proposalVotes == null) {
            setProposalVotes(new java.util.ArrayList<VoteSummary>(proposalVotes.length));
        }
        for (VoteSummary ele : proposalVotes) {
            this.proposalVotes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listing of votes.
     * </p>
     * 
     * @param proposalVotes
     *        The listing of votes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProposalVotesResult withProposalVotes(java.util.Collection<VoteSummary> proposalVotes) {
        setProposalVotes(proposalVotes);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProposalVotesResult withNextToken(String nextToken) {
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
        if (getProposalVotes() != null)
            sb.append("ProposalVotes: ").append(getProposalVotes()).append(",");
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

        if (obj instanceof ListProposalVotesResult == false)
            return false;
        ListProposalVotesResult other = (ListProposalVotesResult) obj;
        if (other.getProposalVotes() == null ^ this.getProposalVotes() == null)
            return false;
        if (other.getProposalVotes() != null && other.getProposalVotes().equals(this.getProposalVotes()) == false)
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

        hashCode = prime * hashCode + ((getProposalVotes() == null) ? 0 : getProposalVotes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProposalVotesResult clone() {
        try {
            return (ListProposalVotesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
