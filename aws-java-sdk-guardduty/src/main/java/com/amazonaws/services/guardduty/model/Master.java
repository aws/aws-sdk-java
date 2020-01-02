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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the Master account and invitation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Master" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Master implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the account used as the Master account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * This value is used to validate the master account to the member account.
     * </p>
     */
    private String invitationId;
    /**
     * <p>
     * The status of the relationship between the master and member accounts.
     * </p>
     */
    private String relationshipStatus;
    /**
     * <p>
     * Timestamp at which the invitation was sent.
     * </p>
     */
    private String invitedAt;

    /**
     * <p>
     * The ID of the account used as the Master account.
     * </p>
     * 
     * @param accountId
     *        The ID of the account used as the Master account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the account used as the Master account.
     * </p>
     * 
     * @return The ID of the account used as the Master account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the account used as the Master account.
     * </p>
     * 
     * @param accountId
     *        The ID of the account used as the Master account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Master withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * This value is used to validate the master account to the member account.
     * </p>
     * 
     * @param invitationId
     *        This value is used to validate the master account to the member account.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * This value is used to validate the master account to the member account.
     * </p>
     * 
     * @return This value is used to validate the master account to the member account.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * This value is used to validate the master account to the member account.
     * </p>
     * 
     * @param invitationId
     *        This value is used to validate the master account to the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Master withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the master and member accounts.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the master and member accounts.
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the master and member accounts.
     * </p>
     * 
     * @return The status of the relationship between the master and member accounts.
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the master and member accounts.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the master and member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Master withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * Timestamp at which the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        Timestamp at which the invitation was sent.
     */

    public void setInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * Timestamp at which the invitation was sent.
     * </p>
     * 
     * @return Timestamp at which the invitation was sent.
     */

    public String getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * Timestamp at which the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        Timestamp at which the invitation was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Master withInvitedAt(String invitedAt) {
        setInvitedAt(invitedAt);
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
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus()).append(",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: ").append(getInvitedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Master == false)
            return false;
        Master other = (Master) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        return hashCode;
    }

    @Override
    public Master clone() {
        try {
            return (Master) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.MasterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
