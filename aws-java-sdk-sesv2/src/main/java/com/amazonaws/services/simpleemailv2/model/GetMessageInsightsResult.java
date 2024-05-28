/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about a message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetMessageInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMessageInsightsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the message.
     * </p>
     */
    private String messageId;
    /**
     * <p>
     * The from address used to send the message.
     * </p>
     */
    private String fromEmailAddress;
    /**
     * <p>
     * The subject line of the message.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with Amazon SES
     * <a href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * </p>
     */
    private java.util.List<MessageTag> emailTags;
    /**
     * <p>
     * A set of insights associated with the message.
     * </p>
     */
    private java.util.List<EmailInsights> insights;

    /**
     * <p>
     * A unique identifier for the message.
     * </p>
     * 
     * @param messageId
     *        A unique identifier for the message.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * A unique identifier for the message.
     * </p>
     * 
     * @return A unique identifier for the message.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * A unique identifier for the message.
     * </p>
     * 
     * @param messageId
     *        A unique identifier for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withMessageId(String messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * 
     * @param fromEmailAddress
     *        The from address used to send the message.
     */

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * 
     * @return The from address used to send the message.
     */

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * 
     * @param fromEmailAddress
     *        The from address used to send the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withFromEmailAddress(String fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * 
     * @param subject
     *        The subject line of the message.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * 
     * @return The subject line of the message.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * 
     * @param subject
     *        The subject line of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with Amazon SES
     * <a href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * </p>
     * 
     * @return A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with
     *         Amazon SES <a
     *         href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     */

    public java.util.List<MessageTag> getEmailTags() {
        return emailTags;
    }

    /**
     * <p>
     * A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with Amazon SES
     * <a href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * </p>
     * 
     * @param emailTags
     *        A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with
     *        Amazon SES <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
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
     * A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with Amazon SES
     * <a href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmailTags(java.util.Collection)} or {@link #withEmailTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param emailTags
     *        A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with
     *        Amazon SES <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withEmailTags(MessageTag... emailTags) {
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
     * A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with Amazon SES
     * <a href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * </p>
     * 
     * @param emailTags
     *        A list of tags, in the form of name/value pairs, that were applied to the email you sent, along with
     *        Amazon SES <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/monitor-using-event-publishing.html">Auto-Tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withEmailTags(java.util.Collection<MessageTag> emailTags) {
        setEmailTags(emailTags);
        return this;
    }

    /**
     * <p>
     * A set of insights associated with the message.
     * </p>
     * 
     * @return A set of insights associated with the message.
     */

    public java.util.List<EmailInsights> getInsights() {
        return insights;
    }

    /**
     * <p>
     * A set of insights associated with the message.
     * </p>
     * 
     * @param insights
     *        A set of insights associated with the message.
     */

    public void setInsights(java.util.Collection<EmailInsights> insights) {
        if (insights == null) {
            this.insights = null;
            return;
        }

        this.insights = new java.util.ArrayList<EmailInsights>(insights);
    }

    /**
     * <p>
     * A set of insights associated with the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsights(java.util.Collection)} or {@link #withInsights(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param insights
     *        A set of insights associated with the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withInsights(EmailInsights... insights) {
        if (this.insights == null) {
            setInsights(new java.util.ArrayList<EmailInsights>(insights.length));
        }
        for (EmailInsights ele : insights) {
            this.insights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of insights associated with the message.
     * </p>
     * 
     * @param insights
     *        A set of insights associated with the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMessageInsightsResult withInsights(java.util.Collection<EmailInsights> insights) {
        setInsights(insights);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append("***Sensitive Data Redacted***").append(",");
        if (getEmailTags() != null)
            sb.append("EmailTags: ").append(getEmailTags()).append(",");
        if (getInsights() != null)
            sb.append("Insights: ").append(getInsights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMessageInsightsResult == false)
            return false;
        GetMessageInsightsResult other = (GetMessageInsightsResult) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getEmailTags() == null ^ this.getEmailTags() == null)
            return false;
        if (other.getEmailTags() != null && other.getEmailTags().equals(this.getEmailTags()) == false)
            return false;
        if (other.getInsights() == null ^ this.getInsights() == null)
            return false;
        if (other.getInsights() != null && other.getInsights().equals(this.getInsights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getEmailTags() == null) ? 0 : getEmailTags().hashCode());
        hashCode = prime * hashCode + ((getInsights() == null) ? 0 : getInsights().hashCode());
        return hashCode;
    }

    @Override
    public GetMessageInsightsResult clone() {
        try {
            return (GetMessageInsightsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
