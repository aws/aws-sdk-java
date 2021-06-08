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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/BulkEmailEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkEmailEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain part of
     * an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as
     * described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     */
    private Destination destination;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you define,
     * so that you can publish email sending events.
     * </p>
     */
    private java.util.List<MessageTag> replacementTags;
    /**
     * <p>
     * The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     * </p>
     */
    private ReplacementEmailContent replacementEmailContent;

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain part of
     * an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as
     * described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     * 
     * @param destination
     *        Represents the destination of the message, consisting of To:, CC:, and BCC: fields.</p> <note>
     *        <p>
     *        Amazon SES does not support the SMTPUTF8 extension, as described in <a
     *        href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination
     *        email address (the part of the email address that precedes the @ sign) may only contain <a
     *        href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain
     *        part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     *        Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *        </p>
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain part of
     * an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as
     * described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     * 
     * @return Represents the destination of the message, consisting of To:, CC:, and BCC: fields.</p> <note>
     *         <p>
     *         Amazon SES does not support the SMTPUTF8 extension, as described in <a
     *         href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination
     *         email address (the part of the email address that precedes the @ sign) may only contain <a
     *         href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain
     *         part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     *         Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *         </p>
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain part of
     * an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as
     * described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     * </p>
     * </note>
     * 
     * @param destination
     *        Represents the destination of the message, consisting of To:, CC:, and BCC: fields.</p> <note>
     *        <p>
     *        Amazon SES does not support the SMTPUTF8 extension, as described in <a
     *        href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the local part of a destination
     *        email address (the part of the email address that precedes the @ sign) may only contain <a
     *        href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the domain
     *        part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     *        Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailEntry withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you define,
     * so that you can publish email sending events.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *         <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you
     *         define, so that you can publish email sending events.
     */

    public java.util.List<MessageTag> getReplacementTags() {
        return replacementTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you define,
     * so that you can publish email sending events.
     * </p>
     * 
     * @param replacementTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *        <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you
     *        define, so that you can publish email sending events.
     */

    public void setReplacementTags(java.util.Collection<MessageTag> replacementTags) {
        if (replacementTags == null) {
            this.replacementTags = null;
            return;
        }

        this.replacementTags = new java.util.ArrayList<MessageTag>(replacementTags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you define,
     * so that you can publish email sending events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplacementTags(java.util.Collection)} or {@link #withReplacementTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replacementTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *        <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you
     *        define, so that you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailEntry withReplacementTags(MessageTag... replacementTags) {
        if (this.replacementTags == null) {
            setReplacementTags(new java.util.ArrayList<MessageTag>(replacementTags.length));
        }
        for (MessageTag ele : replacementTags) {
            this.replacementTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you define,
     * so that you can publish email sending events.
     * </p>
     * 
     * @param replacementTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *        <code>SendBulkTemplatedEmail</code> operation. Tags correspond to characteristics of the email that you
     *        define, so that you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailEntry withReplacementTags(java.util.Collection<MessageTag> replacementTags) {
        setReplacementTags(replacementTags);
        return this;
    }

    /**
     * <p>
     * The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     * </p>
     * 
     * @param replacementEmailContent
     *        The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     */

    public void setReplacementEmailContent(ReplacementEmailContent replacementEmailContent) {
        this.replacementEmailContent = replacementEmailContent;
    }

    /**
     * <p>
     * The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     * </p>
     * 
     * @return The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     */

    public ReplacementEmailContent getReplacementEmailContent() {
        return this.replacementEmailContent;
    }

    /**
     * <p>
     * The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     * </p>
     * 
     * @param replacementEmailContent
     *        The <code>ReplacementEmailContent</code> associated with a <code>BulkEmailEntry</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailEntry withReplacementEmailContent(ReplacementEmailContent replacementEmailContent) {
        setReplacementEmailContent(replacementEmailContent);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getReplacementTags() != null)
            sb.append("ReplacementTags: ").append(getReplacementTags()).append(",");
        if (getReplacementEmailContent() != null)
            sb.append("ReplacementEmailContent: ").append(getReplacementEmailContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkEmailEntry == false)
            return false;
        BulkEmailEntry other = (BulkEmailEntry) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getReplacementTags() == null ^ this.getReplacementTags() == null)
            return false;
        if (other.getReplacementTags() != null && other.getReplacementTags().equals(this.getReplacementTags()) == false)
            return false;
        if (other.getReplacementEmailContent() == null ^ this.getReplacementEmailContent() == null)
            return false;
        if (other.getReplacementEmailContent() != null && other.getReplacementEmailContent().equals(this.getReplacementEmailContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getReplacementTags() == null) ? 0 : getReplacementTags().hashCode());
        hashCode = prime * hashCode + ((getReplacementEmailContent() == null) ? 0 : getReplacementEmailContent().hashCode());
        return hashCode;
    }

    @Override
    public BulkEmailEntry clone() {
        try {
            return (BulkEmailEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.BulkEmailEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
