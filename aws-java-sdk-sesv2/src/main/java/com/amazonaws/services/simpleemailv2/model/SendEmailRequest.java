/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to send a single formatted email using Amazon SES. For more information, see the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-email-formatted.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SendEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendEmailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address that you want to use as the "From" address for the email. The address that you specify has to
     * be verified.
     * </p>
     */
    private String fromEmailAddress;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FromEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use sender@example.com, then you would specify the
     * <code>FromEmailAddressIdentityArn</code> to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     * <code>FromEmailAddress</code> to be sender@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     * X-SES-FROM-ARN headers specified in raw email message content.
     * </p>
     */
    private String fromEmailAddressIdentityArn;
    /**
     * <p>
     * An object that contains the recipients of the email message.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address
     * receives the reply.
     * </p>
     */
    private java.util.List<String> replyToAddresses;
    /**
     * <p>
     * The address that you want bounce and complaint notifications to be sent to.
     * </p>
     */
    private String feedbackForwardingEmailAddress;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FeedbackForwardingEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the
     * <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     * arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FeedbackForwardingEmailAddress</code> to
     * be feedback@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     */
    private String feedbackForwardingEmailAddressIdentityArn;
    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message Raw message or a template
     * Message.
     * </p>
     */
    private EmailContent content;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     */
    private java.util.List<MessageTag> emailTags;
    /**
     * <p>
     * The name of the configuration set that you want to use when sending the email.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * The email address that you want to use as the "From" address for the email. The address that you specify has to
     * be verified.
     * </p>
     * 
     * @param fromEmailAddress
     *        The email address that you want to use as the "From" address for the email. The address that you specify
     *        has to be verified.
     */

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * The email address that you want to use as the "From" address for the email. The address that you specify has to
     * be verified.
     * </p>
     * 
     * @return The email address that you want to use as the "From" address for the email. The address that you specify
     *         has to be verified.
     */

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    /**
     * <p>
     * The email address that you want to use as the "From" address for the email. The address that you specify has to
     * be verified.
     * </p>
     * 
     * @param fromEmailAddress
     *        The email address that you want to use as the "From" address for the email. The address that you specify
     *        has to be verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withFromEmailAddress(String fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FromEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use sender@example.com, then you would specify the
     * <code>FromEmailAddressIdentityArn</code> to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     * <code>FromEmailAddress</code> to be sender@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     * X-SES-FROM-ARN headers specified in raw email message content.
     * </p>
     * 
     * @param fromEmailAddressIdentityArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the email address specified in the
     *        <code>FromEmailAddress</code> parameter.</p>
     *        <p>
     *        For example, if the owner of example.com (which has ARN
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to
     *        use sender@example.com, then you would specify the <code>FromEmailAddressIdentityArn</code> to be
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FromEmailAddress</code> to be
     *        sender@example.com.
     *        </p>
     *        <p>
     *        For more information about sending authorization, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     *        </p>
     *        <p>
     *        For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     *        X-SES-FROM-ARN headers specified in raw email message content.
     */

    public void setFromEmailAddressIdentityArn(String fromEmailAddressIdentityArn) {
        this.fromEmailAddressIdentityArn = fromEmailAddressIdentityArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FromEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use sender@example.com, then you would specify the
     * <code>FromEmailAddressIdentityArn</code> to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     * <code>FromEmailAddress</code> to be sender@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     * X-SES-FROM-ARN headers specified in raw email message content.
     * </p>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to use the email address specified in the
     *         <code>FromEmailAddress</code> parameter.</p>
     *         <p>
     *         For example, if the owner of example.com (which has ARN
     *         arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to
     *         use sender@example.com, then you would specify the <code>FromEmailAddressIdentityArn</code> to be
     *         arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FromEmailAddress</code> to be
     *         sender@example.com.
     *         </p>
     *         <p>
     *         For more information about sending authorization, see the <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
     *         </p>
     *         <p>
     *         For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     *         X-SES-FROM-ARN headers specified in raw email message content.
     */

    public String getFromEmailAddressIdentityArn() {
        return this.fromEmailAddressIdentityArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FromEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use sender@example.com, then you would specify the
     * <code>FromEmailAddressIdentityArn</code> to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     * <code>FromEmailAddress</code> to be sender@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * <p>
     * For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     * X-SES-FROM-ARN headers specified in raw email message content.
     * </p>
     * 
     * @param fromEmailAddressIdentityArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the email address specified in the
     *        <code>FromEmailAddress</code> parameter.</p>
     *        <p>
     *        For example, if the owner of example.com (which has ARN
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to
     *        use sender@example.com, then you would specify the <code>FromEmailAddressIdentityArn</code> to be
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FromEmailAddress</code> to be
     *        sender@example.com.
     *        </p>
     *        <p>
     *        For more information about sending authorization, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     *        </p>
     *        <p>
     *        For Raw emails, the <code>FromEmailAddressIdentityArn</code> value overrides the X-SES-SOURCE-ARN and
     *        X-SES-FROM-ARN headers specified in raw email message content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withFromEmailAddressIdentityArn(String fromEmailAddressIdentityArn) {
        setFromEmailAddressIdentityArn(fromEmailAddressIdentityArn);
        return this;
    }

    /**
     * <p>
     * An object that contains the recipients of the email message.
     * </p>
     * 
     * @param destination
     *        An object that contains the recipients of the email message.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * An object that contains the recipients of the email message.
     * </p>
     * 
     * @return An object that contains the recipients of the email message.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * An object that contains the recipients of the email message.
     * </p>
     * 
     * @param destination
     *        An object that contains the recipients of the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address
     * receives the reply.
     * </p>
     * 
     * @return The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to
     *         address receives the reply.
     */

    public java.util.List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    /**
     * <p>
     * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address
     * receives the reply.
     * </p>
     * 
     * @param replyToAddresses
     *        The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to
     *        address receives the reply.
     */

    public void setReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        if (replyToAddresses == null) {
            this.replyToAddresses = null;
            return;
        }

        this.replyToAddresses = new java.util.ArrayList<String>(replyToAddresses);
    }

    /**
     * <p>
     * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address
     * receives the reply.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplyToAddresses(java.util.Collection)} or {@link #withReplyToAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replyToAddresses
     *        The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to
     *        address receives the reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withReplyToAddresses(String... replyToAddresses) {
        if (this.replyToAddresses == null) {
            setReplyToAddresses(new java.util.ArrayList<String>(replyToAddresses.length));
        }
        for (String ele : replyToAddresses) {
            this.replyToAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address
     * receives the reply.
     * </p>
     * 
     * @param replyToAddresses
     *        The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to
     *        address receives the reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withReplyToAddresses(java.util.Collection<String> replyToAddresses) {
        setReplyToAddresses(replyToAddresses);
        return this;
    }

    /**
     * <p>
     * The address that you want bounce and complaint notifications to be sent to.
     * </p>
     * 
     * @param feedbackForwardingEmailAddress
     *        The address that you want bounce and complaint notifications to be sent to.
     */

    public void setFeedbackForwardingEmailAddress(String feedbackForwardingEmailAddress) {
        this.feedbackForwardingEmailAddress = feedbackForwardingEmailAddress;
    }

    /**
     * <p>
     * The address that you want bounce and complaint notifications to be sent to.
     * </p>
     * 
     * @return The address that you want bounce and complaint notifications to be sent to.
     */

    public String getFeedbackForwardingEmailAddress() {
        return this.feedbackForwardingEmailAddress;
    }

    /**
     * <p>
     * The address that you want bounce and complaint notifications to be sent to.
     * </p>
     * 
     * @param feedbackForwardingEmailAddress
     *        The address that you want bounce and complaint notifications to be sent to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withFeedbackForwardingEmailAddress(String feedbackForwardingEmailAddress) {
        setFeedbackForwardingEmailAddress(feedbackForwardingEmailAddress);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FeedbackForwardingEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the
     * <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     * arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FeedbackForwardingEmailAddress</code> to
     * be feedback@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param feedbackForwardingEmailAddressIdentityArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the email address specified in the
     *        <code>FeedbackForwardingEmailAddress</code> parameter.</p>
     *        <p>
     *        For example, if the owner of example.com (which has ARN
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to
     *        use feedback@example.com, then you would specify the
     *        <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     *        <code>FeedbackForwardingEmailAddress</code> to be feedback@example.com.
     *        </p>
     *        <p>
     *        For more information about sending authorization, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     */

    public void setFeedbackForwardingEmailAddressIdentityArn(String feedbackForwardingEmailAddressIdentityArn) {
        this.feedbackForwardingEmailAddressIdentityArn = feedbackForwardingEmailAddressIdentityArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FeedbackForwardingEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the
     * <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     * arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FeedbackForwardingEmailAddress</code> to
     * be feedback@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to use the email address specified in the
     *         <code>FeedbackForwardingEmailAddress</code> parameter.</p>
     *         <p>
     *         For example, if the owner of example.com (which has ARN
     *         arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to
     *         use feedback@example.com, then you would specify the
     *         <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     *         arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     *         <code>FeedbackForwardingEmailAddress</code> to be feedback@example.com.
     *         </p>
     *         <p>
     *         For more information about sending authorization, see the <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
     */

    public String getFeedbackForwardingEmailAddressIdentityArn() {
        return this.feedbackForwardingEmailAddressIdentityArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to use the email address specified in the
     * <code>FeedbackForwardingEmailAddress</code> parameter.
     * </p>
     * <p>
     * For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com)
     * attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the
     * <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     * arn:aws:ses:us-east-1:123456789012:identity/example.com, and the <code>FeedbackForwardingEmailAddress</code> to
     * be feedback@example.com.
     * </p>
     * <p>
     * For more information about sending authorization, see the <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param feedbackForwardingEmailAddressIdentityArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to use the email address specified in the
     *        <code>FeedbackForwardingEmailAddress</code> parameter.</p>
     *        <p>
     *        For example, if the owner of example.com (which has ARN
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to
     *        use feedback@example.com, then you would specify the
     *        <code>FeedbackForwardingEmailAddressIdentityArn</code> to be
     *        arn:aws:ses:us-east-1:123456789012:identity/example.com, and the
     *        <code>FeedbackForwardingEmailAddress</code> to be feedback@example.com.
     *        </p>
     *        <p>
     *        For more information about sending authorization, see the <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withFeedbackForwardingEmailAddressIdentityArn(String feedbackForwardingEmailAddressIdentityArn) {
        setFeedbackForwardingEmailAddressIdentityArn(feedbackForwardingEmailAddressIdentityArn);
        return this;
    }

    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message Raw message or a template
     * Message.
     * </p>
     * 
     * @param content
     *        An object that contains the body of the message. You can send either a Simple message Raw message or a
     *        template Message.
     */

    public void setContent(EmailContent content) {
        this.content = content;
    }

    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message Raw message or a template
     * Message.
     * </p>
     * 
     * @return An object that contains the body of the message. You can send either a Simple message Raw message or a
     *         template Message.
     */

    public EmailContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message Raw message or a template
     * Message.
     * </p>
     * 
     * @param content
     *        An object that contains the body of the message. You can send either a Simple message Raw message or a
     *        template Message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withContent(EmailContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *         <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so
     *         that you can publish email sending events.
     */

    public java.util.List<MessageTag> getEmailTags() {
        return emailTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * 
     * @param emailTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *        <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that
     *        you can publish email sending events.
     */

    public void setEmailTags(java.util.Collection<MessageTag> emailTags) {
        if (emailTags == null) {
            this.emailTags = null;
            return;
        }

        this.emailTags = new java.util.ArrayList<MessageTag>(emailTags);
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmailTags(java.util.Collection)} or {@link #withEmailTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param emailTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *        <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that
     *        you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withEmailTags(MessageTag... emailTags) {
        if (this.emailTags == null) {
            setEmailTags(new java.util.ArrayList<MessageTag>(emailTags.length));
        }
        for (MessageTag ele : emailTags) {
            this.emailTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     * <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that you
     * can publish email sending events.
     * </p>
     * 
     * @param emailTags
     *        A list of tags, in the form of name/value pairs, to apply to an email that you send using the
     *        <code>SendEmail</code> operation. Tags correspond to characteristics of the email that you define, so that
     *        you can publish email sending events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withEmailTags(java.util.Collection<MessageTag> emailTags) {
        setEmailTags(emailTags);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set that you want to use when sending the email.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to use when sending the email.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to use when sending the email.
     * </p>
     * 
     * @return The name of the configuration set that you want to use when sending the email.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to use when sending the email.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to use when sending the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withConfigurationSetName(String configurationSetName) {
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
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: ").append(getFromEmailAddress()).append(",");
        if (getFromEmailAddressIdentityArn() != null)
            sb.append("FromEmailAddressIdentityArn: ").append(getFromEmailAddressIdentityArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: ").append(getReplyToAddresses()).append(",");
        if (getFeedbackForwardingEmailAddress() != null)
            sb.append("FeedbackForwardingEmailAddress: ").append(getFeedbackForwardingEmailAddress()).append(",");
        if (getFeedbackForwardingEmailAddressIdentityArn() != null)
            sb.append("FeedbackForwardingEmailAddressIdentityArn: ").append(getFeedbackForwardingEmailAddressIdentityArn()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getEmailTags() != null)
            sb.append("EmailTags: ").append(getEmailTags()).append(",");
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

        if (obj instanceof SendEmailRequest == false)
            return false;
        SendEmailRequest other = (SendEmailRequest) obj;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getFromEmailAddressIdentityArn() == null ^ this.getFromEmailAddressIdentityArn() == null)
            return false;
        if (other.getFromEmailAddressIdentityArn() != null && other.getFromEmailAddressIdentityArn().equals(this.getFromEmailAddressIdentityArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getReplyToAddresses() == null ^ this.getReplyToAddresses() == null)
            return false;
        if (other.getReplyToAddresses() != null && other.getReplyToAddresses().equals(this.getReplyToAddresses()) == false)
            return false;
        if (other.getFeedbackForwardingEmailAddress() == null ^ this.getFeedbackForwardingEmailAddress() == null)
            return false;
        if (other.getFeedbackForwardingEmailAddress() != null
                && other.getFeedbackForwardingEmailAddress().equals(this.getFeedbackForwardingEmailAddress()) == false)
            return false;
        if (other.getFeedbackForwardingEmailAddressIdentityArn() == null ^ this.getFeedbackForwardingEmailAddressIdentityArn() == null)
            return false;
        if (other.getFeedbackForwardingEmailAddressIdentityArn() != null
                && other.getFeedbackForwardingEmailAddressIdentityArn().equals(this.getFeedbackForwardingEmailAddressIdentityArn()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getEmailTags() == null ^ this.getEmailTags() == null)
            return false;
        if (other.getEmailTags() != null && other.getEmailTags().equals(this.getEmailTags()) == false)
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

        hashCode = prime * hashCode + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getFromEmailAddressIdentityArn() == null) ? 0 : getFromEmailAddressIdentityArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getFeedbackForwardingEmailAddress() == null) ? 0 : getFeedbackForwardingEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getFeedbackForwardingEmailAddressIdentityArn() == null) ? 0 : getFeedbackForwardingEmailAddressIdentityArn().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getEmailTags() == null) ? 0 : getEmailTags().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        return hashCode;
    }

    @Override
    public SendEmailRequest clone() {
        return (SendEmailRequest) super.clone();
    }

}
