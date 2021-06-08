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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The content of the email, composed of a subject line, an HTML part, and a text-only part.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/EmailTemplateContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailTemplateContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subject line of the email.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do not display HTML.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The HTML body of the email.
     * </p>
     */
    private String html;

    /**
     * <p>
     * The subject line of the email.
     * </p>
     * 
     * @param subject
     *        The subject line of the email.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line of the email.
     * </p>
     * 
     * @return The subject line of the email.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line of the email.
     * </p>
     * 
     * @param subject
     *        The subject line of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailTemplateContent withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do not display HTML.
     * </p>
     * 
     * @param text
     *        The email body that will be visible to recipients whose email clients do not display HTML.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do not display HTML.
     * </p>
     * 
     * @return The email body that will be visible to recipients whose email clients do not display HTML.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The email body that will be visible to recipients whose email clients do not display HTML.
     * </p>
     * 
     * @param text
     *        The email body that will be visible to recipients whose email clients do not display HTML.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailTemplateContent withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     * 
     * @param html
     *        The HTML body of the email.
     */

    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     * 
     * @return The HTML body of the email.
     */

    public String getHtml() {
        return this.html;
    }

    /**
     * <p>
     * The HTML body of the email.
     * </p>
     * 
     * @param html
     *        The HTML body of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailTemplateContent withHtml(String html) {
        setHtml(html);
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
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getHtml() != null)
            sb.append("Html: ").append(getHtml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailTemplateContent == false)
            return false;
        EmailTemplateContent other = (EmailTemplateContent) obj;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getHtml() == null ^ this.getHtml() == null)
            return false;
        if (other.getHtml() != null && other.getHtml().equals(this.getHtml()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getHtml() == null) ? 0 : getHtml().hashCode());
        return hashCode;
    }

    @Override
    public EmailTemplateContent clone() {
        try {
            return (EmailTemplateContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.EmailTemplateContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
