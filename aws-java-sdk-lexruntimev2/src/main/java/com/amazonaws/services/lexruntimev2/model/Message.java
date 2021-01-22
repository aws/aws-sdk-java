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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for text that is returned to the customer..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the message.
     * </p>
     */
    private String content;
    /**
     * <p>
     * Indicates the type of response.
     * </p>
     */
    private String contentType;

    private ImageResponseCard imageResponseCard;

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
     * Indicates the type of response.
     * </p>
     * 
     * @param contentType
     *        Indicates the type of response.
     * @see MessageContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Indicates the type of response.
     * </p>
     * 
     * @return Indicates the type of response.
     * @see MessageContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Indicates the type of response.
     * </p>
     * 
     * @param contentType
     *        Indicates the type of response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageContentType
     */

    public Message withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of response.
     * </p>
     * 
     * @param contentType
     *        Indicates the type of response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageContentType
     */

    public Message withContentType(MessageContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * @param imageResponseCard
     */

    public void setImageResponseCard(ImageResponseCard imageResponseCard) {
        this.imageResponseCard = imageResponseCard;
    }

    /**
     * @return
     */

    public ImageResponseCard getImageResponseCard() {
        return this.imageResponseCard;
    }

    /**
     * @param imageResponseCard
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withImageResponseCard(ImageResponseCard imageResponseCard) {
        setImageResponseCard(imageResponseCard);
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
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getImageResponseCard() != null)
            sb.append("ImageResponseCard: ").append(getImageResponseCard());
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
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getImageResponseCard() == null ^ this.getImageResponseCard() == null)
            return false;
        if (other.getImageResponseCard() != null && other.getImageResponseCard().equals(this.getImageResponseCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getImageResponseCard() == null) ? 0 : getImageResponseCard().hashCode());
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
        com.amazonaws.services.lexruntimev2.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
