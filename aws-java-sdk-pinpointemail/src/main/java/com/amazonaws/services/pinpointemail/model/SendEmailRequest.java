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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to send an email message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendEmail" target="_top">AWS API
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
     * The address that Amazon Pinpoint should send bounce and complaint notifications to.
     * </p>
     */
    private String feedbackForwardingEmailAddress;
    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message or a Raw message.
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
     * The address that Amazon Pinpoint should send bounce and complaint notifications to.
     * </p>
     * 
     * @param feedbackForwardingEmailAddress
     *        The address that Amazon Pinpoint should send bounce and complaint notifications to.
     */

    public void setFeedbackForwardingEmailAddress(String feedbackForwardingEmailAddress) {
        this.feedbackForwardingEmailAddress = feedbackForwardingEmailAddress;
    }

    /**
     * <p>
     * The address that Amazon Pinpoint should send bounce and complaint notifications to.
     * </p>
     * 
     * @return The address that Amazon Pinpoint should send bounce and complaint notifications to.
     */

    public String getFeedbackForwardingEmailAddress() {
        return this.feedbackForwardingEmailAddress;
    }

    /**
     * <p>
     * The address that Amazon Pinpoint should send bounce and complaint notifications to.
     * </p>
     * 
     * @param feedbackForwardingEmailAddress
     *        The address that Amazon Pinpoint should send bounce and complaint notifications to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendEmailRequest withFeedbackForwardingEmailAddress(String feedbackForwardingEmailAddress) {
        setFeedbackForwardingEmailAddress(feedbackForwardingEmailAddress);
        return this;
    }

    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message or a Raw message.
     * </p>
     * 
     * @param content
     *        An object that contains the body of the message. You can send either a Simple message or a Raw message.
     */

    public void setContent(EmailContent content) {
        this.content = content;
    }

    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message or a Raw message.
     * </p>
     * 
     * @return An object that contains the body of the message. You can send either a Simple message or a Raw message.
     */

    public EmailContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * An object that contains the body of the message. You can send either a Simple message or a Raw message.
     * </p>
     * 
     * @param content
     *        An object that contains the body of the message. You can send either a Simple message or a Raw message.
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getReplyToAddresses() != null)
            sb.append("ReplyToAddresses: ").append(getReplyToAddresses()).append(",");
        if (getFeedbackForwardingEmailAddress() != null)
            sb.append("FeedbackForwardingEmailAddress: ").append(getFeedbackForwardingEmailAddress()).append(",");
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
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getReplyToAddresses() == null) ? 0 : getReplyToAddresses().hashCode());
        hashCode = prime * hashCode + ((getFeedbackForwardingEmailAddress() == null) ? 0 : getFeedbackForwardingEmailAddress().hashCode());
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
