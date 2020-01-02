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
 * Properties of an individual vote that a member cast for a proposal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/VoteSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoteSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The vote value, either <code>YES</code> or <code>NO</code>.
     * </p>
     */
    private String vote;
    /**
     * <p>
     * The name of the member that cast the vote.
     * </p>
     */
    private String memberName;
    /**
     * <p>
     * The unique identifier of the member that cast the vote.
     * </p>
     */
    private String memberId;

    /**
     * <p>
     * The vote value, either <code>YES</code> or <code>NO</code>.
     * </p>
     * 
     * @param vote
     *        The vote value, either <code>YES</code> or <code>NO</code>.
     * @see VoteValue
     */

    public void setVote(String vote) {
        this.vote = vote;
    }

    /**
     * <p>
     * The vote value, either <code>YES</code> or <code>NO</code>.
     * </p>
     * 
     * @return The vote value, either <code>YES</code> or <code>NO</code>.
     * @see VoteValue
     */

    public String getVote() {
        return this.vote;
    }

    /**
     * <p>
     * The vote value, either <code>YES</code> or <code>NO</code>.
     * </p>
     * 
     * @param vote
     *        The vote value, either <code>YES</code> or <code>NO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoteValue
     */

    public VoteSummary withVote(String vote) {
        setVote(vote);
        return this;
    }

    /**
     * <p>
     * The vote value, either <code>YES</code> or <code>NO</code>.
     * </p>
     * 
     * @param vote
     *        The vote value, either <code>YES</code> or <code>NO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoteValue
     */

    public VoteSummary withVote(VoteValue vote) {
        this.vote = vote.toString();
        return this;
    }

    /**
     * <p>
     * The name of the member that cast the vote.
     * </p>
     * 
     * @param memberName
     *        The name of the member that cast the vote.
     */

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * <p>
     * The name of the member that cast the vote.
     * </p>
     * 
     * @return The name of the member that cast the vote.
     */

    public String getMemberName() {
        return this.memberName;
    }

    /**
     * <p>
     * The name of the member that cast the vote.
     * </p>
     * 
     * @param memberName
     *        The name of the member that cast the vote.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoteSummary withMemberName(String memberName) {
        setMemberName(memberName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the member that cast the vote.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that cast the vote.
     */

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that cast the vote.
     * </p>
     * 
     * @return The unique identifier of the member that cast the vote.
     */

    public String getMemberId() {
        return this.memberId;
    }

    /**
     * <p>
     * The unique identifier of the member that cast the vote.
     * </p>
     * 
     * @param memberId
     *        The unique identifier of the member that cast the vote.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoteSummary withMemberId(String memberId) {
        setMemberId(memberId);
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
        if (getVote() != null)
            sb.append("Vote: ").append(getVote()).append(",");
        if (getMemberName() != null)
            sb.append("MemberName: ").append(getMemberName()).append(",");
        if (getMemberId() != null)
            sb.append("MemberId: ").append(getMemberId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoteSummary == false)
            return false;
        VoteSummary other = (VoteSummary) obj;
        if (other.getVote() == null ^ this.getVote() == null)
            return false;
        if (other.getVote() != null && other.getVote().equals(this.getVote()) == false)
            return false;
        if (other.getMemberName() == null ^ this.getMemberName() == null)
            return false;
        if (other.getMemberName() != null && other.getMemberName().equals(this.getMemberName()) == false)
            return false;
        if (other.getMemberId() == null ^ this.getMemberId() == null)
            return false;
        if (other.getMemberId() != null && other.getMemberId().equals(this.getMemberId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVote() == null) ? 0 : getVote().hashCode());
        hashCode = prime * hashCode + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        hashCode = prime * hashCode + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        return hashCode;
    }

    @Override
    public VoteSummary clone() {
        try {
            return (VoteSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.VoteSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
