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
 * An object that defines the entire content of the email, including the message headers and the body content. You can
 * create a simple email message, in which you specify the subject and the text and HTML versions of the message body.
 * You can also create raw messages, in which you specify a complete MIME-formatted message. Raw messages can include
 * attachments and custom headers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/EmailContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The simple email message. The message consists of a subject and a message body.
     * </p>
     */
    private Message simple;
    /**
     * <p>
     * The raw email message. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by one blank line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be Base64 encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you
     * should encode that content to ensure that recipients' email clients render the message properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined
     * in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * </li>
     * </ul>
     */
    private RawMessage raw;

    /**
     * <p>
     * The simple email message. The message consists of a subject and a message body.
     * </p>
     * 
     * @param simple
     *        The simple email message. The message consists of a subject and a message body.
     */

    public void setSimple(Message simple) {
        this.simple = simple;
    }

    /**
     * <p>
     * The simple email message. The message consists of a subject and a message body.
     * </p>
     * 
     * @return The simple email message. The message consists of a subject and a message body.
     */

    public Message getSimple() {
        return this.simple;
    }

    /**
     * <p>
     * The simple email message. The message consists of a subject and a message body.
     * </p>
     * 
     * @param simple
     *        The simple email message. The message consists of a subject and a message body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailContent withSimple(Message simple) {
        setSimple(simple);
        return this;
    }

    /**
     * <p>
     * The raw email message. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by one blank line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be Base64 encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you
     * should encode that content to ensure that recipients' email clients render the message properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined
     * in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param raw
     *        The raw email message. The message has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The message has to contain a header and a body, separated by one blank line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All of the required header fields must be present in the message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each part of a multipart MIME message must be formatted properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The entire message must be Base64 encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *        range, you should encode that content to ensure that recipients' email clients render the message
     *        properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The length of any single line of text in the message can't exceed 1,000 characters. This restriction is
     *        defined in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     *        </p>
     *        </li>
     */

    public void setRaw(RawMessage raw) {
        this.raw = raw;
    }

    /**
     * <p>
     * The raw email message. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by one blank line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be Base64 encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you
     * should encode that content to ensure that recipients' email clients render the message properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined
     * in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The raw email message. The message has to meet the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The message has to contain a header and a body, separated by one blank line.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All of the required header fields must be present in the message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each part of a multipart MIME message must be formatted properly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The entire message must be Base64 encoded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *         range, you should encode that content to ensure that recipients' email clients render the message
     *         properly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The length of any single line of text in the message can't exceed 1,000 characters. This restriction is
     *         defined in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     *         </p>
     *         </li>
     */

    public RawMessage getRaw() {
        return this.raw;
    }

    /**
     * <p>
     * The raw email message. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by one blank line.
     * </p>
     * </li>
     * <li>
     * <p>
     * All of the required header fields must be present in the message.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each part of a multipart MIME message must be formatted properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be Base64 encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, you
     * should encode that content to ensure that recipients' email clients render the message properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length of any single line of text in the message can't exceed 1,000 characters. This restriction is defined
     * in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param raw
     *        The raw email message. The message has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The message has to contain a header and a body, separated by one blank line.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All of the required header fields must be present in the message.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each part of a multipart MIME message must be formatted properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you include attachments, they must be in a file format that Amazon Pinpoint supports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The entire message must be Base64 encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *        range, you should encode that content to ensure that recipients' email clients render the message
     *        properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The length of any single line of text in the message can't exceed 1,000 characters. This restriction is
     *        defined in <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailContent withRaw(RawMessage raw) {
        setRaw(raw);
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
        if (getSimple() != null)
            sb.append("Simple: ").append(getSimple()).append(",");
        if (getRaw() != null)
            sb.append("Raw: ").append(getRaw());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailContent == false)
            return false;
        EmailContent other = (EmailContent) obj;
        if (other.getSimple() == null ^ this.getSimple() == null)
            return false;
        if (other.getSimple() != null && other.getSimple().equals(this.getSimple()) == false)
            return false;
        if (other.getRaw() == null ^ this.getRaw() == null)
            return false;
        if (other.getRaw() != null && other.getRaw().equals(this.getRaw()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimple() == null) ? 0 : getSimple().hashCode());
        hashCode = prime * hashCode + ((getRaw() == null) ? 0 : getRaw().hashCode());
        return hashCode;
    }

    @Override
    public EmailContent clone() {
        try {
            return (EmailContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.EmailContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
