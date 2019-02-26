/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImportTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of name-value pairs that you provide to filter the results for the <code>DescribeImportTask</code>
     * request to a specific subset of results. Currently, wildcard values aren't supported for filters.
     * </p>
     */
    private java.util.List<ImportTaskFilter> filters;
    /**
     * <p>
     * The maximum number of results that you want this request to return, up to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to request a specific page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of name-value pairs that you provide to filter the results for the <code>DescribeImportTask</code>
     * request to a specific subset of results. Currently, wildcard values aren't supported for filters.
     * </p>
     * 
     * @return An array of name-value pairs that you provide to filter the results for the
     *         <code>DescribeImportTask</code> request to a specific subset of results. Currently, wildcard values
     *         aren't supported for filters.
     */

    public java.util.List<ImportTaskFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of name-value pairs that you provide to filter the results for the <code>DescribeImportTask</code>
     * request to a specific subset of results. Currently, wildcard values aren't supported for filters.
     * </p>
     * 
     * @param filters
     *        An array of name-value pairs that you provide to filter the results for the
     *        <code>DescribeImportTask</code> request to a specific subset of results. Currently, wildcard values aren't
     *        supported for filters.
     */

    public void setFilters(java.util.Collection<ImportTaskFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ImportTaskFilter>(filters);
    }

    /**
     * <p>
     * An array of name-value pairs that you provide to filter the results for the <code>DescribeImportTask</code>
     * request to a specific subset of results. Currently, wildcard values aren't supported for filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of name-value pairs that you provide to filter the results for the
     *        <code>DescribeImportTask</code> request to a specific subset of results. Currently, wildcard values aren't
     *        supported for filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksRequest withFilters(ImportTaskFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ImportTaskFilter>(filters.length));
        }
        for (ImportTaskFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs that you provide to filter the results for the <code>DescribeImportTask</code>
     * request to a specific subset of results. Currently, wildcard values aren't supported for filters.
     * </p>
     * 
     * @param filters
     *        An array of name-value pairs that you provide to filter the results for the
     *        <code>DescribeImportTask</code> request to a specific subset of results. Currently, wildcard values aren't
     *        supported for filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksRequest withFilters(java.util.Collection<ImportTaskFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that you want this request to return, up to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want this request to return, up to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want this request to return, up to 100.
     * </p>
     * 
     * @return The maximum number of results that you want this request to return, up to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that you want this request to return, up to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that you want this request to return, up to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to request a specific page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request a specific page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request a specific page of results.
     * </p>
     * 
     * @return The token to request a specific page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request a specific page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request a specific page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImportTasksRequest withNextToken(String nextToken) {
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

        if (obj instanceof DescribeImportTasksRequest == false)
            return false;
        DescribeImportTasksRequest other = (DescribeImportTasksRequest) obj;
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
    public DescribeImportTasksRequest clone() {
        return (DescribeImportTasksRequest) super.clone();
    }

}
