/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon Macie membership invitation that was received by an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Invitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Invitation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with
     * the invitee account.
     * </p>
     */
    private String invitationId;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     * </p>
     */
    private java.util.Date invitedAt;
    /**
     * <p>
     * The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and the
     * account that received the invitation (<i>invitee account</i>).
     * </p>
     */
    private String relationshipStatus;

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the account that sent the invitation.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the account that sent the invitation.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the account that sent the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with
     * the invitee account.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter
     *        account with the invitee account.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with
     * the invitee account.
     * </p>
     * 
     * @return The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter
     *         account with the invitee account.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter account with
     * the invitee account.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier for the invitation. Amazon Macie uses this identifier to validate the inviter
     *        account with the invitee account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     */

    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     */

    public java.util.Date getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the invitation was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withInvitedAt(java.util.Date invitedAt) {
        setInvitedAt(invitedAt);
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and the
     * account that received the invitation (<i>invitee account</i>).
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and
     *        the account that received the invitation (<i>invitee account</i>).
     * @see RelationshipStatus
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and the
     * account that received the invitation (<i>invitee account</i>).
     * </p>
     * 
     * @return The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and
     *         the account that received the invitation (<i>invitee account</i>).
     * @see RelationshipStatus
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and the
     * account that received the invitation (<i>invitee account</i>).
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and
     *        the account that received the invitation (<i>invitee account</i>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public Invitation withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and the
     * account that received the invitation (<i>invitee account</i>).
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the account that sent the invitation (<i>inviter account</i>) and
     *        the account that received the invitation (<i>invitee account</i>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public Invitation withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
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
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus());
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
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
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
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
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
        com.amazonaws.services.macie2.model.transform.InvitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
