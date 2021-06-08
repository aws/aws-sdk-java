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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannelMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The ID string of the message being updated.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The content of the message being updated.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The metadata of the message being updated.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     */
    private String chimeBearer;

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

    public UpdateChannelMessageRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The ID string of the message being updated.
     * </p>
     * 
     * @param messageId
     *        The ID string of the message being updated.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID string of the message being updated.
     * </p>
     * 
     * @return The ID string of the message being updated.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID string of the message being updated.
     * </p>
     * 
     * @param messageId
     *        The ID string of the message being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelMessageRequest withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The content of the message being updated.
     * </p>
     * 
     * @param content
     *        The content of the message being updated.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the message being updated.
     * </p>
     * 
     * @return The content of the message being updated.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the message being updated.
     * </p>
     * 
     * @param content
     *        The content of the message being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelMessageRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The metadata of the message being updated.
     * </p>
     * 
     * @param metadata
     *        The metadata of the message being updated.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the message being updated.
     * </p>
     * 
     * @return The metadata of the message being updated.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the message being updated.
     * </p>
     * 
     * @param metadata
     *        The metadata of the message being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelMessageRequest withMetadata(String metadata) {
        setMetadata(metadata);
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

    public UpdateChannelMessageRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
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
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelMessageRequest == false)
            return false;
        UpdateChannelMessageRequest other = (UpdateChannelMessageRequest) obj;
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
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
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
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelMessageRequest clone() {
        return (UpdateChannelMessageRequest) super.clone();
    }

}
