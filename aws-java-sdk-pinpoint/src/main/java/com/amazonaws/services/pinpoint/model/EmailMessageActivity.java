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
 * Specifies the settings for an email activity in a journey. This type of activity sends an email message to
 * participants.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EmailMessageActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailMessageActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     */
    private JourneyEmailMessage messageConfig;
    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message is sent.
     * </p>
     */
    private String nextActivity;
    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The unique identifier for the version of the email template to use for the message. If specified, this value must
     * match the identifier for an existing template version. To retrieve a list of versions and version identifiers for
     * a template, use the <link linkend="templates-template-name-template-type-versions">Template Versions</link>
     * resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     */
    private String templateVersion;

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     * 
     * @param messageConfig
     *        The "From" address to use for the message.
     */

    public void setMessageConfig(JourneyEmailMessage messageConfig) {
        this.messageConfig = messageConfig;
    }

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     * 
     * @return The "From" address to use for the message.
     */

    public JourneyEmailMessage getMessageConfig() {
        return this.messageConfig;
    }

    /**
     * <p>
     * The "From" address to use for the message.
     * </p>
     * 
     * @param messageConfig
     *        The "From" address to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessageActivity withMessageConfig(JourneyEmailMessage messageConfig) {
        setMessageConfig(messageConfig);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message is sent.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform, after the message is sent.
     */

    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message is sent.
     * </p>
     * 
     * @return The unique identifier for the next activity to perform, after the message is sent.
     */

    public String getNextActivity() {
        return this.nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after the message is sent.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform, after the message is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessageActivity withNextActivity(String nextActivity) {
        setNextActivity(nextActivity);
        return this;
    }

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     * 
     * @param templateName
     *        The name of the email template to use for the message.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     * 
     * @return The name of the email template to use for the message.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the email template to use for the message.
     * </p>
     * 
     * @param templateName
     *        The name of the email template to use for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessageActivity withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the email template to use for the message. If specified, this value must
     * match the identifier for an existing template version. To retrieve a list of versions and version identifiers for
     * a template, use the <link linkend="templates-template-name-template-type-versions">Template Versions</link>
     * resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @param templateVersion
     *        The unique identifier for the version of the email template to use for the message. If specified, this
     *        value must match the identifier for an existing template version. To retrieve a list of versions and
     *        version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *        template. The <i>active version</i> is typically the version of a template that's been most recently
     *        reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *        template.
     */

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the email template to use for the message. If specified, this value must
     * match the identifier for an existing template version. To retrieve a list of versions and version identifiers for
     * a template, use the <link linkend="templates-template-name-template-type-versions">Template Versions</link>
     * resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @return The unique identifier for the version of the email template to use for the message. If specified, this
     *         value must match the identifier for an existing template version. To retrieve a list of versions and
     *         version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *         <p>
     *         If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *         template. The <i>active version</i> is typically the version of a template that's been most recently
     *         reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *         template.
     */

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the email template to use for the message. If specified, this value must
     * match the identifier for an existing template version. To retrieve a list of versions and version identifiers for
     * a template, use the <link linkend="templates-template-name-template-type-versions">Template Versions</link>
     * resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @param templateVersion
     *        The unique identifier for the version of the email template to use for the message. If specified, this
     *        value must match the identifier for an existing template version. To retrieve a list of versions and
     *        version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *        template. The <i>active version</i> is typically the version of a template that's been most recently
     *        reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailMessageActivity withTemplateVersion(String templateVersion) {
        setTemplateVersion(templateVersion);
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
        if (getMessageConfig() != null)
            sb.append("MessageConfig: ").append(getMessageConfig()).append(",");
        if (getNextActivity() != null)
            sb.append("NextActivity: ").append(getNextActivity()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: ").append(getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailMessageActivity == false)
            return false;
        EmailMessageActivity other = (EmailMessageActivity) obj;
        if (other.getMessageConfig() == null ^ this.getMessageConfig() == null)
            return false;
        if (other.getMessageConfig() != null && other.getMessageConfig().equals(this.getMessageConfig()) == false)
            return false;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageConfig() == null) ? 0 : getMessageConfig().hashCode());
        hashCode = prime * hashCode + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public EmailMessageActivity clone() {
        try {
            return (EmailMessageActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EmailMessageActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
