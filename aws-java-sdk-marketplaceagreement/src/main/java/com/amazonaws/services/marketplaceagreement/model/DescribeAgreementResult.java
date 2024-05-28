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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/DescribeAgreement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAgreementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the offer was accepted or the agreement was created.
     * </p>
     * <note>
     * <p>
     * <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     * </p>
     * </note>
     */
    private java.util.Date acceptanceTime;
    /**
     * <p>
     * The details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement</code>.
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
     * The estimated cost of the agreement.
     * </p>
     */
    private EstimatedCharges estimatedCharges;
    /**
     * <p>
     * A summary of the proposal received from the proposer.
     * </p>
     */
    private ProposalSummary proposalSummary;
    /**
     * <p>
     * The details of the party proposing the agreement terms. This is commonly the seller for
     * <code>PurchaseAgreement</code>.
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
     * <p>
     * Statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The terms of the agreement are active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code> – The agreement ended without a specified reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> – The agreement ended on the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has been
     * rolled back because of an error. An earlier revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no longer
     * active and another agreement revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination (for
     * example, a payment failure).
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The date and time the offer was accepted or the agreement was created.
     * </p>
     * <note>
     * <p>
     * <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     * </p>
     * </note>
     * 
     * @param acceptanceTime
     *        The date and time the offer was accepted or the agreement was created.</p> <note>
     *        <p>
     *        <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     *        </p>
     */

    public void setAcceptanceTime(java.util.Date acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    /**
     * <p>
     * The date and time the offer was accepted or the agreement was created.
     * </p>
     * <note>
     * <p>
     * <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     * </p>
     * </note>
     * 
     * @return The date and time the offer was accepted or the agreement was created.</p> <note>
     *         <p>
     *         <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     *         </p>
     */

    public java.util.Date getAcceptanceTime() {
        return this.acceptanceTime;
    }

    /**
     * <p>
     * The date and time the offer was accepted or the agreement was created.
     * </p>
     * <note>
     * <p>
     * <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     * </p>
     * </note>
     * 
     * @param acceptanceTime
     *        The date and time the offer was accepted or the agreement was created.</p> <note>
     *        <p>
     *        <code>AcceptanceTime</code> and <code>StartTime</code> can differ for future dated agreements (FDAs).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgreementResult withAcceptanceTime(java.util.Date acceptanceTime) {
        setAcceptanceTime(acceptanceTime);
        return this;
    }

    /**
     * <p>
     * The details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @param acceptor
     *        The details of the party accepting the agreement terms. This is commonly the buyer for
     *        <code>PurchaseAgreement</code>.
     */

    public void setAcceptor(Acceptor acceptor) {
        this.acceptor = acceptor;
    }

    /**
     * <p>
     * The details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @return The details of the party accepting the agreement terms. This is commonly the buyer for
     *         <code>PurchaseAgreement</code>.
     */

    public Acceptor getAcceptor() {
        return this.acceptor;
    }

    /**
     * <p>
     * The details of the party accepting the agreement terms. This is commonly the buyer for
     * <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @param acceptor
     *        The details of the party accepting the agreement terms. This is commonly the buyer for
     *        <code>PurchaseAgreement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgreementResult withAcceptor(Acceptor acceptor) {
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

    public DescribeAgreementResult withAgreementId(String agreementId) {
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

    public DescribeAgreementResult withAgreementType(String agreementType) {
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

    public DescribeAgreementResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The estimated cost of the agreement.
     * </p>
     * 
     * @param estimatedCharges
     *        The estimated cost of the agreement.
     */

    public void setEstimatedCharges(EstimatedCharges estimatedCharges) {
        this.estimatedCharges = estimatedCharges;
    }

    /**
     * <p>
     * The estimated cost of the agreement.
     * </p>
     * 
     * @return The estimated cost of the agreement.
     */

    public EstimatedCharges getEstimatedCharges() {
        return this.estimatedCharges;
    }

    /**
     * <p>
     * The estimated cost of the agreement.
     * </p>
     * 
     * @param estimatedCharges
     *        The estimated cost of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgreementResult withEstimatedCharges(EstimatedCharges estimatedCharges) {
        setEstimatedCharges(estimatedCharges);
        return this;
    }

    /**
     * <p>
     * A summary of the proposal received from the proposer.
     * </p>
     * 
     * @param proposalSummary
     *        A summary of the proposal received from the proposer.
     */

    public void setProposalSummary(ProposalSummary proposalSummary) {
        this.proposalSummary = proposalSummary;
    }

    /**
     * <p>
     * A summary of the proposal received from the proposer.
     * </p>
     * 
     * @return A summary of the proposal received from the proposer.
     */

    public ProposalSummary getProposalSummary() {
        return this.proposalSummary;
    }

    /**
     * <p>
     * A summary of the proposal received from the proposer.
     * </p>
     * 
     * @param proposalSummary
     *        A summary of the proposal received from the proposer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgreementResult withProposalSummary(ProposalSummary proposalSummary) {
        setProposalSummary(proposalSummary);
        return this;
    }

    /**
     * <p>
     * The details of the party proposing the agreement terms. This is commonly the seller for
     * <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @param proposer
     *        The details of the party proposing the agreement terms. This is commonly the seller for
     *        <code>PurchaseAgreement</code>.
     */

    public void setProposer(Proposer proposer) {
        this.proposer = proposer;
    }

    /**
     * <p>
     * The details of the party proposing the agreement terms. This is commonly the seller for
     * <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @return The details of the party proposing the agreement terms. This is commonly the seller for
     *         <code>PurchaseAgreement</code>.
     */

    public Proposer getProposer() {
        return this.proposer;
    }

    /**
     * <p>
     * The details of the party proposing the agreement terms. This is commonly the seller for
     * <code>PurchaseAgreement</code>.
     * </p>
     * 
     * @param proposer
     *        The details of the party proposing the agreement terms. This is commonly the seller for
     *        <code>PurchaseAgreement</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAgreementResult withProposer(Proposer proposer) {
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

    public DescribeAgreementResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * <p>
     * Statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The terms of the agreement are active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code> – The agreement ended without a specified reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> – The agreement ended on the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has been
     * rolled back because of an error. An earlier revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no longer
     * active and another agreement revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination (for
     * example, a payment failure).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the agreement.</p>
     *        <p>
     *        Statuses include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – The terms of the agreement are active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code> – The agreement ended without a specified reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> – The agreement ended on the defined end date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has
     *        been rolled back because of an error. An earlier revision is now active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no
     *        longer active and another agreement revision is now active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination
     *        (for example, a payment failure).
     *        </p>
     *        </li>
     * @see AgreementStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * <p>
     * Statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The terms of the agreement are active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code> – The agreement ended without a specified reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> – The agreement ended on the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has been
     * rolled back because of an error. An earlier revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no longer
     * active and another agreement revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination (for
     * example, a payment failure).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the agreement.</p>
     *         <p>
     *         Statuses include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> – The terms of the agreement are active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ARCHIVED</code> – The agreement ended without a specified reason.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED</code> – The agreement ended on the defined end date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has
     *         been rolled back because of an error. An earlier revision is now active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no
     *         longer active and another agreement revision is now active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination
     *         (for example, a payment failure).
     *         </p>
     *         </li>
     * @see AgreementStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * <p>
     * Statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The terms of the agreement are active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code> – The agreement ended without a specified reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> – The agreement ended on the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has been
     * rolled back because of an error. An earlier revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no longer
     * active and another agreement revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination (for
     * example, a payment failure).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the agreement.</p>
     *        <p>
     *        Statuses include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – The terms of the agreement are active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code> – The agreement ended without a specified reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> – The agreement ended on the defined end date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has
     *        been rolled back because of an error. An earlier revision is now active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no
     *        longer active and another agreement revision is now active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination
     *        (for example, a payment failure).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatus
     */

    public DescribeAgreementResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the agreement.
     * </p>
     * <p>
     * Statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The terms of the agreement are active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ARCHIVED</code> – The agreement ended without a specified reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> – The agreement ended on the defined end date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has been
     * rolled back because of an error. An earlier revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no longer
     * active and another agreement revision is now active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination (for
     * example, a payment failure).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the agreement.</p>
     *        <p>
     *        Statuses include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – The terms of the agreement are active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ARCHIVED</code> – The agreement ended without a specified reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The acceptor ended the agreement before the defined end date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> – The agreement ended on the defined end date.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RENEWED</code> – The agreement was renewed into a new agreement (for example, an auto-renewal).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLACED</code> – The agreement was replaced using an agreement replacement offer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ROLLED_BACK</code> (Only applicable to inactive agreement revisions) – The agreement revision has
     *        been rolled back because of an error. An earlier revision is now active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUPERCEDED</code> (Only applicable to inactive agreement revisions) – The agreement revision is no
     *        longer active and another agreement revision is now active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code> – The agreement ended before the defined end date because of an AWS termination
     *        (for example, a payment failure).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgreementStatus
     */

    public DescribeAgreementResult withStatus(AgreementStatus status) {
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
        if (getEstimatedCharges() != null)
            sb.append("EstimatedCharges: ").append(getEstimatedCharges()).append(",");
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

        if (obj instanceof DescribeAgreementResult == false)
            return false;
        DescribeAgreementResult other = (DescribeAgreementResult) obj;
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
        if (other.getEstimatedCharges() == null ^ this.getEstimatedCharges() == null)
            return false;
        if (other.getEstimatedCharges() != null && other.getEstimatedCharges().equals(this.getEstimatedCharges()) == false)
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
        hashCode = prime * hashCode + ((getEstimatedCharges() == null) ? 0 : getEstimatedCharges().hashCode());
        hashCode = prime * hashCode + ((getProposalSummary() == null) ? 0 : getProposalSummary().hashCode());
        hashCode = prime * hashCode + ((getProposer() == null) ? 0 : getProposer().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAgreementResult clone() {
        try {
            return (DescribeAgreementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
