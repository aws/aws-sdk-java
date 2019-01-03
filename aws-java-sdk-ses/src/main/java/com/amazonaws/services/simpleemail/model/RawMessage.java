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
 * Represents the raw data of the message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/RawMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RawMessage implements Serializable, Cloneable {

    /**
     * <p>
     * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through
     * the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding
     * for you. In all cases, the client must ensure that the message format complies with Internet email standards
     * regarding email header fields, MIME types, and MIME encoding.
     * </p>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group list.
     * </p>
     * <p>
     * If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the raw
     * message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation
     * for <code>SendRawEmail</code>.
     * </p>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * </important>
     * <p>
     * For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.
     * </p>
     */
    private java.nio.ByteBuffer data;

    /**
     * Default constructor for RawMessage object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public RawMessage() {
    }

    /**
     * Constructs a new RawMessage object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param data
     *        The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly
     *        through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the
     *        base 64-encoding for you. In all cases, the client must ensure that the message format complies with
     *        Internet email standards regarding email header fields, MIME types, and MIME encoding.</p>
     *        <p>
     *        The To:, CC:, and BCC: headers in the raw message can contain a group list.
     *        </p>
     *        <p>
     *        If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the
     *        raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the
     *        documentation for <code>SendRawEmail</code>.
     *        </p>
     *        <important>
     *        <p>
     *        Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before
     *        sending the email.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, go to the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *        Guide</a>.
     */
    public RawMessage(java.nio.ByteBuffer data) {
        setData(data);
    }

    /**
     * <p>
     * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through
     * the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding
     * for you. In all cases, the client must ensure that the message format complies with Internet email standards
     * regarding email header fields, MIME types, and MIME encoding.
     * </p>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group list.
     * </p>
     * <p>
     * If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the raw
     * message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation
     * for <code>SendRawEmail</code>.
     * </p>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * </important>
     * <p>
     * For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.
     * </p>
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
     *        The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly
     *        through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the
     *        base 64-encoding for you. In all cases, the client must ensure that the message format complies with
     *        Internet email standards regarding email header fields, MIME types, and MIME encoding.</p>
     *        <p>
     *        The To:, CC:, and BCC: headers in the raw message can contain a group list.
     *        </p>
     *        <p>
     *        If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the
     *        raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the
     *        documentation for <code>SendRawEmail</code>.
     *        </p>
     *        <important>
     *        <p>
     *        Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before
     *        sending the email.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, go to the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *        Guide</a>.
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through
     * the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding
     * for you. In all cases, the client must ensure that the message format complies with Internet email standards
     * regarding email header fields, MIME types, and MIME encoding.
     * </p>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group list.
     * </p>
     * <p>
     * If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the raw
     * message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation
     * for <code>SendRawEmail</code>.
     * </p>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * </important>
     * <p>
     * For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly
     *         through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the
     *         base 64-encoding for you. In all cases, the client must ensure that the message format complies with
     *         Internet email standards regarding email header fields, MIME types, and MIME encoding.</p>
     *         <p>
     *         The To:, CC:, and BCC: headers in the raw message can contain a group list.
     *         </p>
     *         <p>
     *         If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the
     *         raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the
     *         documentation for <code>SendRawEmail</code>.
     *         </p>
     *         <important>
     *         <p>
     *         Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before
     *         sending the email.
     *         </p>
     *         </important>
     *         <p>
     *         For more information, go to the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *         Guide</a>.
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly through
     * the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the base 64-encoding
     * for you. In all cases, the client must ensure that the message format complies with Internet email standards
     * regarding email header fields, MIME types, and MIME encoding.
     * </p>
     * <p>
     * The To:, CC:, and BCC: headers in the raw message can contain a group list.
     * </p>
     * <p>
     * If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the raw
     * message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the documentation
     * for <code>SendRawEmail</code>.
     * </p>
     * <important>
     * <p>
     * Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before sending the
     * email.
     * </p>
     * </important>
     * <p>
     * For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.
     * </p>
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
     *        The raw data of the message. This data needs to base64-encoded if you are accessing Amazon SES directly
     *        through the HTTPS interface. If you are accessing Amazon SES using an AWS SDK, the SDK takes care of the
     *        base 64-encoding for you. In all cases, the client must ensure that the message format complies with
     *        Internet email standards regarding email header fields, MIME types, and MIME encoding.</p>
     *        <p>
     *        The To:, CC:, and BCC: headers in the raw message can contain a group list.
     *        </p>
     *        <p>
     *        If you are using <code>SendRawEmail</code> with sending authorization, you can include X-headers in the
     *        raw message to specify the "Source," "From," and "Return-Path" addresses. For more information, see the
     *        documentation for <code>SendRawEmail</code>.
     *        </p>
     *        <important>
     *        <p>
     *        Do not include these X-headers in the DKIM signature, because they are removed by Amazon SES before
     *        sending the email.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, go to the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer
     *        Guide</a>.
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

}
