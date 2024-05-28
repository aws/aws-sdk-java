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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateGeneratedTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGeneratedTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     */
    private String generatedTemplateName;
    /**
     * <p>
     * An optional new name to assign to the generated template.
     * </p>
     */
    private String newGeneratedTemplateName;
    /**
     * <p>
     * An optional list of resources to be added to the generated template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceDefinition> addResources;
    /**
     * <p>
     * A list of logical ids for resources to remove from the generated template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeResources;
    /**
     * <p>
     * If <code>true</code>, update the resource properties in the generated template with their current live state.
     * This feature is useful when the resource properties in your generated a template does not reflect the live state
     * of the resource properties. This happens when a user update the resource properties after generating a template.
     * </p>
     */
    private Boolean refreshAllResources;
    /**
     * <p>
     * The configuration details of the generated template, including the <code>DeletionPolicy</code> and
     * <code>UpdateReplacePolicy</code>.
     * </p>
     */
    private TemplateConfiguration templateConfiguration;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name or Amazon Resource Name (ARN) of a generated template.
     */

    public void setGeneratedTemplateName(String generatedTemplateName) {
        this.generatedTemplateName = generatedTemplateName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of a generated template.
     */

    public String getGeneratedTemplateName() {
        return this.generatedTemplateName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a generated template.
     * </p>
     * 
     * @param generatedTemplateName
     *        The name or Amazon Resource Name (ARN) of a generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withGeneratedTemplateName(String generatedTemplateName) {
        setGeneratedTemplateName(generatedTemplateName);
        return this;
    }

    /**
     * <p>
     * An optional new name to assign to the generated template.
     * </p>
     * 
     * @param newGeneratedTemplateName
     *        An optional new name to assign to the generated template.
     */

    public void setNewGeneratedTemplateName(String newGeneratedTemplateName) {
        this.newGeneratedTemplateName = newGeneratedTemplateName;
    }

    /**
     * <p>
     * An optional new name to assign to the generated template.
     * </p>
     * 
     * @return An optional new name to assign to the generated template.
     */

    public String getNewGeneratedTemplateName() {
        return this.newGeneratedTemplateName;
    }

    /**
     * <p>
     * An optional new name to assign to the generated template.
     * </p>
     * 
     * @param newGeneratedTemplateName
     *        An optional new name to assign to the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withNewGeneratedTemplateName(String newGeneratedTemplateName) {
        setNewGeneratedTemplateName(newGeneratedTemplateName);
        return this;
    }

    /**
     * <p>
     * An optional list of resources to be added to the generated template.
     * </p>
     * 
     * @return An optional list of resources to be added to the generated template.
     */

    public java.util.List<ResourceDefinition> getAddResources() {
        if (addResources == null) {
            addResources = new com.amazonaws.internal.SdkInternalList<ResourceDefinition>();
        }
        return addResources;
    }

    /**
     * <p>
     * An optional list of resources to be added to the generated template.
     * </p>
     * 
     * @param addResources
     *        An optional list of resources to be added to the generated template.
     */

    public void setAddResources(java.util.Collection<ResourceDefinition> addResources) {
        if (addResources == null) {
            this.addResources = null;
            return;
        }

        this.addResources = new com.amazonaws.internal.SdkInternalList<ResourceDefinition>(addResources);
    }

    /**
     * <p>
     * An optional list of resources to be added to the generated template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddResources(java.util.Collection)} or {@link #withAddResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addResources
     *        An optional list of resources to be added to the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withAddResources(ResourceDefinition... addResources) {
        if (this.addResources == null) {
            setAddResources(new com.amazonaws.internal.SdkInternalList<ResourceDefinition>(addResources.length));
        }
        for (ResourceDefinition ele : addResources) {
            this.addResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of resources to be added to the generated template.
     * </p>
     * 
     * @param addResources
     *        An optional list of resources to be added to the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withAddResources(java.util.Collection<ResourceDefinition> addResources) {
        setAddResources(addResources);
        return this;
    }

    /**
     * <p>
     * A list of logical ids for resources to remove from the generated template.
     * </p>
     * 
     * @return A list of logical ids for resources to remove from the generated template.
     */

    public java.util.List<String> getRemoveResources() {
        if (removeResources == null) {
            removeResources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeResources;
    }

    /**
     * <p>
     * A list of logical ids for resources to remove from the generated template.
     * </p>
     * 
     * @param removeResources
     *        A list of logical ids for resources to remove from the generated template.
     */

    public void setRemoveResources(java.util.Collection<String> removeResources) {
        if (removeResources == null) {
            this.removeResources = null;
            return;
        }

        this.removeResources = new com.amazonaws.internal.SdkInternalList<String>(removeResources);
    }

    /**
     * <p>
     * A list of logical ids for resources to remove from the generated template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveResources(java.util.Collection)} or {@link #withRemoveResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeResources
     *        A list of logical ids for resources to remove from the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withRemoveResources(String... removeResources) {
        if (this.removeResources == null) {
            setRemoveResources(new com.amazonaws.internal.SdkInternalList<String>(removeResources.length));
        }
        for (String ele : removeResources) {
            this.removeResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of logical ids for resources to remove from the generated template.
     * </p>
     * 
     * @param removeResources
     *        A list of logical ids for resources to remove from the generated template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withRemoveResources(java.util.Collection<String> removeResources) {
        setRemoveResources(removeResources);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, update the resource properties in the generated template with their current live state.
     * This feature is useful when the resource properties in your generated a template does not reflect the live state
     * of the resource properties. This happens when a user update the resource properties after generating a template.
     * </p>
     * 
     * @param refreshAllResources
     *        If <code>true</code>, update the resource properties in the generated template with their current live
     *        state. This feature is useful when the resource properties in your generated a template does not reflect
     *        the live state of the resource properties. This happens when a user update the resource properties after
     *        generating a template.
     */

    public void setRefreshAllResources(Boolean refreshAllResources) {
        this.refreshAllResources = refreshAllResources;
    }

    /**
     * <p>
     * If <code>true</code>, update the resource properties in the generated template with their current live state.
     * This feature is useful when the resource properties in your generated a template does not reflect the live state
     * of the resource properties. This happens when a user update the resource properties after generating a template.
     * </p>
     * 
     * @return If <code>true</code>, update the resource properties in the generated template with their current live
     *         state. This feature is useful when the resource properties in your generated a template does not reflect
     *         the live state of the resource properties. This happens when a user update the resource properties after
     *         generating a template.
     */

    public Boolean getRefreshAllResources() {
        return this.refreshAllResources;
    }

    /**
     * <p>
     * If <code>true</code>, update the resource properties in the generated template with their current live state.
     * This feature is useful when the resource properties in your generated a template does not reflect the live state
     * of the resource properties. This happens when a user update the resource properties after generating a template.
     * </p>
     * 
     * @param refreshAllResources
     *        If <code>true</code>, update the resource properties in the generated template with their current live
     *        state. This feature is useful when the resource properties in your generated a template does not reflect
     *        the live state of the resource properties. This happens when a user update the resource properties after
     *        generating a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeneratedTemplateRequest withRefreshAllResources(Boolean refreshAllResources) {
        setRefreshAllResources(refreshAllResources);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, update the resource properties in the generated template with their current live state.
     * This feature is useful when the resource properties in your generated a template does not reflect the live state
     * of the resource properties. This happens when a user update the resource properties after generating a template.
     * </p>
     * 
     * @return If <code>true</code>, update the resource properties in the generated template with their current live
     *         state. This feature is useful when the resource properties in your generated a template does not reflect
     *         the live state of the resource properties. This happens when a user update the resource properties after
     *         generating a template.
     */

    public Boolean isRefreshAllResources() {
        return this.refreshAllResources;
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

    public UpdateGeneratedTemplateRequest withTemplateConfiguration(TemplateConfiguration templateConfiguration) {
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
        if (getGeneratedTemplateName() != null)
            sb.append("GeneratedTemplateName: ").append(getGeneratedTemplateName()).append(",");
        if (getNewGeneratedTemplateName() != null)
            sb.append("NewGeneratedTemplateName: ").append(getNewGeneratedTemplateName()).append(",");
        if (getAddResources() != null)
            sb.append("AddResources: ").append(getAddResources()).append(",");
        if (getRemoveResources() != null)
            sb.append("RemoveResources: ").append(getRemoveResources()).append(",");
        if (getRefreshAllResources() != null)
            sb.append("RefreshAllResources: ").append(getRefreshAllResources()).append(",");
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

        if (obj instanceof UpdateGeneratedTemplateRequest == false)
            return false;
        UpdateGeneratedTemplateRequest other = (UpdateGeneratedTemplateRequest) obj;
        if (other.getGeneratedTemplateName() == null ^ this.getGeneratedTemplateName() == null)
            return false;
        if (other.getGeneratedTemplateName() != null && other.getGeneratedTemplateName().equals(this.getGeneratedTemplateName()) == false)
            return false;
        if (other.getNewGeneratedTemplateName() == null ^ this.getNewGeneratedTemplateName() == null)
            return false;
        if (other.getNewGeneratedTemplateName() != null && other.getNewGeneratedTemplateName().equals(this.getNewGeneratedTemplateName()) == false)
            return false;
        if (other.getAddResources() == null ^ this.getAddResources() == null)
            return false;
        if (other.getAddResources() != null && other.getAddResources().equals(this.getAddResources()) == false)
            return false;
        if (other.getRemoveResources() == null ^ this.getRemoveResources() == null)
            return false;
        if (other.getRemoveResources() != null && other.getRemoveResources().equals(this.getRemoveResources()) == false)
            return false;
        if (other.getRefreshAllResources() == null ^ this.getRefreshAllResources() == null)
            return false;
        if (other.getRefreshAllResources() != null && other.getRefreshAllResources().equals(this.getRefreshAllResources()) == false)
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

        hashCode = prime * hashCode + ((getGeneratedTemplateName() == null) ? 0 : getGeneratedTemplateName().hashCode());
        hashCode = prime * hashCode + ((getNewGeneratedTemplateName() == null) ? 0 : getNewGeneratedTemplateName().hashCode());
        hashCode = prime * hashCode + ((getAddResources() == null) ? 0 : getAddResources().hashCode());
        hashCode = prime * hashCode + ((getRemoveResources() == null) ? 0 : getRemoveResources().hashCode());
        hashCode = prime * hashCode + ((getRefreshAllResources() == null) ? 0 : getRefreshAllResources().hashCode());
        hashCode = prime * hashCode + ((getTemplateConfiguration() == null) ? 0 : getTemplateConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGeneratedTemplateRequest clone() {
        return (UpdateGeneratedTemplateRequest) super.clone();
    }

}
