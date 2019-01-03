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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the body of the message. You can specify text, HTML, or both. If you use both, then the message should
 * display correctly in the widest variety of email clients.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/Body" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Body implements Serializable, Cloneable {

    /**
     * <p>
     * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency
     * networks (such as mobile devices).
     * </p>
     */
    private Content text;
    /**
     * <p>
     * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include
     * clickable links, formatted text, and much more in an HTML message.
     * </p>
     */
    private Content html;

    /**
     * Default constructor for Body object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Body() {
    }

    /**
     * Constructs a new Body object. Callers should use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param text
     *        The content of the message, in text format. Use this for text-based email clients, or clients on
     *        high-latency networks (such as mobile devices).
     */
    public Body(Content text) {
        setText(text);
    }

    /**
     * <p>
     * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency
     * networks (such as mobile devices).
     * </p>
     * 
     * @param text
     *        The content of the message, in text format. Use this for text-based email clients, or clients on
     *        high-latency networks (such as mobile devices).
     */

    public void setText(Content text) {
        this.text = text;
    }

    /**
     * <p>
     * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency
     * networks (such as mobile devices).
     * </p>
     * 
     * @return The content of the message, in text format. Use this for text-based email clients, or clients on
     *         high-latency networks (such as mobile devices).
     */

    public Content getText() {
        return this.text;
    }

    /**
     * <p>
     * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency
     * networks (such as mobile devices).
     * </p>
     * 
     * @param text
     *        The content of the message, in text format. Use this for text-based email clients, or clients on
     *        high-latency networks (such as mobile devices).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Body withText(Content text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include
     * clickable links, formatted text, and much more in an HTML message.
     * </p>
     * 
     * @param html
     *        The content of the message, in HTML format. Use this for email clients that can process HTML. You can
     *        include clickable links, formatted text, and much more in an HTML message.
     */

    public void setHtml(Content html) {
        this.html = html;
    }

    /**
     * <p>
     * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include
     * clickable links, formatted text, and much more in an HTML message.
     * </p>
     * 
     * @return The content of the message, in HTML format. Use this for email clients that can process HTML. You can
     *         include clickable links, formatted text, and much more in an HTML message.
     */

    public Content getHtml() {
        return this.html;
    }

    /**
     * <p>
     * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include
     * clickable links, formatted text, and much more in an HTML message.
     * </p>
     * 
     * @param html
     *        The content of the message, in HTML format. Use this for email clients that can process HTML. You can
     *        include clickable links, formatted text, and much more in an HTML message.
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

}
