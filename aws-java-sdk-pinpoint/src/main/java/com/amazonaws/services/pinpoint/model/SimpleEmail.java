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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the contents of an email message, composed of a subject, a text part, and an HTML part.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SimpleEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleEmail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML
     * content. You can include links, formatted text, and more in an HTML message.
     * </p>
     */
    private SimpleEmailPart htmlPart;
    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     */
    private SimpleEmailPart subject;
    /**
     * <p>
     * The body of the email message, in plain text format. We recommend using plain text format for email clients that
     * don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
     * </p>
     */
    private SimpleEmailPart textPart;

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML
     * content. You can include links, formatted text, and more in an HTML message.
     * </p>
     * 
     * @param htmlPart
     *        The body of the email message, in HTML format. We recommend using HTML format for email clients that
     *        render HTML content. You can include links, formatted text, and more in an HTML message.
     */

    public void setHtmlPart(SimpleEmailPart htmlPart) {
        this.htmlPart = htmlPart;
    }

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML
     * content. You can include links, formatted text, and more in an HTML message.
     * </p>
     * 
     * @return The body of the email message, in HTML format. We recommend using HTML format for email clients that
     *         render HTML content. You can include links, formatted text, and more in an HTML message.
     */

    public SimpleEmailPart getHtmlPart() {
        return this.htmlPart;
    }

    /**
     * <p>
     * The body of the email message, in HTML format. We recommend using HTML format for email clients that render HTML
     * content. You can include links, formatted text, and more in an HTML message.
     * </p>
     * 
     * @param htmlPart
     *        The body of the email message, in HTML format. We recommend using HTML format for email clients that
     *        render HTML content. You can include links, formatted text, and more in an HTML message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleEmail withHtmlPart(SimpleEmailPart htmlPart) {
        setHtmlPart(htmlPart);
        return this;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * 
     * @param subject
     *        The subject line, or title, of the email.
     */

    public void setSubject(SimpleEmailPart subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * 
     * @return The subject line, or title, of the email.
     */

    public SimpleEmailPart getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line, or title, of the email.
     * </p>
     * 
     * @param subject
     *        The subject line, or title, of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleEmail withSubject(SimpleEmailPart subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The body of the email message, in plain text format. We recommend using plain text format for email clients that
     * don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
     * </p>
     * 
     * @param textPart
     *        The body of the email message, in plain text format. We recommend using plain text format for email
     *        clients that don't render HTML content and clients that are connected to high-latency networks, such as
     *        mobile devices.
     */

    public void setTextPart(SimpleEmailPart textPart) {
        this.textPart = textPart;
    }

    /**
     * <p>
     * The body of the email message, in plain text format. We recommend using plain text format for email clients that
     * don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
     * </p>
     * 
     * @return The body of the email message, in plain text format. We recommend using plain text format for email
     *         clients that don't render HTML content and clients that are connected to high-latency networks, such as
     *         mobile devices.
     */

    public SimpleEmailPart getTextPart() {
        return this.textPart;
    }

    /**
     * <p>
     * The body of the email message, in plain text format. We recommend using plain text format for email clients that
     * don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
     * </p>
     * 
     * @param textPart
     *        The body of the email message, in plain text format. We recommend using plain text format for email
     *        clients that don't render HTML content and clients that are connected to high-latency networks, such as
     *        mobile devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleEmail withTextPart(SimpleEmailPart textPart) {
        setTextPart(textPart);
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
        if (getHtmlPart() != null)
            sb.append("HtmlPart: ").append(getHtmlPart()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getTextPart() != null)
            sb.append("TextPart: ").append(getTextPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleEmail == false)
            return false;
        SimpleEmail other = (SimpleEmail) obj;
        if (other.getHtmlPart() == null ^ this.getHtmlPart() == null)
            return false;
        if (other.getHtmlPart() != null && other.getHtmlPart().equals(this.getHtmlPart()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getTextPart() == null ^ this.getTextPart() == null)
            return false;
        if (other.getTextPart() != null && other.getTextPart().equals(this.getTextPart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHtmlPart() == null) ? 0 : getHtmlPart().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getTextPart() == null) ? 0 : getTextPart().hashCode());
        return hashCode;
    }

    @Override
    public SimpleEmail clone() {
        try {
            return (SimpleEmail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SimpleEmailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
