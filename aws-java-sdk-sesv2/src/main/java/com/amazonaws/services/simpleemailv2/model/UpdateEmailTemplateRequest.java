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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to update an email template. For more information, see the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/UpdateEmailTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEmailTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the template you want to update.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     */
    private EmailTemplateContent templateContent;

    /**
     * <p>
     * The name of the template you want to update.
     * </p>
     * 
     * @param templateName
     *        The name of the template you want to update.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template you want to update.
     * </p>
     * 
     * @return The name of the template you want to update.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the template you want to update.
     * </p>
     * 
     * @param templateName
     *        The name of the template you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEmailTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     * 
     * @param templateContent
     *        The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     */

    public void setTemplateContent(EmailTemplateContent templateContent) {
        this.templateContent = templateContent;
    }

    /**
     * <p>
     * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     * 
     * @return The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     */

    public EmailTemplateContent getTemplateContent() {
        return this.templateContent;
    }

    /**
     * <p>
     * The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     * 
     * @param templateContent
     *        The content of the email template, composed of a subject line, an HTML part, and a text-only part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEmailTemplateRequest withTemplateContent(EmailTemplateContent templateContent) {
        setTemplateContent(templateContent);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateContent() != null)
            sb.append("TemplateContent: ").append(getTemplateContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEmailTemplateRequest == false)
            return false;
        UpdateEmailTemplateRequest other = (UpdateEmailTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateContent() == null ^ this.getTemplateContent() == null)
            return false;
        if (other.getTemplateContent() != null && other.getTemplateContent().equals(this.getTemplateContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateContent() == null) ? 0 : getTemplateContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEmailTemplateRequest clone() {
        return (UpdateEmailTemplateRequest) super.clone();
    }

}
