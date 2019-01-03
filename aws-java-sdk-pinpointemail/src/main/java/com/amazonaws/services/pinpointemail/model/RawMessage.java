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
 * The raw email message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/RawMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RawMessage implements Serializable, Cloneable, StructuredPojo {

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
     * Attachments must be in a file format that Amazon Pinpoint supports.
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
    private java.nio.ByteBuffer data;

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
     * Attachments must be in a file format that Amazon Pinpoint supports.
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
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
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
     *        Attachments must be in a file format that Amazon Pinpoint supports.
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

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
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
     * Attachments must be in a file format that Amazon Pinpoint supports.
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
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
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
     *         Attachments must be in a file format that Amazon Pinpoint supports.
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

    public java.nio.ByteBuffer getData() {
        return this.data;
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
     * Attachments must be in a file format that Amazon Pinpoint supports.
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
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param data
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
     *        Attachments must be in a file format that Amazon Pinpoint supports.
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

    public RawMessage withData(java.nio.ByteBuffer data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RawMessage == false)
            return false;
        RawMessage other = (RawMessage) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public RawMessage clone() {
        try {
            return (RawMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.RawMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
