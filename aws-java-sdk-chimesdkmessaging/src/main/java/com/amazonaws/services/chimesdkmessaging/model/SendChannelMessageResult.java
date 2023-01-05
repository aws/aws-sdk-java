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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SendChannelMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendChannelMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ID string assigned to each message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The status of the channel message.
     * </p>
     */
    private ChannelMessageStatusStructure status;
    /**
     * <p>
     * The ID of the SubChannel in the response.
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

    public SendChannelMessageResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ID string assigned to each message.
     * </p>
     * 
     * @param messageId
     *        The ID string assigned to each message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID string assigned to each message.
     * </p>
     * 
     * @return The ID string assigned to each message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID string assigned to each message.
     * </p>
     * 
     * @param messageId
     *        The ID string assigned to each message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageResult withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The status of the channel message.
     * </p>
     * 
     * @param status
     *        The status of the channel message.
     */

    public void setStatus(ChannelMessageStatusStructure status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the channel message.
     * </p>
     * 
     * @return The status of the channel message.
     */

    public ChannelMessageStatusStructure getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the channel message.
     * </p>
     * 
     * @param status
     *        The status of the channel message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageResult withStatus(ChannelMessageStatusStructure status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * 
     * @param subChannelId
     *        The ID of the SubChannel in the response.
     */

    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * 
     * @return The ID of the SubChannel in the response.
     */

    public String getSubChannelId() {
        return this.subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * 
     * @param subChannelId
     *        The ID of the SubChannel in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChannelMessageResult withSubChannelId(String subChannelId) {
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof SendChannelMessageResult == false)
            return false;
        SendChannelMessageResult other = (SendChannelMessageResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        return hashCode;
    }

    @Override
    public SendChannelMessageResult clone() {
        try {
            return (SendChannelMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
