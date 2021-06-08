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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a channel member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMembership implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     */
    private Identity invitedBy;
    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The data of the channel member.
     * </p>
     */
    private Identity member;
    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     * 
     * @param invitedBy
     *        The identifier of the member who invited another member.
     */

    public void setInvitedBy(Identity invitedBy) {
        this.invitedBy = invitedBy;
    }

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     * 
     * @return The identifier of the member who invited another member.
     */

    public Identity getInvitedBy() {
        return this.invitedBy;
    }

    /**
     * <p>
     * The identifier of the member who invited another member.
     * </p>
     * 
     * @param invitedBy
     *        The identifier of the member who invited another member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembership withInvitedBy(Identity invitedBy) {
        setInvitedBy(invitedBy);
        return this;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * 
     * @param type
     *        The membership type set for the channel member.
     * @see ChannelMembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * 
     * @return The membership type set for the channel member.
     * @see ChannelMembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * 
     * @param type
     *        The membership type set for the channel member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public ChannelMembership withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The membership type set for the channel member.
     * </p>
     * 
     * @param type
     *        The membership type set for the channel member.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public ChannelMembership withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The data of the channel member.
     * </p>
     * 
     * @param member
     *        The data of the channel member.
     */

    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * <p>
     * The data of the channel member.
     * </p>
     * 
     * @return The data of the channel member.
     */

    public Identity getMember() {
        return this.member;
    }

    /**
     * <p>
     * The data of the channel member.
     * </p>
     * 
     * @param member
     *        The data of the channel member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembership withMember(Identity member) {
        setMember(member);
        return this;
    }

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the member's channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * 
     * @return The ARN of the member's channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the member's channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the member's channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembership withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the channel membership was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     * 
     * @return The time at which the channel membership was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the channel membership was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the channel membership was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembership withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which a channel membership was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     * 
     * @return The time at which a channel membership was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a channel membership was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which a channel membership was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMembership withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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
        if (getInvitedBy() != null)
            sb.append("InvitedBy: ").append(getInvitedBy()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMember() != null)
            sb.append("Member: ").append(getMember()).append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembership == false)
            return false;
        ChannelMembership other = (ChannelMembership) obj;
        if (other.getInvitedBy() == null ^ this.getInvitedBy() == null)
            return false;
        if (other.getInvitedBy() != null && other.getInvitedBy().equals(this.getInvitedBy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitedBy() == null) ? 0 : getInvitedBy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMembership clone() {
        try {
            return (ChannelMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelMembershipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
