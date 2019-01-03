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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The template for verification messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerificationMessageTemplateType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerificationMessageTemplateType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SMS message template.
     * </p>
     */
    private String smsMessage;
    /**
     * <p>
     * The email message template.
     * </p>
     */
    private String emailMessage;
    /**
     * <p>
     * The subject line for the email message template.
     * </p>
     */
    private String emailSubject;
    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * </p>
     */
    private String emailMessageByLink;
    /**
     * <p>
     * The subject line for the email message template for sending a confirmation link to the user.
     * </p>
     */
    private String emailSubjectByLink;
    /**
     * <p>
     * The default email option.
     * </p>
     */
    private String defaultEmailOption;

    /**
     * <p>
     * The SMS message template.
     * </p>
     * 
     * @param smsMessage
     *        The SMS message template.
     */

    public void setSmsMessage(String smsMessage) {
        this.smsMessage = smsMessage;
    }

    /**
     * <p>
     * The SMS message template.
     * </p>
     * 
     * @return The SMS message template.
     */

    public String getSmsMessage() {
        return this.smsMessage;
    }

    /**
     * <p>
     * The SMS message template.
     * </p>
     * 
     * @param smsMessage
     *        The SMS message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationMessageTemplateType withSmsMessage(String smsMessage) {
        setSmsMessage(smsMessage);
        return this;
    }

    /**
     * <p>
     * The email message template.
     * </p>
     * 
     * @param emailMessage
     *        The email message template.
     */

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The email message template.
     * </p>
     * 
     * @return The email message template.
     */

    public String getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * <p>
     * The email message template.
     * </p>
     * 
     * @param emailMessage
     *        The email message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationMessageTemplateType withEmailMessage(String emailMessage) {
        setEmailMessage(emailMessage);
        return this;
    }

    /**
     * <p>
     * The subject line for the email message template.
     * </p>
     * 
     * @param emailSubject
     *        The subject line for the email message template.
     */

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * <p>
     * The subject line for the email message template.
     * </p>
     * 
     * @return The subject line for the email message template.
     */

    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * <p>
     * The subject line for the email message template.
     * </p>
     * 
     * @param emailSubject
     *        The subject line for the email message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationMessageTemplateType withEmailSubject(String emailSubject) {
        setEmailSubject(emailSubject);
        return this;
    }

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * </p>
     * 
     * @param emailMessageByLink
     *        The email message template for sending a confirmation link to the user.
     */

    public void setEmailMessageByLink(String emailMessageByLink) {
        this.emailMessageByLink = emailMessageByLink;
    }

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * </p>
     * 
     * @return The email message template for sending a confirmation link to the user.
     */

    public String getEmailMessageByLink() {
        return this.emailMessageByLink;
    }

    /**
     * <p>
     * The email message template for sending a confirmation link to the user.
     * </p>
     * 
     * @param emailMessageByLink
     *        The email message template for sending a confirmation link to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationMessageTemplateType withEmailMessageByLink(String emailMessageByLink) {
        setEmailMessageByLink(emailMessageByLink);
        return this;
    }

    /**
     * <p>
     * The subject line for the email message template for sending a confirmation link to the user.
     * </p>
     * 
     * @param emailSubjectByLink
     *        The subject line for the email message template for sending a confirmation link to the user.
     */

    public void setEmailSubjectByLink(String emailSubjectByLink) {
        this.emailSubjectByLink = emailSubjectByLink;
    }

    /**
     * <p>
     * The subject line for the email message template for sending a confirmation link to the user.
     * </p>
     * 
     * @return The subject line for the email message template for sending a confirmation link to the user.
     */

    public String getEmailSubjectByLink() {
        return this.emailSubjectByLink;
    }

    /**
     * <p>
     * The subject line for the email message template for sending a confirmation link to the user.
     * </p>
     * 
     * @param emailSubjectByLink
     *        The subject line for the email message template for sending a confirmation link to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationMessageTemplateType withEmailSubjectByLink(String emailSubjectByLink) {
        setEmailSubjectByLink(emailSubjectByLink);
        return this;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * 
     * @param defaultEmailOption
     *        The default email option.
     * @see DefaultEmailOptionType
     */

    public void setDefaultEmailOption(String defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * 
     * @return The default email option.
     * @see DefaultEmailOptionType
     */

    public String getDefaultEmailOption() {
        return this.defaultEmailOption;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * 
     * @param defaultEmailOption
     *        The default email option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultEmailOptionType
     */

    public VerificationMessageTemplateType withDefaultEmailOption(String defaultEmailOption) {
        setDefaultEmailOption(defaultEmailOption);
        return this;
    }

    /**
     * <p>
     * The default email option.
     * </p>
     * 
     * @param defaultEmailOption
     *        The default email option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultEmailOptionType
     */

    public VerificationMessageTemplateType withDefaultEmailOption(DefaultEmailOptionType defaultEmailOption) {
        this.defaultEmailOption = defaultEmailOption.toString();
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
        if (getSmsMessage() != null)
            sb.append("SmsMessage: ").append(getSmsMessage()).append(",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: ").append(getEmailMessage()).append(",");
        if (getEmailSubject() != null)
            sb.append("EmailSubject: ").append(getEmailSubject()).append(",");
        if (getEmailMessageByLink() != null)
            sb.append("EmailMessageByLink: ").append(getEmailMessageByLink()).append(",");
        if (getEmailSubjectByLink() != null)
            sb.append("EmailSubjectByLink: ").append(getEmailSubjectByLink()).append(",");
        if (getDefaultEmailOption() != null)
            sb.append("DefaultEmailOption: ").append(getDefaultEmailOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerificationMessageTemplateType == false)
            return false;
        VerificationMessageTemplateType other = (VerificationMessageTemplateType) obj;
        if (other.getSmsMessage() == null ^ this.getSmsMessage() == null)
            return false;
        if (other.getSmsMessage() != null && other.getSmsMessage().equals(this.getSmsMessage()) == false)
            return false;
        if (other.getEmailMessage() == null ^ this.getEmailMessage() == null)
            return false;
        if (other.getEmailMessage() != null && other.getEmailMessage().equals(this.getEmailMessage()) == false)
            return false;
        if (other.getEmailSubject() == null ^ this.getEmailSubject() == null)
            return false;
        if (other.getEmailSubject() != null && other.getEmailSubject().equals(this.getEmailSubject()) == false)
            return false;
        if (other.getEmailMessageByLink() == null ^ this.getEmailMessageByLink() == null)
            return false;
        if (other.getEmailMessageByLink() != null && other.getEmailMessageByLink().equals(this.getEmailMessageByLink()) == false)
            return false;
        if (other.getEmailSubjectByLink() == null ^ this.getEmailSubjectByLink() == null)
            return false;
        if (other.getEmailSubjectByLink() != null && other.getEmailSubjectByLink().equals(this.getEmailSubjectByLink()) == false)
            return false;
        if (other.getDefaultEmailOption() == null ^ this.getDefaultEmailOption() == null)
            return false;
        if (other.getDefaultEmailOption() != null && other.getDefaultEmailOption().equals(this.getDefaultEmailOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSmsMessage() == null) ? 0 : getSmsMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailSubject() == null) ? 0 : getEmailSubject().hashCode());
        hashCode = prime * hashCode + ((getEmailMessageByLink() == null) ? 0 : getEmailMessageByLink().hashCode());
        hashCode = prime * hashCode + ((getEmailSubjectByLink() == null) ? 0 : getEmailSubjectByLink().hashCode());
        hashCode = prime * hashCode + ((getDefaultEmailOption() == null) ? 0 : getDefaultEmailOption().hashCode());
        return hashCode;
    }

    @Override
    public VerificationMessageTemplateType clone() {
        try {
            return (VerificationMessageTemplateType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.VerificationMessageTemplateTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
