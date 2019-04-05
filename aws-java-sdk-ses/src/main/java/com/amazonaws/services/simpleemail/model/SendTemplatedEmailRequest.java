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
 * Represents a request to send a templated email using Amazon SES. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendTemplatedEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendTemplatedEmailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address that is sending the email. This email address must be either individually verified with Amazon
     * SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy,
     * then you must also specify the <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in<a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME encoded-word
     * syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     */
    private String source;
    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     * recipients across these three fields.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address
     * will receive the reply.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> replyToAddresses;
    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the
     * message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP;
     * this message will then be forwarded to the email address specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email address must be either individually verified
     * with Amazon SES, or from a domain that has been verified with Amazon SES.
     * </p>
     */
    private String returnPath;
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     */
    private String returnPathArn;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MessageTag> tags;
    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     */
    private String templateData;

    /**
     * <p>
     * The email address that is sending the email. This email address must be either individually verified with Amazon
     * SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy,
     * then you must also specify the <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in<a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME encoded-word
     * syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * 
     * @param source
     *        The email address that is sending the email. This email address must be either individually verified with
     *        Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying
     *        identities, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     *        Developer Guide</a>.</p>
     *        <p>
     *        If you are sending on behalf of another user and have been permitted to do so by a sending authorization
     *        policy, then you must also specify the <code>SourceArn</code> parameter. For more information about
     *        sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon SES does not support the SMTPUTF8 extension, as described in <a
     *        href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source
     *        email address (the part of the email address that precedes the @ sign) may only contain <a
     *        href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     *        part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded
     *        using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     *        name (also known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be
     *        encoded using MIME encoded-word syntax, as described in<a href="https://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>. MIME encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>
     *        .
     *        </p>
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The email address that is sending the email. This email address must be either individually verified with Amazon
     * SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy,
     * then you must also specify the <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in<a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME encoded-word
     * syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * 
     * @return The email address that is sending the email. This email address must be either individually verified with
     *         Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying
     *         identities, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     *         Developer Guide</a>.</p>
     *         <p>
     *         If you are sending on behalf of another user and have been permitted to do so by a sending authorization
     *         policy, then you must also specify the <code>SourceArn</code> parameter. For more information about
     *         sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon SES does not support the SMTPUTF8 extension, as described in <a
     *         href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a
     *         source email address (the part of the email address that precedes the @ sign) may only contain <a
     *         href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the
     *         <i>domain part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be
     *         encoded using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
     *         The sender name (also known as the <i>friendly name</i>) may contain non-ASCII characters. These
     *         characters must be encoded using MIME encoded-word syntax, as described in<a
     *         href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME encoded-word syntax uses the following
     *         form: <code>=?charset?encoding?encoded-text?=</code>.
     *         </p>
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The email address that is sending the email. This email address must be either individually verified with Amazon
     * SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the
     * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     * Developer Guide</a>.
     * </p>
     * <p>
     * If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy,
     * then you must also specify the <code>SourceArn</code> parameter. For more information about sending
     * authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <note>
     * <p>
     * Amazon SES does not support the SMTPUTF8 extension, as described in <a
     * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source email
     * address (the part of the email address that precedes the @ sign) may only contain <a
     * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     * part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using
     * Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender name (also
     * known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be encoded using MIME
     * encoded-word syntax, as described in<a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME encoded-word
     * syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     * 
     * @param source
     *        The email address that is sending the email. This email address must be either individually verified with
     *        Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying
     *        identities, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-addresses-and-domains.html">Amazon SES
     *        Developer Guide</a>.</p>
     *        <p>
     *        If you are sending on behalf of another user and have been permitted to do so by a sending authorization
     *        policy, then you must also specify the <code>SourceArn</code> parameter. For more information about
     *        sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon SES does not support the SMTPUTF8 extension, as described in <a
     *        href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a source
     *        email address (the part of the email address that precedes the @ sign) may only contain <a
     *        href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain
     *        part</i> of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded
     *        using Punycode, as described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>. The sender
     *        name (also known as the <i>friendly name</i>) may contain non-ASCII characters. These characters must be
     *        encoded using MIME encoded-word syntax, as described in<a href="https://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>. MIME encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>
     *        .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     * recipients across these three fields.
     * </p>
     * 
     * @param destination
     *        The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     *        recipients across these three fields.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     * recipients across these three fields.
     * </p>
     * 
     * @return The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     *         recipients across these three fields.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     * recipients across these three fields.
     * </p>
     * 
     * @param destination
     *        The destination for this email, composed of To:, CC:, and BCC: fields. A Destination can include up to 50
     *        recipients across these three fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address
     * will receive the reply.
     * </p>
     * 
     * @return The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to
     *         address will receive the reply.
     */

    public java.util.List<String> getReplyToAddresses() {
        if (replyToAddresses == null) {
            replyToAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return replyToAddresses;
    }

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address
     * will receive the reply.
     * </p>
     * 
     * @param replyToAddresses
     *        The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to
     *        address will receive the reply.
     */

    public void setReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
            return;
        }

        this.replyToAddresses = new com.amazonaws.internal.SdkInternalList<String>(replyToAddresses);
    }

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address
     * will receive the reply.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplyToAddresses(java.util.Collection)} or {@link #withReplyToAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replyToAddresses
     *        The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to
     *        address will receive the reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withReplyToAddresses(String... replyToAddresses) {
        if (this.replyToAddresses == null) {
            setReplyToAddresses(new com.amazonaws.internal.SdkInternalList<String>(replyToAddresses.length));
        }
        for (String ele : replyToAddresses) {
            this.replyToAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address
     * will receive the reply.
     * </p>
     * 
     * @param replyToAddresses
     *        The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to
     *        address will receive the reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        setReplyToAddresses(replyToAddresses);
        return this;
    }

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the
     * message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP;
     * this message will then be forwarded to the email address specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email address must be either individually verified
     * with Amazon SES, or from a domain that has been verified with Amazon SES.
     * </p>
     * 
     * @param returnPath
     *        The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If
     *        the message cannot be delivered to the recipient, then an error message will be returned from the
     *        recipient's ISP; this message will then be forwarded to the email address specified by the
     *        <code>ReturnPath</code> parameter. The <code>ReturnPath</code> parameter is never overwritten. This email
     *        address must be either individually verified with Amazon SES, or from a domain that has been verified with
     *        Amazon SES.
     */

    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the
     * message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP;
     * this message will then be forwarded to the email address specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email address must be either individually verified
     * with Amazon SES, or from a domain that has been verified with Amazon SES.
     * </p>
     * 
     * @return The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
     *         If the message cannot be delivered to the recipient, then an error message will be returned from the
     *         recipient's ISP; this message will then be forwarded to the email address specified by the
     *         <code>ReturnPath</code> parameter. The <code>ReturnPath</code> parameter is never overwritten. This email
     *         address must be either individually verified with Amazon SES, or from a domain that has been verified
     *         with Amazon SES.
     */

    public String getReturnPath() {
        return this.returnPath;
    }

    /**
     * <p>
     * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the
     * message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP;
     * this message will then be forwarded to the email address specified by the <code>ReturnPath</code> parameter. The
     * <code>ReturnPath</code> parameter is never overwritten. This email address must be either individually verified
     * with Amazon SES, or from a domain that has been verified with Amazon SES.
     * </p>
     * 
     * @param returnPath
     *        The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If
     *        the message cannot be delivered to the recipient, then an error message will be returned from the
     *        recipient's ISP; this message will then be forwarded to the email address specified by the
     *        <code>ReturnPath</code> parameter. The <code>ReturnPath</code> parameter is never overwritten. This email
     *        address must be either individually verified with Amazon SES, or from a domain that has been verified with
     *        Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withReturnPath(String returnPath) {
        setReturnPath(returnPath);
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     *        For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     *         For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     *        For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withSourceArn(String sourceArn) {
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     *        For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     *         For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
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
     * For more information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
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
     *        For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withReturnPathArn(String returnPathArn) {
        setReturnPathArn(returnPathArn);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using
     * <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *         <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that
     *         you can publish email sending events.
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
     * <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * 
     * @param tags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that
     *        you can publish email sending events.
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
     * <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
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
     *        <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that
     *        you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withTags(MessageTag... tags) {
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
     * <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that you can
     * publish email sending events.
     * </p>
     * 
     * @param tags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using
     *        <code>SendTemplatedEmail</code>. Tags correspond to characteristics of the email that you define, so that
     *        you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withTags(java.util.Collection<MessageTag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     * </p>
     * 
     * @return The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use when you send an email using <code>SendTemplatedEmail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     * 
     * @param template
     *        The template to use when sending this email.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     * 
     * @return The template to use when sending this email.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The template to use when sending this email.
     * </p>
     * 
     * @param template
     *        The template to use when sending this email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     * 
     * @param templateArn
     *        The ARN of the template to use when sending this email.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     * 
     * @return The ARN of the template to use when sending this email.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The ARN of the template to use when sending this email.
     * </p>
     * 
     * @param templateArn
     *        The ARN of the template to use when sending this email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param templateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @return A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *         consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public String getTemplateData() {
        return this.templateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param templateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTemplatedEmailRequest withTemplateData(String templateData) {
        setTemplateData(templateData);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: ").append(getReplyToAddresses()).append(",");
        if (getReturnPath() != null)
            sb.append("ReturnPath: ").append(getReturnPath()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getReturnPathArn() != null)
            sb.append("ReturnPathArn: ").append(getReturnPathArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateData() != null)
            sb.append("TemplateData: ").append(getTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendTemplatedEmailRequest == false)
            return false;
        SendTemplatedEmailRequest other = (SendTemplatedEmailRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null)
            return false;
        if (other.getReplyToAddresses() != null && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false)
            return false;
        if (other.getReturnPath() == null ^ this.getReturnPath() == null)
            return false;
        if (other.getReturnPath() != null && other.getReturnPath().equals(this.getReturnPath()) == false)
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
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateData() == null ^ this.getTemplateData() == null)
            return false;
        if (other.getTemplateData() != null && other.getTemplateData().equals(this.getTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getReturnPath() == null) ? 0 : getReturnPath().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getReturnPathArn() == null) ? 0 : getReturnPathArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateData() == null) ? 0 : getTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public SendTemplatedEmailRequest clone() {
        return (SendTemplatedEmailRequest) super.clone();
    }

}
