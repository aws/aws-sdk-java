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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The message object that provides the message text and its type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content type of the message string.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The text of the message.
     * </p>
     */
    private String content;
    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex
     * returns one message from each group in the response.
     * </p>
     */
    private Integer groupNumber;

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * 
     * @param contentType
     *        The content type of the message string.
     * @see ContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * 
     * @return The content type of the message string.
     * @see ContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * 
     * @param contentType
     *        The content type of the message string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public Message withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * 
     * @param contentType
     *        The content type of the message string.
     * @see ContentType
     */

    public void setContentType(ContentType contentType) {
        withContentType(contentType);
    }

    /**
     * <p>
     * The content type of the message string.
     * </p>
     * 
     * @param contentType
     *        The content type of the message string.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentType
     */

    public Message withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * The text of the message.
     * </p>
     * 
     * @param content
     *        The text of the message.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The text of the message.
     * </p>
     * 
     * @return The text of the message.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The text of the message.
     * </p>
     * 
     * @param content
     *        The text of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex
     * returns one message from each group in the response.
     * </p>
     * 
     * @param groupNumber
     *        Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon
     *        Lex returns one message from each group in the response.
     */

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex
     * returns one message from each group in the response.
     * </p>
     * 
     * @return Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon
     *         Lex returns one message from each group in the response.
     */

    public Integer getGroupNumber() {
        return this.groupNumber;
    }

    /**
     * <p>
     * Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon Lex
     * returns one message from each group in the response.
     * </p>
     * 
     * @param groupNumber
     *        Identifies the message group that the message belongs to. When a group is assigned to a message, Amazon
     *        Lex returns one message from each group in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withGroupNumber(Integer groupNumber) {
        setGroupNumber(groupNumber);
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
            sb.append("Content: ").append(getContent()).append(",");
        if (getGroupNumber() != null)
            sb.append("GroupNumber: ").append(getGroupNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getGroupNumber() == null ^ this.getGroupNumber() == null)
            return false;
        if (other.getGroupNumber() != null && other.getGroupNumber().equals(this.getGroupNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getGroupNumber() == null) ? 0 : getGroupNumber().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
