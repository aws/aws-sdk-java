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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the member account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Member" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Member implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The detector ID of the member account.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The administrator account ID.
     * </p>
     */
    private String masterId;
    /**
     * <p>
     * The email address of the member account.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The status of the relationship between the member and the administrator.
     * </p>
     */
    private String relationshipStatus;
    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     */
    private String invitedAt;
    /**
     * <p>
     * The last-updated timestamp of the member.
     * </p>
     */
    private String updatedAt;

    /**
     * <p>
     * The ID of the member account.
     * </p>
     * 
     * @param accountId
     *        The ID of the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the member account.
     * </p>
     * 
     * @return The ID of the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the member account.
     * </p>
     * 
     * @param accountId
     *        The ID of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The detector ID of the member account.
     * </p>
     * 
     * @param detectorId
     *        The detector ID of the member account.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID of the member account.
     * </p>
     * 
     * @return The detector ID of the member account.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector ID of the member account.
     * </p>
     * 
     * @param detectorId
     *        The detector ID of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The administrator account ID.
     * </p>
     * 
     * @param masterId
     *        The administrator account ID.
     */

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The administrator account ID.
     * </p>
     * 
     * @return The administrator account ID.
     */

    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * The administrator account ID.
     * </p>
     * 
     * @param masterId
     *        The administrator account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * 
     * @param email
     *        The email address of the member account.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * 
     * @return The email address of the member account.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the member account.
     * </p>
     * 
     * @param email
     *        The email address of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the member and the administrator.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the member and the administrator.
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member and the administrator.
     * </p>
     * 
     * @return The status of the relationship between the member and the administrator.
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member and the administrator.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the member and the administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        The timestamp when the invitation was sent.
     */

    public void setInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     * 
     * @return The timestamp when the invitation was sent.
     */

    public String getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * The timestamp when the invitation was sent.
     * </p>
     * 
     * @param invitedAt
     *        The timestamp when the invitation was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withInvitedAt(String invitedAt) {
        setInvitedAt(invitedAt);
        return this;
    }

    /**
     * <p>
     * The last-updated timestamp of the member.
     * </p>
     * 
     * @param updatedAt
     *        The last-updated timestamp of the member.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The last-updated timestamp of the member.
     * </p>
     * 
     * @return The last-updated timestamp of the member.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The last-updated timestamp of the member.
     * </p>
     * 
     * @param updatedAt
     *        The last-updated timestamp of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus()).append(",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: ").append(getInvitedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Member == false)
            return false;
        Member other = (Member) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Member clone() {
        try {
            return (Member) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.MemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
