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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateEmailTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEmailTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private EmailTemplateRequest emailTemplateRequest;
    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     */
    private String templateName;

    /**
     * @param emailTemplateRequest
     */

    public void setEmailTemplateRequest(EmailTemplateRequest emailTemplateRequest) {
        this.emailTemplateRequest = emailTemplateRequest;
    }

    /**
     * @return
     */

    public EmailTemplateRequest getEmailTemplateRequest() {
        return this.emailTemplateRequest;
    }

    /**
     * @param emailTemplateRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailTemplateRequest withEmailTemplateRequest(EmailTemplateRequest emailTemplateRequest) {
        setEmailTemplateRequest(emailTemplateRequest);
        return this;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @param templateName
     *        The name of the message template. A template name must start with an alphanumeric character and can
     *        contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *        hyphens (-). Template names are case sensitive.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @return The name of the message template. A template name must start with an alphanumeric character and can
     *         contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *         hyphens (-). Template names are case sensitive.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @param templateName
     *        The name of the message template. A template name must start with an alphanumeric character and can
     *        contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *        hyphens (-). Template names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEmailTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getEmailTemplateRequest() != null)
            sb.append("EmailTemplateRequest: ").append(getEmailTemplateRequest()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEmailTemplateRequest == false)
            return false;
        CreateEmailTemplateRequest other = (CreateEmailTemplateRequest) obj;
        if (other.getEmailTemplateRequest() == null ^ this.getEmailTemplateRequest() == null)
            return false;
        if (other.getEmailTemplateRequest() != null && other.getEmailTemplateRequest().equals(this.getEmailTemplateRequest()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailTemplateRequest() == null) ? 0 : getEmailTemplateRequest().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public CreateEmailTemplateRequest clone() {
        return (CreateEmailTemplateRequest) super.clone();
    }

}
