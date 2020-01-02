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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of a proposal on a Managed Blockchain network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Proposal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Proposal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the proposal.
     * </p>
     */
    private String proposalId;
    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The description of the proposal.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The actions to perform on the network if the proposal is <code>APPROVED</code>.
     * </p>
     */
    private ProposalActions actions;
    /**
     * <p>
     * The unique identifier of the member that created the proposal.
     * </p>
     */
    private String proposedByMemberId;
    /**
     * <p>
     * The name of the member that created the proposal.
     * </p>
     */
    private String proposedByMemberName;
    /**
     * <p>
     * The status of the proposal. Values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members according
     * to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal actions are
     * carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     * according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     * <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome before
     * the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that was
     * approved could not be completed because of an error.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time that the proposal was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the
     * proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * The current total of <code>YES</code> votes cast on the proposal by members.
     * </p>
     */
    private Integer yesVoteCount;
    /**
     * <p>
     * The current total of <code>NO</code> votes cast on the proposal by members.
     * </p>
     */
    private Integer noVoteCount;
    /**
     * <p>
     * The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus
     * the sum of <code>YES</code> votes and <code>NO</code> votes.
     * </p>
     */
    private Integer outstandingVoteCount;

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

    public Proposal withProposalId(String proposalId) {
        setProposalId(proposalId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which the proposal is made.
     */

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     * 
     * @return The unique identifier of the network for which the proposal is made.
     */

    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     * 
     * @param networkId
     *        The unique identifier of the network for which the proposal is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The description of the proposal.
     * </p>
     * 
     * @param description
     *        The description of the proposal.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the proposal.
     * </p>
     * 
     * @return The description of the proposal.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the proposal.
     * </p>
     * 
     * @param description
     *        The description of the proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The actions to perform on the network if the proposal is <code>APPROVED</code>.
     * </p>
     * 
     * @param actions
     *        The actions to perform on the network if the proposal is <code>APPROVED</code>.
     */

    public void setActions(ProposalActions actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * The actions to perform on the network if the proposal is <code>APPROVED</code>.
     * </p>
     * 
     * @return The actions to perform on the network if the proposal is <code>APPROVED</code>.
     */

    public ProposalActions getActions() {
        return this.actions;
    }

    /**
     * <p>
     * The actions to perform on the network if the proposal is <code>APPROVED</code>.
     * </p>
     * 
     * @param actions
     *        The actions to perform on the network if the proposal is <code>APPROVED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withActions(ProposalActions actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member that created the proposal.
     * </p>
     * 
     * @param proposedByMemberId
     *        The unique identifier of the member that created the proposal.
     */

    public void setProposedByMemberId(String proposedByMemberId) {
        this.proposedByMemberId = proposedByMemberId;
    }

    /**
     * <p>
     * The unique identifier of the member that created the proposal.
     * </p>
     * 
     * @return The unique identifier of the member that created the proposal.
     */

    public String getProposedByMemberId() {
        return this.proposedByMemberId;
    }

    /**
     * <p>
     * The unique identifier of the member that created the proposal.
     * </p>
     * 
     * @param proposedByMemberId
     *        The unique identifier of the member that created the proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withProposedByMemberId(String proposedByMemberId) {
        setProposedByMemberId(proposedByMemberId);
        return this;
    }

    /**
     * <p>
     * The name of the member that created the proposal.
     * </p>
     * 
     * @param proposedByMemberName
     *        The name of the member that created the proposal.
     */

    public void setProposedByMemberName(String proposedByMemberName) {
        this.proposedByMemberName = proposedByMemberName;
    }

    /**
     * <p>
     * The name of the member that created the proposal.
     * </p>
     * 
     * @return The name of the member that created the proposal.
     */

    public String getProposedByMemberName() {
        return this.proposedByMemberName;
    }

    /**
     * <p>
     * The name of the member that created the proposal.
     * </p>
     * 
     * @param proposedByMemberName
     *        The name of the member that created the proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withProposedByMemberName(String proposedByMemberName) {
        setProposedByMemberName(proposedByMemberName);
        return this;
    }

    /**
     * <p>
     * The status of the proposal. Values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members according
     * to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal actions are
     * carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     * according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     * <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome before
     * the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that was
     * approved could not be completed because of an error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the proposal. Values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members
     *        according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal
     *        actions are carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     *        according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     *        <code>ProposalActions</code> are not carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome
     *        before the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that
     *        was approved could not be completed because of an error.
     *        </p>
     *        </li>
     * @see ProposalStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the proposal. Values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members according
     * to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal actions are
     * carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     * according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     * <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome before
     * the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that was
     * approved could not be completed because of an error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the proposal. Values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members
     *         according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal
     *         actions are carried out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     *         according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     *         <code>ProposalActions</code> are not carried out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal
     *         outcome before the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that
     *         was approved could not be completed because of an error.
     *         </p>
     *         </li>
     * @see ProposalStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the proposal. Values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members according
     * to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal actions are
     * carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     * according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     * <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome before
     * the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that was
     * approved could not be completed because of an error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the proposal. Values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members
     *        according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal
     *        actions are carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     *        according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     *        <code>ProposalActions</code> are not carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome
     *        before the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that
     *        was approved could not be completed because of an error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProposalStatus
     */

    public Proposal withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the proposal. Values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members according
     * to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal actions are
     * carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     * according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     * <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome before
     * the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that was
     * approved could not be completed because of an error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the proposal. Values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The proposal is active and open for member voting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The proposal was approved with sufficient <code>YES</code> votes among members
     *        according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified proposal
     *        actions are carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The proposal was rejected with insufficient <code>YES</code> votes among members
     *        according to the <code>VotingPolicy</code> specified for the <code>Network</code>. The specified
     *        <code>ProposalActions</code> are not carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> - Members did not cast the number of votes required to determine the proposal outcome
     *        before the proposal expired. The specified <code>ProposalActions</code> are not carried out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTION_FAILED</code> - One or more of the specified <code>ProposalActions</code> in a proposal that
     *        was approved could not be completed because of an error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProposalStatus
     */

    public Proposal withStatus(ProposalStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the proposal was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the proposal was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the proposal was created.
     * </p>
     * 
     * @return The date and time that the proposal was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the proposal was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the proposal was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the
     * proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     * </p>
     * 
     * @param expirationDate
     *        The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     *        <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After
     *        this date and time, if members have not cast enough votes to determine the outcome according to the voting
     *        policy, the proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the
     * proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     * </p>
     * 
     * @return The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     *         <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After
     *         this date and time, if members have not cast enough votes to determine the outcome according to the
     *         voting policy, the proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the
     * proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     * </p>
     * 
     * @param expirationDate
     *        The date and time that the proposal expires. This is the <code>CreationDate</code> plus the
     *        <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After
     *        this date and time, if members have not cast enough votes to determine the outcome according to the voting
     *        policy, the proposal is <code>EXPIRED</code> and <code>Actions</code> are not carried out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * The current total of <code>YES</code> votes cast on the proposal by members.
     * </p>
     * 
     * @param yesVoteCount
     *        The current total of <code>YES</code> votes cast on the proposal by members.
     */

    public void setYesVoteCount(Integer yesVoteCount) {
        this.yesVoteCount = yesVoteCount;
    }

    /**
     * <p>
     * The current total of <code>YES</code> votes cast on the proposal by members.
     * </p>
     * 
     * @return The current total of <code>YES</code> votes cast on the proposal by members.
     */

    public Integer getYesVoteCount() {
        return this.yesVoteCount;
    }

    /**
     * <p>
     * The current total of <code>YES</code> votes cast on the proposal by members.
     * </p>
     * 
     * @param yesVoteCount
     *        The current total of <code>YES</code> votes cast on the proposal by members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withYesVoteCount(Integer yesVoteCount) {
        setYesVoteCount(yesVoteCount);
        return this;
    }

    /**
     * <p>
     * The current total of <code>NO</code> votes cast on the proposal by members.
     * </p>
     * 
     * @param noVoteCount
     *        The current total of <code>NO</code> votes cast on the proposal by members.
     */

    public void setNoVoteCount(Integer noVoteCount) {
        this.noVoteCount = noVoteCount;
    }

    /**
     * <p>
     * The current total of <code>NO</code> votes cast on the proposal by members.
     * </p>
     * 
     * @return The current total of <code>NO</code> votes cast on the proposal by members.
     */

    public Integer getNoVoteCount() {
        return this.noVoteCount;
    }

    /**
     * <p>
     * The current total of <code>NO</code> votes cast on the proposal by members.
     * </p>
     * 
     * @param noVoteCount
     *        The current total of <code>NO</code> votes cast on the proposal by members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withNoVoteCount(Integer noVoteCount) {
        setNoVoteCount(noVoteCount);
        return this;
    }

    /**
     * <p>
     * The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus
     * the sum of <code>YES</code> votes and <code>NO</code> votes.
     * </p>
     * 
     * @param outstandingVoteCount
     *        The number of votes remaining to be cast on the proposal by members. In other words, the number of members
     *        minus the sum of <code>YES</code> votes and <code>NO</code> votes.
     */

    public void setOutstandingVoteCount(Integer outstandingVoteCount) {
        this.outstandingVoteCount = outstandingVoteCount;
    }

    /**
     * <p>
     * The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus
     * the sum of <code>YES</code> votes and <code>NO</code> votes.
     * </p>
     * 
     * @return The number of votes remaining to be cast on the proposal by members. In other words, the number of
     *         members minus the sum of <code>YES</code> votes and <code>NO</code> votes.
     */

    public Integer getOutstandingVoteCount() {
        return this.outstandingVoteCount;
    }

    /**
     * <p>
     * The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus
     * the sum of <code>YES</code> votes and <code>NO</code> votes.
     * </p>
     * 
     * @param outstandingVoteCount
     *        The number of votes remaining to be cast on the proposal by members. In other words, the number of members
     *        minus the sum of <code>YES</code> votes and <code>NO</code> votes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Proposal withOutstandingVoteCount(Integer outstandingVoteCount) {
        setOutstandingVoteCount(outstandingVoteCount);
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
        if (getProposalId() != null)
            sb.append("ProposalId: ").append(getProposalId()).append(",");
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getProposedByMemberId() != null)
            sb.append("ProposedByMemberId: ").append(getProposedByMemberId()).append(",");
        if (getProposedByMemberName() != null)
            sb.append("ProposedByMemberName: ").append(getProposedByMemberName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getYesVoteCount() != null)
            sb.append("YesVoteCount: ").append(getYesVoteCount()).append(",");
        if (getNoVoteCount() != null)
            sb.append("NoVoteCount: ").append(getNoVoteCount()).append(",");
        if (getOutstandingVoteCount() != null)
            sb.append("OutstandingVoteCount: ").append(getOutstandingVoteCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Proposal == false)
            return false;
        Proposal other = (Proposal) obj;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getProposedByMemberId() == null ^ this.getProposedByMemberId() == null)
            return false;
        if (other.getProposedByMemberId() != null && other.getProposedByMemberId().equals(this.getProposedByMemberId()) == false)
            return false;
        if (other.getProposedByMemberName() == null ^ this.getProposedByMemberName() == null)
            return false;
        if (other.getProposedByMemberName() != null && other.getProposedByMemberName().equals(this.getProposedByMemberName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getYesVoteCount() == null ^ this.getYesVoteCount() == null)
            return false;
        if (other.getYesVoteCount() != null && other.getYesVoteCount().equals(this.getYesVoteCount()) == false)
            return false;
        if (other.getNoVoteCount() == null ^ this.getNoVoteCount() == null)
            return false;
        if (other.getNoVoteCount() != null && other.getNoVoteCount().equals(this.getNoVoteCount()) == false)
            return false;
        if (other.getOutstandingVoteCount() == null ^ this.getOutstandingVoteCount() == null)
            return false;
        if (other.getOutstandingVoteCount() != null && other.getOutstandingVoteCount().equals(this.getOutstandingVoteCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getProposedByMemberId() == null) ? 0 : getProposedByMemberId().hashCode());
        hashCode = prime * hashCode + ((getProposedByMemberName() == null) ? 0 : getProposedByMemberName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getYesVoteCount() == null) ? 0 : getYesVoteCount().hashCode());
        hashCode = prime * hashCode + ((getNoVoteCount() == null) ? 0 : getNoVoteCount().hashCode());
        hashCode = prime * hashCode + ((getOutstandingVoteCount() == null) ? 0 : getOutstandingVoteCount().hashCode());
        return hashCode;
    }

    @Override
    public Proposal clone() {
        try {
            return (Proposal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.ProposalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
