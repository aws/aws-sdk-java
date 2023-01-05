/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateMappingTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateMappingTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The mapping template; this can be a request or response template. A <code>template</code> is required for this
     * action.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     */
    private String context;

    /**
     * <p>
     * The mapping template; this can be a request or response template. A <code>template</code> is required for this
     * action.
     * </p>
     * 
     * @param template
     *        The mapping template; this can be a request or response template. A <code>template</code> is required for
     *        this action.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The mapping template; this can be a request or response template. A <code>template</code> is required for this
     * action.
     * </p>
     * 
     * @return The mapping template; this can be a request or response template. A <code>template</code> is required for
     *         this action.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The mapping template; this can be a request or response template. A <code>template</code> is required for this
     * action.
     * </p>
     * 
     * @param template
     *        The mapping template; this can be a request or response template. A <code>template</code> is required for
     *        this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateMappingTemplateRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     * 
     * @param context
     *        The map that holds all of the contextual information for your resolver invocation. A <code>context</code>
     *        is required for this action.
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     * 
     * @return The map that holds all of the contextual information for your resolver invocation. A <code>context</code>
     *         is required for this action.
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     * 
     * @param context
     *        The map that holds all of the contextual information for your resolver invocation. A <code>context</code>
     *        is required for this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateMappingTemplateRequest withContext(String context) {
        setContext(context);
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
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateMappingTemplateRequest == false)
            return false;
        EvaluateMappingTemplateRequest other = (EvaluateMappingTemplateRequest) obj;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateMappingTemplateRequest clone() {
        return (EvaluateMappingTemplateRequest) super.clone();
    }

}
