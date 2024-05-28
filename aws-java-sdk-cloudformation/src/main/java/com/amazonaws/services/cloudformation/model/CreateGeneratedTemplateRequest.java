/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGeneratedTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional list of resources to be included in the generated template.
     * </p>
     * <p>
     * If no resources are specified,the template will be created without any resources. Resources can be added to the
     * template using the <code>UpdateGeneratedTemplate</code> API action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceDefinition> resources;
    /**
     * <p>
     * The name assigned to the generated template.
     * </p>
     */
    private String generatedTemplateName;
    /**
     * <p>
     * An optional name or ARN of a stack to use as the base stack for the generated template.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;

    /**
     * <p>
     * An optional list of resources to be included in the generated template.
     * </p>
     * <p>
     * If no resources are specified,the template will be created without any resources. Resources can be added to the
     * template using the <code>UpdateGeneratedTemplate</code> API action.
     * </p>
     * 
     * @return An optional list of resources to be included in the generated template.</p>
     *         <p>
     *         If no resources are specified,the template will be created without any resources. Resources can be added
     *         to the template using the <code>UpdateGeneratedTemplate</code> API action.
     */

    public java.util.List<ResourceDefinition> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<ResourceDefinition>();
        }
        return resources;
    }

    /**
     * <p>
     * An optional list of resources to be included in the generated template.
     * </p>
     * <p>
     * If no resources are specified,the template will be created without any resources. Resources can be added to the
     * template using the <code>UpdateGeneratedTemplate</code> API action.
     * </p>
     * 
     * @param resources
     *        An optional list of resources to be included in the generated template.</p>
     *        <p>
     *        If no resources are specified,the template will be created without any resources. Resources can be added
     *        to the template using the <code>UpdateGeneratedTemplate</code> API action.
     */

    public void setResources(java.util.Collection<ResourceDefinition> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<ResourceDefinition>(resources);
    }

    /**
     * <p>
     * An optional list of resources to be included in the generated template.
     * </p>
     * <p>
     * If no resources are specified,the template will be created without any resources. Resources can be added to the
     * template using the <code>UpdateGeneratedTemplate</code> API action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        An optional list of resources to be included in the generated template.</p>
     *        <p>
     *        If no resources are specified,the template will be created without any resources. Resources can be added
     *        to the template using the <code>UpdateGeneratedTemplate</code> API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeneratedTemplateRequest withResources(ResourceDefinition... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<ResourceDefinition>(resources.length));
        }
        for (ResourceDefinition ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of resources to be included in the generated template.
     * </p>
     * <p>
     * If no resources are specified,the template will be created without any resources. Resources can be added to the
     * template using the <code>UpdateGeneratedTemplate</code> API action.
     * </p>
     * 
     * @param resources
     *        An optional list of resources to be included in the generated template.</p>
     *        <p>
     *        If no resources are specified,the template will be created without any resources. Resources can be added
     *        to the template using the <code>UpdateGeneratedTemplate</code> API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeneratedTemplateRequest withResources(java.util.Collection<ResourceDefinition> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The name assigned to the generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name assigned to the generated template.
     */

    public void setGeneratedTemplateName(String generatedTemplateName) {
        this.generatedTemplateName = generatedTemplateName;
    }

    /**
     * <p>
     * The name assigned to the generated template.
     * </p>
     * 
     * @return The name assigned to the generated template.
     */

    public String getGeneratedTemplateName() {
        return this.generatedTemplateName;
    }

    /**
     * <p>
     * The name assigned to the generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name assigned to the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeneratedTemplateRequest withGeneratedTemplateName(String generatedTemplateName) {
        setGeneratedTemplateName(generatedTemplateName);
        return this;
    }

    /**
     * <p>
     * An optional name or ARN of a stack to use as the base stack for the generated template.
     * </p>
     * 
     * @param stackName
     *        An optional name or ARN of a stack to use as the base stack for the generated template.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * An optional name or ARN of a stack to use as the base stack for the generated template.
     * </p>
     * 
     * @return An optional name or ARN of a stack to use as the base stack for the generated template.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * An optional name or ARN of a stack to use as the base stack for the generated template.
     * </p>
     * 
     * @param stackName
     *        An optional name or ARN of a stack to use as the base stack for the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeneratedTemplateRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     * 
     * @param templateConfiguration
     *        The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     *        <code>UpdateReplacePolicy</code>.
     */

    public void setTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
    }

    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     * 
     * @return The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     *         <code>UpdateReplacePolicy</code>.
     */

    public TemplateConfiguration getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     * 
     * @param templateConfiguration
     *        The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     *        <code>UpdateReplacePolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeneratedTemplateRequest withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
        setTemplateConfiguration(templateConfiguration);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getGeneratedTemplateName() != null)
            sb.append("GeneratedTemplateName: ").append(getGeneratedTemplateName()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getTemplateConfiguration() != null)
            sb.append("TemplateConfiguration: ").append(getTemplateConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGeneratedTemplateRequest == false)
            return false;
        CreateGeneratedTemplateRequest other = (CreateGeneratedTemplateRequest) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getGeneratedTemplateName() == null ^ this.getGeneratedTemplateName() == null)
            return false;
        if (other.getGeneratedTemplateName() != null && other.getGeneratedTemplateName().equals(this.getGeneratedTemplateName()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTemplateConfiguration() == null ^ this.getTemplateConfiguration() == null)
            return false;
        if (other.getTemplateConfiguration() != null && other.getTemplateConfiguration().equals(this.getTemplateConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getGeneratedTemplateName() == null) ? 0 : getGeneratedTemplateName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateGeneratedTemplateRequest clone() {
        return (CreateGeneratedTemplateRequest) super.clone();
    }

}
