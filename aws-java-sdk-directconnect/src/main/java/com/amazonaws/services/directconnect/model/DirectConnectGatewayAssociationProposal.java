/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the proposal request to attach a virtual private gateway to a DDirect Connect gateway.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DirectConnectGatewayAssociationProposal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayAssociationProposal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     */
    private String proposalId;
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayOwnerAccount;
    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available to use
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct Connect
     * gateway association cannot be used in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be used in
     * this state.
     * </p>
     * </li>
     * </ul>
     */
    private String proposalState;
    /**
     * <p>
     * Information about the associated virtual private gateway.
     * </p>
     */
    private AssociatedGateway associatedGateway;
    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway;
    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     * 
     * @param proposalId
     *        The ID of the association proposal.
     */

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     * 
     * @return The ID of the association proposal.
     */

    public String getProposalId() {
        return this.proposalId;
    }

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     * 
     * @param proposalId
     *        The ID of the association proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withProposalId(String proposalId) {
        setProposalId(proposalId);
        return this;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayOwnerAccount
     *        The ID of the AWS account that owns the Direct Connect gateway.
     */

    public void setDirectConnectGatewayOwnerAccount(String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @return The ID of the AWS account that owns the Direct Connect gateway.
     */

    public String getDirectConnectGatewayOwnerAccount() {
        return this.directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * 
     * @param directConnectGatewayOwnerAccount
     *        The ID of the AWS account that owns the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withDirectConnectGatewayOwnerAccount(String directConnectGatewayOwnerAccount) {
        setDirectConnectGatewayOwnerAccount(directConnectGatewayOwnerAccount);
        return this;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available to use
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct Connect
     * gateway association cannot be used in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be used in
     * this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param proposalState
     *        The state of the proposal. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available
     *        to use in this state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct
     *        Connect gateway association cannot be used in this state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be
     *        used in this state.
     *        </p>
     *        </li>
     * @see DirectConnectGatewayAssociationProposalState
     */

    public void setProposalState(String proposalState) {
        this.proposalState = proposalState;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available to use
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct Connect
     * gateway association cannot be used in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be used in
     * this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the proposal. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is
     *         available to use in this state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct
     *         Connect gateway association cannot be used in this state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be
     *         used in this state.
     *         </p>
     *         </li>
     * @see DirectConnectGatewayAssociationProposalState
     */

    public String getProposalState() {
        return this.proposalState;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available to use
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct Connect
     * gateway association cannot be used in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be used in
     * this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param proposalState
     *        The state of the proposal. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available
     *        to use in this state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct
     *        Connect gateway association cannot be used in this state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be
     *        used in this state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAssociationProposalState
     */

    public DirectConnectGatewayAssociationProposal withProposalState(String proposalState) {
        setProposalState(proposalState);
        return this;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available to use
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct Connect
     * gateway association cannot be used in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be used in
     * this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param proposalState
     *        The state of the proposal. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>accepted</code>: The proposal has been accepted. The Direct Connect gateway association is available
     *        to use in this state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The proposal has been deleted by the owner that made the proposal. The Direct
     *        Connect gateway association cannot be used in this state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>: The proposal has been requested. The Direct Connect gateway association cannot be
     *        used in this state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectConnectGatewayAssociationProposalState
     */

    public DirectConnectGatewayAssociationProposal withProposalState(DirectConnectGatewayAssociationProposalState proposalState) {
        this.proposalState = proposalState.toString();
        return this;
    }

    /**
     * <p>
     * Information about the associated virtual private gateway.
     * </p>
     * 
     * @param associatedGateway
     *        Information about the associated virtual private gateway.
     */

    public void setAssociatedGateway(AssociatedGateway associatedGateway) {
        this.associatedGateway = associatedGateway;
    }

    /**
     * <p>
     * Information about the associated virtual private gateway.
     * </p>
     * 
     * @return Information about the associated virtual private gateway.
     */

    public AssociatedGateway getAssociatedGateway() {
        return this.associatedGateway;
    }

    /**
     * <p>
     * Information about the associated virtual private gateway.
     * </p>
     * 
     * @param associatedGateway
     *        Information about the associated virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withAssociatedGateway(AssociatedGateway associatedGateway) {
        setAssociatedGateway(associatedGateway);
        return this;
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * 
     * @return The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     */

    public java.util.List<RouteFilterPrefix> getExistingAllowedPrefixesToDirectConnectGateway() {
        if (existingAllowedPrefixesToDirectConnectGateway == null) {
            existingAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return existingAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * 
     * @param existingAllowedPrefixesToDirectConnectGateway
     *        The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     */

    public void setExistingAllowedPrefixesToDirectConnectGateway(java.util.Collection<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway) {
        if (existingAllowedPrefixesToDirectConnectGateway == null) {
            this.existingAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.existingAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                existingAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExistingAllowedPrefixesToDirectConnectGateway(java.util.Collection)} or
     * {@link #withExistingAllowedPrefixesToDirectConnectGateway(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param existingAllowedPrefixesToDirectConnectGateway
     *        The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withExistingAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... existingAllowedPrefixesToDirectConnectGateway) {
        if (this.existingAllowedPrefixesToDirectConnectGateway == null) {
            setExistingAllowedPrefixesToDirectConnectGateway(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                    existingAllowedPrefixesToDirectConnectGateway.length));
        }
        for (RouteFilterPrefix ele : existingAllowedPrefixesToDirectConnectGateway) {
            this.existingAllowedPrefixesToDirectConnectGateway.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * 
     * @param existingAllowedPrefixesToDirectConnectGateway
     *        The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withExistingAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway) {
        setExistingAllowedPrefixesToDirectConnectGateway(existingAllowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * 
     * @return The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     */

    public java.util.List<RouteFilterPrefix> getRequestedAllowedPrefixesToDirectConnectGateway() {
        if (requestedAllowedPrefixesToDirectConnectGateway == null) {
            requestedAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return requestedAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * 
     * @param requestedAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     */

    public void setRequestedAllowedPrefixesToDirectConnectGateway(java.util.Collection<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway) {
        if (requestedAllowedPrefixesToDirectConnectGateway == null) {
            this.requestedAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.requestedAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                requestedAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedAllowedPrefixesToDirectConnectGateway(java.util.Collection)} or
     * {@link #withRequestedAllowedPrefixesToDirectConnectGateway(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param requestedAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withRequestedAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... requestedAllowedPrefixesToDirectConnectGateway) {
        if (this.requestedAllowedPrefixesToDirectConnectGateway == null) {
            setRequestedAllowedPrefixesToDirectConnectGateway(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                    requestedAllowedPrefixesToDirectConnectGateway.length));
        }
        for (RouteFilterPrefix ele : requestedAllowedPrefixesToDirectConnectGateway) {
            this.requestedAllowedPrefixesToDirectConnectGateway.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * 
     * @param requestedAllowedPrefixesToDirectConnectGateway
     *        The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectConnectGatewayAssociationProposal withRequestedAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway) {
        setRequestedAllowedPrefixesToDirectConnectGateway(requestedAllowedPrefixesToDirectConnectGateway);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getDirectConnectGatewayOwnerAccount() != null)
            sb.append("DirectConnectGatewayOwnerAccount: ").append(getDirectConnectGatewayOwnerAccount()).append(",");
        if (getProposalState() != null)
            sb.append("ProposalState: ").append(getProposalState()).append(",");
        if (getAssociatedGateway() != null)
            sb.append("AssociatedGateway: ").append(getAssociatedGateway()).append(",");
        if (getExistingAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("ExistingAllowedPrefixesToDirectConnectGateway: ").append(getExistingAllowedPrefixesToDirectConnectGateway()).append(",");
        if (getRequestedAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("RequestedAllowedPrefixesToDirectConnectGateway: ").append(getRequestedAllowedPrefixesToDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGatewayAssociationProposal == false)
            return false;
        DirectConnectGatewayAssociationProposal other = (DirectConnectGatewayAssociationProposal) obj;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayOwnerAccount() == null ^ this.getDirectConnectGatewayOwnerAccount() == null)
            return false;
        if (other.getDirectConnectGatewayOwnerAccount() != null
                && other.getDirectConnectGatewayOwnerAccount().equals(this.getDirectConnectGatewayOwnerAccount()) == false)
            return false;
        if (other.getProposalState() == null ^ this.getProposalState() == null)
            return false;
        if (other.getProposalState() != null && other.getProposalState().equals(this.getProposalState()) == false)
            return false;
        if (other.getAssociatedGateway() == null ^ this.getAssociatedGateway() == null)
            return false;
        if (other.getAssociatedGateway() != null && other.getAssociatedGateway().equals(this.getAssociatedGateway()) == false)
            return false;
        if (other.getExistingAllowedPrefixesToDirectConnectGateway() == null ^ this.getExistingAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getExistingAllowedPrefixesToDirectConnectGateway() != null
                && other.getExistingAllowedPrefixesToDirectConnectGateway().equals(this.getExistingAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getRequestedAllowedPrefixesToDirectConnectGateway() == null ^ this.getRequestedAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getRequestedAllowedPrefixesToDirectConnectGateway() != null
                && other.getRequestedAllowedPrefixesToDirectConnectGateway().equals(this.getRequestedAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getDirectConnectGatewayOwnerAccount() == null) ? 0 : getDirectConnectGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getProposalState() == null) ? 0 : getProposalState().hashCode());
        hashCode = prime * hashCode + ((getAssociatedGateway() == null) ? 0 : getAssociatedGateway().hashCode());
        hashCode = prime * hashCode
                + ((getExistingAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getExistingAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime * hashCode
                + ((getRequestedAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getRequestedAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public DirectConnectGatewayAssociationProposal clone() {
        try {
            return (DirectConnectGatewayAssociationProposal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.DirectConnectGatewayAssociationProposalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
