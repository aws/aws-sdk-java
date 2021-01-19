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
 * The details of a message in a channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ChannelMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ID of a message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The message content.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The message metadata.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The message type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time at which the message was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which a message was edited.
     * </p>
     */
    private java.util.Date lastEditedTimestamp;
    /**
     * <p>
     * The time at which a message was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The message sender.
     * </p>
     */
    private Identity sender;
    /**
     * <p>
     * Hides the content of a message.
     * </p>
     */
    private Boolean redacted;
    /**
     * <p>
     * The persistence setting for a channel message.
     * </p>
     */
    private String persistence;

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

    public ChannelMessage withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ID of a message.
     * </p>
     * 
     * @param messageId
     *        The ID of a message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of a message.
     * </p>
     * 
     * @return The ID of a message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID of a message.
     * </p>
     * 
     * @param messageId
     *        The ID of a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The message content.
     * </p>
     * 
     * @param content
     *        The message content.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The message content.
     * </p>
     * 
     * @return The message content.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The message content.
     * </p>
     * 
     * @param content
     *        The message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The message metadata.
     * </p>
     * 
     * @param metadata
     *        The message metadata.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The message metadata.
     * </p>
     * 
     * @return The message metadata.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The message metadata.
     * </p>
     * 
     * @param metadata
     *        The message metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @param type
     *        The message type.
     * @see ChannelMessageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @return The message type.
     * @see ChannelMessageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @param type
     *        The message type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessageType
     */

    public ChannelMessage withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The message type.
     * </p>
     * 
     * @param type
     *        The message type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessageType
     */

    public ChannelMessage withType(ChannelMessageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the message was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the message was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the message was created.
     * </p>
     * 
     * @return The time at which the message was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the message was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the message was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a message was edited.
     * </p>
     * 
     * @param lastEditedTimestamp
     *        The time at which a message was edited.
     */

    public void setLastEditedTimestamp(java.util.Date lastEditedTimestamp) {
        this.lastEditedTimestamp = lastEditedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was edited.
     * </p>
     * 
     * @return The time at which a message was edited.
     */

    public java.util.Date getLastEditedTimestamp() {
        return this.lastEditedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was edited.
     * </p>
     * 
     * @param lastEditedTimestamp
     *        The time at which a message was edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withLastEditedTimestamp(java.util.Date lastEditedTimestamp) {
        setLastEditedTimestamp(lastEditedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which a message was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which a message was updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was updated.
     * </p>
     * 
     * @return The time at which a message was updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which a message was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which a message was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The message sender.
     * </p>
     * 
     * @param sender
     *        The message sender.
     */

    public void setSender(Identity sender) {
        this.sender = sender;
    }

    /**
     * <p>
     * The message sender.
     * </p>
     * 
     * @return The message sender.
     */

    public Identity getSender() {
        return this.sender;
    }

    /**
     * <p>
     * The message sender.
     * </p>
     * 
     * @param sender
     *        The message sender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withSender(Identity sender) {
        setSender(sender);
        return this;
    }

    /**
     * <p>
     * Hides the content of a message.
     * </p>
     * 
     * @param redacted
     *        Hides the content of a message.
     */

    public void setRedacted(Boolean redacted) {
        this.redacted = redacted;
    }

    /**
     * <p>
     * Hides the content of a message.
     * </p>
     * 
     * @return Hides the content of a message.
     */

    public Boolean getRedacted() {
        return this.redacted;
    }

    /**
     * <p>
     * Hides the content of a message.
     * </p>
     * 
     * @param redacted
     *        Hides the content of a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessage withRedacted(Boolean redacted) {
        setRedacted(redacted);
        return this;
    }

    /**
     * <p>
     * Hides the content of a message.
     * </p>
     * 
     * @return Hides the content of a message.
     */

    public Boolean isRedacted() {
        return this.redacted;
    }

    /**
     * <p>
     * The persistence setting for a channel message.
     * </p>
     * 
     * @param persistence
     *        The persistence setting for a channel message.
     * @see ChannelMessagePersistenceType
     */

    public void setPersistence(String persistence) {
        this.persistence = persistence;
    }

    /**
     * <p>
     * The persistence setting for a channel message.
     * </p>
     * 
     * @return The persistence setting for a channel message.
     * @see ChannelMessagePersistenceType
     */

    public String getPersistence() {
        return this.persistence;
    }

    /**
     * <p>
     * The persistence setting for a channel message.
     * </p>
     * 
     * @param persistence
     *        The persistence setting for a channel message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessagePersistenceType
     */

    public ChannelMessage withPersistence(String persistence) {
        setPersistence(persistence);
        return this;
    }

    /**
     * <p>
     * The persistence setting for a channel message.
     * </p>
     * 
     * @param persistence
     *        The persistence setting for a channel message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessagePersistenceType
     */

    public ChannelMessage withPersistence(ChannelMessagePersistenceType persistence) {
        this.persistence = persistence.toString();
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastEditedTimestamp() != null)
            sb.append("LastEditedTimestamp: ").append(getLastEditedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getSender() != null)
            sb.append("Sender: ").append(getSender()).append(",");
        if (getRedacted() != null)
            sb.append("Redacted: ").append(getRedacted()).append(",");
        if (getPersistence() != null)
            sb.append("Persistence: ").append(getPersistence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMessage == false)
            return false;
        ChannelMessage other = (ChannelMessage) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastEditedTimestamp() == null ^ this.getLastEditedTimestamp() == null)
            return false;
        if (other.getLastEditedTimestamp() != null && other.getLastEditedTimestamp().equals(this.getLastEditedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getSender() == null ^ this.getSender() == null)
            return false;
        if (other.getSender() != null && other.getSender().equals(this.getSender()) == false)
            return false;
        if (other.getRedacted() == null ^ this.getRedacted() == null)
            return false;
        if (other.getRedacted() != null && other.getRedacted().equals(this.getRedacted()) == false)
            return false;
        if (other.getPersistence() == null ^ this.getPersistence() == null)
            return false;
        if (other.getPersistence() != null && other.getPersistence().equals(this.getPersistence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastEditedTimestamp() == null) ? 0 : getLastEditedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        hashCode = prime * hashCode + ((getRedacted() == null) ? 0 : getRedacted().hashCode());
        hashCode = prime * hashCode + ((getPersistence() == null) ? 0 : getPersistence().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMessage clone() {
        try {
            return (ChannelMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ChannelMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
