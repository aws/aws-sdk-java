/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendRawEmail(SendRawEmailRequest) SendRawEmail operation}.
 * <p>
 * Sends an email message, with header and content specified by the
 * client. The <code>SendRawEmail</code> action is useful for sending
 * multipart MIME emails. The raw text of the message must comply with
 * Internet email standards; otherwise, the message cannot be sent.
 * </p>
 * <p>
 * There are several important points to know about
 * <code>SendRawEmail</code> :
 * </p>
 * 
 * <ul>
 * <li>You can only send email from verified email addresses and
 * domains; otherwise, you will get an "Email address not verified"
 * error. If your account is still in the Amazon SES sandbox, you must
 * also verify every recipient email address except for the recipients
 * provided by the Amazon SES mailbox simulator. For more information, go
 * to the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html"> Amazon SES Developer Guide </a>
 * .</li>
 * <li>The total size of the message cannot exceed 10 MB. This includes
 * any attachments that are part of the message.</li>
 * <li>Amazon SES has a limit on the total number of recipients per
 * message. The combined number of To:, CC: and BCC: email addresses
 * cannot exceed 50. If you need to send an email message to a larger
 * audience, you can divide your recipient list into groups of 50 or
 * fewer, and then call Amazon SES repeatedly to send the message to each
 * group.</li>
 * <li>The To:, CC:, and BCC: headers in the raw message can contain a
 * group list. Note that each recipient in a group list counts towards
 * the 50-recipient limit.</li>
 * <li>For every message that you send, the total number of recipients
 * (To:, CC: and BCC:) is counted against your sending quota - the
 * maximum number of emails you can send in a 24-hour period. For
 * information about your sending quota, go to the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/manage-sending-limits.html"> Amazon SES Developer Guide </a>
 * .</li>
 * <li>If you are using sending authorization to send on behalf of
 * another user, <code>SendRawEmail</code> enables you to specify the
 * cross-account identity for the email's "Source," "From," and
 * "Return-Path" parameters in one of two ways: you can pass optional
 * parameters <code>SourceArn</code> ,
 * <code>FromArn</code> , and/or
 * <code>ReturnPathArn</code> to the API, or you can include the
 * following X-headers in the header of your raw email:
 * <ul>
 * <li> <code>X-SES-SOURCE-ARN</code> </li>
 * <li> <code>X-SES-FROM-ARN</code> </li>
 * <li> <code>X-SES-RETURN-PATH-ARN</code> </li>
 * 
 * </ul>
 * <p>
 * <b>IMPORTANT:</b>Do not include these X-headers in the DKIM signature,
 * because they are removed by Amazon SES before sending the email.
 * </p>
 * For the most common sending authorization use case, we recommend that
 * you specify the <code>SourceIdentityArn</code> and do not specify
 * either the <code>FromIdentityArn</code> or
 * <code>ReturnPathIdentityArn</code> . (The same note applies to the
 * corresponding X-headers.) If you only specify the
 * <code>SourceIdentityArn</code> , Amazon SES will simply set the "From"
 * address and the "Return Path" address to the identity specified in
 * <code>SourceIdentityArn</code> . For more information about sending
 * authorization, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
 * .</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendRawEmail(SendRawEmailRequest)
 */
