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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the agreement, including top-level attributes (for example, the agreement ID, version, proposer, and
 * acceptor).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/AgreementViewSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgreementViewSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the agreement was accepted.
     * </p>
     */
    private java.util.Date acceptanceTime;
    /**
     * <p>
     * Details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement.</code>
     * </p>
     */
    private Acceptor acceptor;
    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     */
    private String agreementId;
    /**
     * <p>
     * The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     * </p>
     */
    private String agreementType;
    /**
     * <p>
     * The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements, which
     * don’t have end dates.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A summary of the proposal
     * </p>
     */
    private ProposalSummary proposalSummary;
    /**
     * <p>
     * Details of the party proposing the agreement terms, most commonly the seller for <code>PurchaseAgreement</code>.
     * </p>
     */
    private Proposer proposer;
    /**
     * <p>
     * The date and time when the agreement starts.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The current status of the agreement.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The date and time that the agreement was accepted.
     * </p>
     * 
     * @param acceptanceTime
     *        The date and time that the agreement was accepted.
     */

    public void setAcceptanceTime(java.util.Date acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    /**
     * <p>
     * The date and time that the agreement was accepted.
     * </p>
     * 
     * @return The date and time that the agreement was accepted.
     */

    public java.util.Date getAcceptanceTime() {
        return this.acceptanceTime;
    }

    /**
     * <p>
     * The date and time that the agreement was accepted.
     * </p>
     * 
     * @param acceptanceTime
     *        The date and time that the agreement was accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withAcceptanceTime(java.util.Date acceptanceTime) {
        setAcceptanceTime(acceptanceTime);
        return this;
    }

    /**
     * <p>
     * Details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement.</code>
     * </p>
     * 
     * @param acceptor
     *        Details of the party accepting the agreement terms. This is commonly the buyer for
     *        <code>PurchaseAgreement.</code>
     */

    public void setAcceptor(Acceptor acceptor) {
        this.acceptor = acceptor;
    }

    /**
     * <p>
     * Details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement.</code>
     * </p>
     * 
     * @return Details of the party accepting the agreement terms. This is commonly the buyer for
     *         <code>PurchaseAgreement.</code>
     */

    public Acceptor getAcceptor() {
        return this.acceptor;
    }

    /**
     * <p>
     * Details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement.</code>
     * </p>
     * 
     * @param acceptor
     *        Details of the party accepting the agreement terms. This is commonly the buyer for
     *        <code>PurchaseAgreement.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withAcceptor(Acceptor acceptor) {
        setAcceptor(acceptor);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @return The unique identifier of the agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withAgreementId(String agreementId) {
        setAgreementId(agreementId);
        return this;
    }

    /**
     * <p>
     * The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     * </p>
     * 
     * @param agreementType
     *        The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     */

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    /**
     * <p>
     * The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     * </p>
     * 
     * @return The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     */

    public String getAgreementType() {
        return this.agreementType;
    }

    /**
     * <p>
     * The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     * </p>
     * 
     * @param agreementType
     *        The type of agreement. Values are <code>PurchaseAgreement</code> or <code>VendorInsightsAgreement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withAgreementType(String agreementType) {
        setAgreementType(agreementType);
        return this;
    }

    /**
     * <p>
     * The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements, which
     * don’t have end dates.
     * </p>
     * 
     * @param endTime
     *        The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements,
     *        which don’t have end dates.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements, which
     * don’t have end dates.
     * </p>
     * 
     * @return The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements,
     *         which don’t have end dates.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements, which
     * don’t have end dates.
     * </p>
     * 
     * @param endTime
     *        The date and time when the agreement ends. The field is <code>null</code> for pay-as-you-go agreements,
     *        which don’t have end dates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A summary of the proposal
     * </p>
     * 
     * @param proposalSummary
     *        A summary of the proposal
     */

    public void setProposalSummary(ProposalSummary proposalSummary) {
        this.proposalSummary = proposalSummary;
    }

    /**
     * <p>
     * A summary of the proposal
     * </p>
     * 
     * @return A summary of the proposal
     */

    public ProposalSummary getProposalSummary() {
        return this.proposalSummary;
    }

    /**
     * <p>
     * A summary of the proposal
     * </p>
     * 
     * @param proposalSummary
     *        A summary of the proposal
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withProposalSummary(ProposalSummary proposalSummary) {
        setProposalSummary(proposalSummary);
        return this;
    }

    /**
     * <p>
     * Details of the party proposing the agreement terms, most commonly the seller for <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @param proposer
     *        Details of the party proposing the agreement terms, most commonly the seller for
     *        <code>PurchaseAgreement</code>.
     */

    public void setProposer(Proposer proposer) {
        this.proposer = proposer;
    }

    /**
     * <p>
     * Details of the party proposing the agreement terms, most commonly the seller for <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @return Details of the party proposing the agreement terms, most commonly the seller for
     *         <code>PurchaseAgreement</code>.
     */

    public Proposer getProposer() {
        return this.proposer;
    }

    /**
     * <p>
     * Details of the party proposing the agreement terms, most commonly the seller for <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @param proposer
     *        Details of the party proposing the agreement terms, most commonly the seller for
     *        <code>PurchaseAgreement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withProposer(Proposer proposer) {
        setProposer(proposer);
        return this;
    }

    /**
     * <p>
     * The date and time when the agreement starts.
     * </p>
     * 
     * @param startTime
     *        The date and time when the agreement starts.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the agreement starts.
     * </p>
     * 
     * @return The date and time when the agreement starts.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time when the agreement starts.
     * </p>
     * 
     * @param startTime
     *        The date and time when the agreement starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgreementViewSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * 
     * @param status
     *        The current status of the agreement.
     * @see AgreementStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * 
     * @return The current status of the agreement.
     * @see AgreementStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * 
     * @param status
     *        The current status of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatus
     */

    public AgreementViewSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * 
     * @param status
     *        The current status of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatus
     */

    public AgreementViewSummary withStatus(AgreementStatus status) {
        this.status = status.toString();
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
        if (getAcceptanceTime() != null)
            sb.append("AcceptanceTime: ").append(getAcceptanceTime()).append(",");
        if (getAcceptor() != null)
            sb.append("Acceptor: ").append(getAcceptor()).append(",");
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId()).append(",");
        if (getAgreementType() != null)
            sb.append("AgreementType: ").append(getAgreementType()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getProposalSummary() != null)
            sb.append("ProposalSummary: ").append(getProposalSummary()).append(",");
        if (getProposer() != null)
            sb.append("Proposer: ").append(getProposer()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgreementViewSummary == false)
            return false;
        AgreementViewSummary other = (AgreementViewSummary) obj;
        if (other.getAcceptanceTime() == null ^ this.getAcceptanceTime() == null)
            return false;
        if (other.getAcceptanceTime() != null && other.getAcceptanceTime().equals(this.getAcceptanceTime()) == false)
            return false;
        if (other.getAcceptor() == null ^ this.getAcceptor() == null)
            return false;
        if (other.getAcceptor() != null && other.getAcceptor().equals(this.getAcceptor()) == false)
            return false;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        if (other.getAgreementType() == null ^ this.getAgreementType() == null)
            return false;
        if (other.getAgreementType() != null && other.getAgreementType().equals(this.getAgreementType()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getProposalSummary() == null ^ this.getProposalSummary() == null)
            return false;
        if (other.getProposalSummary() != null && other.getProposalSummary().equals(this.getProposalSummary()) == false)
            return false;
        if (other.getProposer() == null ^ this.getProposer() == null)
            return false;
        if (other.getProposer() != null && other.getProposer().equals(this.getProposer()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptanceTime() == null) ? 0 : getAcceptanceTime().hashCode());
        hashCode = prime * hashCode + ((getAcceptor() == null) ? 0 : getAcceptor().hashCode());
        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        hashCode = prime * hashCode + ((getAgreementType() == null) ? 0 : getAgreementType().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getProposalSummary() == null) ? 0 : getProposalSummary().hashCode());
        hashCode = prime * hashCode + ((getProposer() == null) ? 0 : getProposer().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AgreementViewSummary clone() {
        try {
            return (AgreementViewSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.AgreementViewSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
