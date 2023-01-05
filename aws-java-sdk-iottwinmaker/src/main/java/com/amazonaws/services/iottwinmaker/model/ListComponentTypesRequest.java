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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     */
    private java.util.List<ListComponentTypesFilter> filters;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
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

    public ListComponentTypesRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * 
     * @return A list of objects that filter the request.
     */

    public java.util.List<ListComponentTypesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * 
     * @param filters
     *        A list of objects that filter the request.
     */

    public void setFilters(java.util.Collection<ListComponentTypesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ListComponentTypesFilter>(filters);
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of objects that filter the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesRequest withFilters(ListComponentTypesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ListComponentTypesFilter>(filters.length));
        }
        for (ListComponentTypesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that filter the request.
     * </p>
     * 
     * @param filters
     *        A list of objects that filter the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesRequest withFilters(java.util.Collection<ListComponentTypesFilter> filters) {
        setFilters(filters);
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

    public ListComponentTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.</p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 250.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @return The maximum number of results to return at one time. The default is 25.</p>
     *         <p>
     *         Valid Range: Minimum value of 1. Maximum value of 250.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Valid Range: Minimum value of 1. Maximum value of 250.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time. The default is 25.</p>
     *        <p>
     *        Valid Range: Minimum value of 1. Maximum value of 250.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof ListComponentTypesRequest == false)
            return false;
        ListComponentTypesRequest other = (ListComponentTypesRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentTypesRequest clone() {
        return (ListComponentTypesRequest) super.clone();
    }

}
