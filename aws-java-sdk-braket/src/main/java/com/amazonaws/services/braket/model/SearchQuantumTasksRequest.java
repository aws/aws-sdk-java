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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchQuantumTasks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchQuantumTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Array of <code>SearchQuantumTasksFilter</code> objects.
     * </p>
     */
    private java.util.List<SearchQuantumTasksFilter> filters;
    /**
     * <p>
     * Maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Array of <code>SearchQuantumTasksFilter</code> objects.
     * </p>
     * 
     * @return Array of <code>SearchQuantumTasksFilter</code> objects.
     */

    public java.util.List<SearchQuantumTasksFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Array of <code>SearchQuantumTasksFilter</code> objects.
     * </p>
     * 
     * @param filters
     *        Array of <code>SearchQuantumTasksFilter</code> objects.
     */

    public void setFilters(java.util.Collection<SearchQuantumTasksFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SearchQuantumTasksFilter>(filters);
    }

    /**
     * <p>
     * Array of <code>SearchQuantumTasksFilter</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Array of <code>SearchQuantumTasksFilter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksRequest withFilters(SearchQuantumTasksFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SearchQuantumTasksFilter>(filters.length));
        }
        for (SearchQuantumTasksFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of <code>SearchQuantumTasksFilter</code> objects.
     * </p>
     * 
     * @param filters
     *        Array of <code>SearchQuantumTasksFilter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksRequest withFilters(java.util.Collection<SearchQuantumTasksFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in the response.
     * </p>
     * 
     * @return Maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned in the response. Use the token returned from the previous
     *        request continue results where the previous request ended.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     * 
     * @return A token used for pagination of results returned in the response. Use the token returned from the previous
     *         request continue results where the previous request ended.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned in the response. Use the token returned from the previous
     *        request continue results where the previous request ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchQuantumTasksRequest == false)
            return false;
        SearchQuantumTasksRequest other = (SearchQuantumTasksRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchQuantumTasksRequest clone() {
        return (SearchQuantumTasksRequest) super.clone();
    }

}
