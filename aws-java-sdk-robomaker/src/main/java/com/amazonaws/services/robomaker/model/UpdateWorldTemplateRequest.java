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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateWorldTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorldTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template to update.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The world template body.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The location of the world template.
     * </p>
     */
    private TemplateLocation templateLocation;

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template to update.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template to update.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template to update.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world template to update.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template to update.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @return The name of the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param name
     *        The name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @param templateBody
     *        The world template body.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @return The world template body.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @param templateBody
     *        The world template body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The location of the world template.
     * </p>
     * 
     * @param templateLocation
     *        The location of the world template.
     */

    public void setTemplateLocation(TemplateLocation templateLocation) {
        this.templateLocation = templateLocation;
    }

    /**
     * <p>
     * The location of the world template.
     * </p>
     * 
     * @return The location of the world template.
     */

    public TemplateLocation getTemplateLocation() {
        return this.templateLocation;
    }

    /**
     * <p>
     * The location of the world template.
     * </p>
     * 
     * @param templateLocation
     *        The location of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorldTemplateRequest withTemplateLocation(TemplateLocation templateLocation) {
        setTemplateLocation(templateLocation);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateLocation() != null)
            sb.append("TemplateLocation: ").append(getTemplateLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorldTemplateRequest == false)
            return false;
        UpdateWorldTemplateRequest other = (UpdateWorldTemplateRequest) obj;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateLocation() == null ^ this.getTemplateLocation() == null)
            return false;
        if (other.getTemplateLocation() != null && other.getTemplateLocation().equals(this.getTemplateLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateLocation() == null) ? 0 : getTemplateLocation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorldTemplateRequest clone() {
        return (UpdateWorldTemplateRequest) super.clone();
    }

}
