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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/RedactChannelMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedactChannelMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel containing the messages that you want to redact.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ID of the message being redacted.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * <note>
     * <p>
     * Only required when redacting messages in a SubChannel that the user belongs to.
     * </p>
     * </note>
     */
    private String subChannelId;

    /**
     * <p>
     * The ARN of the channel containing the messages that you want to redact.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel containing the messages that you want to redact.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel containing the messages that you want to redact.
     * </p>
     * 
     * @return The ARN of the channel containing the messages that you want to redact.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel containing the messages that you want to redact.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel containing the messages that you want to redact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactChannelMessageResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ID of the message being redacted.
     * </p>
     * 
     * @param messageId
     *        The ID of the message being redacted.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message being redacted.
     * </p>
     * 
     * @return The ID of the message being redacted.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID of the message being redacted.
     * </p>
     * 
     * @param messageId
     *        The ID of the message being redacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactChannelMessageResult withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * <note>
     * <p>
     * Only required when redacting messages in a SubChannel that the user belongs to.
     * </p>
     * </note>
     * 
     * @param subChannelId
     *        The ID of the SubChannel in the response.</p> <note>
     *        <p>
     *        Only required when redacting messages in a SubChannel that the user belongs to.
     *        </p>
     */

    public void setSubChannelId(String subChannelId) {
        this.subChannelId = subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * <note>
     * <p>
     * Only required when redacting messages in a SubChannel that the user belongs to.
     * </p>
     * </note>
     * 
     * @return The ID of the SubChannel in the response.</p> <note>
     *         <p>
     *         Only required when redacting messages in a SubChannel that the user belongs to.
     *         </p>
     */

    public String getSubChannelId() {
        return this.subChannelId;
    }

    /**
     * <p>
     * The ID of the SubChannel in the response.
     * </p>
     * <note>
     * <p>
     * Only required when redacting messages in a SubChannel that the user belongs to.
     * </p>
     * </note>
     * 
     * @param subChannelId
     *        The ID of the SubChannel in the response.</p> <note>
     *        <p>
     *        Only required when redacting messages in a SubChannel that the user belongs to.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactChannelMessageResult withSubChannelId(String subChannelId) {
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

        if (obj instanceof RedactChannelMessageResult == false)
            return false;
        RedactChannelMessageResult other = (RedactChannelMessageResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
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
        hashCode = prime * hashCode + ((getSubChannelId() == null) ? 0 : getSubChannelId().hashCode());
        return hashCode;
    }

    @Override
    public RedactChannelMessageResult clone() {
        try {
            return (RedactChannelMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
