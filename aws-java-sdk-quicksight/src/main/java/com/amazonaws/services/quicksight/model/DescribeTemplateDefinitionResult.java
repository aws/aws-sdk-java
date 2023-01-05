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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTemplateDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTemplateDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the template described.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * Errors associated with the template version.
     * </p>
     */
    private java.util.List<TemplateError> errors;
    /**
     * <p>
     * Status associated with the template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceStatus;
    /**
     * <p>
     * The ARN of the theme of the template.
     * </p>
     */
    private String themeArn;
    /**
     * <p>
     * The definition of the template.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     */
    private TemplateVersionDefinition definition;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * The descriptive name of the template.
     * </p>
     * 
     * @param name
     *        The descriptive name of the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name of the template.
     * </p>
     * 
     * @return The descriptive name of the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name of the template.
     * </p>
     * 
     * @param name
     *        The descriptive name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the template described.
     * </p>
     * 
     * @param templateId
     *        The ID of the template described.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template described.
     * </p>
     * 
     * @return The ID of the template described.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template described.
     * </p>
     * 
     * @param templateId
     *        The ID of the template described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * Errors associated with the template version.
     * </p>
     * 
     * @return Errors associated with the template version.
     */

    public java.util.List<TemplateError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with the template version.
     * </p>
     * 
     * @param errors
     *        Errors associated with the template version.
     */

    public void setErrors(java.util.Collection<TemplateError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<TemplateError>(errors);
    }

    /**
     * <p>
     * Errors associated with the template version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors associated with the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withErrors(TemplateError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<TemplateError>(errors.length));
        }
        for (TemplateError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with the template version.
     * </p>
     * 
     * @param errors
     *        Errors associated with the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withErrors(java.util.Collection<TemplateError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Status associated with the template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceStatus
     *        Status associated with the template.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATION_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>
     *        </p>
     *        </li>
     * @see ResourceStatus
     */

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Status associated with the template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Status associated with the template.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATION_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATION_SUCCESSFUL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATION_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_SUCCESSFUL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code>
     *         </p>
     *         </li>
     * @see ResourceStatus
     */

    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Status associated with the template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceStatus
     *        Status associated with the template.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATION_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public DescribeTemplateDefinitionResult withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Status associated with the template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceStatus
     *        Status associated with the template.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATION_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public DescribeTemplateDefinitionResult withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the theme of the template.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the template.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the template.
     * </p>
     * 
     * @return The ARN of the theme of the template.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the template.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withThemeArn(String themeArn) {
        setThemeArn(themeArn);
        return this;
    }

    /**
     * <p>
     * The definition of the template.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @param definition
     *        The definition of the template.</p>
     *        <p>
     *        A definition is the data model of all features in a Dashboard, Template, or Analysis.
     */

    public void setDefinition(TemplateVersionDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition of the template.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @return The definition of the template.</p>
     *         <p>
     *         A definition is the data model of all features in a Dashboard, Template, or Analysis.
     */

    public TemplateVersionDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition of the template.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @param definition
     *        The definition of the template.</p>
     *        <p>
     *        A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withDefinition(TemplateVersionDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTemplateDefinitionResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: ").append(getResourceStatus()).append(",");
        if (getThemeArn() != null)
            sb.append("ThemeArn: ").append(getThemeArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTemplateDefinitionResult == false)
            return false;
        DescribeTemplateDefinitionResult other = (DescribeTemplateDefinitionResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getThemeArn() == null ^ this.getThemeArn() == null)
            return false;
        if (other.getThemeArn() != null && other.getThemeArn().equals(this.getThemeArn()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTemplateDefinitionResult clone() {
        try {
            return (DescribeTemplateDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
