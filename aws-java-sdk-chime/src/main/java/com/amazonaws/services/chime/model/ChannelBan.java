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
 * The details of a channel ban.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelBan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelBan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The member being banned from the channel.
     * </p>
     */
    private Identity member;
    /**
     * <p>
     * The ARN of the channel from which a member is being banned.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The time at which the ban was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the ban.
     * </p>
     */
    private Identity createdBy;

    /**
     * <p>
     * The member being banned from the channel.
     * </p>
     * 
     * @param member
     *        The member being banned from the channel.
     */

    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * <p>
     * The member being banned from the channel.
     * </p>
     * 
     * @return The member being banned from the channel.
     */

    public Identity getMember() {
        return this.member;
    }

    /**
     * <p>
     * The member being banned from the channel.
     * </p>
     * 
     * @param member
     *        The member being banned from the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelBan withMember(Identity member) {
        setMember(member);
        return this;
    }

    /**
     * <p>
     * The ARN of the channel from which a member is being banned.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel from which a member is being banned.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel from which a member is being banned.
     * </p>
     * 
     * @return The ARN of the channel from which a member is being banned.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel from which a member is being banned.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel from which a member is being banned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelBan withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the ban was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the ban was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the ban was created.
     * </p>
     * 
     * @return The time at which the ban was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the ban was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the ban was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelBan withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the ban.
     * </p>
     * 
     * @param createdBy
     *        The <code>AppInstanceUser</code> who created the ban.
     */

    public void setCreatedBy(Identity createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the ban.
     * </p>
     * 
     * @return The <code>AppInstanceUser</code> who created the ban.
     */

    public Identity getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the ban.
     * </p>
     * 
     * @param createdBy
     *        The <code>AppInstanceUser</code> who created the ban.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelBan withCreatedBy(Identity createdBy) {
        setCreatedBy(createdBy);
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
        if (getMember() != null)
            sb.append("Member: ").append(getMember()).append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelBan == false)
            return false;
        ChannelBan other = (ChannelBan) obj;
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
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public ChannelBan clone() {
        try {
            return (ChannelBan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelBanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
