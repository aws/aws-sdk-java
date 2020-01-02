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
 * A policy type that defines the voting rules for the network. The rules decide if a proposal is approved. Approval may
 * be based on criteria such as the percentage of <code>YES</code> votes and the duration of the proposal. The policy
 * applies to all proposals and is specified when the network is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ApprovalThresholdPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalThresholdPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved. For
     * example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     * <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code> value
     * of <code>50</code> is specified on a network with 10 members, along with a <code>ThresholdComparator</code> value
     * of <code>GREATER_THAN</code>, this indicates that 6 <code>YES</code> votes are required for the proposal to be
     * approved.
     * </p>
     */
    private Integer thresholdPercentage;
    /**
     * <p>
     * The duration from the time that a proposal is created until it expires. If members cast neither the required
     * number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes required to
     * reject it before the duration expires, the proposal is <code>EXPIRED</code> and <code>ProposalActions</code> are
     * not carried out.
     * </p>
     */
    private Integer proposalDurationInHours;
    /**
     * <p>
     * Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must be
     * greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * </p>
     */
    private String thresholdComparator;

    /**
     * <p>
     * The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved. For
     * example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     * <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code> value
     * of <code>50</code> is specified on a network with 10 members, along with a <code>ThresholdComparator</code> value
     * of <code>GREATER_THAN</code>, this indicates that 6 <code>YES</code> votes are required for the proposal to be
     * approved.
     * </p>
     * 
     * @param thresholdPercentage
     *        The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved. For
     *        example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     *        <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code>
     *        value of <code>50</code> is specified on a network with 10 members, along with a
     *        <code>ThresholdComparator</code> value of <code>GREATER_THAN</code>, this indicates that 6
     *        <code>YES</code> votes are required for the proposal to be approved.
     */

    public void setThresholdPercentage(Integer thresholdPercentage) {
        this.thresholdPercentage = thresholdPercentage;
    }

    /**
     * <p>
     * The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved. For
     * example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     * <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code> value
     * of <code>50</code> is specified on a network with 10 members, along with a <code>ThresholdComparator</code> value
     * of <code>GREATER_THAN</code>, this indicates that 6 <code>YES</code> votes are required for the proposal to be
     * approved.
     * </p>
     * 
     * @return The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved.
     *         For example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     *         <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code>
     *         value of <code>50</code> is specified on a network with 10 members, along with a
     *         <code>ThresholdComparator</code> value of <code>GREATER_THAN</code>, this indicates that 6
     *         <code>YES</code> votes are required for the proposal to be approved.
     */

    public Integer getThresholdPercentage() {
        return this.thresholdPercentage;
    }

    /**
     * <p>
     * The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved. For
     * example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     * <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code> value
     * of <code>50</code> is specified on a network with 10 members, along with a <code>ThresholdComparator</code> value
     * of <code>GREATER_THAN</code>, this indicates that 6 <code>YES</code> votes are required for the proposal to be
     * approved.
     * </p>
     * 
     * @param thresholdPercentage
     *        The percentage of votes among all members that must be <code>YES</code> for a proposal to be approved. For
     *        example, a <code>ThresholdPercentage</code> value of <code>50</code> indicates 50%. The
     *        <code>ThresholdComparator</code> determines the precise comparison. If a <code>ThresholdPercentage</code>
     *        value of <code>50</code> is specified on a network with 10 members, along with a
     *        <code>ThresholdComparator</code> value of <code>GREATER_THAN</code>, this indicates that 6
     *        <code>YES</code> votes are required for the proposal to be approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalThresholdPolicy withThresholdPercentage(Integer thresholdPercentage) {
        setThresholdPercentage(thresholdPercentage);
        return this;
    }

    /**
     * <p>
     * The duration from the time that a proposal is created until it expires. If members cast neither the required
     * number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes required to
     * reject it before the duration expires, the proposal is <code>EXPIRED</code> and <code>ProposalActions</code> are
     * not carried out.
     * </p>
     * 
     * @param proposalDurationInHours
     *        The duration from the time that a proposal is created until it expires. If members cast neither the
     *        required number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes
     *        required to reject it before the duration expires, the proposal is <code>EXPIRED</code> and
     *        <code>ProposalActions</code> are not carried out.
     */

    public void setProposalDurationInHours(Integer proposalDurationInHours) {
        this.proposalDurationInHours = proposalDurationInHours;
    }

    /**
     * <p>
     * The duration from the time that a proposal is created until it expires. If members cast neither the required
     * number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes required to
     * reject it before the duration expires, the proposal is <code>EXPIRED</code> and <code>ProposalActions</code> are
     * not carried out.
     * </p>
     * 
     * @return The duration from the time that a proposal is created until it expires. If members cast neither the
     *         required number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes
     *         required to reject it before the duration expires, the proposal is <code>EXPIRED</code> and
     *         <code>ProposalActions</code> are not carried out.
     */

    public Integer getProposalDurationInHours() {
        return this.proposalDurationInHours;
    }

    /**
     * <p>
     * The duration from the time that a proposal is created until it expires. If members cast neither the required
     * number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes required to
     * reject it before the duration expires, the proposal is <code>EXPIRED</code> and <code>ProposalActions</code> are
     * not carried out.
     * </p>
     * 
     * @param proposalDurationInHours
     *        The duration from the time that a proposal is created until it expires. If members cast neither the
     *        required number of <code>YES</code> votes to approve the proposal nor the number of <code>NO</code> votes
     *        required to reject it before the duration expires, the proposal is <code>EXPIRED</code> and
     *        <code>ProposalActions</code> are not carried out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalThresholdPolicy withProposalDurationInHours(Integer proposalDurationInHours) {
        setProposalDurationInHours(proposalDurationInHours);
        return this;
    }

    /**
     * <p>
     * Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must be
     * greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * </p>
     * 
     * @param thresholdComparator
     *        Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must
     *        be greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * @see ThresholdComparator
     */

    public void setThresholdComparator(String thresholdComparator) {
        this.thresholdComparator = thresholdComparator;
    }

    /**
     * <p>
     * Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must be
     * greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * </p>
     * 
     * @return Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must
     *         be greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * @see ThresholdComparator
     */

    public String getThresholdComparator() {
        return this.thresholdComparator;
    }

    /**
     * <p>
     * Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must be
     * greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * </p>
     * 
     * @param thresholdComparator
     *        Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must
     *        be greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdComparator
     */

    public ApprovalThresholdPolicy withThresholdComparator(String thresholdComparator) {
        setThresholdComparator(thresholdComparator);
        return this;
    }

    /**
     * <p>
     * Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must be
     * greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * </p>
     * 
     * @param thresholdComparator
     *        Determines whether the vote percentage must be greater than the <code>ThresholdPercentage</code> or must
     *        be greater than or equal to the <code>ThreholdPercentage</code> to be approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdComparator
     */

    public ApprovalThresholdPolicy withThresholdComparator(ThresholdComparator thresholdComparator) {
        this.thresholdComparator = thresholdComparator.toString();
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
        if (getThresholdPercentage() != null)
            sb.append("ThresholdPercentage: ").append(getThresholdPercentage()).append(",");
        if (getProposalDurationInHours() != null)
            sb.append("ProposalDurationInHours: ").append(getProposalDurationInHours()).append(",");
        if (getThresholdComparator() != null)
            sb.append("ThresholdComparator: ").append(getThresholdComparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalThresholdPolicy == false)
            return false;
        ApprovalThresholdPolicy other = (ApprovalThresholdPolicy) obj;
        if (other.getThresholdPercentage() == null ^ this.getThresholdPercentage() == null)
            return false;
        if (other.getThresholdPercentage() != null && other.getThresholdPercentage().equals(this.getThresholdPercentage()) == false)
            return false;
        if (other.getProposalDurationInHours() == null ^ this.getProposalDurationInHours() == null)
            return false;
        if (other.getProposalDurationInHours() != null && other.getProposalDurationInHours().equals(this.getProposalDurationInHours()) == false)
            return false;
        if (other.getThresholdComparator() == null ^ this.getThresholdComparator() == null)
            return false;
        if (other.getThresholdComparator() != null && other.getThresholdComparator().equals(this.getThresholdComparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThresholdPercentage() == null) ? 0 : getThresholdPercentage().hashCode());
        hashCode = prime * hashCode + ((getProposalDurationInHours() == null) ? 0 : getProposalDurationInHours().hashCode());
        hashCode = prime * hashCode + ((getThresholdComparator() == null) ? 0 : getThresholdComparator().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalThresholdPolicy clone() {
        try {
            return (ApprovalThresholdPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.ApprovalThresholdPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
