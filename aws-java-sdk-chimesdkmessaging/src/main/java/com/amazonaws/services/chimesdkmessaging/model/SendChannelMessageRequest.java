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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SendChannelMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendChannelMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The content of the message.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end. Required.
     * </p>
     */
    private String persistence;
    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     */
    private String chimeBearer;
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
     * The ID of the SubChannel in the request.
     * </p>
     */
    private String subChannelId;

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

    public SendChannelMessageRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * 
     * @param content
     *        The content of the message.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * 
     * @return The content of the message.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the message.
     * </p>
     * 
     * @param content
     *        The content of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * 
     * @param type
     *        The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * @see ChannelMessageType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * 
     * @return The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * @see ChannelMessageType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * 
     * @param type
     *        The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessageType
     */

    public SendChannelMessageRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * </p>
     * 
     * @param type
     *        The type of message, <code>STANDARD</code> or <code>CONTROL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessageType
     */

    public SendChannelMessageRequest withType(ChannelMessageType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end. Required.
     * </p>
     * 
     * @param persistence
     *        Boolean that controls whether the message is persisted on the back end. Required.
     * @see ChannelMessagePersistenceType
     */

    public void setPersistence(String persistence) {
        this.persistence = persistence;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end. Required.
     * </p>
     * 
     * @return Boolean that controls whether the message is persisted on the back end. Required.
     * @see ChannelMessagePersistenceType
     */

    public String getPersistence() {
        return this.persistence;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end. Required.
     * </p>
     * 
     * @param persistence
     *        Boolean that controls whether the message is persisted on the back end. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessagePersistenceType
     */

    public SendChannelMessageRequest withPersistence(String persistence) {
        setPersistence(persistence);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the message is persisted on the back end. Required.
     * </p>
     * 
     * @param persistence
     *        Boolean that controls whether the message is persisted on the back end. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMessagePersistenceType
     */

    public SendChannelMessageRequest withPersistence(ChannelMessagePersistenceType persistence) {
        this.persistence = persistence.toString();
        return this;
    }

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * 
     * @param metadata
     *        The optional metadata for each message.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * 
     * @return The optional metadata for each message.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The optional metadata for each message.
     * </p>
     * 
     * @param metadata
     *        The optional metadata for each message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageRequest withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     * 
     * @param clientRequestToken
     *        The <code>Idempotency</code> token for each client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     * 
     * @return The <code>Idempotency</code> token for each client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The <code>Idempotency</code> token for each client request.
     * </p>
     * 
     * @param clientRequestToken
     *        The <code>Idempotency</code> token for each client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user that makes the API call.
     */

    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @return The <code>AppInstanceUserArn</code> of the user that makes the API call.
     */

    public String getChimeBearer() {
        return this.chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
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

    public SendChannelMessageRequest withPushNotification(PushNotificationConfiguration pushNotification) {
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

    public SendChannelMessageRequest withMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    /**
     * Add a single MessageAttributes entry
     *
     * @see SendChannelMessageRequest#withMessageAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageRequest addMessageAttributesEntry(String key, MessageAttributeValue value) {
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

    public SendChannelMessageRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * 
     * @param subChannelId
     *        The ID of the SubChannel in the request.
     */

    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * 
     * @return The ID of the SubChannel in the request.
     */

    public String getSubChannelId() {
        return this.subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the request.
     * </p>
     * 
     * @param subChannelId
     *        The ID of the SubChannel in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageRequest withSubChannelId(String subChannelId) {
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPersistence() != null)
            sb.append("Persistence: ").append(getPersistence()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer()).append(",");
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

        if (obj instanceof SendChannelMessageRequest == false)
            return false;
        SendChannelMessageRequest other = (SendChannelMessageRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPersistence() == null ^ this.getPersistence() == null)
            return false;
        if (other.getPersistence() != null && other.getPersistence().equals(this.getPersistence()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
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

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPersistence() == null) ? 0 : getPersistence().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        hashCode = prime * hashCode + ((getPushNotification() == null) ? 0 : getPushNotification().hashCode());
        hashCode = prime * hashCode + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        hashCode = prime * hashCode + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        return hashCode;
    }

    @Override
    public SendChannelMessageRequest clone() {
        return (SendChannelMessageRequest) super.clone();
    }

}
