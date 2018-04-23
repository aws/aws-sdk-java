/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/BatchPutMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the channel where the messages are sent.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * </p>
     */
    private java.util.List<Message> messages;

    /**
     * <p>
     * The name of the channel where the messages are sent.
     * </p>
     * 
     * @param channelName
     *        The name of the channel where the messages are sent.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel where the messages are sent.
     * </p>
     * 
     * @return The name of the channel where the messages are sent.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel where the messages are sent.
     * </p>
     * 
     * @param channelName
     *        The name of the channel where the messages are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMessageRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * </p>
     * 
     * @return The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload":
     *         "string"}'.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * </p>
     * 
     * @param messages
     *        The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMessageRequest withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * </p>
     * 
     * @param messages
     *        The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMessageRequest withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutMessageRequest == false)
            return false;
        BatchPutMessageRequest other = (BatchPutMessageRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutMessageRequest clone() {
        return (BatchPutMessageRequest) super.clone();
    }

}
