/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores information about a callback.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelMessageCallback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessageCallback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message ID.
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
     * The push notification configuration of the message.
     * </p>
     */
    private PushNotificationConfiguration pushNotification;
    /**
     * <p>
     * The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes;
    /**
     * <p>
     * The ID of the SubChannel.
     * </p>
     */
    private String subChannelId;

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @param messageId
     *        The message ID.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @return The message ID.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @param messageId
     *        The message ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageCallback withMessageId(String messageId) {
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

    public ChannelMessageCallback withContent(String content) {
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

    public ChannelMessageCallback withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     * 
     * @param pushNotification
     *        The push notification configuration of the message.
     */

    public void setPushNotification(PushNotificationConfiguration pushNotification) {
        this.pushNotification = pushNotification;
    }

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     * 
     * @return The push notification configuration of the message.
     */

    public PushNotificationConfiguration getPushNotification() {
        return this.pushNotification;
    }

    /**
     * <p>
     * The push notification configuration of the message.
     * </p>
     * 
     * @param pushNotification
     *        The push notification configuration of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageCallback withPushNotification(PushNotificationConfiguration pushNotification) {
        setPushNotification(pushNotification);
        return this;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     * 
     * @return The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined
     *         in the <code>PushNotificationPreferences</code>.
     */

    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     * 
     * @param messageAttributes
     *        The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined in
     *        the <code>PushNotificationPreferences</code>.
     */

    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined in the
     * <code>PushNotificationPreferences</code>.
     * </p>
     * 
     * @param messageAttributes
     *        The attributes for the message, used for message filtering along with a <code>FilterRule</code> defined in
     *        the <code>PushNotificationPreferences</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageCallback withMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    /**
     * Add a single MessageAttributes entry
     *
     * @see ChannelMessageCallback#withMessageAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageCallback addMessageAttributesEntry(String key, MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageCallback clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel.
     * </p>
     * 
     * @param subChannelId
     *        The ID of the SubChannel.
     */

    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel.
     * </p>
     * 
     * @return The ID of the SubChannel.
     */

    public String getSubChannelId() {
        return this.subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel.
     * </p>
     * 
     * @param subChannelId
     *        The ID of the SubChannel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelMessageCallback withSubChannelId(String subChannelId) {
        setSubChannelId(subChannelId);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getPushNotification() != null)
            sb.append("PushNotification: ").append(getPushNotification()).append(",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getSubChannelId() != null)
            sb.append("SubChannelId: ").append(getSubChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMessageCallback == false)
            return false;
        ChannelMessageCallback other = (ChannelMessageCallback) obj;
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
        if (other.getPushNotification() == null ^ this.getPushNotification() == null)
            return false;
        if (other.getPushNotification() != null && other.getPushNotification().equals(this.getPushNotification()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        if (other.getSubChannelId() == null ^ this.getSubChannelId() == null)
            return false;
        if (other.getSubChannelId() != null && other.getSubChannelId().equals(this.getSubChannelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getPushNotification() == null) ? 0 : getPushNotification().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        hashCode = prime * hashCode + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        return hashCode;
    }

    @Override
    public ChannelMessageCallback clone() {
        try {
            return (ChannelMessageCallback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ChannelMessageCallbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
