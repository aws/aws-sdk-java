/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <p>
     * Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with an alphabetic character or single underscore (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain hyphens (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be greater than 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01":
     * 29} are invalid in message payloads.
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
     * <p>
     * Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with an alphabetic character or single underscore (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain hyphens (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be greater than 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01":
     * 29} are invalid in message payloads.
     * </p>
     * 
     * @return The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload":
     *         "string"}'.</p>
     *         <p>
     *         Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with an alphabetic character or single underscore (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot contain hyphens (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be greater than 255 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or
     *         {"__temp_01": 29} are invalid in message payloads.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'.
     * </p>
     * <p>
     * Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with an alphabetic character or single underscore (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain hyphens (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be greater than 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01":
     * 29} are invalid in message payloads.
     * </p>
     * 
     * @param messages
     *        The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload":
     *        "string"}'.</p>
     *        <p>
     *        Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with an alphabetic character or single underscore (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain hyphens (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be greater than 255 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or
     *        {"__temp_01": 29} are invalid in message payloads.
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
     * Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with an alphabetic character or single underscore (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain hyphens (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be greater than 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01":
     * 29} are invalid in message payloads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload":
     *        "string"}'.</p>
     *        <p>
     *        Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with an alphabetic character or single underscore (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain hyphens (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be greater than 255 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or
     *        {"__temp_01": 29} are invalid in message payloads.
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
     * <p>
     * Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with an alphabetic character or single underscore (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot contain hyphens (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be greater than 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01":
     * 29} are invalid in message payloads.
     * </p>
     * 
     * @param messages
     *        The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload":
     *        "string"}'.</p>
     *        <p>
     *        Note that the field names of message payloads (data) that you send to AWS IoT Analytics:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with an alphabetic character or single underscore (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot contain hyphens (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be greater than 255 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or
     *        {"__temp_01": 29} are invalid in message payloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMessageRequest withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
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
