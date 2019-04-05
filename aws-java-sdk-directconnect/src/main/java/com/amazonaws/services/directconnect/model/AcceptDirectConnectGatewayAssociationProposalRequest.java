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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AcceptDirectConnectGatewayAssociationProposal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptDirectConnectGatewayAssociationProposalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     */
    private String proposalId;
    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     */
    private String associatedGatewayOwnerAccount;
    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteFilterPrefix> overrideAllowedPrefixesToDirectConnectGateway;

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

    public AcceptDirectConnectGatewayAssociationProposalRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     * 
     * @param proposalId
     *        The ID of the request proposal.
     */

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     * 
     * @return The ID of the request proposal.
     */

    public String getProposalId() {
        return this.proposalId;
    }

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     * 
     * @param proposalId
     *        The ID of the request proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptDirectConnectGatewayAssociationProposalRequest withProposalId(String proposalId) {
        setProposalId(proposalId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * 
     * @param associatedGatewayOwnerAccount
     *        The ID of the AWS account that owns the virtual private gateway.
     */

    public void setAssociatedGatewayOwnerAccount(String associatedGatewayOwnerAccount) {
        this.associatedGatewayOwnerAccount = associatedGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * 
     * @return The ID of the AWS account that owns the virtual private gateway.
     */

    public String getAssociatedGatewayOwnerAccount() {
        return this.associatedGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * 
     * @param associatedGatewayOwnerAccount
     *        The ID of the AWS account that owns the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptDirectConnectGatewayAssociationProposalRequest withAssociatedGatewayOwnerAccount(String associatedGatewayOwnerAccount) {
        setAssociatedGatewayOwnerAccount(associatedGatewayOwnerAccount);
        return this;
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * 
     * @return Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     */

    public java.util.List<RouteFilterPrefix> getOverrideAllowedPrefixesToDirectConnectGateway() {
        if (overrideAllowedPrefixesToDirectConnectGateway == null) {
            overrideAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>();
        }
        return overrideAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * 
     * @param overrideAllowedPrefixesToDirectConnectGateway
     *        Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     */

    public void setOverrideAllowedPrefixesToDirectConnectGateway(java.util.Collection<RouteFilterPrefix> overrideAllowedPrefixesToDirectConnectGateway) {
        if (overrideAllowedPrefixesToDirectConnectGateway == null) {
            this.overrideAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.overrideAllowedPrefixesToDirectConnectGateway = new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                overrideAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrideAllowedPrefixesToDirectConnectGateway(java.util.Collection)} or
     * {@link #withOverrideAllowedPrefixesToDirectConnectGateway(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param overrideAllowedPrefixesToDirectConnectGateway
     *        Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptDirectConnectGatewayAssociationProposalRequest withOverrideAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... overrideAllowedPrefixesToDirectConnectGateway) {
        if (this.overrideAllowedPrefixesToDirectConnectGateway == null) {
            setOverrideAllowedPrefixesToDirectConnectGateway(new com.amazonaws.internal.SdkInternalList<RouteFilterPrefix>(
                    overrideAllowedPrefixesToDirectConnectGateway.length));
        }
        for (RouteFilterPrefix ele : overrideAllowedPrefixesToDirectConnectGateway) {
            this.overrideAllowedPrefixesToDirectConnectGateway.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * </p>
     * 
     * @param overrideAllowedPrefixesToDirectConnectGateway
     *        Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptDirectConnectGatewayAssociationProposalRequest withOverrideAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> overrideAllowedPrefixesToDirectConnectGateway) {
        setOverrideAllowedPrefixesToDirectConnectGateway(overrideAllowedPrefixesToDirectConnectGateway);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getProposalId() != null)
            sb.append("ProposalId: ").append(getProposalId()).append(",");
        if (getAssociatedGatewayOwnerAccount() != null)
            sb.append("AssociatedGatewayOwnerAccount: ").append(getAssociatedGatewayOwnerAccount()).append(",");
        if (getOverrideAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("OverrideAllowedPrefixesToDirectConnectGateway: ").append(getOverrideAllowedPrefixesToDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptDirectConnectGatewayAssociationProposalRequest == false)
            return false;
        AcceptDirectConnectGatewayAssociationProposalRequest other = (AcceptDirectConnectGatewayAssociationProposalRequest) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        if (other.getAssociatedGatewayOwnerAccount() == null ^ this.getAssociatedGatewayOwnerAccount() == null)
            return false;
        if (other.getAssociatedGatewayOwnerAccount() != null
                && other.getAssociatedGatewayOwnerAccount().equals(this.getAssociatedGatewayOwnerAccount()) == false)
            return false;
        if (other.getOverrideAllowedPrefixesToDirectConnectGateway() == null ^ this.getOverrideAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getOverrideAllowedPrefixesToDirectConnectGateway() != null
                && other.getOverrideAllowedPrefixesToDirectConnectGateway().equals(this.getOverrideAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedGatewayOwnerAccount() == null) ? 0 : getAssociatedGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getOverrideAllowedPrefixesToDirectConnectGateway() == null) ? 0 : getOverrideAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public AcceptDirectConnectGatewayAssociationProposalRequest clone() {
        return (AcceptDirectConnectGatewayAssociationProposalRequest) super.clone();
    }

}
