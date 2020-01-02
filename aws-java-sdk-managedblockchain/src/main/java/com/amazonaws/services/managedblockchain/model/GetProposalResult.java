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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/GetProposal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProposalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a proposal.
     * </p>
     */
    private Proposal proposal;

    /**
     * <p>
     * Information about a proposal.
     * </p>
     * 
     * @param proposal
     *        Information about a proposal.
     */

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }

    /**
     * <p>
     * Information about a proposal.
     * </p>
     * 
     * @return Information about a proposal.
     */

    public Proposal getProposal() {
        return this.proposal;
    }

    /**
     * <p>
     * Information about a proposal.
     * </p>
     * 
     * @param proposal
     *        Information about a proposal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProposalResult withProposal(Proposal proposal) {
        setProposal(proposal);
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
        if (getProposal() != null)
            sb.append("Proposal: ").append(getProposal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProposalResult == false)
            return false;
        GetProposalResult other = (GetProposalResult) obj;
        if (other.getProposal() == null ^ this.getProposal() == null)
            return false;
        if (other.getProposal() != null && other.getProposal().equals(this.getProposal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProposal() == null) ? 0 : getProposal().hashCode());
        return hashCode;
    }

    @Override
    public GetProposalResult clone() {
        try {
            return (GetProposalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
