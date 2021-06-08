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
 * Represents a request to delete an email template. For more information, see the <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-personalized-email-api.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/DeleteEmailTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEmailTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the template to be deleted.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The name of the template to be deleted.
     * </p>
     * 
     * @param templateName
     *        The name of the template to be deleted.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template to be deleted.
     * </p>
     * 
     * @return The name of the template to be deleted.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the template to be deleted.
     * </p>
     * 
     * @param templateName
     *        The name of the template to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEmailTemplateRequest withTemplateName(String templateName) {
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

        if (obj instanceof DeleteEmailTemplateRequest == false)
            return false;
        DeleteEmailTemplateRequest other = (DeleteEmailTemplateRequest) obj;
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

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEmailTemplateRequest clone() {
        return (DeleteEmailTemplateRequest) super.clone();
    }

}
