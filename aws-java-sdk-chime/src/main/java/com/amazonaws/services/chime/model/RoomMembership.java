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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The room membership details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RoomMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoomMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The room ID.
     * </p>
     */
    private String roomId;

    private Member member;
    /**
     * <p>
     * The membership role.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     */
    private String invitedBy;
    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The room ID.
     * </p>
     * 
     * @param roomId
     *        The room ID.
     */

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * 
     * @return The room ID.
     */

    public String getRoomId() {
        return this.roomId;
    }

    /**
     * <p>
     * The room ID.
     * </p>
     * 
     * @param roomId
     *        The room ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoomMembership withRoomId(String roomId) {
        setRoomId(roomId);
        return this;
    }

    /**
     * @param member
     */

    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return
     */

    public Member getMember() {
        return this.member;
    }

    /**
     * @param member
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoomMembership withMember(Member member) {
        setMember(member);
        return this;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * 
     * @param role
     *        The membership role.
     * @see RoomMembershipRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * 
     * @return The membership role.
     * @see RoomMembershipRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * 
     * @param role
     *        The membership role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoomMembershipRole
     */

    public RoomMembership withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The membership role.
     * </p>
     * 
     * @param role
     *        The membership role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoomMembershipRole
     */

    public RoomMembership withRole(RoomMembershipRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * 
     * @param invitedBy
     *        The identifier of the user that invited the room member.
     */

    public void setInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
    }

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * 
     * @return The identifier of the user that invited the room member.
     */

    public String getInvitedBy() {
        return this.invitedBy;
    }

    /**
     * <p>
     * The identifier of the user that invited the room member.
     * </p>
     * 
     * @param invitedBy
     *        The identifier of the user that invited the room member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoomMembership withInvitedBy(String invitedBy) {
        setInvitedBy(invitedBy);
        return this;
    }

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The room membership update timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The room membership update timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The room membership update timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The room membership update timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoomMembership withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getRoomId() != null)
            sb.append("RoomId: ").append(getRoomId()).append(",");
        if (getMember() != null)
            sb.append("Member: ").append(getMember()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getInvitedBy() != null)
            sb.append("InvitedBy: ").append(getInvitedBy()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoomMembership == false)
            return false;
        RoomMembership other = (RoomMembership) obj;
        if (other.getRoomId() == null ^ this.getRoomId() == null)
            return false;
        if (other.getRoomId() != null && other.getRoomId().equals(this.getRoomId()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getInvitedBy() == null ^ this.getInvitedBy() == null)
            return false;
        if (other.getInvitedBy() != null && other.getInvitedBy().equals(this.getInvitedBy()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getInvitedBy() == null) ? 0 : getInvitedBy().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public RoomMembership clone() {
        try {
            return (RoomMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.RoomMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
