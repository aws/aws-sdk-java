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
 * An invitation to an AWS account to create a member and join the network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Invitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Invitation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the invitation.
     * </p>
     */
    private String invitationId;
    /**
     * <p>
     * The date and time that the invitation was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, the invitee can no longer create a member and join the network using this
     * <code>InvitationId</code>.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * The status of the invitation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED</code> - The invitee created a member and joined the network using the <code>InvitationID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The invitee rejected the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     * <code>ExpirationDate</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    private NetworkSummary networkSummary;

    /**
     * <p>
     * The unique identifier for the invitation.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier for the invitation.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation.
     * </p>
     * 
     * @return The unique identifier for the invitation.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier for the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * <p>
     * The date and time that the invitation was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the invitation was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the invitation was created.
     * </p>
     * 
     * @return The date and time that the invitation was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the invitation was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the invitation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, the invitee can no longer create a member and join the network using this
     * <code>InvitationId</code>.
     * </p>
     * 
     * @param expirationDate
     *        The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     *        <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After
     *        this date and time, the invitee can no longer create a member and join the network using this
     *        <code>InvitationId</code>.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, the invitee can no longer create a member and join the network using this
     * <code>InvitationId</code>.
     * </p>
     * 
     * @return The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     *         <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After
     *         this date and time, the invitee can no longer create a member and join the network using this
     *         <code>InvitationId</code>.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     * <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After this
     * date and time, the invitee can no longer create a member and join the network using this
     * <code>InvitationId</code>.
     * </p>
     * 
     * @param expirationDate
     *        The date and time that the invitation expires. This is the <code>CreationDate</code> plus the
     *        <code>ProposalDurationInHours</code> that is specified in the <code>ProposalThresholdPolicy</code>. After
     *        this date and time, the invitee can no longer create a member and join the network using this
     *        <code>InvitationId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * The status of the invitation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED</code> - The invitee created a member and joined the network using the <code>InvitationID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The invitee rejected the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     * <code>ExpirationDate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the invitation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has
     *        not yet expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED</code> - The invitee created a member and joined the network using the
     *        <code>InvitationID</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The invitee rejected the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     *        <code>ExpirationDate</code>.
     *        </p>
     *        </li>
     * @see InvitationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invitation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED</code> - The invitee created a member and joined the network using the <code>InvitationID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The invitee rejected the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     * <code>ExpirationDate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the invitation:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has
     *         not yet expired.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACCEPTED</code> - The invitee created a member and joined the network using the
     *         <code>InvitationID</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REJECTED</code> - The invitee rejected the invitation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     *         <code>ExpirationDate</code>.
     *         </p>
     *         </li>
     * @see InvitationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the invitation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED</code> - The invitee created a member and joined the network using the <code>InvitationID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The invitee rejected the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     * <code>ExpirationDate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the invitation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has
     *        not yet expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED</code> - The invitee created a member and joined the network using the
     *        <code>InvitationID</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The invitee rejected the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     *        <code>ExpirationDate</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvitationStatus
     */

    public Invitation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the invitation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has not yet
     * expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACCEPTED</code> - The invitee created a member and joined the network using the <code>InvitationID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The invitee rejected the invitation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     * <code>ExpirationDate</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the invitation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The invitee has not created a member to join the network, and the invitation has
     *        not yet expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTING</code> - The invitee has begun creating a member, and creation has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACCEPTED</code> - The invitee created a member and joined the network using the
     *        <code>InvitationID</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The invitee rejected the invitation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code> - The invitee neither created a member nor rejected the invitation before the
     *        <code>ExpirationDate</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvitationStatus
     */

    public Invitation withStatus(InvitationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param networkSummary
     */

    public void setNetworkSummary(NetworkSummary networkSummary) {
        this.networkSummary = networkSummary;
    }

    /**
     * @return
     */

    public NetworkSummary getNetworkSummary() {
        return this.networkSummary;
    }

    /**
     * @param networkSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Invitation withNetworkSummary(NetworkSummary networkSummary) {
        setNetworkSummary(networkSummary);
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
        if (getInvitationId() != null)
            sb.append("InvitationId: ").append(getInvitationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNetworkSummary() != null)
            sb.append("NetworkSummary: ").append(getNetworkSummary());
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
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNetworkSummary() == null ^ this.getNetworkSummary() == null)
            return false;
        if (other.getNetworkSummary() != null && other.getNetworkSummary().equals(this.getNetworkSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNetworkSummary() == null) ? 0 : getNetworkSummary().hashCode());
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
        com.amazonaws.services.managedblockchain.model.transform.InvitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
