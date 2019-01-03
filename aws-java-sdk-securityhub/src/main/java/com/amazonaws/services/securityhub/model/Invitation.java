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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an invitation sent to an AWS account by the Security Hub master account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Invitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Invitation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID of the master Security Hub account who sent the invitation.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID of the invitation sent by the master Security Hub account.
     * </p>
     */
    private String invitationId;
    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     */
    private java.util.Date invitedAt;
    /**
     * <p>
     * The current relationship status between the inviter and invitee accounts.
     * </p>
     */
    private String memberStatus;

    /**
     * <p>
     * The account ID of the master Security Hub account who sent the invitation.
     * </p>
     * 
     * @param accountId
     *        The account ID of the master Security Hub account who sent the invitation.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the master Security Hub account who sent the invitation.
     * </p>
     * 
     * @return The account ID of the master Security Hub account who sent the invitation.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the master Security Hub account who sent the invitation.
     * </p>
     * 
     * @param accountId
     *        The account ID of the master Security Hub account who sent the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the invitation sent by the master Security Hub account.
     * </p>
     * 
     * @param invitationId
     *        The ID of the invitation sent by the master Security Hub account.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The ID of the invitation sent by the master Security Hub account.
     * </p>
     * 
     * @return The ID of the invitation sent by the master Security Hub account.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The ID of the invitation sent by the master Security Hub account.
     * </p>
     * 
     * @param invitationId
     *        The ID of the invitation sent by the master Security Hub account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        The timestamp of when the invitation was sent.
     */

    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     * 
     * @return The timestamp of when the invitation was sent.
     */

    public java.util.Date getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * The timestamp of when the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        The timestamp of when the invitation was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withInvitedAt(java.util.Date invitedAt) {
        setInvitedAt(invitedAt);
        return this;
    }

    /**
     * <p>
     * The current relationship status between the inviter and invitee accounts.
     * </p>
     * 
     * @param memberStatus
     *        The current relationship status between the inviter and invitee accounts.
     */

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    /**
     * <p>
     * The current relationship status between the inviter and invitee accounts.
     * </p>
     * 
     * @return The current relationship status between the inviter and invitee accounts.
     */

    public String getMemberStatus() {
        return this.memberStatus;
    }

    /**
     * <p>
     * The current relationship status between the inviter and invitee accounts.
     * </p>
     * 
     * @param memberStatus
     *        The current relationship status between the inviter and invitee accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withMemberStatus(String memberStatus) {
        setMemberStatus(memberStatus);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getInvitationId() != null)
            sb.append("InvitationId: ").append(getInvitationId()).append(",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: ").append(getInvitedAt()).append(",");
        if (getMemberStatus() != null)
            sb.append("MemberStatus: ").append(getMemberStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Invitation == false)
            return false;
        Invitation other = (Invitation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getMemberStatus() == null ^ this.getMemberStatus() == null)
            return false;
        if (other.getMemberStatus() != null && other.getMemberStatus().equals(this.getMemberStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode + ((getMemberStatus() == null) ? 0 : getMemberStatus().hashCode());
        return hashCode;
    }

    @Override
    public Invitation clone() {
        try {
            return (Invitation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.InvitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
