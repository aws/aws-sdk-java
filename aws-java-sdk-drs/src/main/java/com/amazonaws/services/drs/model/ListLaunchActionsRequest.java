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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListLaunchActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLaunchActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters to apply when listing resource launch actions.
     * </p>
     */
    private LaunchActionsRequestFilters filters;
    /**
     * <p>
     * Maximum amount of items to return when listing resource launch actions.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Next token to use when listing resource launch actions.
     * </p>
     */
    private String nextToken;

    private String resourceId;

    /**
     * <p>
     * Filters to apply when listing resource launch actions.
     * </p>
     * 
     * @param filters
     *        Filters to apply when listing resource launch actions.
     */

    public void setFilters(LaunchActionsRequestFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters to apply when listing resource launch actions.
     * </p>
     * 
     * @return Filters to apply when listing resource launch actions.
     */

    public LaunchActionsRequestFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters to apply when listing resource launch actions.
     * </p>
     * 
     * @param filters
     *        Filters to apply when listing resource launch actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchActionsRequest withFilters(LaunchActionsRequestFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Maximum amount of items to return when listing resource launch actions.
     * </p>
     * 
     * @param maxResults
     *        Maximum amount of items to return when listing resource launch actions.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum amount of items to return when listing resource launch actions.
     * </p>
     * 
     * @return Maximum amount of items to return when listing resource launch actions.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum amount of items to return when listing resource launch actions.
     * </p>
     * 
     * @param maxResults
     *        Maximum amount of items to return when listing resource launch actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchActionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Next token to use when listing resource launch actions.
     * </p>
     * 
     * @param nextToken
     *        Next token to use when listing resource launch actions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token to use when listing resource launch actions.
     * </p>
     * 
     * @return Next token to use when listing resource launch actions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token to use when listing resource launch actions.
     * </p>
     * 
     * @param nextToken
     *        Next token to use when listing resource launch actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchActionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param resourceId
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchActionsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLaunchActionsRequest == false)
            return false;
        ListLaunchActionsRequest other = (ListLaunchActionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public ListLaunchActionsRequest clone() {
        return (ListLaunchActionsRequest) super.clone();
    }

}
