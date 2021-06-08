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
 * The details of a channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Channel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Channel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The mode of the channel.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The channel's privacy setting.
     * </p>
     */
    private String privacy;
    /**
     * <p>
     * The channel's metadata.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the channel.
     * </p>
     */
    private Identity createdBy;
    /**
     * <p>
     * The time at which the <code>AppInstanceUser</code> created the channel.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which a member sent the last message in the channel.
     * </p>
     */
    private java.util.Date lastMessageTimestamp;
    /**
     * <p>
     * The time at which a channel was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @return The name of the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the channel.
     * </p>
     * 
     * @param name
     *        The name of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The mode of the channel.
     * </p>
     * 
     * @param mode
     *        The mode of the channel.
     * @see ChannelMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of the channel.
     * </p>
     * 
     * @return The mode of the channel.
     * @see ChannelMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of the channel.
     * </p>
     * 
     * @param mode
     *        The mode of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMode
     */

    public Channel withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of the channel.
     * </p>
     * 
     * @param mode
     *        The mode of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMode
     */

    public Channel withMode(ChannelMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The channel's privacy setting.
     * </p>
     * 
     * @param privacy
     *        The channel's privacy setting.
     * @see ChannelPrivacy
     */

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * <p>
     * The channel's privacy setting.
     * </p>
     * 
     * @return The channel's privacy setting.
     * @see ChannelPrivacy
     */

    public String getPrivacy() {
        return this.privacy;
    }

    /**
     * <p>
     * The channel's privacy setting.
     * </p>
     * 
     * @param privacy
     *        The channel's privacy setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPrivacy
     */

    public Channel withPrivacy(String privacy) {
        setPrivacy(privacy);
        return this;
    }

    /**
     * <p>
     * The channel's privacy setting.
     * </p>
     * 
     * @param privacy
     *        The channel's privacy setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelPrivacy
     */

    public Channel withPrivacy(ChannelPrivacy privacy) {
        this.privacy = privacy.toString();
        return this;
    }

    /**
     * <p>
     * The channel's metadata.
     * </p>
     * 
     * @param metadata
     *        The channel's metadata.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The channel's metadata.
     * </p>
     * 
     * @return The channel's metadata.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The channel's metadata.
     * </p>
     * 
     * @param metadata
     *        The channel's metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the channel.
     * </p>
     * 
     * @param createdBy
     *        The <code>AppInstanceUser</code> who created the channel.
     */

    public void setCreatedBy(Identity createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the channel.
     * </p>
     * 
     * @return The <code>AppInstanceUser</code> who created the channel.
     */

    public Identity getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The <code>AppInstanceUser</code> who created the channel.
     * </p>
     * 
     * @param createdBy
     *        The <code>AppInstanceUser</code> who created the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withCreatedBy(Identity createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceUser</code> created the channel.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the <code>AppInstanceUser</code> created the channel.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceUser</code> created the channel.
     * </p>
     * 
     * @return The time at which the <code>AppInstanceUser</code> created the channel.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceUser</code> created the channel.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the <code>AppInstanceUser</code> created the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a member sent the last message in the channel.
     * </p>
     * 
     * @param lastMessageTimestamp
     *        The time at which a member sent the last message in the channel.
     */

    public void setLastMessageTimestamp(java.util.Date lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    /**
     * <p>
     * The time at which a member sent the last message in the channel.
     * </p>
     * 
     * @return The time at which a member sent the last message in the channel.
     */

    public java.util.Date getLastMessageTimestamp() {
        return this.lastMessageTimestamp;
    }

    /**
     * <p>
     * The time at which a member sent the last message in the channel.
     * </p>
     * 
     * @param lastMessageTimestamp
     *        The time at which a member sent the last message in the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withLastMessageTimestamp(java.util.Date lastMessageTimestamp) {
        setLastMessageTimestamp(lastMessageTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a channel was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which a channel was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a channel was last updated.
     * </p>
     * 
     * @return The time at which a channel was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a channel was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which a channel was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Channel withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getPrivacy() != null)
            sb.append("Privacy: ").append(getPrivacy()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastMessageTimestamp() != null)
            sb.append("LastMessageTimestamp: ").append(getLastMessageTimestamp()).append(",");
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

        if (obj instanceof Channel == false)
            return false;
        Channel other = (Channel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getPrivacy() == null ^ this.getPrivacy() == null)
            return false;
        if (other.getPrivacy() != null && other.getPrivacy().equals(this.getPrivacy()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastMessageTimestamp() == null ^ this.getLastMessageTimestamp() == null)
            return false;
        if (other.getLastMessageTimestamp() != null && other.getLastMessageTimestamp().equals(this.getLastMessageTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getPrivacy() == null) ? 0 : getPrivacy().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastMessageTimestamp() == null) ? 0 : getLastMessageTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Channel clone() {
        try {
            return (Channel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
