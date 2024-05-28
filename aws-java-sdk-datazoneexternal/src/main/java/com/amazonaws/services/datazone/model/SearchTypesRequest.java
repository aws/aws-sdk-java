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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The filters for the <code>SearchTypes</code> action.
     * </p>
     */
    private FilterClause filters;
    /**
     * <p>
     * Specifies whether the search is managed.
     * </p>
     */
    private Boolean managed;
    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of results
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The details of the search.
     * </p>
     */
    private java.util.List<SearchInItem> searchIn;
    /**
     * <p>
     * Specifies the scope of the search for types.
     * </p>
     */
    private String searchScope;
    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     */
    private String searchText;
    /**
     * <p>
     * The specifies the way to sort the <code>SearchTypes</code> results.
     * </p>
     */
    private SearchSort sort;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to invoke the <code>SearchTypes</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The filters for the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param filters
     *        The filters for the <code>SearchTypes</code> action.
     */

    public void setFilters(FilterClause filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The filters for the <code>SearchTypes</code> action.
     * </p>
     * 
     * @return The filters for the <code>SearchTypes</code> action.
     */

    public FilterClause getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The filters for the <code>SearchTypes</code> action.
     * </p>
     * 
     * @param filters
     *        The filters for the <code>SearchTypes</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withFilters(FilterClause filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Specifies whether the search is managed.
     * </p>
     * 
     * @param managed
     *        Specifies whether the search is managed.
     */

    public void setManaged(Boolean managed) {
        this.managed = managed;
    }

    /**
     * <p>
     * Specifies whether the search is managed.
     * </p>
     * 
     * @return Specifies whether the search is managed.
     */

    public Boolean getManaged() {
        return this.managed;
    }

    /**
     * <p>
     * Specifies whether the search is managed.
     * </p>
     * 
     * @param managed
     *        Specifies whether the search is managed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withManaged(Boolean managed) {
        setManaged(managed);
        return this;
    }

    /**
     * <p>
     * Specifies whether the search is managed.
     * </p>
     * 
     * @return Specifies whether the search is managed.
     */

    public Boolean isManaged() {
        return this.managed;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of results
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of
     *        results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *        <code>NextToken</code> value that you can use in a subsequent call to <code>SearchTypes</code> to list the
     *        next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of results
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     * 
     * @return The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of
     *         results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *         <code>NextToken</code> value that you can use in a subsequent call to <code>SearchTypes</code> to list
     *         the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of results
     * to be listed is greater than the value of <code>MaxResults</code>, the response contains a <code>NextToken</code>
     * value that you can use in a subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call to <code>SearchTypes</code>. When the number of
     *        results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *        <code>NextToken</code> value that you can use in a subsequent call to <code>SearchTypes</code> to list the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or
     *        if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>SearchTypes</code> to list the next set of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     * 
     * @return When the number of results is greater than the default value for the <code>MaxResults</code> parameter,
     *         or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results,
     *         the response includes a pagination token named <code>NextToken</code>. You can specify this
     *         <code>NextToken</code> value in a subsequent call to <code>SearchTypes</code> to list the next set of
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchTypes</code> to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or
     *        if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>SearchTypes</code> to list the next set of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The details of the search.
     * </p>
     * 
     * @return The details of the search.
     */

    public java.util.List<SearchInItem> getSearchIn() {
        return searchIn;
    }

    /**
     * <p>
     * The details of the search.
     * </p>
     * 
     * @param searchIn
     *        The details of the search.
     */

    public void setSearchIn(java.util.Collection<SearchInItem> searchIn) {
        if (searchIn == null) {
            this.searchIn = null;
            return;
        }

        this.searchIn = new java.util.ArrayList<SearchInItem>(searchIn);
    }

    /**
     * <p>
     * The details of the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearchIn(java.util.Collection)} or {@link #withSearchIn(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param searchIn
     *        The details of the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withSearchIn(SearchInItem... searchIn) {
        if (this.searchIn == null) {
            setSearchIn(new java.util.ArrayList<SearchInItem>(searchIn.length));
        }
        for (SearchInItem ele : searchIn) {
            this.searchIn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the search.
     * </p>
     * 
     * @param searchIn
     *        The details of the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withSearchIn(java.util.Collection<SearchInItem> searchIn) {
        setSearchIn(searchIn);
        return this;
    }

    /**
     * <p>
     * Specifies the scope of the search for types.
     * </p>
     * 
     * @param searchScope
     *        Specifies the scope of the search for types.
     * @see TypesSearchScope
     */

    public void setSearchScope(String searchScope) {
        this.searchScope = searchScope;
    }

    /**
     * <p>
     * Specifies the scope of the search for types.
     * </p>
     * 
     * @return Specifies the scope of the search for types.
     * @see TypesSearchScope
     */

    public String getSearchScope() {
        return this.searchScope;
    }

    /**
     * <p>
     * Specifies the scope of the search for types.
     * </p>
     * 
     * @param searchScope
     *        Specifies the scope of the search for types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypesSearchScope
     */

    public SearchTypesRequest withSearchScope(String searchScope) {
        setSearchScope(searchScope);
        return this;
    }

    /**
     * <p>
     * Specifies the scope of the search for types.
     * </p>
     * 
     * @param searchScope
     *        Specifies the scope of the search for types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypesSearchScope
     */

    public SearchTypesRequest withSearchScope(TypesSearchScope searchScope) {
        this.searchScope = searchScope.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     * 
     * @param searchText
     *        Specifies the text for which to search.
     */

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     * 
     * @return Specifies the text for which to search.
     */

    public String getSearchText() {
        return this.searchText;
    }

    /**
     * <p>
     * Specifies the text for which to search.
     * </p>
     * 
     * @param searchText
     *        Specifies the text for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withSearchText(String searchText) {
        setSearchText(searchText);
        return this;
    }

    /**
     * <p>
     * The specifies the way to sort the <code>SearchTypes</code> results.
     * </p>
     * 
     * @param sort
     *        The specifies the way to sort the <code>SearchTypes</code> results.
     */

    public void setSort(SearchSort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The specifies the way to sort the <code>SearchTypes</code> results.
     * </p>
     * 
     * @return The specifies the way to sort the <code>SearchTypes</code> results.
     */

    public SearchSort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The specifies the way to sort the <code>SearchTypes</code> results.
     * </p>
     * 
     * @param sort
     *        The specifies the way to sort the <code>SearchTypes</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTypesRequest withSort(SearchSort sort) {
        setSort(sort);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getManaged() != null)
            sb.append("Managed: ").append(getManaged()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSearchIn() != null)
            sb.append("SearchIn: ").append(getSearchIn()).append(",");
        if (getSearchScope() != null)
            sb.append("SearchScope: ").append(getSearchScope()).append(",");
        if (getSearchText() != null)
            sb.append("SearchText: ").append(getSearchText()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTypesRequest == false)
            return false;
        SearchTypesRequest other = (SearchTypesRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getManaged() == null ^ this.getManaged() == null)
            return false;
        if (other.getManaged() != null && other.getManaged().equals(this.getManaged()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSearchIn() == null ^ this.getSearchIn() == null)
            return false;
        if (other.getSearchIn() != null && other.getSearchIn().equals(this.getSearchIn()) == false)
            return false;
        if (other.getSearchScope() == null ^ this.getSearchScope() == null)
            return false;
        if (other.getSearchScope() != null && other.getSearchScope().equals(this.getSearchScope()) == false)
            return false;
        if (other.getSearchText() == null ^ this.getSearchText() == null)
            return false;
        if (other.getSearchText() != null && other.getSearchText().equals(this.getSearchText()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getManaged() == null) ? 0 : getManaged().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSearchIn() == null) ? 0 : getSearchIn().hashCode());
        hashCode = prime * hashCode + ((getSearchScope() == null) ? 0 : getSearchScope().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public SearchTypesRequest clone() {
        return (SearchTypesRequest) super.clone();
    }

}
