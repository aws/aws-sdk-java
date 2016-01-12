/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request instructing the service to send a raw email message.
 * </p>
 * <p>
 * This datatype can be used in application code to compose a message consisting
 * of source, destination, and raw message text. This object can then be sent
 * using the <code>SendRawEmail</code> action.
 * </p>
 */
public class SendRawEmailRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <p>
     * By default, the string must be 7-bit ASCII. If the text must contain any
     * other characters, then you must use MIME encoded-word syntax (RFC 2047)
     * instead of a literal string. MIME encoded-word syntax uses the following
     * form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
     * <note>If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any <i>Return-Path</i> header
     * that you might include in the raw text of the message. </note>
     */
    private String source;
    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> destinations;
    /**
     * <p>
     * The raw text of the message. The client is responsible for ensuring the
     * following:
     * </p>
     * <p>
     * <ul>
     * <li>Message must contain a header and a body, separated by a blank line.</li>
     * <li>All required header fields must be present.</li>
     * <li>Each part of a multipart MIME message must be formatted properly.</li>
     * <li>MIME content types must be among those supported by Amazon SES. For
     * more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>Content must be base64-encoded, if MIME requires it.</li>
     * </ul>
     * </p>
     */
    private RawMessage rawMessage;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     */
    private String fromArn;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     */
    private String sourceArn;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     */
    private String returnPathArn;

    /**
     * Default constructor for SendRawEmailRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public SendRawEmailRequest() {
    }

    /**
     * Constructs a new SendRawEmailRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param rawMessage
     *        The raw text of the message. The client is responsible for
     *        ensuring the following:</p>
     *        <p>
     *        <ul>
     *        <li>Message must contain a header and a body, separated by a blank
     *        line.</li>
     *        <li>All required header fields must be present.</li>
     *        <li>Each part of a multipart MIME message must be formatted
     *        properly.</li>
     *        <li>MIME content types must be among those supported by Amazon
     *        SES. For more information, go to the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *        >Amazon SES Developer Guide</a>.</li>
     *        <li>Content must be base64-encoded, if MIME requires it.</li>
     *        </ul>
     */
    public SendRawEmailRequest(RawMessage rawMessage) {
        setRawMessage(rawMessage);
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <p>
     * By default, the string must be 7-bit ASCII. If the text must contain any
     * other characters, then you must use MIME encoded-word syntax (RFC 2047)
     * instead of a literal string. MIME encoded-word syntax uses the following
     * form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
     * <note>If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any <i>Return-Path</i> header
     * that you might include in the raw text of the message. </note>
     * 
     * @param source
     *        The identity's email address. If you do not provide a value for
     *        this parameter, you must specify a "From" address in the raw text
     *        of the message. (You can also specify both.)</p>
     *        <p>
     *        By default, the string must be 7-bit ASCII. If the text must
     *        contain any other characters, then you must use MIME encoded-word
     *        syntax (RFC 2047) instead of a literal string. MIME encoded-word
     *        syntax uses the following form:
     *        <code>=?charset?encoding?encoded-text?=</code>. For more
     *        information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>.
     *        </p>
     *        <note>If you specify the <code>Source</code> parameter and have
     *        feedback forwarding enabled, then bounces and complaints will be
     *        sent to this email address. This takes precedence over any
     *        <i>Return-Path</i> header that you might include in the raw text
     *        of the message.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <p>
     * By default, the string must be 7-bit ASCII. If the text must contain any
     * other characters, then you must use MIME encoded-word syntax (RFC 2047)
     * instead of a literal string. MIME encoded-word syntax uses the following
     * form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
     * <note>If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any <i>Return-Path</i> header
     * that you might include in the raw text of the message. </note>
     * 
     * @return The identity's email address. If you do not provide a value for
     *         this parameter, you must specify a "From" address in the raw text
     *         of the message. (You can also specify both.)</p>
     *         <p>
     *         By default, the string must be 7-bit ASCII. If the text must
     *         contain any other characters, then you must use MIME encoded-word
     *         syntax (RFC 2047) instead of a literal string. MIME encoded-word
     *         syntax uses the following form:
     *         <code>=?charset?encoding?encoded-text?=</code>. For more
     *         information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     *         2047</a>.
     *         </p>
     *         <note>If you specify the <code>Source</code> parameter and have
     *         feedback forwarding enabled, then bounces and complaints will be
     *         sent to this email address. This takes precedence over any
     *         <i>Return-Path</i> header that you might include in the raw text
     *         of the message.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.)
     * </p>
     * <p>
     * By default, the string must be 7-bit ASCII. If the text must contain any
     * other characters, then you must use MIME encoded-word syntax (RFC 2047)
     * instead of a literal string. MIME encoded-word syntax uses the following
     * form: <code>=?charset?encoding?encoded-text?=</code>. For more
     * information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     * 2047</a>.
     * </p>
     * <note>If you specify the <code>Source</code> parameter and have feedback
     * forwarding enabled, then bounces and complaints will be sent to this
     * email address. This takes precedence over any <i>Return-Path</i> header
     * that you might include in the raw text of the message. </note>
     * 
     * @param source
     *        The identity's email address. If you do not provide a value for
     *        this parameter, you must specify a "From" address in the raw text
     *        of the message. (You can also specify both.)</p>
     *        <p>
     *        By default, the string must be 7-bit ASCII. If the text must
     *        contain any other characters, then you must use MIME encoded-word
     *        syntax (RFC 2047) instead of a literal string. MIME encoded-word
     *        syntax uses the following form:
     *        <code>=?charset?encoding?encoded-text?=</code>. For more
     *        information, see <a href="http://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>.
     *        </p>
     *        <note>If you specify the <code>Source</code> parameter and have
     *        feedback forwarding enabled, then bounces and complaints will be
     *        sent to this email address. This takes precedence over any
     *        <i>Return-Path</i> header that you might include in the raw text
     *        of the message.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     * 
     * @return A list of destinations for the message, consisting of To:, CC:,
     *         and BCC: addresses.
     */
    public java.util.List<String> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return destinations;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     * 
     * @param destinations
     *        A list of destinations for the message, consisting of To:, CC:,
     *        and BCC: addresses.
     */
    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<String>(
                destinations);
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDestinations(java.util.Collection)} or
     * {@link #withDestinations(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of destinations for the message, consisting of To:, CC:,
     *        and BCC: addresses.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withDestinations(String... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<String>(
                    destinations.length));
        }
        for (String ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of destinations for the message, consisting of To:, CC:, and BCC:
     * addresses.
     * </p>
     * 
     * @param destinations
     *        A list of destinations for the message, consisting of To:, CC:,
     *        and BCC: addresses.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withDestinations(
            java.util.Collection<String> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * The raw text of the message. The client is responsible for ensuring the
     * following:
     * </p>
     * <p>
     * <ul>
     * <li>Message must contain a header and a body, separated by a blank line.</li>
     * <li>All required header fields must be present.</li>
     * <li>Each part of a multipart MIME message must be formatted properly.</li>
     * <li>MIME content types must be among those supported by Amazon SES. For
     * more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>Content must be base64-encoded, if MIME requires it.</li>
     * </ul>
     * </p>
     * 
     * @param rawMessage
     *        The raw text of the message. The client is responsible for
     *        ensuring the following:</p>
     *        <p>
     *        <ul>
     *        <li>Message must contain a header and a body, separated by a blank
     *        line.</li>
     *        <li>All required header fields must be present.</li>
     *        <li>Each part of a multipart MIME message must be formatted
     *        properly.</li>
     *        <li>MIME content types must be among those supported by Amazon
     *        SES. For more information, go to the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *        >Amazon SES Developer Guide</a>.</li>
     *        <li>Content must be base64-encoded, if MIME requires it.</li>
     *        </ul>
     */
    public void setRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
    }

    /**
     * <p>
     * The raw text of the message. The client is responsible for ensuring the
     * following:
     * </p>
     * <p>
     * <ul>
     * <li>Message must contain a header and a body, separated by a blank line.</li>
     * <li>All required header fields must be present.</li>
     * <li>Each part of a multipart MIME message must be formatted properly.</li>
     * <li>MIME content types must be among those supported by Amazon SES. For
     * more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>Content must be base64-encoded, if MIME requires it.</li>
     * </ul>
     * </p>
     * 
     * @return The raw text of the message. The client is responsible for
     *         ensuring the following:</p>
     *         <p>
     *         <ul>
     *         <li>Message must contain a header and a body, separated by a
     *         blank line.</li>
     *         <li>All required header fields must be present.</li>
     *         <li>Each part of a multipart MIME message must be formatted
     *         properly.</li>
     *         <li>MIME content types must be among those supported by Amazon
     *         SES. For more information, go to the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *         >Amazon SES Developer Guide</a>.</li>
     *         <li>Content must be base64-encoded, if MIME requires it.</li>
     *         </ul>
     */
    public RawMessage getRawMessage() {
        return this.rawMessage;
    }

    /**
     * <p>
     * The raw text of the message. The client is responsible for ensuring the
     * following:
     * </p>
     * <p>
     * <ul>
     * <li>Message must contain a header and a body, separated by a blank line.</li>
     * <li>All required header fields must be present.</li>
     * <li>Each part of a multipart MIME message must be formatted properly.</li>
     * <li>MIME content types must be among those supported by Amazon SES. For
     * more information, go to the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     * >Amazon SES Developer Guide</a>.</li>
     * <li>Content must be base64-encoded, if MIME requires it.</li>
     * </ul>
     * </p>
     * 
     * @param rawMessage
     *        The raw text of the message. The client is responsible for
     *        ensuring the following:</p>
     *        <p>
     *        <ul>
     *        <li>Message must contain a header and a body, separated by a blank
     *        line.</li>
     *        <li>All required header fields must be present.</li>
     *        <li>Each part of a multipart MIME message must be formatted
     *        properly.</li>
     *        <li>MIME content types must be among those supported by Amazon
     *        SES. For more information, go to the <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html"
     *        >Amazon SES Developer Guide</a>.</li>
     *        <li>Content must be base64-encoded, if MIME requires it.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withRawMessage(RawMessage rawMessage) {
        setRawMessage(rawMessage);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @param fromArn
     *        This parameter is used only for sending authorization. It is the
     *        ARN of the identity that is associated with the sending
     *        authorization policy that permits you to specify a particular
     *        "From" address in the header of the raw email.</p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header
     *        <code>X-SES-FROM-ARN</code> in the raw message of the email. If
     *        you use both the <code>FromArn</code> parameter and the
     *        corresponding X-header, Amazon SES uses the value of the
     *        <code>FromArn</code> parameter.
     *        </p>
     *        <note>For information about when to use this parameter, see the
     *        description of <code>SendRawEmail</code> in this guide, or see the
     *        <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     */
    public void setFromArn(String fromArn) {
        this.fromArn = fromArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @return This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to specify a particular
     *         "From" address in the header of the raw email.</p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header
     *         <code>X-SES-FROM-ARN</code> in the raw message of the email. If
     *         you use both the <code>FromArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>FromArn</code> parameter.
     *         </p>
     *         <note>For information about when to use this parameter, see the
     *         description of <code>SendRawEmail</code> in this guide, or see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     */
    public String getFromArn() {
        return this.fromArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to specify a particular "From" address in the header of
     * the raw email.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-FROM-ARN</code> in the raw message of the email. If you use
     * both the <code>FromArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>FromArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @param fromArn
     *        This parameter is used only for sending authorization. It is the
     *        ARN of the identity that is associated with the sending
     *        authorization policy that permits you to specify a particular
     *        "From" address in the header of the raw email.</p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header
     *        <code>X-SES-FROM-ARN</code> in the raw message of the email. If
     *        you use both the <code>FromArn</code> parameter and the
     *        corresponding X-header, Amazon SES uses the value of the
     *        <code>FromArn</code> parameter.
     *        </p>
     *        <note>For information about when to use this parameter, see the
     *        description of <code>SendRawEmail</code> in this guide, or see the
     *        <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withFromArn(String fromArn) {
        setFromArn(fromArn);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @param sourceArn
     *        This parameter is used only for sending authorization. It is the
     *        ARN of the identity that is associated with the sending
     *        authorization policy that permits you to send for the email
     *        address specified in the <code>Source</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has
     *        ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        ) attaches a policy to it that authorizes you to send from
     *        <code>user@example.com</code>, then you would specify the
     *        <code>SourceArn</code> to be
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        , and the <code>Source</code> to be <code>user@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header
     *        <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If
     *        you use both the <code>SourceArn</code> parameter and the
     *        corresponding X-header, Amazon SES uses the value of the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <note>For information about when to use this parameter, see the
     *        description of <code>SendRawEmail</code> in this guide, or see the
     *        <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @return This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to send for the email
     *         address specified in the <code>Source</code> parameter.</p>
     *         <p>
     *         For example, if the owner of <code>example.com</code> (which has
     *         ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         ) attaches a policy to it that authorizes you to send from
     *         <code>user@example.com</code>, then you would specify the
     *         <code>SourceArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         , and the <code>Source</code> to be <code>user@example.com</code>
     *         .
     *         </p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header
     *         <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If
     *         you use both the <code>SourceArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>SourceArn</code> parameter.
     *         </p>
     *         <note>For information about when to use this parameter, see the
     *         description of <code>SendRawEmail</code> in this guide, or see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to send for the email address specified in the
     * <code>Source</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>Source</code> to be <code>user@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you use
     * both the <code>SourceArn</code> parameter and the corresponding X-header,
     * Amazon SES uses the value of the <code>SourceArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @param sourceArn
     *        This parameter is used only for sending authorization. It is the
     *        ARN of the identity that is associated with the sending
     *        authorization policy that permits you to send for the email
     *        address specified in the <code>Source</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has
     *        ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        ) attaches a policy to it that authorizes you to send from
     *        <code>user@example.com</code>, then you would specify the
     *        <code>SourceArn</code> to be
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        , and the <code>Source</code> to be <code>user@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header
     *        <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If
     *        you use both the <code>SourceArn</code> parameter and the
     *        corresponding X-header, Amazon SES uses the value of the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <note>For information about when to use this parameter, see the
     *        description of <code>SendRawEmail</code> in this guide, or see the
     *        <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @param returnPathArn
     *        This parameter is used only for sending authorization. It is the
     *        ARN of the identity that is associated with the sending
     *        authorization policy that permits you to use the email address
     *        specified in the <code>ReturnPath</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has
     *        ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        ) attaches a policy to it that authorizes you to use
     *        <code>feedback@example.com</code>, then you would specify the
     *        <code>ReturnPathArn</code> to be
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        , and the <code>ReturnPath</code> to be
     *        <code>feedback@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header
     *        <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the
     *        email. If you use both the <code>ReturnPathArn</code> parameter
     *        and the corresponding X-header, Amazon SES uses the value of the
     *        <code>ReturnPathArn</code> parameter.
     *        </p>
     *        <note>For information about when to use this parameter, see the
     *        description of <code>SendRawEmail</code> in this guide, or see the
     *        <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     */
    public void setReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @return This parameter is used only for sending authorization. It is the
     *         ARN of the identity that is associated with the sending
     *         authorization policy that permits you to use the email address
     *         specified in the <code>ReturnPath</code> parameter.</p>
     *         <p>
     *         For example, if the owner of <code>example.com</code> (which has
     *         ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         ) attaches a policy to it that authorizes you to use
     *         <code>feedback@example.com</code>, then you would specify the
     *         <code>ReturnPathArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         , and the <code>ReturnPath</code> to be
     *         <code>feedback@example.com</code>.
     *         </p>
     *         <p>
     *         Instead of using this parameter, you can use the X-header
     *         <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the
     *         email. If you use both the <code>ReturnPathArn</code> parameter
     *         and the corresponding X-header, Amazon SES uses the value of the
     *         <code>ReturnPathArn</code> parameter.
     *         </p>
     *         <note>For information about when to use this parameter, see the
     *         description of <code>SendRawEmail</code> in this guide, or see
     *         the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *         >Amazon SES Developer Guide</a>.
     */
    public String getReturnPathArn() {
        return this.returnPathArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of
     * the identity that is associated with the sending authorization policy
     * that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>, and
     * the <code>ReturnPath</code> to be <code>feedback@example.com</code>.
     * </p>
     * <p>
     * Instead of using this parameter, you can use the X-header
     * <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the email. If
     * you use both the <code>ReturnPathArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>ReturnPathArn</code> parameter.
     * </p>
     * <note>For information about when to use this parameter, see the
     * description of <code>SendRawEmail</code> in this guide, or see the <a
     * href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     * >Amazon SES Developer Guide</a>. </note>
     * 
     * @param returnPathArn
     *        This parameter is used only for sending authorization. It is the
     *        ARN of the identity that is associated with the sending
     *        authorization policy that permits you to use the email address
     *        specified in the <code>ReturnPath</code> parameter.</p>
     *        <p>
     *        For example, if the owner of <code>example.com</code> (which has
     *        ARN
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        ) attaches a policy to it that authorizes you to use
     *        <code>feedback@example.com</code>, then you would specify the
     *        <code>ReturnPathArn</code> to be
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *        , and the <code>ReturnPath</code> to be
     *        <code>feedback@example.com</code>.
     *        </p>
     *        <p>
     *        Instead of using this parameter, you can use the X-header
     *        <code>X-SES-RETURN-PATH-ARN</code> in the raw message of the
     *        email. If you use both the <code>ReturnPathArn</code> parameter
     *        and the corresponding X-header, Amazon SES uses the value of the
     *        <code>ReturnPathArn</code> parameter.
     *        </p>
     *        <note>For information about when to use this parameter, see the
     *        description of <code>SendRawEmail</code> in this guide, or see the
     *        <a href=
     *        "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html"
     *        >Amazon SES Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public SendRawEmailRequest withReturnPathArn(String returnPathArn) {
        setReturnPathArn(returnPathArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Source: " + getSource() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getRawMessage() != null)
            sb.append("RawMessage: " + getRawMessage() + ",");
        if (getFromArn() != null)
            sb.append("FromArn: " + getFromArn() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getReturnPathArn() != null)
            sb.append("ReturnPathArn: " + getReturnPathArn());
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
        if (other.getSource() != null
                && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getRawMessage() == null ^ this.getRawMessage() == null)
            return false;
        if (other.getRawMessage() != null
                && other.getRawMessage().equals(this.getRawMessage()) == false)
            return false;
        if (other.getFromArn() == null ^ this.getFromArn() == null)
            return false;
        if (other.getFromArn() != null
                && other.getFromArn().equals(this.getFromArn()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReturnPathArn() == null ^ this.getReturnPathArn() == null)
            return false;
        if (other.getReturnPathArn() != null
                && other.getReturnPathArn().equals(this.getReturnPathArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinations() == null) ? 0 : getDestinations()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRawMessage() == null) ? 0 : getRawMessage().hashCode());
        hashCode = prime * hashCode
                + ((getFromArn() == null) ? 0 : getFromArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnPathArn() == null) ? 0 : getReturnPathArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public SendRawEmailRequest clone() {
        return (SendRawEmailRequest) super.clone();
    }
}