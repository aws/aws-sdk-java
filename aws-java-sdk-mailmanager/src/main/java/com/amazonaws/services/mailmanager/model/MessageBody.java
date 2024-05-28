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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The textual body content of an email message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/MessageBody" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageBody implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTML body content of the message.
     * </p>
     */
    private String html;
    /**
     * <p>
     * A flag indicating if the email was malformed.
     * </p>
     */
    private Boolean messageMalformed;
    /**
     * <p>
     * The plain text body content of the message.
     * </p>
     */
    private String text;

    /**
     * <p>
     * The HTML body content of the message.
     * </p>
     * 
     * @param html
     *        The HTML body content of the message.
     */

    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * <p>
     * The HTML body content of the message.
     * </p>
     * 
     * @return The HTML body content of the message.
     */

    public String getHtml() {
        return this.html;
    }

    /**
     * <p>
     * The HTML body content of the message.
     * </p>
     * 
     * @param html
     *        The HTML body content of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageBody withHtml(String html) {
        setHtml(html);
        return this;
    }

    /**
     * <p>
     * A flag indicating if the email was malformed.
     * </p>
     * 
     * @param messageMalformed
     *        A flag indicating if the email was malformed.
     */

    public void setMessageMalformed(Boolean messageMalformed) {
        this.messageMalformed = messageMalformed;
    }

    /**
     * <p>
     * A flag indicating if the email was malformed.
     * </p>
     * 
     * @return A flag indicating if the email was malformed.
     */

    public Boolean getMessageMalformed() {
        return this.messageMalformed;
    }

    /**
     * <p>
     * A flag indicating if the email was malformed.
     * </p>
     * 
     * @param messageMalformed
     *        A flag indicating if the email was malformed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageBody withMessageMalformed(Boolean messageMalformed) {
        setMessageMalformed(messageMalformed);
        return this;
    }

    /**
     * <p>
     * A flag indicating if the email was malformed.
     * </p>
     * 
     * @return A flag indicating if the email was malformed.
     */

    public Boolean isMessageMalformed() {
        return this.messageMalformed;
    }

    /**
     * <p>
     * The plain text body content of the message.
     * </p>
     * 
     * @param text
     *        The plain text body content of the message.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The plain text body content of the message.
     * </p>
     * 
     * @return The plain text body content of the message.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The plain text body content of the message.
     * </p>
     * 
     * @param text
     *        The plain text body content of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageBody withText(String text) {
        setText(text);
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
        if (getHtml() != null)
            sb.append("Html: ").append(getHtml()).append(",");
        if (getMessageMalformed() != null)
            sb.append("MessageMalformed: ").append(getMessageMalformed()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageBody == false)
            return false;
        MessageBody other = (MessageBody) obj;
        if (other.getHtml() == null ^ this.getHtml() == null)
            return false;
        if (other.getHtml() != null && other.getHtml().equals(this.getHtml()) == false)
            return false;
        if (other.getMessageMalformed() == null ^ this.getMessageMalformed() == null)
            return false;
        if (other.getMessageMalformed() != null && other.getMessageMalformed().equals(this.getMessageMalformed()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHtml() == null) ? 0 : getHtml().hashCode());
        hashCode = prime * hashCode + ((getMessageMalformed() == null) ? 0 : getMessageMalformed().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public MessageBody clone() {
        try {
            return (MessageBody) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.MessageBodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
