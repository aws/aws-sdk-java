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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TestRenderTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestRenderTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified
     * in the TemplateName parameter.
     * </p>
     */
    private String renderedTemplate;

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified
     * in the TemplateName parameter.
     * </p>
     * 
     * @param renderedTemplate
     *        The complete MIME message rendered by applying the data in the TemplateData parameter to the template
     *        specified in the TemplateName parameter.
     */

    public void setRenderedTemplate(String renderedTemplate) {
        this.renderedTemplate = renderedTemplate;
    }

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified
     * in the TemplateName parameter.
     * </p>
     * 
     * @return The complete MIME message rendered by applying the data in the TemplateData parameter to the template
     *         specified in the TemplateName parameter.
     */

    public String getRenderedTemplate() {
        return this.renderedTemplate;
    }

    /**
     * <p>
     * The complete MIME message rendered by applying the data in the TemplateData parameter to the template specified
     * in the TemplateName parameter.
     * </p>
     * 
     * @param renderedTemplate
     *        The complete MIME message rendered by applying the data in the TemplateData parameter to the template
     *        specified in the TemplateName parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestRenderTemplateResult withRenderedTemplate(String renderedTemplate) {
        setRenderedTemplate(renderedTemplate);
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
        if (getRenderedTemplate() != null)
            sb.append("RenderedTemplate: ").append(getRenderedTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRenderTemplateResult == false)
            return false;
        TestRenderTemplateResult other = (TestRenderTemplateResult) obj;
        if (other.getRenderedTemplate() == null ^ this.getRenderedTemplate() == null)
            return false;
        if (other.getRenderedTemplate() != null && other.getRenderedTemplate().equals(this.getRenderedTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenderedTemplate() == null) ? 0 : getRenderedTemplate().hashCode());
        return hashCode;
    }

    @Override
    public TestRenderTemplateResult clone() {
        try {
            return (TestRenderTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
