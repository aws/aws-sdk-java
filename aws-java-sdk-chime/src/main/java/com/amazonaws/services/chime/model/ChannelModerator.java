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
 * The details of a channel moderator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelModerator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelModerator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The moderator's data.
     * </p>
     */
    private Identity moderator;
    /**
     * <p>
     * The ARN of the moderator's channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The time at which the moderator was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the moderator.
     * </p>
     */
    private Identity createdBy;

    /**
     * <p>
     * The moderator's data.
     * </p>
     * 
     * @param moderator
     *        The moderator's data.
     */

    public void setModerator(Identity moderator) {
        this.moderator = moderator;
    }

    /**
     * <p>
     * The moderator's data.
     * </p>
     * 
     * @return The moderator's data.
     */

    public Identity getModerator() {
        return this.moderator;
    }

    /**
     * <p>
     * The moderator's data.
     * </p>
     * 
     * @param moderator
     *        The moderator's data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelModerator withModerator(Identity moderator) {
        setModerator(moderator);
        return this;
    }

    /**
     * <p>
     * The ARN of the moderator's channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the moderator's channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the moderator's channel.
     * </p>
     * 
     * @return The ARN of the moderator's channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the moderator's channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the moderator's channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelModerator withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the moderator was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the moderator was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the moderator was created.
     * </p>
     * 
     * @return The time at which the moderator was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the moderator was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the moderator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelModerator withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the moderator.
     * </p>
     * 
     * @param createdBy
     *        The <code>AppInstanceUser</code> who created the moderator.
     */

    public void setCreatedBy(Identity createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the moderator.
     * </p>
     * 
     * @return The <code>AppInstanceUser</code> who created the moderator.
     */

    public Identity getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the moderator.
     * </p>
     * 
     * @param createdBy
     *        The <code>AppInstanceUser</code> who created the moderator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelModerator withCreatedBy(Identity createdBy) {
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
        if (getModerator() != null)
            sb.append("Moderator: ").append(getModerator()).append(",");
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

        if (obj instanceof ChannelModerator == false)
            return false;
        ChannelModerator other = (ChannelModerator) obj;
        if (other.getModerator() == null ^ this.getModerator() == null)
            return false;
        if (other.getModerator() != null && other.getModerator().equals(this.getModerator()) == false)
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

        hashCode = prime * hashCode + ((getModerator() == null) ? 0 : getModerator().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public ChannelModerator clone() {
        try {
            return (ChannelModerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelModeratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
