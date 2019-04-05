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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Invitation object returned after emailing users to invite them to join the Amazon Chime <code>Team</code> account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Invite" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Invite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The invite ID.
     * </p>
     */
    private String inviteId;
    /**
     * <p>
     * The status of the invite.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The status of the invite email.
     * </p>
     */
    private String emailStatus;

    /**
     * <p>
     * The invite ID.
     * </p>
     * 
     * @param inviteId
     *        The invite ID.
     */

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    /**
     * <p>
     * The invite ID.
     * </p>
     * 
     * @return The invite ID.
     */

    public String getInviteId() {
        return this.inviteId;
    }

    /**
     * <p>
     * The invite ID.
     * </p>
     * 
     * @param inviteId
     *        The invite ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invite withInviteId(String inviteId) {
        setInviteId(inviteId);
        return this;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * 
     * @param status
     *        The status of the invite.
     * @see InviteStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * 
     * @return The status of the invite.
     * @see InviteStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * 
     * @param status
     *        The status of the invite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InviteStatus
     */

    public Invite withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the invite.
     * </p>
     * 
     * @param status
     *        The status of the invite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InviteStatus
     */

    public Invite withStatus(InviteStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * 
     * @param emailAddress
     *        The email address to which the invite is sent.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * 
     * @return The email address to which the invite is sent.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address to which the invite is sent.
     * </p>
     * 
     * @param emailAddress
     *        The email address to which the invite is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invite withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * 
     * @param emailStatus
     *        The status of the invite email.
     * @see EmailStatus
     */

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * 
     * @return The status of the invite email.
     * @see EmailStatus
     */

    public String getEmailStatus() {
        return this.emailStatus;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * 
     * @param emailStatus
     *        The status of the invite email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmailStatus
     */

    public Invite withEmailStatus(String emailStatus) {
        setEmailStatus(emailStatus);
        return this;
    }

    /**
     * <p>
     * The status of the invite email.
     * </p>
     * 
     * @param emailStatus
     *        The status of the invite email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmailStatus
     */

    public Invite withEmailStatus(EmailStatus emailStatus) {
        this.emailStatus = emailStatus.toString();
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
        if (getInviteId() != null)
            sb.append("InviteId: ").append(getInviteId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getEmailStatus() != null)
            sb.append("EmailStatus: ").append(getEmailStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Invite == false)
            return false;
        Invite other = (Invite) obj;
        if (other.getInviteId() == null ^ this.getInviteId() == null)
            return false;
        if (other.getInviteId() != null && other.getInviteId().equals(this.getInviteId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getEmailStatus() == null ^ this.getEmailStatus() == null)
            return false;
        if (other.getEmailStatus() != null && other.getEmailStatus().equals(this.getEmailStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInviteId() == null) ? 0 : getInviteId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getEmailStatus() == null) ? 0 : getEmailStatus().hashCode());
        return hashCode;
    }

    @Override
    public Invite clone() {
        try {
            return (Invite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.InviteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
