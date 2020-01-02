/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A chat message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ChatMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the content. Supported types are text/plain.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The content of the chat message.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The type of the content. Supported types are text/plain.
     * </p>
     * 
     * @param contentType
     *        The type of the content. Supported types are text/plain.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of the content. Supported types are text/plain.
     * </p>
     * 
     * @return The type of the content. Supported types are text/plain.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of the content. Supported types are text/plain.
     * </p>
     * 
     * @param contentType
     *        The type of the content. Supported types are text/plain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatMessage withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content of the chat message.
     * </p>
     * 
     * @param content
     *        The content of the chat message.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the chat message.
     * </p>
     * 
     * @return The content of the chat message.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the chat message.
     * </p>
     * 
     * @param content
     *        The content of the chat message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatMessage withContent(String content) {
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

        if (obj instanceof ChatMessage == false)
            return false;
        ChatMessage other = (ChatMessage) obj;
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

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public ChatMessage clone() {
        try {
            return (ChatMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ChatMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
