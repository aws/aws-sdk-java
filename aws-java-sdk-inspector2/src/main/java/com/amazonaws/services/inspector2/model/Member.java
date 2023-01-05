/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on a member account in your organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Member" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Member implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member account.
     * </p>
     */
    private String delegatedAdminAccountId;
    /**
     * <p>
     * The status of the member account.
     * </p>
     */
    private String relationshipStatus;
    /**
     * <p>
     * A timestamp showing when the status of this member was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Web Services account ID of the member account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the member account.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the member account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member account.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member
     *        account.
     */

    public void setDelegatedAdminAccountId(String delegatedAdminAccountId) {
        this.delegatedAdminAccountId = delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member account.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member
     *         account.
     */

    public String getDelegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member account.
     * </p>
     * 
     * @param delegatedAdminAccountId
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withDelegatedAdminAccountId(String delegatedAdminAccountId) {
        setDelegatedAdminAccountId(delegatedAdminAccountId);
        return this;
    }

    /**
     * <p>
     * The status of the member account.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the member account.
     * @see RelationshipStatus
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the member account.
     * </p>
     * 
     * @return The status of the member account.
     * @see RelationshipStatus
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The status of the member account.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public Member withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * The status of the member account.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public Member withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp showing when the status of this member was last updated.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp showing when the status of this member was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * A timestamp showing when the status of this member was last updated.
     * </p>
     * 
     * @return A timestamp showing when the status of this member was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * A timestamp showing when the status of this member was last updated.
     * </p>
     * 
     * @param updatedAt
     *        A timestamp showing when the status of this member was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withUpdatedAt(java.util.Date updatedAt) {
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
        if (getDelegatedAdminAccountId() != null)
            sb.append("DelegatedAdminAccountId: ").append(getDelegatedAdminAccountId()).append(",");
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus()).append(",");
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
        if (other.getDelegatedAdminAccountId() == null ^ this.getDelegatedAdminAccountId() == null)
            return false;
        if (other.getDelegatedAdminAccountId() != null && other.getDelegatedAdminAccountId().equals(this.getDelegatedAdminAccountId()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
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
        hashCode = prime * hashCode + ((getDelegatedAdminAccountId() == null) ? 0 : getDelegatedAdminAccountId().hashCode());
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
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
        com.amazonaws.services.inspector2.model.transform.MemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
