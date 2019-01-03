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
 * Represents the email message that you're sending. The <code>Message</code> object consists of a subject line and a
 * message body.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify
     * non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     * href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * </p>
     */
    private Content subject;
    /**
     * <p>
     * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or
     * both.
     * </p>
     */
    private Body body;

    /**
     * <p>
     * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify
     * non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     * href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * </p>
     * 
     * @param subject
     *        The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can
     *        specify non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     *        href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     */

    public void setSubject(Content subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify
     * non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     * href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * </p>
     * 
     * @return The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can
     *         specify non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     *         href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     */

    public Content getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can specify
     * non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     * href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * </p>
     * 
     * @param subject
     *        The subject line of the email. The subject line can only contain 7-bit ASCII characters. However, you can
     *        specify non-ASCII characters in the subject line by using encoded-word syntax, as described in <a
     *        href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withSubject(Content subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or
     * both.
     * </p>
     * 
     * @param body
     *        The body of the message. You can specify an HTML version of the message, a text-only version of the
     *        message, or both.
     */

    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or
     * both.
     * </p>
     * 
     * @return The body of the message. You can specify an HTML version of the message, a text-only version of the
     *         message, or both.
     */

    public Body getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the message. You can specify an HTML version of the message, a text-only version of the message, or
     * both.
     * </p>
     * 
     * @param body
     *        The body of the message. You can specify an HTML version of the message, a text-only version of the
     *        message, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withBody(Body body) {
        setBody(body);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
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
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
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
        com.amazonaws.services.pinpointemail.model.transform.MessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
