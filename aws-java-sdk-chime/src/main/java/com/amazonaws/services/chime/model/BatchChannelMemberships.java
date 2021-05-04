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
 * The membership information, including member ARNs, the channel ARN, and membership types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchChannelMemberships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchChannelMemberships implements Serializable, Cloneable, StructuredPojo {

    private Identity invitedBy;
    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     */
    private java.util.List<Identity> members;
    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     */
    private String channelArn;

    /**
     * @param invitedBy
     */

    public void setInvitedBy(Identity invitedBy) {
        this.invitedBy = invitedBy;
    }

    /**
     * @return
     */

    public Identity getInvitedBy() {
        return this.invitedBy;
    }

    /**
     * @param invitedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchChannelMemberships withInvitedBy(Identity invitedBy) {
        setInvitedBy(invitedBy);
        return this;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * 
     * @param type
     *        The membership types set for the channel users.
     * @see ChannelMembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * 
     * @return The membership types set for the channel users.
     * @see ChannelMembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * 
     * @param type
     *        The membership types set for the channel users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public BatchChannelMemberships withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The membership types set for the channel users.
     * </p>
     * 
     * @param type
     *        The membership types set for the channel users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public BatchChannelMemberships withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     * 
     * @return The users successfully added to the request.
     */

    public java.util.List<Identity> getMembers() {
        return members;
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     * 
     * @param members
     *        The users successfully added to the request.
     */

    public void setMembers(java.util.Collection<Identity> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<Identity>(members);
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        The users successfully added to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchChannelMemberships withMembers(Identity... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<Identity>(members.length));
        }
        for (Identity ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The users successfully added to the request.
     * </p>
     * 
     * @param members
     *        The users successfully added to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchChannelMemberships withMembers(java.util.Collection<Identity> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel to which you're adding users.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * 
     * @return The ARN of the channel to which you're adding users.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel to which you're adding users.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel to which you're adding users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchChannelMemberships withChannelArn(String channelArn) {
        setChannelArn(channelArn);
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
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchChannelMemberships == false)
            return false;
        BatchChannelMemberships other = (BatchChannelMemberships) obj;
        if (other.getInvitedBy() == null ^ this.getInvitedBy() == null)
            return false;
        if (other.getInvitedBy() != null && other.getInvitedBy().equals(this.getInvitedBy()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitedBy() == null) ? 0 : getInvitedBy().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        return hashCode;
    }

    @Override
    public BatchChannelMemberships clone() {
        try {
            return (BatchChannelMemberships) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.BatchChannelMembershipsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
