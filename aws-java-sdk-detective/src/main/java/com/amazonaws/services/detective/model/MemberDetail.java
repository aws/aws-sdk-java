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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Detective is currently in preview.
 * </p>
 * <p>
 * Details about a member account that was invited to contribute to a behavior graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/MemberDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The AWS account identifier of the master account for the behavior graph.
     * </p>
     */
    private String masterId;
    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     */
    private java.util.Date invitedTime;
    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     */
    private java.util.Date updatedTime;

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier for the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     * 
     * @return The AWS account identifier for the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account identifier for the member account.
     * </p>
     * 
     * @param accountId
     *        The AWS account identifier for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     * 
     * @param emailAddress
     *        The AWS account root user email address for the member account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     * 
     * @return The AWS account root user email address for the member account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The AWS account root user email address for the member account.
     * </p>
     * 
     * @param emailAddress
     *        The AWS account root user email address for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph that the member account was invited to.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     * 
     * @return The ARN of the behavior graph that the member account was invited to.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph that the member account was invited to.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph that the member account was invited to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The AWS account identifier of the master account for the behavior graph.
     * </p>
     * 
     * @param masterId
     *        The AWS account identifier of the master account for the behavior graph.
     */

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The AWS account identifier of the master account for the behavior graph.
     * </p>
     * 
     * @return The AWS account identifier of the master account for the behavior graph.
     */

    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * The AWS account identifier of the master account for the behavior graph.
     * </p>
     * 
     * @param masterId
     *        The AWS account identifier of the master account for the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *        and email address provided for the member account match. If they do match, then Detective sends the
     *        invitation. If the email address and account identifier don't match, then the member cannot be added to
     *        the behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *        account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *        behavior graph.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * @see MemberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @return The current membership status of the member account. The status can have one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *         and email address provided for the member account match. If they do match, then Detective sends the
     *         invitation. If the email address and account identifier don't match, then the member cannot be added to
     *         the behavior graph.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *         account do not match, and Detective did not send an invitation to the account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *         behavior graph.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Member accounts that declined an invitation or that were removed from the behavior graph are not
     *         included.
     * @see MemberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *        and email address provided for the member account match. If they do match, then Detective sends the
     *        invitation. If the email address and account identifier don't match, then the member cannot be added to
     *        the behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *        account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *        behavior graph.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current membership status of the member account. The status can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier and
     * email address provided for the member account match. If they do match, then Detective sends the invitation. If
     * the email address and account identifier don't match, then the member cannot be added to the behavior graph.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member account
     * do not match, and Detective did not send an invitation to the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the behavior
     * graph.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * </p>
     * 
     * @param status
     *        The current membership status of the member account. The status can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVITED</code> - Indicates that the member was sent an invitation but has not yet responded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_IN_PROGRESS</code> - Indicates that Detective is verifying that the account identifier
     *        and email address provided for the member account match. If they do match, then Detective sends the
     *        invitation. If the email address and account identifier don't match, then the member cannot be added to
     *        the behavior graph.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VERIFICATION_FAILED</code> - Indicates that the account and email address provided for the member
     *        account do not match, and Detective did not send an invitation to the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Indicates that the member account accepted the invitation to contribute to the
     *        behavior graph.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Member accounts that declined an invitation or that were removed from the behavior graph are not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberDetail withStatus(MemberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     * 
     * @param invitedTime
     *        The date and time that Detective sent the invitation to the member account. The value is in milliseconds
     *        since the epoch.
     */

    public void setInvitedTime(java.util.Date invitedTime) {
        this.invitedTime = invitedTime;
    }

    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     * 
     * @return The date and time that Detective sent the invitation to the member account. The value is in milliseconds
     *         since the epoch.
     */

    public java.util.Date getInvitedTime() {
        return this.invitedTime;
    }

    /**
     * <p>
     * The date and time that Detective sent the invitation to the member account. The value is in milliseconds since
     * the epoch.
     * </p>
     * 
     * @param invitedTime
     *        The date and time that Detective sent the invitation to the member account. The value is in milliseconds
     *        since the epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withInvitedTime(java.util.Date invitedTime) {
        setInvitedTime(invitedTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @return The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that the member account was last updated. The value is in milliseconds since the epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDetail withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInvitedTime() != null)
            sb.append("InvitedTime: ").append(getInvitedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberDetail == false)
            return false;
        MemberDetail other = (MemberDetail) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInvitedTime() == null ^ this.getInvitedTime() == null)
            return false;
        if (other.getInvitedTime() != null && other.getInvitedTime().equals(this.getInvitedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedTime() == null) ? 0 : getInvitedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public MemberDetail clone() {
        try {
            return (MemberDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.MemberDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
