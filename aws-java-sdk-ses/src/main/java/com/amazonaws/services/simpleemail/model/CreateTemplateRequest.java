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
 * Represents a request to create an email template. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/CreateTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     */
    private Template template;

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     * 
     * @param template
     *        The content of the email, composed of a subject line, an HTML part, and a text-only part.
     */

    public void setTemplate(Template template) {
        this.template = template;
    }

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     * 
     * @return The content of the email, composed of a subject line, an HTML part, and a text-only part.
     */

    public Template getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The content of the email, composed of a subject line, an HTML part, and a text-only part.
     * </p>
     * 
     * @param template
     *        The content of the email, composed of a subject line, an HTML part, and a text-only part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withTemplate(Template template) {
        setTemplate(template);
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
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateRequest == false)
            return false;
        CreateTemplateRequest other = (CreateTemplateRequest) obj;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreateTemplateRequest clone() {
        return (CreateTemplateRequest) super.clone();
    }

}
