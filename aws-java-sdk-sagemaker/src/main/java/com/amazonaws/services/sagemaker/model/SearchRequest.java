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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * A Boolean conditional statement. Resource objects must satisfy this condition to be included in search results.
     * You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     */
    private SearchExpression searchExpression;
    /**
     * <p>
     * The name of the resource property used to sort the <code>SearchResults</code>. The default is
     * <code>LastModifiedTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or <code>Descending</code>.
     * The default is <code>Descending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>, the
     * <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results for the specified <code>SearchExpression</code>
     * and <code>Sort</code> parameters.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a <code>SearchResponse</code>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @param resource
     *        The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code>
     *        value is <code>TrainingJob</code>.
     * @see ResourceType
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @return The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code>
     *         value is <code>TrainingJob</code>.
     * @see ResourceType
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @param resource
     *        The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code>
     *        value is <code>TrainingJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SearchRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code> value is
     * <code>TrainingJob</code>.
     * </p>
     * 
     * @param resource
     *        The name of the Amazon SageMaker resource to search for. Currently, the only valid <code>Resource</code>
     *        value is <code>TrainingJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public SearchRequest withResource(ResourceType resource) {
        this.resource = resource.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean conditional statement. Resource objects must satisfy this condition to be included in search results.
     * You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     * 
     * @param searchExpression
     *        A Boolean conditional statement. Resource objects must satisfy this condition to be included in search
     *        results. You must provide at least one subexpression, filter, or nested filter. The maximum number of
     *        recursive <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be
     *        included in a <code>SearchExpression</code> object is 50.
     */

    public void setSearchExpression(SearchExpression searchExpression) {
        this.searchExpression = searchExpression;
    }

    /**
     * <p>
     * A Boolean conditional statement. Resource objects must satisfy this condition to be included in search results.
     * You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     * 
     * @return A Boolean conditional statement. Resource objects must satisfy this condition to be included in search
     *         results. You must provide at least one subexpression, filter, or nested filter. The maximum number of
     *         recursive <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be
     *         included in a <code>SearchExpression</code> object is 50.
     */

    public SearchExpression getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * <p>
     * A Boolean conditional statement. Resource objects must satisfy this condition to be included in search results.
     * You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     * 
     * @param searchExpression
     *        A Boolean conditional statement. Resource objects must satisfy this condition to be included in search
     *        results. You must provide at least one subexpression, filter, or nested filter. The maximum number of
     *        recursive <code>SubExpressions</code>, <code>NestedFilters</code>, and <code>Filters</code> that can be
     *        included in a <code>SearchExpression</code> object is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withSearchExpression(SearchExpression searchExpression) {
        setSearchExpression(searchExpression);
        return this;
    }

    /**
     * <p>
     * The name of the resource property used to sort the <code>SearchResults</code>. The default is
     * <code>LastModifiedTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The name of the resource property used to sort the <code>SearchResults</code>. The default is
     *        <code>LastModifiedTime</code>.
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The name of the resource property used to sort the <code>SearchResults</code>. The default is
     * <code>LastModifiedTime</code>.
     * </p>
     * 
     * @return The name of the resource property used to sort the <code>SearchResults</code>. The default is
     *         <code>LastModifiedTime</code>.
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The name of the resource property used to sort the <code>SearchResults</code>. The default is
     * <code>LastModifiedTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The name of the resource property used to sort the <code>SearchResults</code>. The default is
     *        <code>LastModifiedTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or <code>Descending</code>.
     * The default is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or
     *        <code>Descending</code>. The default is <code>Descending</code>.
     * @see SearchSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or <code>Descending</code>.
     * The default is <code>Descending</code>.
     * </p>
     * 
     * @return How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or
     *         <code>Descending</code>. The default is <code>Descending</code>.
     * @see SearchSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or <code>Descending</code>.
     * The default is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or
     *        <code>Descending</code>. The default is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchSortOrder
     */

    public SearchRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or <code>Descending</code>.
     * The default is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        How <code>SearchResults</code> are ordered. Valid values are <code>Ascending</code> or
     *        <code>Descending</code>. The default is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchSortOrder
     */

    public SearchRequest withSortOrder(SearchSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>, the
     * <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results for the specified <code>SearchExpression</code>
     * and <code>Sort</code> parameters.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>,
     *        the <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be
     *        passed to the next <code>SearchRequest</code> to continue retrieving results for the specified
     *        <code>SearchExpression</code> and <code>Sort</code> parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>, the
     * <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results for the specified <code>SearchExpression</code>
     * and <code>Sort</code> parameters.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>,
     *         the <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be
     *         passed to the next <code>SearchRequest</code> to continue retrieving results for the specified
     *         <code>SearchExpression</code> and <code>Sort</code> parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>, the
     * <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results for the specified <code>SearchExpression</code>
     * and <code>Sort</code> parameters.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> resource objects match the specified <code>SearchExpression</code>,
     *        the <code>SearchResponse</code> includes a <code>NextToken</code>. The <code>NextToken</code> can be
     *        passed to the next <code>SearchRequest</code> to continue retrieving results for the specified
     *        <code>SearchExpression</code> and <code>Sort</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a <code>SearchResponse</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a <code>SearchResponse</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a <code>SearchResponse</code>.
     * </p>
     * 
     * @return The maximum number of results to return in a <code>SearchResponse</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a <code>SearchResponse</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a <code>SearchResponse</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRequest withMaxResults(Integer maxResults) {
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getSearchExpression() != null)
            sb.append("SearchExpression: ").append(getSearchExpression()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
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

        if (obj instanceof SearchRequest == false)
            return false;
        SearchRequest other = (SearchRequest) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getSearchExpression() == null ^ this.getSearchExpression() == null)
            return false;
        if (other.getSearchExpression() != null && other.getSearchExpression().equals(this.getSearchExpression()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
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

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getSearchExpression() == null) ? 0 : getSearchExpression().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchRequest clone() {
        return (SearchRequest) super.clone();
    }

}
