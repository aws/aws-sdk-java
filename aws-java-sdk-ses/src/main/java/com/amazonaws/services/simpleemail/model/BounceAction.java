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
 * When included in a receipt rule, this action rejects the received email by returning a bounce response to the sender
 * and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
 * </p>
 * <p>
 * For information about sending a bounce message in response to a received email, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-bounce.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/BounceAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BounceAction implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of
     * an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     * Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     * Developer Guide</a>.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     */
    private String smtpReplyCode;
    /**
     * <p>
     * The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Human-readable text to include in the bounce message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The email address of the sender of the bounced email. This is the address from which the bounce message will be
     * sent.
     * </p>
     */
    private String sender;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of
     * an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     * Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     * Developer Guide</a>.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An
     *        example of an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *        information about Amazon SNS topics, see the <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of
     * an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     * Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     * Developer Guide</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An
     *         example of an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of
     * an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     * Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     * Developer Guide</a>.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An
     *        example of an Amazon SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *        information about Amazon SNS topics, see the <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BounceAction withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * 
     * @param smtpReplyCode
     *        The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     */

    public void setSmtpReplyCode(String smtpReplyCode) {
        this.smtpReplyCode = smtpReplyCode;
    }

    /**
     * <p>
     * The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * 
     * @return The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     */

    public String getSmtpReplyCode() {
        return this.smtpReplyCode;
    }

    /**
     * <p>
     * The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * </p>
     * 
     * @param smtpReplyCode
     *        The SMTP reply code, as defined by <a href="https://tools.ietf.org/html/rfc5321">RFC 5321</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BounceAction withSmtpReplyCode(String smtpReplyCode) {
        setSmtpReplyCode(smtpReplyCode);
        return this;
    }

    /**
     * <p>
     * The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     * </p>
     * 
     * @param statusCode
     *        The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     * </p>
     * 
     * @return The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     * </p>
     * 
     * @param statusCode
     *        The SMTP enhanced status code, as defined by <a href="https://tools.ietf.org/html/rfc3463">RFC 3463</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BounceAction withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Human-readable text to include in the bounce message.
     * </p>
     * 
     * @param message
     *        Human-readable text to include in the bounce message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Human-readable text to include in the bounce message.
     * </p>
     * 
     * @return Human-readable text to include in the bounce message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Human-readable text to include in the bounce message.
     * </p>
     * 
     * @param message
     *        Human-readable text to include in the bounce message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BounceAction withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The email address of the sender of the bounced email. This is the address from which the bounce message will be
     * sent.
     * </p>
     * 
     * @param sender
     *        The email address of the sender of the bounced email. This is the address from which the bounce message
     *        will be sent.
     */

    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * <p>
     * The email address of the sender of the bounced email. This is the address from which the bounce message will be
     * sent.
     * </p>
     * 
     * @return The email address of the sender of the bounced email. This is the address from which the bounce message
     *         will be sent.
     */

    public String getSender() {
        return this.sender;
    }

    /**
     * <p>
     * The email address of the sender of the bounced email. This is the address from which the bounce message will be
     * sent.
     * </p>
     * 
     * @param sender
     *        The email address of the sender of the bounced email. This is the address from which the bounce message
     *        will be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BounceAction withSender(String sender) {
        setSender(sender);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getSmtpReplyCode() != null)
            sb.append("SmtpReplyCode: ").append(getSmtpReplyCode()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSender() != null)
            sb.append("Sender: ").append(getSender());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BounceAction == false)
            return false;
        BounceAction other = (BounceAction) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getSmtpReplyCode() == null ^ this.getSmtpReplyCode() == null)
            return false;
        if (other.getSmtpReplyCode() != null && other.getSmtpReplyCode().equals(this.getSmtpReplyCode()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSender() == null ^ this.getSender() == null)
            return false;
        if (other.getSender() != null && other.getSender().equals(this.getSender()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSmtpReplyCode() == null) ? 0 : getSmtpReplyCode().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSender() == null) ? 0 : getSender().hashCode());
        return hashCode;
    }

    @Override
    public BounceAction clone() {
        try {
            return (BounceAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
