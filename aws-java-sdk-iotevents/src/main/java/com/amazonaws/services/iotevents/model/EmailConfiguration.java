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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of email notifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/EmailConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address that sends emails.
     * </p>
     * <important>
     * <p>
     * If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email address
     * that sends emails in Amazon SES</a>.
     * </p>
     * </important>
     */
    private String from;
    /**
     * <p>
     * Contains the subject and message of an email.
     * </p>
     */
    private EmailContent content;
    /**
     * <p>
     * Contains the information of one or more recipients who receive the emails.
     * </p>
     * <important>
     * <p>
     * You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users that
     * receive emails to your AWS SSO store</a>.
     * </p>
     * </important>
     */
    private EmailRecipients recipients;

    /**
     * <p>
     * The email address that sends emails.
     * </p>
     * <important>
     * <p>
     * If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email address
     * that sends emails in Amazon SES</a>.
     * </p>
     * </important>
     * 
     * @param from
     *        The email address that sends emails.</p> <important>
     *        <p>
     *        If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email
     *        address that sends emails in Amazon SES</a>.
     *        </p>
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The email address that sends emails.
     * </p>
     * <important>
     * <p>
     * If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email address
     * that sends emails in Amazon SES</a>.
     * </p>
     * </important>
     * 
     * @return The email address that sends emails.</p> <important>
     *         <p>
     *         If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     *         href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email
     *         address that sends emails in Amazon SES</a>.
     *         </p>
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The email address that sends emails.
     * </p>
     * <important>
     * <p>
     * If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email address
     * that sends emails in Amazon SES</a>.
     * </p>
     * </important>
     * 
     * @param from
     *        The email address that sends emails.</p> <important>
     *        <p>
     *        If you use the AWS IoT Events managed AWS Lambda function to manage your emails, you must <a
     *        href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-email-addresses.html">verify the email
     *        address that sends emails in Amazon SES</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfiguration withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * Contains the subject and message of an email.
     * </p>
     * 
     * @param content
     *        Contains the subject and message of an email.
     */

    public void setContent(EmailContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Contains the subject and message of an email.
     * </p>
     * 
     * @return Contains the subject and message of an email.
     */

    public EmailContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Contains the subject and message of an email.
     * </p>
     * 
     * @param content
     *        Contains the subject and message of an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfiguration withContent(EmailContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Contains the information of one or more recipients who receive the emails.
     * </p>
     * <important>
     * <p>
     * You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users that
     * receive emails to your AWS SSO store</a>.
     * </p>
     * </important>
     * 
     * @param recipients
     *        Contains the information of one or more recipients who receive the emails.</p> <important>
     *        <p>
     *        You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users
     *        that receive emails to your AWS SSO store</a>.
     *        </p>
     */

    public void setRecipients(EmailRecipients recipients) {
        this.recipients = recipients;
    }

    /**
     * <p>
     * Contains the information of one or more recipients who receive the emails.
     * </p>
     * <important>
     * <p>
     * You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users that
     * receive emails to your AWS SSO store</a>.
     * </p>
     * </important>
     * 
     * @return Contains the information of one or more recipients who receive the emails.</p> <important>
     *         <p>
     *         You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users
     *         that receive emails to your AWS SSO store</a>.
     *         </p>
     */

    public EmailRecipients getRecipients() {
        return this.recipients;
    }

    /**
     * <p>
     * Contains the information of one or more recipients who receive the emails.
     * </p>
     * <important>
     * <p>
     * You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users that
     * receive emails to your AWS SSO store</a>.
     * </p>
     * </important>
     * 
     * @param recipients
     *        Contains the information of one or more recipients who receive the emails.</p> <important>
     *        <p>
     *        You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users
     *        that receive emails to your AWS SSO store</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfiguration withRecipients(EmailRecipients recipients) {
        setRecipients(recipients);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getRecipients() != null)
            sb.append("Recipients: ").append(getRecipients());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailConfiguration == false)
            return false;
        EmailConfiguration other = (EmailConfiguration) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getRecipients() == null ^ this.getRecipients() == null)
            return false;
        if (other.getRecipients() != null && other.getRecipients().equals(this.getRecipients()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getRecipients() == null) ? 0 : getRecipients().hashCode());
        return hashCode;
    }

    @Override
    public EmailConfiguration clone() {
        try {
            return (EmailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.EmailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
