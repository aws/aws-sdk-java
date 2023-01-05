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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAnalysisDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnalysisDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the analysis described.
     * </p>
     */
    private String analysisId;
    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     */
    private java.util.List<AnalysisError> errors;
    /**
     * <p>
     * Status associated with the analysis.
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
     * The ARN of the theme of the analysis.
     * </p>
     */
    private String themeArn;
    /**
     * <p>
     * The definition of an analysis.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     */
    private AnalysisDefinition definition;
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
     * The ID of the analysis described.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis described.
     */

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * <p>
     * The ID of the analysis described.
     * </p>
     * 
     * @return The ID of the analysis described.
     */

    public String getAnalysisId() {
        return this.analysisId;
    }

    /**
     * <p>
     * The ID of the analysis described.
     * </p>
     * 
     * @param analysisId
     *        The ID of the analysis described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisDefinitionResult withAnalysisId(String analysisId) {
        setAnalysisId(analysisId);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     * 
     * @param name
     *        The descriptive name of the analysis.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     * 
     * @return The descriptive name of the analysis.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name of the analysis.
     * </p>
     * 
     * @param name
     *        The descriptive name of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisDefinitionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * 
     * @return Errors associated with the analysis.
     */

    public java.util.List<AnalysisError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * 
     * @param errors
     *        Errors associated with the analysis.
     */

    public void setErrors(java.util.Collection<AnalysisError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AnalysisError>(errors);
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors associated with the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisDefinitionResult withErrors(AnalysisError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<AnalysisError>(errors.length));
        }
        for (AnalysisError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with the analysis.
     * </p>
     * 
     * @param errors
     *        Errors associated with the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisDefinitionResult withErrors(java.util.Collection<AnalysisError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Status associated with the analysis.
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
     *        Status associated with the analysis.</p>
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
     * Status associated with the analysis.
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
     * @return Status associated with the analysis.</p>
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
     * Status associated with the analysis.
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
     *        Status associated with the analysis.</p>
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

    public DescribeAnalysisDefinitionResult withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Status associated with the analysis.
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
     *        Status associated with the analysis.</p>
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

    public DescribeAnalysisDefinitionResult withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the analysis.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     * 
     * @return The ARN of the theme of the analysis.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the analysis.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisDefinitionResult withThemeArn(String themeArn) {
        setThemeArn(themeArn);
        return this;
    }

    /**
     * <p>
     * The definition of an analysis.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @param definition
     *        The definition of an analysis.</p>
     *        <p>
     *        A definition is the data model of all features in a Dashboard, Template, or Analysis.
     */

    public void setDefinition(AnalysisDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition of an analysis.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @return The definition of an analysis.</p>
     *         <p>
     *         A definition is the data model of all features in a Dashboard, Template, or Analysis.
     */

    public AnalysisDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition of an analysis.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @param definition
     *        The definition of an analysis.</p>
     *        <p>
     *        A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnalysisDefinitionResult withDefinition(AnalysisDefinition definition) {
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

    public DescribeAnalysisDefinitionResult withStatus(Integer status) {
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

    public DescribeAnalysisDefinitionResult withRequestId(String requestId) {
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
        if (getAnalysisId() != null)
            sb.append("AnalysisId: ").append(getAnalysisId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof DescribeAnalysisDefinitionResult == false)
            return false;
        DescribeAnalysisDefinitionResult other = (DescribeAnalysisDefinitionResult) obj;
        if (other.getAnalysisId() == null ^ this.getAnalysisId() == null)
            return false;
        if (other.getAnalysisId() != null && other.getAnalysisId().equals(this.getAnalysisId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getAnalysisId() == null) ? 0 : getAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnalysisDefinitionResult clone() {
        try {
            return (DescribeAnalysisDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
