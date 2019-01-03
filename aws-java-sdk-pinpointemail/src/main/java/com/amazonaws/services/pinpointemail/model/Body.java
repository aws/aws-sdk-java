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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the body of the email message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/Body" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Body implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that don't support HTML,
     * or clients where the recipient has disabled HTML rendering.
     * </p>
     */
    private Content text;
    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that support HTML. HTML
     * messages can include formatted text, hyperlinks, images, and more.
     * </p>
     */
    private Content html;

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that don't support HTML,
     * or clients where the recipient has disabled HTML rendering.
     * </p>
     * 
     * @param text
     *        An object that represents the version of the message that is displayed in email clients that don't support
     *        HTML, or clients where the recipient has disabled HTML rendering.
     */

    public void setText(Content text) {
        this.text = text;
    }

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that don't support HTML,
     * or clients where the recipient has disabled HTML rendering.
     * </p>
     * 
     * @return An object that represents the version of the message that is displayed in email clients that don't
     *         support HTML, or clients where the recipient has disabled HTML rendering.
     */

    public Content getText() {
        return this.text;
    }

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that don't support HTML,
     * or clients where the recipient has disabled HTML rendering.
     * </p>
     * 
     * @param text
     *        An object that represents the version of the message that is displayed in email clients that don't support
     *        HTML, or clients where the recipient has disabled HTML rendering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Body withText(Content text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that support HTML. HTML
     * messages can include formatted text, hyperlinks, images, and more.
     * </p>
     * 
     * @param html
     *        An object that represents the version of the message that is displayed in email clients that support HTML.
     *        HTML messages can include formatted text, hyperlinks, images, and more.
     */

    public void setHtml(Content html) {
        this.html = html;
    }

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that support HTML. HTML
     * messages can include formatted text, hyperlinks, images, and more.
     * </p>
     * 
     * @return An object that represents the version of the message that is displayed in email clients that support
     *         HTML. HTML messages can include formatted text, hyperlinks, images, and more.
     */

    public Content getHtml() {
        return this.html;
    }

    /**
     * <p>
     * An object that represents the version of the message that is displayed in email clients that support HTML. HTML
     * messages can include formatted text, hyperlinks, images, and more.
     * </p>
     * 
     * @param html
     *        An object that represents the version of the message that is displayed in email clients that support HTML.
     *        HTML messages can include formatted text, hyperlinks, images, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Body withHtml(Content html) {
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

        if (obj instanceof Body == false)
            return false;
        Body other = (Body) obj;
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

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getHtml() == null) ? 0 : getHtml().hashCode());
        return hashCode;
    }

    @Override
    public Body clone() {
        try {
            return (Body) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.BodyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
