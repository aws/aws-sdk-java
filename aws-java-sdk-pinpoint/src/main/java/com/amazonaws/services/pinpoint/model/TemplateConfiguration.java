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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the message template to use for the message, for each type of channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TemplateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     */
    private Template emailTemplate;
    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     */
    private Template pushTemplate;
    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     */
    private Template sMSTemplate;
    /**
     * <p>
     * The voice template to use for the message. This object isn't supported for campaigns.
     * </p>
     */
    private Template voiceTemplate;

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     * 
     * @param emailTemplate
     *        The email template to use for the message.
     */

    public void setEmailTemplate(Template emailTemplate) {
        this.emailTemplate = emailTemplate;
    }

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     * 
     * @return The email template to use for the message.
     */

    public Template getEmailTemplate() {
        return this.emailTemplate;
    }

    /**
     * <p>
     * The email template to use for the message.
     * </p>
     * 
     * @param emailTemplate
     *        The email template to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateConfiguration withEmailTemplate(Template emailTemplate) {
        setEmailTemplate(emailTemplate);
        return this;
    }

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     * 
     * @param pushTemplate
     *        The push notification template to use for the message.
     */

    public void setPushTemplate(Template pushTemplate) {
        this.pushTemplate = pushTemplate;
    }

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     * 
     * @return The push notification template to use for the message.
     */

    public Template getPushTemplate() {
        return this.pushTemplate;
    }

    /**
     * <p>
     * The push notification template to use for the message.
     * </p>
     * 
     * @param pushTemplate
     *        The push notification template to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateConfiguration withPushTemplate(Template pushTemplate) {
        setPushTemplate(pushTemplate);
        return this;
    }

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     * 
     * @param sMSTemplate
     *        The SMS template to use for the message.
     */

    public void setSMSTemplate(Template sMSTemplate) {
        this.sMSTemplate = sMSTemplate;
    }

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     * 
     * @return The SMS template to use for the message.
     */

    public Template getSMSTemplate() {
        return this.sMSTemplate;
    }

    /**
     * <p>
     * The SMS template to use for the message.
     * </p>
     * 
     * @param sMSTemplate
     *        The SMS template to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateConfiguration withSMSTemplate(Template sMSTemplate) {
        setSMSTemplate(sMSTemplate);
        return this;
    }

    /**
     * <p>
     * The voice template to use for the message. This object isn't supported for campaigns.
     * </p>
     * 
     * @param voiceTemplate
     *        The voice template to use for the message. This object isn't supported for campaigns.
     */

    public void setVoiceTemplate(Template voiceTemplate) {
        this.voiceTemplate = voiceTemplate;
    }

    /**
     * <p>
     * The voice template to use for the message. This object isn't supported for campaigns.
     * </p>
     * 
     * @return The voice template to use for the message. This object isn't supported for campaigns.
     */

    public Template getVoiceTemplate() {
        return this.voiceTemplate;
    }

    /**
     * <p>
     * The voice template to use for the message. This object isn't supported for campaigns.
     * </p>
     * 
     * @param voiceTemplate
     *        The voice template to use for the message. This object isn't supported for campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateConfiguration withVoiceTemplate(Template voiceTemplate) {
        setVoiceTemplate(voiceTemplate);
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
        if (getEmailTemplate() != null)
            sb.append("EmailTemplate: ").append(getEmailTemplate()).append(",");
        if (getPushTemplate() != null)
            sb.append("PushTemplate: ").append(getPushTemplate()).append(",");
        if (getSMSTemplate() != null)
            sb.append("SMSTemplate: ").append(getSMSTemplate()).append(",");
        if (getVoiceTemplate() != null)
            sb.append("VoiceTemplate: ").append(getVoiceTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateConfiguration == false)
            return false;
        TemplateConfiguration other = (TemplateConfiguration) obj;
        if (other.getEmailTemplate() == null ^ this.getEmailTemplate() == null)
            return false;
        if (other.getEmailTemplate() != null && other.getEmailTemplate().equals(this.getEmailTemplate()) == false)
            return false;
        if (other.getPushTemplate() == null ^ this.getPushTemplate() == null)
            return false;
        if (other.getPushTemplate() != null && other.getPushTemplate().equals(this.getPushTemplate()) == false)
            return false;
        if (other.getSMSTemplate() == null ^ this.getSMSTemplate() == null)
            return false;
        if (other.getSMSTemplate() != null && other.getSMSTemplate().equals(this.getSMSTemplate()) == false)
            return false;
        if (other.getVoiceTemplate() == null ^ this.getVoiceTemplate() == null)
            return false;
        if (other.getVoiceTemplate() != null && other.getVoiceTemplate().equals(this.getVoiceTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailTemplate() == null) ? 0 : getEmailTemplate().hashCode());
        hashCode = prime * hashCode + ((getPushTemplate() == null) ? 0 : getPushTemplate().hashCode());
        hashCode = prime * hashCode + ((getSMSTemplate() == null) ? 0 : getSMSTemplate().hashCode());
        hashCode = prime * hashCode + ((getVoiceTemplate() == null) ? 0 : getVoiceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public TemplateConfiguration clone() {
        try {
            return (TemplateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TemplateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
