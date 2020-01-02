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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateProposal" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProposalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The unique identifier of the network for which the proposal is made.
     * </p>
     */
    private String networkId;
    /**
     * <p>
     * The unique identifier of the member that is creating the proposal. This identifier is especially useful for
     * identifying the member making the proposal when multiple members exist in a single AWS account.
     * </p>
     */
    private String memberId;
    /**
     * <p>
     * The type of actions proposed, such as inviting a member or removing a member. The types of <code>Actions</code>
     * in a proposal are mutually exclusive. For example, a proposal with <code>Invitations</code> actions cannot also
     * contain <code>Removals</code> actions.
     * </p>
     */
    private ProposalActions actions;
    /**
     * <p>
     * A description for the proposal that is visible to voting members, for example,
     * "Proposal to add Example Corp. as member."
     * </p>
     */
    private String description;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time. This identifier is required only if you make a
     *         service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *         AWS CLI.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProposalRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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

    public CreateProposalRequest withNetworkId(String networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member that is creating the proposal. This identifier is especially useful for
     * identifying the member making the proposal when multiple members exist in a single AWS account.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that is creating the proposal. This identifier is especially useful
     *        for identifying the member making the proposal when multiple members exist in a single AWS account.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that is creating the proposal. This identifier is especially useful for
     * identifying the member making the proposal when multiple members exist in a single AWS account.
     * </p>
     * 
     * @return The unique identifier of the member that is creating the proposal. This identifier is especially useful
     *         for identifying the member making the proposal when multiple members exist in a single AWS account.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that is creating the proposal. This identifier is especially useful for
     * identifying the member making the proposal when multiple members exist in a single AWS account.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that is creating the proposal. This identifier is especially useful
     *        for identifying the member making the proposal when multiple members exist in a single AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProposalRequest withMemberId(String memberId) {
        setMemberId(memberId);
        return this;
    }

    /**
     * <p>
     * The type of actions proposed, such as inviting a member or removing a member. The types of <code>Actions</code>
     * in a proposal are mutually exclusive. For example, a proposal with <code>Invitations</code> actions cannot also
     * contain <code>Removals</code> actions.
     * </p>
     * 
     * @param actions
     *        The type of actions proposed, such as inviting a member or removing a member. The types of
     *        <code>Actions</code> in a proposal are mutually exclusive. For example, a proposal with
     *        <code>Invitations</code> actions cannot also contain <code>Removals</code> actions.
     */

    public void setActions(ProposalActions actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * The type of actions proposed, such as inviting a member or removing a member. The types of <code>Actions</code>
     * in a proposal are mutually exclusive. For example, a proposal with <code>Invitations</code> actions cannot also
     * contain <code>Removals</code> actions.
     * </p>
     * 
     * @return The type of actions proposed, such as inviting a member or removing a member. The types of
     *         <code>Actions</code> in a proposal are mutually exclusive. For example, a proposal with
     *         <code>Invitations</code> actions cannot also contain <code>Removals</code> actions.
     */

    public ProposalActions getActions() {
        return this.actions;
    }

    /**
     * <p>
     * The type of actions proposed, such as inviting a member or removing a member. The types of <code>Actions</code>
     * in a proposal are mutually exclusive. For example, a proposal with <code>Invitations</code> actions cannot also
     * contain <code>Removals</code> actions.
     * </p>
     * 
     * @param actions
     *        The type of actions proposed, such as inviting a member or removing a member. The types of
     *        <code>Actions</code> in a proposal are mutually exclusive. For example, a proposal with
     *        <code>Invitations</code> actions cannot also contain <code>Removals</code> actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProposalRequest withActions(ProposalActions actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A description for the proposal that is visible to voting members, for example,
     * "Proposal to add Example Corp. as member."
     * </p>
     * 
     * @param description
     *        A description for the proposal that is visible to voting members, for example,
     *        "Proposal to add Example Corp. as member."
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the proposal that is visible to voting members, for example,
     * "Proposal to add Example Corp. as member."
     * </p>
     * 
     * @return A description for the proposal that is visible to voting members, for example,
     *         "Proposal to add Example Corp. as member."
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the proposal that is visible to voting members, for example,
     * "Proposal to add Example Corp. as member."
     * </p>
     * 
     * @param description
     *        A description for the proposal that is visible to voting members, for example,
     *        "Proposal to add Example Corp. as member."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProposalRequest withDescription(String description) {
        setDescription(description);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProposalRequest == false)
            return false;
        CreateProposalRequest other = (CreateProposalRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateProposalRequest clone() {
        return (CreateProposalRequest) super.clone();
    }

}
