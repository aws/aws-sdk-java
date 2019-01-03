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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The notify email type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/NotifyEmailType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyEmailType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subject.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The HTML body.
     * </p>
     */
    private String htmlBody;
    /**
     * <p>
     * The text body.
     * </p>
     */
    private String textBody;

    /**
     * <p>
     * The subject.
     * </p>
     * 
     * @param subject
     *        The subject.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject.
     * </p>
     * 
     * @return The subject.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject.
     * </p>
     * 
     * @param subject
     *        The subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyEmailType withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The HTML body.
     * </p>
     * 
     * @param htmlBody
     *        The HTML body.
     */

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    /**
     * <p>
     * The HTML body.
     * </p>
     * 
     * @return The HTML body.
     */

    public String getHtmlBody() {
        return this.htmlBody;
    }

    /**
     * <p>
     * The HTML body.
     * </p>
     * 
     * @param htmlBody
     *        The HTML body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyEmailType withHtmlBody(String htmlBody) {
        setHtmlBody(htmlBody);
        return this;
    }

    /**
     * <p>
     * The text body.
     * </p>
     * 
     * @param textBody
     *        The text body.
     */

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    /**
     * <p>
     * The text body.
     * </p>
     * 
     * @return The text body.
     */

    public String getTextBody() {
        return this.textBody;
    }

    /**
     * <p>
     * The text body.
     * </p>
     * 
     * @param textBody
     *        The text body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyEmailType withTextBody(String textBody) {
        setTextBody(textBody);
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
        if (getHtmlBody() != null)
            sb.append("HtmlBody: ").append(getHtmlBody()).append(",");
        if (getTextBody() != null)
            sb.append("TextBody: ").append(getTextBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyEmailType == false)
            return false;
        NotifyEmailType other = (NotifyEmailType) obj;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getHtmlBody() == null ^ this.getHtmlBody() == null)
            return false;
        if (other.getHtmlBody() != null && other.getHtmlBody().equals(this.getHtmlBody()) == false)
            return false;
        if (other.getTextBody() == null ^ this.getTextBody() == null)
            return false;
        if (other.getTextBody() != null && other.getTextBody().equals(this.getTextBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getHtmlBody() == null) ? 0 : getHtmlBody().hashCode());
        hashCode = prime * hashCode + ((getTextBody() == null) ? 0 : getTextBody().hashCode());
        return hashCode;
    }

    @Override
    public NotifyEmailType clone() {
        try {
            return (NotifyEmailType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.NotifyEmailTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
