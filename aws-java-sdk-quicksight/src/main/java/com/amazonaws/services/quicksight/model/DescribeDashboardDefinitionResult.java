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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the dashboard described.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * Errors associated with this dashboard version.
     * </p>
     */
    private java.util.List<DashboardError> errors;
    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Status associated with the dashboard version.
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
     * The ARN of the theme of the dashboard.
     * </p>
     */
    private String themeArn;
    /**
     * <p>
     * The definition of a dashboard.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     */
    private DashboardVersionDefinition definition;
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
     * The ID of the dashboard described.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard described.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard described.
     * </p>
     * 
     * @return The ID of the dashboard described.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard described.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardDefinitionResult withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * Errors associated with this dashboard version.
     * </p>
     * 
     * @return Errors associated with this dashboard version.
     */

    public java.util.List<DashboardError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with this dashboard version.
     * </p>
     * 
     * @param errors
     *        Errors associated with this dashboard version.
     */

    public void setErrors(java.util.Collection<DashboardError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<DashboardError>(errors);
    }

    /**
     * <p>
     * Errors associated with this dashboard version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors associated with this dashboard version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardDefinitionResult withErrors(DashboardError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<DashboardError>(errors.length));
        }
        for (DashboardError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with this dashboard version.
     * </p>
     * 
     * @param errors
     *        Errors associated with this dashboard version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardDefinitionResult withErrors(java.util.Collection<DashboardError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * 
     * @param name
     *        The display name of the dashboard.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * 
     * @return The display name of the dashboard.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * 
     * @param name
     *        The display name of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardDefinitionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Status associated with the dashboard version.
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
     *        Status associated with the dashboard version.</p>
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
     * Status associated with the dashboard version.
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
     * @return Status associated with the dashboard version.</p>
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
     * Status associated with the dashboard version.
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
     *        Status associated with the dashboard version.</p>
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

    public DescribeDashboardDefinitionResult withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Status associated with the dashboard version.
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
     *        Status associated with the dashboard version.</p>
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

    public DescribeDashboardDefinitionResult withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the theme of the dashboard.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the dashboard.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the dashboard.
     * </p>
     * 
     * @return The ARN of the theme of the dashboard.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The ARN of the theme of the dashboard.
     * </p>
     * 
     * @param themeArn
     *        The ARN of the theme of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardDefinitionResult withThemeArn(String themeArn) {
        setThemeArn(themeArn);
        return this;
    }

    /**
     * <p>
     * The definition of a dashboard.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @param definition
     *        The definition of a dashboard.</p>
     *        <p>
     *        A definition is the data model of all features in a Dashboard, Template, or Analysis.
     */

    public void setDefinition(DashboardVersionDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition of a dashboard.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @return The definition of a dashboard.</p>
     *         <p>
     *         A definition is the data model of all features in a Dashboard, Template, or Analysis.
     */

    public DashboardVersionDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition of a dashboard.
     * </p>
     * <p>
     * A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * </p>
     * 
     * @param definition
     *        The definition of a dashboard.</p>
     *        <p>
     *        A definition is the data model of all features in a Dashboard, Template, or Analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardDefinitionResult withDefinition(DashboardVersionDefinition definition) {
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

    public DescribeDashboardDefinitionResult withStatus(Integer status) {
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

    public DescribeDashboardDefinitionResult withRequestId(String requestId) {
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
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof DescribeDashboardDefinitionResult == false)
            return false;
        DescribeDashboardDefinitionResult other = (DescribeDashboardDefinitionResult) obj;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDashboardDefinitionResult clone() {
        try {
            return (DescribeDashboardDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
