/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Chat integration event containing payload to perform different chat actions such as:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Sending a chat message
 * </p>
 * </li>
 * <li>
 * <p>
 * Sending a chat event, such as typing
 * </p>
 * </li>
 * <li>
 * <p>
 * Disconnecting from a chat
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ChatEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;
    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for certain
     * <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String content;

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * 
     * @param type
     *        Type of chat integration event.
     * @see ChatEventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * 
     * @return Type of chat integration event.
     * @see ChatEventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * 
     * @param type
     *        Type of chat integration event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatEventType
     */

    public ChatEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of chat integration event.
     * </p>
     * 
     * @param type
     *        Type of chat integration event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChatEventType
     */

    public ChatEvent withType(ChatEventType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For allowed message content types, see the <code>ContentType</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *        >SendMessage</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For allowed event content types, see the <code>ContentType</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *        >SendEvent</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For allowed message content types, see the <code>ContentType</code> parameter in the <a
     *         href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *         >SendMessage</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For allowed event content types, see the <code>ContentType</code> parameter in the <a
     *         href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *         >SendEvent</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *         </p>
     *         </li>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content types, see the <code>ContentType</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        Type of content. This is required when <code>Type</code> is <code>MESSAGE</code> or <code>EVENT</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For allowed message content types, see the <code>ContentType</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *        >SendMessage</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For allowed event content types, see the <code>ContentType</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *        >SendEvent</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatEvent withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for certain
     * <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param content
     *        Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for
     *        certain <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For allowed message content, see the <code>Content</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *        >SendMessage</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For allowed event content, see the <code>Content</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *        >SendEvent</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for certain
     * <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for
     *         certain <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For allowed message content, see the <code>Content</code> parameter in the <a
     *         href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *         >SendMessage</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For allowed event content, see the <code>Content</code> parameter in the <a
     *         href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *         >SendEvent</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *         </p>
     *         </li>
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for certain
     * <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For allowed message content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html">SendMessage</a>
     * topic in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For allowed event content, see the <code>Content</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html">SendEvent</a> topic
     * in the <i>Amazon Connect Participant Service API Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param content
     *        Content of the message or event. This is required when <code>Type</code> is <code>MESSAGE</code> and for
     *        certain <code>ContentTypes</code> when <code>Type</code> is <code>EVENT</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For allowed message content, see the <code>Content</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendMessage.html"
     *        >SendMessage</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For allowed event content, see the <code>Content</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_SendEvent.html"
     *        >SendEvent</a> topic in the <i>Amazon Connect Participant Service API Reference</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatEvent withContent(String content) {
        setContent(content);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatEvent == false)
            return false;
        ChatEvent other = (ChatEvent) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public ChatEvent clone() {
        try {
            return (ChatEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ChatEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
