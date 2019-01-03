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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TestRenderTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRenderTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     */
    private String templateData;

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     * 
     * @param templateName
     *        The name of the template that you want to render.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     * 
     * @return The name of the template that you want to render.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the template that you want to render.
     * </p>
     * 
     * @param templateName
     *        The name of the template that you want to render.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRenderTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param templateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @return A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *         consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     */

    public String getTemplateData() {
        return this.templateData;
    }

    /**
     * <p>
     * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of
     * key-value pairs in which the keys correspond to replacement tags in the email template.
     * </p>
     * 
     * @param templateData
     *        A list of replacement values to apply to the template. This parameter is a JSON object, typically
     *        consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRenderTemplateRequest withTemplateData(String templateData) {
        setTemplateData(templateData);
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
        if (getTemplateData() != null)
            sb.append("TemplateData: ").append(getTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRenderTemplateRequest == false)
            return false;
        TestRenderTemplateRequest other = (TestRenderTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateData() == null ^ this.getTemplateData() == null)
            return false;
        if (other.getTemplateData() != null && other.getTemplateData().equals(this.getTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateData() == null) ? 0 : getTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public TestRenderTemplateRequest clone() {
        return (TestRenderTemplateRequest) super.clone();
    }

}