public class SendRawEmailRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.) <p> By default, the string must
     * be 7-bit ASCII. If the text must contain any other characters, then
     * you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     * string. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>. For more information,
     * see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * <note>If you specify the <code>Source</code> parameter and have
     * feedback forwarding enabled, then bounces and complaints will be sent
     * to this email address. This takes precedence over any
     * <i>Return-Path</i> header that you might include in the raw text of
     * the message. </note>
     */
    private String source;

    /**
     * A list of destinations for the message, consisting of To:, CC:, and
     * BCC: addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> destinations;

    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     * SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     * MIME requires it.</li> </ul>
     */
    private RawMessage rawMessage;

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to specify a particular "From" address in the
     * header of the raw email. <p>Instead of using this parameter, you can
     * use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>FromArn</code> parameter. <note>For information about when to
     * use this parameter, see the description of <code>SendRawEmail</code>
     * in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     */
    private String fromArn;

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to send for the email address specified in the
     * <code>Source</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>Source</code> to be <code>user@example.com</code>.
     * <p>Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     * use both the <code>SourceArn</code> parameter and the corresponding
     * X-header, Amazon SES uses the value of the <code>SourceArn</code>
     * parameter. <note>For information about when to use this parameter, see
     * the description of <code>SendRawEmail</code> in this guide, or see the
     * <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     */
    private String sourceArn;

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>. <p>Instead of using this parameter,
     * you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     * message of the email. If you use both the <code>ReturnPathArn</code>
     * parameter and the corresponding X-header, Amazon SES uses the value of
     * the <code>ReturnPathArn</code> parameter. <note>For information about
     * when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     */
    private String returnPathArn;

    /**
     * Default constructor for a new SendRawEmailRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendRawEmailRequest() {}
    
    /**
     * Constructs a new SendRawEmailRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param rawMessage The raw text of the message. The client is
     * responsible for ensuring the following: <p> <ul> <li>Message must
     * contain a header and a body, separated by a blank line.</li> <li>All
     * required header fields must be present.</li> <li>Each part of a
     * multipart MIME message must be formatted properly.</li> <li>MIME
     * content types must be among those supported by Amazon SES. For more
     * information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     * SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     * MIME requires it.</li> </ul>
     */
    public SendRawEmailRequest(RawMessage rawMessage) {
        setRawMessage(rawMessage);
    }

    /**
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.) <p> By default, the string must
     * be 7-bit ASCII. If the text must contain any other characters, then
     * you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     * string. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>. For more information,
     * see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * <note>If you specify the <code>Source</code> parameter and have
     * feedback forwarding enabled, then bounces and complaints will be sent
     * to this email address. This takes precedence over any
     * <i>Return-Path</i> header that you might include in the raw text of
     * the message. </note>
     *
     * @return The identity's email address. If you do not provide a value for this
     *         parameter, you must specify a "From" address in the raw text of the
     *         message. (You can also specify both.) <p> By default, the string must
     *         be 7-bit ASCII. If the text must contain any other characters, then
     *         you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     *         string. MIME encoded-word syntax uses the following form:
     *         <code>=?charset?encoding?encoded-text?=</code>. For more information,
     *         see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     *         <note>If you specify the <code>Source</code> parameter and have
     *         feedback forwarding enabled, then bounces and complaints will be sent
     *         to this email address. This takes precedence over any
     *         <i>Return-Path</i> header that you might include in the raw text of
     *         the message. </note>
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.) <p> By default, the string must
     * be 7-bit ASCII. If the text must contain any other characters, then
     * you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     * string. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>. For more information,
     * see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * <note>If you specify the <code>Source</code> parameter and have
     * feedback forwarding enabled, then bounces and complaints will be sent
     * to this email address. This takes precedence over any
     * <i>Return-Path</i> header that you might include in the raw text of
     * the message. </note>
     *
     * @param source The identity's email address. If you do not provide a value for this
     *         parameter, you must specify a "From" address in the raw text of the
     *         message. (You can also specify both.) <p> By default, the string must
     *         be 7-bit ASCII. If the text must contain any other characters, then
     *         you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     *         string. MIME encoded-word syntax uses the following form:
     *         <code>=?charset?encoding?encoded-text?=</code>. For more information,
     *         see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     *         <note>If you specify the <code>Source</code> parameter and have
     *         feedback forwarding enabled, then bounces and complaints will be sent
     *         to this email address. This takes precedence over any
     *         <i>Return-Path</i> header that you might include in the raw text of
     *         the message. </note>
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The identity's email address. If you do not provide a value for this
     * parameter, you must specify a "From" address in the raw text of the
     * message. (You can also specify both.) <p> By default, the string must
     * be 7-bit ASCII. If the text must contain any other characters, then
     * you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     * string. MIME encoded-word syntax uses the following form:
     * <code>=?charset?encoding?encoded-text?=</code>. For more information,
     * see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     * <note>If you specify the <code>Source</code> parameter and have
     * feedback forwarding enabled, then bounces and complaints will be sent
     * to this email address. This takes precedence over any
     * <i>Return-Path</i> header that you might include in the raw text of
     * the message. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The identity's email address. If you do not provide a value for this
     *         parameter, you must specify a "From" address in the raw text of the
     *         message. (You can also specify both.) <p> By default, the string must
     *         be 7-bit ASCII. If the text must contain any other characters, then
     *         you must use MIME encoded-word syntax (RFC 2047) instead of a literal
     *         string. MIME encoded-word syntax uses the following form:
     *         <code>=?charset?encoding?encoded-text?=</code>. For more information,
     *         see <a href="http://tools.ietf.org/html/rfc2047">RFC 2047</a>.
     *         <note>If you specify the <code>Source</code> parameter and have
     *         feedback forwarding enabled, then bounces and complaints will be sent
     *         to this email address. This takes precedence over any
     *         <i>Return-Path</i> header that you might include in the raw text of
     *         the message. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * A list of destinations for the message, consisting of To:, CC:, and
     * BCC: addresses.
     *
     * @return A list of destinations for the message, consisting of To:, CC:, and
     *         BCC: addresses.
     */
    public java.util.List<String> getDestinations() {
        if (destinations == null) {
              destinations = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              destinations.setAutoConstruct(true);
        }
        return destinations;
    }
    
    /**
     * A list of destinations for the message, consisting of To:, CC:, and
     * BCC: addresses.
     *
     * @param destinations A list of destinations for the message, consisting of To:, CC:, and
     *         BCC: addresses.
     */
    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> destinationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(destinations.size());
        destinationsCopy.addAll(destinations);
        this.destinations = destinationsCopy;
    }
    
    /**
     * A list of destinations for the message, consisting of To:, CC:, and
     * BCC: addresses.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDestinations(java.util.Collection)} or {@link
     * #withDestinations(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinations A list of destinations for the message, consisting of To:, CC:, and
     *         BCC: addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withDestinations(String... destinations) {
        if (getDestinations() == null) setDestinations(new java.util.ArrayList<String>(destinations.length));
        for (String value : destinations) {
            getDestinations().add(value);
        }
        return this;
    }
    
    /**
     * A list of destinations for the message, consisting of To:, CC:, and
     * BCC: addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinations A list of destinations for the message, consisting of To:, CC:, and
     *         BCC: addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> destinationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(destinations.size());
            destinationsCopy.addAll(destinations);
            this.destinations = destinationsCopy;
        }

        return this;
    }

    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     * SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     * MIME requires it.</li> </ul>
     *
     * @return The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. For more information, go to the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     *         SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     *         MIME requires it.</li> </ul>
     */
    public RawMessage getRawMessage() {
        return rawMessage;
    }
    
    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     * SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     * MIME requires it.</li> </ul>
     *
     * @param rawMessage The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. For more information, go to the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     *         SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     *         MIME requires it.</li> </ul>
     */
    public void setRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
    }
    
    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. For more information, go to the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     * SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     * MIME requires it.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rawMessage The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. For more information, go to the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mime-types.html">Amazon
     *         SES Developer Guide</a>. </li> <li>Content must be base64-encoded, if
     *         MIME requires it.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
        return this;
    }

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to specify a particular "From" address in the
     * header of the raw email. <p>Instead of using this parameter, you can
     * use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>FromArn</code> parameter. <note>For information about when to
     * use this parameter, see the description of <code>SendRawEmail</code>
     * in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     *
     * @return This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to specify a particular "From" address in the
     *         header of the raw email. <p>Instead of using this parameter, you can
     *         use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     *         email. If you use both the <code>FromArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>FromArn</code> parameter. <note>For information about when to
     *         use this parameter, see the description of <code>SendRawEmail</code>
     *         in this guide, or see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     */
    public String getFromArn() {
        return fromArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to specify a particular "From" address in the
     * header of the raw email. <p>Instead of using this parameter, you can
     * use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>FromArn</code> parameter. <note>For information about when to
     * use this parameter, see the description of <code>SendRawEmail</code>
     * in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     *
     * @param fromArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to specify a particular "From" address in the
     *         header of the raw email. <p>Instead of using this parameter, you can
     *         use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     *         email. If you use both the <code>FromArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>FromArn</code> parameter. <note>For information about when to
     *         use this parameter, see the description of <code>SendRawEmail</code>
     *         in this guide, or see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     */
    public void setFromArn(String fromArn) {
        this.fromArn = fromArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to specify a particular "From" address in the
     * header of the raw email. <p>Instead of using this parameter, you can
     * use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     * email. If you use both the <code>FromArn</code> parameter and the
     * corresponding X-header, Amazon SES uses the value of the
     * <code>FromArn</code> parameter. <note>For information about when to
     * use this parameter, see the description of <code>SendRawEmail</code>
     * in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to specify a particular "From" address in the
     *         header of the raw email. <p>Instead of using this parameter, you can
     *         use the X-header <code>X-SES-FROM-ARN</code> in the raw message of the
     *         email. If you use both the <code>FromArn</code> parameter and the
     *         corresponding X-header, Amazon SES uses the value of the
     *         <code>FromArn</code> parameter. <note>For information about when to
     *         use this parameter, see the description of <code>SendRawEmail</code>
     *         in this guide, or see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withFromArn(String fromArn) {
        this.fromArn = fromArn;
        return this;
    }

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to send for the email address specified in the
     * <code>Source</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>Source</code> to be <code>user@example.com</code>.
     * <p>Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     * use both the <code>SourceArn</code> parameter and the corresponding
     * X-header, Amazon SES uses the value of the <code>SourceArn</code>
     * parameter. <note>For information about when to use this parameter, see
     * the description of <code>SendRawEmail</code> in this guide, or see the
     * <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     *
     * @return This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to send for the email address specified in the
     *         <code>Source</code> parameter. <p>For example, if the owner of
     *         <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     *         attaches a policy to it that authorizes you to send from
     *         <code>user@example.com</code>, then you would specify the
     *         <code>SourceArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>Source</code> to be <code>user@example.com</code>.
     *         <p>Instead of using this parameter, you can use the X-header
     *         <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     *         use both the <code>SourceArn</code> parameter and the corresponding
     *         X-header, Amazon SES uses the value of the <code>SourceArn</code>
     *         parameter. <note>For information about when to use this parameter, see
     *         the description of <code>SendRawEmail</code> in this guide, or see the
     *         <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     */
    public String getSourceArn() {
        return sourceArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to send for the email address specified in the
     * <code>Source</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>Source</code> to be <code>user@example.com</code>.
     * <p>Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     * use both the <code>SourceArn</code> parameter and the corresponding
     * X-header, Amazon SES uses the value of the <code>SourceArn</code>
     * parameter. <note>For information about when to use this parameter, see
     * the description of <code>SendRawEmail</code> in this guide, or see the
     * <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     *
     * @param sourceArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to send for the email address specified in the
     *         <code>Source</code> parameter. <p>For example, if the owner of
     *         <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     *         attaches a policy to it that authorizes you to send from
     *         <code>user@example.com</code>, then you would specify the
     *         <code>SourceArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>Source</code> to be <code>user@example.com</code>.
     *         <p>Instead of using this parameter, you can use the X-header
     *         <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     *         use both the <code>SourceArn</code> parameter and the corresponding
     *         X-header, Amazon SES uses the value of the <code>SourceArn</code>
     *         parameter. <note>For information about when to use this parameter, see
     *         the description of <code>SendRawEmail</code> in this guide, or see the
     *         <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to send for the email address specified in the
     * <code>Source</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to send from
     * <code>user@example.com</code>, then you would specify the
     * <code>SourceArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>Source</code> to be <code>user@example.com</code>.
     * <p>Instead of using this parameter, you can use the X-header
     * <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     * use both the <code>SourceArn</code> parameter and the corresponding
     * X-header, Amazon SES uses the value of the <code>SourceArn</code>
     * parameter. <note>For information about when to use this parameter, see
     * the description of <code>SendRawEmail</code> in this guide, or see the
     * <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to send for the email address specified in the
     *         <code>Source</code> parameter. <p>For example, if the owner of
     *         <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     *         attaches a policy to it that authorizes you to send from
     *         <code>user@example.com</code>, then you would specify the
     *         <code>SourceArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>Source</code> to be <code>user@example.com</code>.
     *         <p>Instead of using this parameter, you can use the X-header
     *         <code>X-SES-SOURCE-ARN</code> in the raw message of the email. If you
     *         use both the <code>SourceArn</code> parameter and the corresponding
     *         X-header, Amazon SES uses the value of the <code>SourceArn</code>
     *         parameter. <note>For information about when to use this parameter, see
     *         the description of <code>SendRawEmail</code> in this guide, or see the
     *         <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>. <p>Instead of using this parameter,
     * you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     * message of the email. If you use both the <code>ReturnPathArn</code>
     * parameter and the corresponding X-header, Amazon SES uses the value of
     * the <code>ReturnPathArn</code> parameter. <note>For information about
     * when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     *
     * @return This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to use the email address specified in the
     *         <code>ReturnPath</code> parameter. <p>For example, if the owner of
     *         <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     *         attaches a policy to it that authorizes you to use
     *         <code>feedback@example.com</code>, then you would specify the
     *         <code>ReturnPathArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>ReturnPath</code> to be
     *         <code>feedback@example.com</code>. <p>Instead of using this parameter,
     *         you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     *         message of the email. If you use both the <code>ReturnPathArn</code>
     *         parameter and the corresponding X-header, Amazon SES uses the value of
     *         the <code>ReturnPathArn</code> parameter. <note>For information about
     *         when to use this parameter, see the description of
     *         <code>SendRawEmail</code> in this guide, or see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     */
    public String getReturnPathArn() {
        return returnPathArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>. <p>Instead of using this parameter,
     * you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     * message of the email. If you use both the <code>ReturnPathArn</code>
     * parameter and the corresponding X-header, Amazon SES uses the value of
     * the <code>ReturnPathArn</code> parameter. <note>For information about
     * when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     *
     * @param returnPathArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to use the email address specified in the
     *         <code>ReturnPath</code> parameter. <p>For example, if the owner of
     *         <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     *         attaches a policy to it that authorizes you to use
     *         <code>feedback@example.com</code>, then you would specify the
     *         <code>ReturnPathArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>ReturnPath</code> to be
     *         <code>feedback@example.com</code>. <p>Instead of using this parameter,
     *         you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     *         message of the email. If you use both the <code>ReturnPathArn</code>
     *         parameter and the corresponding X-header, Amazon SES uses the value of
     *         the <code>ReturnPathArn</code> parameter. <note>For information about
     *         when to use this parameter, see the description of
     *         <code>SendRawEmail</code> in this guide, or see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     */
    public void setReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to use the email address specified in the
     * <code>ReturnPath</code> parameter. <p>For example, if the owner of
     * <code>example.com</code> (which has ARN
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     * attaches a policy to it that authorizes you to use
     * <code>feedback@example.com</code>, then you would specify the
     * <code>ReturnPathArn</code> to be
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     * and the <code>ReturnPath</code> to be
     * <code>feedback@example.com</code>. <p>Instead of using this parameter,
     * you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     * message of the email. If you use both the <code>ReturnPathArn</code>
     * parameter and the corresponding X-header, Amazon SES uses the value of
     * the <code>ReturnPathArn</code> parameter. <note>For information about
     * when to use this parameter, see the description of
     * <code>SendRawEmail</code> in this guide, or see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     * SES Developer Guide</a>. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param returnPathArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to use the email address specified in the
     *         <code>ReturnPath</code> parameter. <p>For example, if the owner of
     *         <code>example.com</code> (which has ARN
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>)
     *         attaches a policy to it that authorizes you to use
     *         <code>feedback@example.com</code>, then you would specify the
     *         <code>ReturnPathArn</code> to be
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>,
     *         and the <code>ReturnPath</code> to be
     *         <code>feedback@example.com</code>. <p>Instead of using this parameter,
     *         you can use the X-header <code>X-SES-RETURN-PATH-ARN</code> in the raw
     *         message of the email. If you use both the <code>ReturnPathArn</code>
     *         parameter and the corresponding X-header, Amazon SES uses the value of
     *         the <code>ReturnPathArn</code> parameter. <note>For information about
     *         when to use this parameter, see the description of
     *         <code>SendRawEmail</code> in this guide, or see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-delegate-sender-tasks-email.html">Amazon
     *         SES Developer Guide</a>. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SendRawEmailRequest withReturnPathArn(String returnPathArn) {
        this.returnPathArn = returnPathArn;
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
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getDestinations() != null) sb.append("Destinations: " + getDestinations() + ",");
        if (getRawMessage() != null) sb.append("RawMessage: " + getRawMessage() + ",");
        if (getFromArn() != null) sb.append("FromArn: " + getFromArn() + ",");
        if (getSourceArn() != null) sb.append("SourceArn: " + getSourceArn() + ",");
        if (getReturnPathArn() != null) sb.append("ReturnPathArn: " + getReturnPathArn() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendRawEmailRequest == false) return false;
        SendRawEmailRequest other = (SendRawEmailRequest)obj;
        
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false; 
        if (other.getDestinations() == null ^ this.getDestinations() == null) return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false) return false; 
        if (other.getRawMessage() == null ^ this.getRawMessage() == null) return false;
        if (other.getRawMessage() != null && other.getRawMessage().equals(this.getRawMessage()) == false) return false; 
        if (other.getFromArn() == null ^ this.getFromArn() == null) return false;
        if (other.getFromArn() != null && other.getFromArn().equals(this.getFromArn()) == false) return false; 
        if (other.getSourceArn() == null ^ this.getSourceArn() == null) return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false) return false; 
        if (other.getReturnPathArn() == null ^ this.getReturnPathArn() == null) return false;
        if (other.getReturnPathArn() != null && other.getReturnPathArn().equals(this.getReturnPathArn()) == false) return false; 
        return true;
    }
    
    @Override
    public SendRawEmailRequest clone() {
        
            return (SendRawEmailRequest) super.clone();
    }

}
    