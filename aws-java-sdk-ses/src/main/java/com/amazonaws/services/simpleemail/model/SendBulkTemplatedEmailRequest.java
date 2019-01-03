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
 * Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see
 * the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES
 * Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SendBulkTemplatedEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendBulkTemplatedEmailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
     * </p>
     * </note>
     */
    private String source;
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
     * The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MessageTag> defaultTags;
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
     * A list of replacement values to apply to the template when replacement data is not specified in a Destination
     * object. These values act as a default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond to
     * replacement tags in the email template.
     * </p>
     */
    private String defaultTemplateData;
    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will receive
     * the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BulkEmailDestination> destinations;

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
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
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
     *        encoded using MIME encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
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
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
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
     *         characters must be encoded using MIME encoded-word syntax, as described in <a
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
     * encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC 2047</a>. MIME
     * encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>.
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
     *        encoded using MIME encoded-word syntax, as described in <a href="https://tools.ietf.org/html/rfc2047">RFC
     *        2047</a>. MIME encoded-word syntax uses the following form: <code>=?charset?encoding?encoded-text?=</code>
     *        .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withSource(String source) {
        setSource(source);
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

    public SendBulkTemplatedEmailRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
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

    public SendBulkTemplatedEmailRequest withReplyToAddresses(String... replyToAddresses) {
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

    public SendBulkTemplatedEmailRequest withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
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

    public SendBulkTemplatedEmailRequest withReturnPath(String returnPath) {
        setReturnPath(returnPath);
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

    public SendBulkTemplatedEmailRequest withReturnPathArn(String returnPathArn) {
        setReturnPathArn(returnPathArn);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>.
     * </p>
     * 
     * @return The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>
     *         .
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use when you send an email using <code>SendBulkTemplatedEmail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination
     *         using <code>SendBulkTemplatedEmail</code>.
     */

    public java.util.List<MessageTag> getDefaultTags() {
        if (defaultTags == null) {
            defaultTags = new com.amazonaws.internal.SdkInternalList<MessageTag>();
        }
        return defaultTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     * 
     * @param defaultTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     *        <code>SendBulkTemplatedEmail</code>.
     */

    public void setDefaultTags(java.util.Collection<MessageTag> defaultTags) {
        if (defaultTags == null) {
            this.defaultTags = null;
            return;
        }

        this.defaultTags = new com.amazonaws.internal.SdkInternalList<MessageTag>(defaultTags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultTags(java.util.Collection)} or {@link #withDefaultTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param defaultTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     *        <code>SendBulkTemplatedEmail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withDefaultTags(MessageTag... defaultTags) {
        if (this.defaultTags == null) {
            setDefaultTags(new com.amazonaws.internal.SdkInternalList<MessageTag>(defaultTags.length));
        }
        for (MessageTag ele : defaultTags) {
            this.defaultTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     * <code>SendBulkTemplatedEmail</code>.
     * </p>
     * 
     * @param defaultTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using
     *        <code>SendBulkTemplatedEmail</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withDefaultTags(java.util.Collection<MessageTag> defaultTags) {
        setDefaultTags(defaultTags);
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

    public SendBulkTemplatedEmailRequest withTemplate(String template) {
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

    public SendBulkTemplatedEmailRequest withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement data is not specified in a Destination
     * object. These values act as a default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond to
     * replacement tags in the email template.
     * </p>
     * 
     * @param defaultTemplateData
     *        A list of replacement values to apply to the template when replacement data is not specified in a
     *        Destination object. These values act as a default or fallback option when no other data is available.</p>
     *        <p>
     *        The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond
     *        to replacement tags in the email template.
     */

    public void setDefaultTemplateData(String defaultTemplateData) {
        this.defaultTemplateData = defaultTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement data is not specified in a Destination
     * object. These values act as a default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond to
     * replacement tags in the email template.
     * </p>
     * 
     * @return A list of replacement values to apply to the template when replacement data is not specified in a
     *         Destination object. These values act as a default or fallback option when no other data is available.</p>
     *         <p>
     *         The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond
     *         to replacement tags in the email template.
     */

    public String getDefaultTemplateData() {
        return this.defaultTemplateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template when replacement data is not specified in a Destination
     * object. These values act as a default or fallback option when no other data is available.
     * </p>
     * <p>
     * The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond to
     * replacement tags in the email template.
     * </p>
     * 
     * @param defaultTemplateData
     *        A list of replacement values to apply to the template when replacement data is not specified in a
     *        Destination object. These values act as a default or fallback option when no other data is available.</p>
     *        <p>
     *        The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond
     *        to replacement tags in the email template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withDefaultTemplateData(String defaultTemplateData) {
        setDefaultTemplateData(defaultTemplateData);
        return this;
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will receive
     * the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     * 
     * @return One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will
     *         receive the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     *         <code>Destinations</code> array.
     */

    public java.util.List<BulkEmailDestination> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<BulkEmailDestination>();
        }
        return destinations;
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will receive
     * the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     * 
     * @param destinations
     *        One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will
     *        receive the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     *        <code>Destinations</code> array.
     */

    public void setDestinations(java.util.Collection<BulkEmailDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<BulkEmailDestination>(destinations);
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will receive
     * the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will
     *        receive the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     *        <code>Destinations</code> array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withDestinations(BulkEmailDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<BulkEmailDestination>(destinations.length));
        }
        for (BulkEmailDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will receive
     * the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     * <code>Destinations</code> array.
     * </p>
     * 
     * @param destinations
     *        One or more <code>Destination</code> objects. All of the recipients in a <code>Destination</code> will
     *        receive the same version of the email. You can specify up to 50 <code>Destination</code> objects within a
     *        <code>Destinations</code> array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendBulkTemplatedEmailRequest withDestinations(java.util.Collection<BulkEmailDestination> destinations) {
        setDestinations(destinations);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: ").append(getReplyToAddresses()).append(",");
        if (getReturnPath() != null)
            sb.append("ReturnPath: ").append(getReturnPath()).append(",");
        if (getReturnPathArn() != null)
            sb.append("ReturnPathArn: ").append(getReturnPathArn()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getDefaultTags() != null)
            sb.append("DefaultTags: ").append(getDefaultTags()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getDefaultTemplateData() != null)
            sb.append("DefaultTemplateData: ").append(getDefaultTemplateData()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBulkTemplatedEmailRequest == false)
            return false;
        SendBulkTemplatedEmailRequest other = (SendBulkTemplatedEmailRequest) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null)
            return false;
        if (other.getReplyToAddresses() != null && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false)
            return false;
        if (other.getReturnPath() == null ^ this.getReturnPath() == null)
            return false;
        if (other.getReturnPath() != null && other.getReturnPath().equals(this.getReturnPath()) == false)
            return false;
        if (other.getReturnPathArn() == null ^ this.getReturnPathArn() == null)
            return false;
        if (other.getReturnPathArn() != null && other.getReturnPathArn().equals(this.getReturnPathArn()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getDefaultTags() == null ^ this.getDefaultTags() == null)
            return false;
        if (other.getDefaultTags() != null && other.getDefaultTags().equals(this.getDefaultTags()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getDefaultTemplateData() == null ^ this.getDefaultTemplateData() == null)
            return false;
        if (other.getDefaultTemplateData() != null && other.getDefaultTemplateData().equals(this.getDefaultTemplateData()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getReturnPath() == null) ? 0 : getReturnPath().hashCode());
        hashCode = prime * hashCode + ((getReturnPathArn() == null) ? 0 : getReturnPathArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getDefaultTags() == null) ? 0 : getDefaultTags().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultTemplateData() == null) ? 0 : getDefaultTemplateData().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public SendBulkTemplatedEmailRequest clone() {
        return (SendBulkTemplatedEmailRequest) super.clone();
    }

}
