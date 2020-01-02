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
 * The voting rules for the network to decide if a proposal is accepted
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VotingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VotingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code> votes
     * required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals
     * and is specified when the network is created.
     * </p>
     */
    private ApprovalThresholdPolicy approvalThresholdPolicy;

    /**
     * <p>
     * Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code> votes
     * required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals
     * and is specified when the network is created.
     * </p>
     * 
     * @param approvalThresholdPolicy
     *        Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code>
     *        votes required for the proposal to be approved and the duration of the proposal. The policy applies to all
     *        proposals and is specified when the network is created.
     */

    public void setApprovalThresholdPolicy(ApprovalThresholdPolicy approvalThresholdPolicy) {
        this.approvalThresholdPolicy = approvalThresholdPolicy;
    }

    /**
     * <p>
     * Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code> votes
     * required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals
     * and is specified when the network is created.
     * </p>
     * 
     * @return Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code>
     *         votes required for the proposal to be approved and the duration of the proposal. The policy applies to
     *         all proposals and is specified when the network is created.
     */

    public ApprovalThresholdPolicy getApprovalThresholdPolicy() {
        return this.approvalThresholdPolicy;
    }

    /**
     * <p>
     * Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code> votes
     * required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals
     * and is specified when the network is created.
     * </p>
     * 
     * @param approvalThresholdPolicy
     *        Defines the rules for the network for voting on proposals, such as the percentage of <code>YES</code>
     *        votes required for the proposal to be approved and the duration of the proposal. The policy applies to all
     *        proposals and is specified when the network is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VotingPolicy withApprovalThresholdPolicy(ApprovalThresholdPolicy approvalThresholdPolicy) {
        setApprovalThresholdPolicy(approvalThresholdPolicy);
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
        if (getApprovalThresholdPolicy() != null)
            sb.append("ApprovalThresholdPolicy: ").append(getApprovalThresholdPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VotingPolicy == false)
            return false;
        VotingPolicy other = (VotingPolicy) obj;
        if (other.getApprovalThresholdPolicy() == null ^ this.getApprovalThresholdPolicy() == null)
            return false;
        if (other.getApprovalThresholdPolicy() != null && other.getApprovalThresholdPolicy().equals(this.getApprovalThresholdPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalThresholdPolicy() == null) ? 0 : getApprovalThresholdPolicy().hashCode());
        return hashCode;
    }

    @Override
    public VotingPolicy clone() {
        try {
            return (VotingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.VotingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
