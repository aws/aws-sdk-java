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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VoteOnProposal" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoteOnProposalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     */
    private String proposalId;
    /**
     * <p>
     * The unique identifier of the member casting the vote.
     * </p>
     */
    private String voterMemberId;
    /**
     * <p>
     * The value of the vote.
     * </p>
     */
    private String vote;

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     * 
     * @return The unique identifier of the network.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoteOnProposalRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     * 
     * @param proposalId
     *        The unique identifier of the proposal.
     */

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     * 
     * @return The unique identifier of the proposal.
     */

    public String getProposalId() {
        return this.proposalId;
    }

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     * 
     * @param proposalId
     *        The unique identifier of the proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoteOnProposalRequest withProposalId(String proposalId) {
        setProposalId(proposalId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member casting the vote.
     * </p>
     * 
     * @param voterMemberId
     *        The unique identifier of the member casting the vote.
     */

    public void setVoterMemberId(String voterMemberId) {
        this.voterMemberId = voterMemberId;
    }

    /**
     * <p>
     * The unique identifier of the member casting the vote.
     * </p>
     * 
     * @return The unique identifier of the member casting the vote.
     */

    public String getVoterMemberId() {
        return this.voterMemberId;
    }

    /**
     * <p>
     * The unique identifier of the member casting the vote.
     * </p>
     * 
     * @param voterMemberId
     *        The unique identifier of the member casting the vote.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoteOnProposalRequest withVoterMemberId(String voterMemberId) {
        setVoterMemberId(voterMemberId);
        return this;
    }

    /**
     * <p>
     * The value of the vote.
     * </p>
     * 
     * @param vote
     *        The value of the vote.
     * @see VoteValue
     */

    public void setVote(String vote) {
        this.vote = vote;
    }

    /**
     * <p>
     * The value of the vote.
     * </p>
     * 
     * @return The value of the vote.
     * @see VoteValue
     */

    public String getVote() {
        return this.vote;
    }

    /**
     * <p>
     * The value of the vote.
     * </p>
     * 
     * @param vote
     *        The value of the vote.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoteValue
     */

    public VoteOnProposalRequest withVote(String vote) {
        setVote(vote);
        return this;
    }

    /**
     * <p>
     * The value of the vote.
     * </p>
     * 
     * @param vote
     *        The value of the vote.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoteValue
     */

    public VoteOnProposalRequest withVote(VoteValue vote) {
        this.vote = vote.toString();
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getProposalId() != null)
            sb.append("ProposalId: ").append(getProposalId()).append(",");
        if (getVoterMemberId() != null)
            sb.append("VoterMemberId: ").append(getVoterMemberId()).append(",");
        if (getVote() != null)
            sb.append("Vote: ").append(getVote());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoteOnProposalRequest == false)
            return false;
        VoteOnProposalRequest other = (VoteOnProposalRequest) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        if (other.getVoterMemberId() == null ^ this.getVoterMemberId() == null)
            return false;
        if (other.getVoterMemberId() != null && other.getVoterMemberId().equals(this.getVoterMemberId()) == false)
            return false;
        if (other.getVote() == null ^ this.getVote() == null)
            return false;
        if (other.getVote() != null && other.getVote().equals(this.getVote()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime * hashCode + ((getVoterMemberId() == null) ? 0 : getVoterMemberId().hashCode());
        hashCode = prime * hashCode + ((getVote() == null) ? 0 : getVote().hashCode());
        return hashCode;
    }

    @Override
    public VoteOnProposalRequest clone() {
        return (VoteOnProposalRequest) super.clone();
    }

}
