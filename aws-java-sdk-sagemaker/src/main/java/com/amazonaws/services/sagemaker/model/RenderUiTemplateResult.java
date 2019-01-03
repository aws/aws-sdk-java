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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenderUiTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     */
    private String renderedContent;
    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the template.
     * If there were no errors, the list is empty.
     * </p>
     */
    private java.util.List<RenderingError> errors;

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     * 
     * @param renderedContent
     *        A Liquid template that renders the HTML for the worker UI.
     */

    public void setRenderedContent(String renderedContent) {
        this.renderedContent = renderedContent;
    }

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     * 
     * @return A Liquid template that renders the HTML for the worker UI.
     */

    public String getRenderedContent() {
        return this.renderedContent;
    }

    /**
     * <p>
     * A Liquid template that renders the HTML for the worker UI.
     * </p>
     * 
     * @param renderedContent
     *        A Liquid template that renders the HTML for the worker UI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderUiTemplateResult withRenderedContent(String renderedContent) {
        setRenderedContent(renderedContent);
        return this;
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the template.
     * If there were no errors, the list is empty.
     * </p>
     * 
     * @return A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the
     *         template. If there were no errors, the list is empty.
     */

    public java.util.List<RenderingError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the template.
     * If there were no errors, the list is empty.
     * </p>
     * 
     * @param errors
     *        A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the
     *        template. If there were no errors, the list is empty.
     */

    public void setErrors(java.util.Collection<RenderingError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<RenderingError>(errors);
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the template.
     * If there were no errors, the list is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the
     *        template. If there were no errors, the list is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderUiTemplateResult withErrors(RenderingError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<RenderingError>(errors.length));
        }
        for (RenderingError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the template.
     * If there were no errors, the list is empty.
     * </p>
     * 
     * @param errors
     *        A list of one or more <code>RenderingError</code> objects if any were encountered while rendering the
     *        template. If there were no errors, the list is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenderUiTemplateResult withErrors(java.util.Collection<RenderingError> errors) {
        setErrors(errors);
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
        if (getRenderedContent() != null)
            sb.append("RenderedContent: ").append(getRenderedContent()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderUiTemplateResult == false)
            return false;
        RenderUiTemplateResult other = (RenderUiTemplateResult) obj;
        if (other.getRenderedContent() == null ^ this.getRenderedContent() == null)
            return false;
        if (other.getRenderedContent() != null && other.getRenderedContent().equals(this.getRenderedContent()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenderedContent() == null) ? 0 : getRenderedContent().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public RenderUiTemplateResult clone() {
        try {
            return (RenderUiTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
