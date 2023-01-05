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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * A list of objects that contain information about the component types.
     * </p>
     */
    private java.util.List<ComponentTypeSummary> componentTypeSummaries;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of results to display.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @return The ID of the workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the component types.
     * </p>
     * 
     * @return A list of objects that contain information about the component types.
     */

    public java.util.List<ComponentTypeSummary> getComponentTypeSummaries() {
        return componentTypeSummaries;
    }

    /**
     * <p>
     * A list of objects that contain information about the component types.
     * </p>
     * 
     * @param componentTypeSummaries
     *        A list of objects that contain information about the component types.
     */

    public void setComponentTypeSummaries(java.util.Collection<ComponentTypeSummary> componentTypeSummaries) {
        if (componentTypeSummaries == null) {
            this.componentTypeSummaries = null;
            return;
        }

        this.componentTypeSummaries = new java.util.ArrayList<ComponentTypeSummary>(componentTypeSummaries);
    }

    /**
     * <p>
     * A list of objects that contain information about the component types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentTypeSummaries(java.util.Collection)} or
     * {@link #withComponentTypeSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param componentTypeSummaries
     *        A list of objects that contain information about the component types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesResult withComponentTypeSummaries(ComponentTypeSummary... componentTypeSummaries) {
        if (this.componentTypeSummaries == null) {
            setComponentTypeSummaries(new java.util.ArrayList<ComponentTypeSummary>(componentTypeSummaries.length));
        }
        for (ComponentTypeSummary ele : componentTypeSummaries) {
            this.componentTypeSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the component types.
     * </p>
     * 
     * @param componentTypeSummaries
     *        A list of objects that contain information about the component types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesResult withComponentTypeSummaries(java.util.Collection<ComponentTypeSummary> componentTypeSummaries) {
        setComponentTypeSummaries(componentTypeSummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of results to display.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of results to display.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of results to display.
     * </p>
     * 
     * @return Specifies the maximum number of results to display.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of results to display.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of results to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getComponentTypeSummaries() != null)
            sb.append("ComponentTypeSummaries: ").append(getComponentTypeSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComponentTypesResult == false)
            return false;
        ListComponentTypesResult other = (ListComponentTypesResult) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getComponentTypeSummaries() == null ^ this.getComponentTypeSummaries() == null)
            return false;
        if (other.getComponentTypeSummaries() != null && other.getComponentTypeSummaries().equals(this.getComponentTypeSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeSummaries() == null) ? 0 : getComponentTypeSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentTypesResult clone() {
        try {
            return (ListComponentTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
