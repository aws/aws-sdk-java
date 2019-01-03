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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to send a single raw email using Amazon SES. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendRawEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendRawEmailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address
     * in the raw text of the message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * <p>
     * If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     * complaints will be sent to this email address. This takes precedence over any Return-Path header that you might
     * include in the raw text of the message.
     * </p>
     */
    private String source;
    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinations;
    /**
     * <p>
     * The raw email message itself. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank line.
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
     * Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment Types</a> in
     * the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we
     * highly recommend that you encode that content. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of each line
     * of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     */
    private RawMessage rawMessage;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to specify a particular "From" address in the header of the raw
     * email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     */
    private String fromArn;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to send for the email address specified in the <code>Source</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to send from <code>user@example.com</code>, then you would specify the <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>Source</code> to be
     * <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw message of the
     * email. If you use both the <code>SourceArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     */
    private String sourceArn;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the <code>ReturnPath</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to use <code>feedback@example.com</code>, then you would specify the <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw message
     * of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding X-header, Amazon SES
     * uses the value of the <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     */
    private String returnPathArn;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MessageTag> tags;
    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     * </p>
     */
    private String configurationSetName;

    /**
     * Default constructor for SendRawEmailRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public SendRawEmailRequest() {
    }

    /**
     * Constructs a new SendRawEmailRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param rawMessage
     *        The raw email message itself. The message has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The message has to contain a header and a body, separated by a blank line.
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
     *        Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types,
     *        see <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment
     *        Types</a> in the <i>Amazon SES Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The entire message must be base64-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *        range, we highly recommend that you encode that content. For more information, see <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in
     *        the <i>Amazon SES Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of
     *        each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *        </p>
     *        </li>
     */
    public SendRawEmailRequest(RawMessage rawMessage) {
        setRawMessage(rawMessage);
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address
     * in the raw text of the message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * <p>
     * If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     * complaints will be sent to this email address. This takes precedence over any Return-Path header that you might
     * include in the raw text of the message.
     * </p>
     * 
     * @param source
     *        The identity's email address. If you do not provide a value for this parameter, you must specify a "From"
     *        address in the raw text of the message. (You can also specify both.)</p> <note>
     *        <p>
     *        Amazon SES does not support the SMTPUTF8 extension, as described in<a
     *        href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source
     *        email address (the part of the email address that precedes the @ sign) may only contain <a
     *        href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     *        part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded
     *        using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     *        name (also known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be
     *        encoded using MIME encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>. MIME encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>
     *        .
     *        </p>
     *        </note>
     *        <p>
     *        If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     *        complaints will be sent to this email address. This takes precedence over any Return-Path header that you
     *        might include in the raw text of the message.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address
     * in the raw text of the message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * <p>
     * If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     * complaints will be sent to this email address. This takes precedence over any Return-Path header that you might
     * include in the raw text of the message.
     * </p>
     * 
     * @return The identity's email address. If you do not provide a value for this parameter, you must specify a "From"
     *         address in the raw text of the message. (You can also specify both.)</p> <note>
     *         <p>
     *         Amazon SES does not support the SMTPUTF8 extension, as described in<a
     *         href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a
     *         source email address (the part of the email address that precedes the @ sign) may only contain <a
     *         href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the
     *         <i>domain part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be
     *         encoded using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *         The sender name (also known as the <i>friendly name</i>) may contain non-ASCII characters. These
     *         characters must be encoded using MIME encoded-word syntax, as described in <a
     *         href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME encoded-word syntax uses the following
     *         form: <code>=?charset?encoding?encoded-text?=</code>.
     *         </p>
     *         </note>
     *         <p>
     *         If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     *         complaints will be sent to this email address. This takes precedence over any Return-Path header that you
     *         might include in the raw text of the message.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this parameter, you must specify a "From" address
     * in the raw text of the message. (You can also specify both.)
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in<a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * <p>
     * If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     * complaints will be sent to this email address. This takes precedence over any Return-Path header that you might
     * include in the raw text of the message.
     * </p>
     * 
     * @param source
     *        The identity's email address. If you do not provide a value for this parameter, you must specify a "From"
     *        address in the raw text of the message. (You can also specify both.)</p> <note>
     *        <p>
     *        Amazon SES does not support the SMTPUTF8 extension, as described in<a
     *        href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source
     *        email address (the part of the email address that precedes the @ sign) may only contain <a
     *        href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     *        part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded
     *        using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     *        name (also known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be
     *        encoded using MIME encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>. MIME encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>
     *        .
     *        </p>
     *        </note>
     *        <p>
     *        If you specify the <code>Source</code> parameter and have feedback forwarding enabled, then bounces and
     *        complaints will be sent to this email address. This takes precedence over any Return-Path header that you
     *        might include in the raw text of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * </p>
     * 
     * @return A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     */

    public java.util.List<String> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinations;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * </p>
     * 
     * @param destinations
     *        A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     */

    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<String>(destinations);
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withDestinations(String... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<String>(destinations.length));
        }
        for (String ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * </p>
     * 
     * @param destinations
     *        A list of destinations for the message, consisting of To:, CC:, and BCC: addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withDestinations(java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The raw email message itself. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank line.
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
     * Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment Types</a> in
     * the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we
     * highly recommend that you encode that content. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of each line
     * of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rawMessage
     *        The raw email message itself. The message has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The message has to contain a header and a body, separated by a blank line.
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
     *        Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types,
     *        see <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment
     *        Types</a> in the <i>Amazon SES Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The entire message must be base64-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *        range, we highly recommend that you encode that content. For more information, see <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in
     *        the <i>Amazon SES Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of
     *        each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *        </p>
     *        </li>
     */

    public void setRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
    }

    /**
     * <p>
     * The raw email message itself. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank line.
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
     * Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment Types</a> in
     * the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we
     * highly recommend that you encode that content. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of each line
     * of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The raw email message itself. The message has to meet the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The message has to contain a header and a body, separated by a blank line.
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
     *         Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types,
     *         see <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment
     *         Types</a> in the <i>Amazon SES Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The entire message must be base64-encoded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *         range, we highly recommend that you encode that content. For more information, see <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in
     *         the <i>Amazon SES Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of
     *         each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *         </p>
     *         </li>
     */

    public RawMessage getRawMessage() {
        return this.rawMessage;
    }

    /**
     * <p>
     * The raw email message itself. The message has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The message has to contain a header and a body, separated by a blank line.
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
     * Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment Types</a> in
     * the <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The entire message must be base64-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character range, we
     * highly recommend that you encode that content. For more information, see <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in the
     * <i>Amazon SES Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of each line
     * of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rawMessage
     *        The raw email message itself. The message has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The message has to contain a header and a body, separated by a blank line.
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
     *        Attachments must be of a content type that Amazon SES supports. For a list on unsupported content types,
     *        see <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Unsupported Attachment
     *        Types</a> in the <i>Amazon SES Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The entire message must be base64-encoded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If any of the MIME parts in your message contain content that is outside of the 7-bit ASCII character
     *        range, we highly recommend that you encode that content. For more information, see <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-raw.html">Sending Raw Email</a> in
     *        the <i>Amazon SES Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Per <a href="https://tools.ietf.org/html/rfc5321#section-4.5.3.1.6">RFC 5321</a>, the maximum length of
     *        each line of text, including the &lt;CRLF&gt;, must not exceed 1,000 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withRawMessage(RawMessage rawMessage) {
        setRawMessage(rawMessage);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to specify a particular "From" address in the header of the raw
     * email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @param fromArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to specify a particular "From" address in the
     *        header of the raw email.</p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message
     *        of the email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon
     *        SES uses the value of the <code>FromArn</code> parameter.
     *        </p>
     *        <note>
     *        <p>
     *        For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this
     *        guide, or see the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     *        </p>
     */

    public void setFromArn(String fromArn) {
        this.fromArn = fromArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to specify a particular "From" address in the header of the raw
     * email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to specify a particular "From" address in the
     *         header of the raw email.</p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message
     *         of the email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon
     *         SES uses the value of the <code>FromArn</code> parameter.
     *         </p>
     *         <note>
     *         <p>
     *         For information about when to use this parameter, see the description of <code>SendRawEmail</code> in
     *         this guide, or see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */

    public String getFromArn() {
        return this.fromArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to specify a particular "From" address in the header of the raw
     * email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>FromArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @param fromArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to specify a particular "From" address in the
     *        header of the raw email.</p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header <code>X-SES-FROM-ARN</code> in the raw message
     *        of the email. If you use both the <code>FromArn</code> parameter and the corresponding X-header, Amazon
     *        SES uses the value of the <code>FromArn</code> parameter.
     *        </p>
     *        <note>
     *        <p>
     *        For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this
     *        guide, or see the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withFromArn(String fromArn) {
        setFromArn(fromArn);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to send for the email address specified in the <code>Source</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to send from <code>user@example.com</code>, then you would specify the <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>Source</code> to be
     * <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw message of the
     * email. If you use both the <code>SourceArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @param sourceArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to send for the email address specified in the
     *        <code>Source</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that
     *        authorizes you to send from <code>user@example.com</code>, then you would specify the
     *        <code>SourceArn</code> to be <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the
     *        <code>Source</code> to be <code>user@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw message
     *        of the email. If you use both the <code>SourceArn</code> parameter and the corresponding X-header, Amazon
     *        SES uses the value of the <code>SourceArn</code> parameter.
     *        </p>
     *        <note>
     *        <p>
     *        For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this
     *        guide, or see the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     *        </p>
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to send for the email address specified in the <code>Source</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to send from <code>user@example.com</code>, then you would specify the <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>Source</code> to be
     * <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw message of the
     * email. If you use both the <code>SourceArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to send for the email address specified in the
     *         <code>Source</code> parameter.</p>
     *         <p>
     *         For example, if the owner of <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that
     *         authorizes you to send from <code>user@example.com</code>, then you would specify the
     *         <code>SourceArn</code> to be <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     *         the <code>Source</code> to be <code>user@example.com</code>.
     *         </p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw
     *         message of the email. If you use both the <code>SourceArn</code> parameter and the corresponding
     *         X-header, Amazon SES uses the value of the <code>SourceArn</code> parameter.
     *         </p>
     *         <note>
     *         <p>
     *         For information about when to use this parameter, see the description of <code>SendRawEmail</code> in
     *         this guide, or see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to send for the email address specified in the <code>Source</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to send from <code>user@example.com</code>, then you would specify the <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>Source</code> to be
     * <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw message of the
     * email. If you use both the <code>SourceArn</code> parameter and the corresponding X-header, Amazon SES uses the
     * value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @param sourceArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to send for the email address specified in the
     *        <code>Source</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that
     *        authorizes you to send from <code>user@example.com</code>, then you would specify the
     *        <code>SourceArn</code> to be <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the
     *        <code>Source</code> to be <code>user@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header <code>X-SES-SOURCE-ARN</code> in the raw message
     *        of the email. If you use both the <code>SourceArn</code> parameter and the corresponding X-header, Amazon
     *        SES uses the value of the <code>SourceArn</code> parameter.
     *        </p>
     *        <note>
     *        <p>
     *        For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this
     *        guide, or see the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the <code>ReturnPath</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to use <code>feedback@example.com</code>, then you would specify the <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw message
     * of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding X-header, Amazon SES
     * uses the value of the <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @param returnPathArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the email address specified in the
     *        <code>ReturnPath</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that
     *        authorizes you to use <code>feedback@example.com</code>, then you would specify the
     *        <code>ReturnPathArn</code> to be <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     *        the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     *        message of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding
     *        X-header, Amazon SES uses the value of the <code>ReturnPathArn</code> parameter.
     *        </p>
     *        <note>
     *        <p>
     *        For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this
     *        guide, or see the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     *        </p>
     */

    public void setReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the <code>ReturnPath</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to use <code>feedback@example.com</code>, then you would specify the <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw message
     * of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding X-header, Amazon SES
     * uses the value of the <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to use the email address specified in the
     *         <code>ReturnPath</code> parameter.</p>
     *         <p>
     *         For example, if the owner of <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that
     *         authorizes you to use <code>feedback@example.com</code>, then you would specify the
     *         <code>ReturnPathArn</code> to be <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     *         </p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     *         message of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding
     *         X-header, Amazon SES uses the value of the <code>ReturnPathArn</code> parameter.
     *         </p>
     *         <note>
     *         <p>
     *         For information about when to use this parameter, see the description of <code>SendRawEmail</code> in
     *         this guide, or see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */

    public String getReturnPathArn() {
        return this.returnPathArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the <code>ReturnPath</code>
     * parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that authorizes you
     * to use <code>feedback@example.com</code>, then you would specify the <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw message
     * of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding X-header, Amazon SES
     * uses the value of the <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>
     * <p>
     * For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this guide,
     * or see the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * </note>
     * 
     * @param returnPathArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the email address specified in the
     *        <code>ReturnPath</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>) attaches a policy to it that
     *        authorizes you to use <code>feedback@example.com</code>, then you would specify the
     *        <code>ReturnPathArn</code> to be <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     *        the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     *        message of the email. If you use both the <code>ReturnPathArn</code> parameter and the corresponding
     *        X-header, Amazon SES uses the value of the <code>ReturnPathArn</code> parameter.
     *        </p>
     *        <note>
     *        <p>
     *        For information about when to use this parameter, see the description of <code>SendRawEmail</code> in this
     *        guide, or see the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withReturnPathArn(String returnPathArn) {
        setReturnPathArn(returnPathArn);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *         <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     *         can publish email sending events.
     */

    public java.util.List<MessageTag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<MessageTag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * 
     * @param tags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     *        can publish email sending events.
     */

    public void setTags(java.util.Collection<MessageTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<MessageTag>(tags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     *        can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withTags(MessageTag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<MessageTag>(tags.length));
        }
        for (MessageTag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * 
     * @param tags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendRawEmail</code>. Tags correspond to characteristics of the email that you define, so that you
     *        can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withTags(java.util.Collection<MessageTag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     * </p>
     * 
     * @return The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use when you send an email using <code>SendRawEmail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendRawEmailRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getRawMessage() != null)
            sb.append("RawMessage: ").append(getRawMessage()).append(",");
        if (getFromArn() != null)
            sb.append("FromArn: ").append(getFromArn()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getReturnPathArn() != null)
            sb.append("ReturnPathArn: ").append(getReturnPathArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendRawEmailRequest == false)
            return false;
        SendRawEmailRequest other = (SendRawEmailRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getRawMessage() == null ^ this.getRawMessage() == null)
            return false;
        if (other.getRawMessage() != null && other.getRawMessage().equals(this.getRawMessage()) == false)
            return false;
        if (other.getFromArn() == null ^ this.getFromArn() == null)
            return false;
        if (other.getFromArn() != null && other.getFromArn().equals(this.getFromArn()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReturnPathArn() == null ^ this.getReturnPathArn() == null)
            return false;
        if (other.getReturnPathArn() != null && other.getReturnPathArn().equals(this.getReturnPathArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getRawMessage() == null) ? 0 : getRawMessage().hashCode());
        hashCode = prime * hashCode + ((getFromArn() == null) ? 0 : getFromArn().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getReturnPathArn() == null) ? 0 : getReturnPathArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public SendRawEmailRequest clone() {
        return (SendRawEmailRequest) super.clone();
    }

}
