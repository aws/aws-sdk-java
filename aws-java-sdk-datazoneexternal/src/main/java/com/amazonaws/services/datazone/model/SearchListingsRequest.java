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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SearchListings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchListingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies additional attributes for the search.
     * </p>
     */
    private java.util.List<String> additionalAttributes;
    /**
     * <p>
     * The identifier of the domain in which to search listings.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * Specifies the filters for the search of listings.
     * </p>
     */
    private FilterClause filters;
    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchListings</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list the
     * next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchListings</code> to list the next set of results.
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
     * Specifies the text for which to search.
     * </p>
     */
    private String searchText;
    /**
     * <p>
     * Specifies the way for sorting the search results.
     * </p>
     */
    private SearchSort sort;

    /**
     * <p>
     * Specifies additional attributes for the search.
     * </p>
     * 
     * @return Specifies additional attributes for the search.
     * @see SearchOutputAdditionalAttribute
     */

    public java.util.List<String> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p>
     * Specifies additional attributes for the search.
     * </p>
     * 
     * @param additionalAttributes
     *        Specifies additional attributes for the search.
     * @see SearchOutputAdditionalAttribute
     */

    public void setAdditionalAttributes(java.util.Collection<String> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new java.util.ArrayList<String>(additionalAttributes);
    }

    /**
     * <p>
     * Specifies additional attributes for the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributes(java.util.Collection)} or {@link #withAdditionalAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributes
     *        Specifies additional attributes for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchOutputAdditionalAttribute
     */

    public SearchListingsRequest withAdditionalAttributes(String... additionalAttributes) {
        if (this.additionalAttributes == null) {
            setAdditionalAttributes(new java.util.ArrayList<String>(additionalAttributes.length));
        }
        for (String ele : additionalAttributes) {
            this.additionalAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies additional attributes for the search.
     * </p>
     * 
     * @param additionalAttributes
     *        Specifies additional attributes for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchOutputAdditionalAttribute
     */

    public SearchListingsRequest withAdditionalAttributes(java.util.Collection<String> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies additional attributes for the search.
     * </p>
     * 
     * @param additionalAttributes
     *        Specifies additional attributes for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchOutputAdditionalAttribute
     */

    public SearchListingsRequest withAdditionalAttributes(SearchOutputAdditionalAttribute... additionalAttributes) {
        java.util.ArrayList<String> additionalAttributesCopy = new java.util.ArrayList<String>(additionalAttributes.length);
        for (SearchOutputAdditionalAttribute value : additionalAttributes) {
            additionalAttributesCopy.add(value.toString());
        }
        if (getAdditionalAttributes() == null) {
            setAdditionalAttributes(additionalAttributesCopy);
        } else {
            getAdditionalAttributes().addAll(additionalAttributesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The identifier of the domain in which to search listings.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the domain in which to search listings.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the domain in which to search listings.
     * </p>
     * 
     * @return The identifier of the domain in which to search listings.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the domain in which to search listings.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the domain in which to search listings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchListingsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the filters for the search of listings.
     * </p>
     * 
     * @param filters
     *        Specifies the filters for the search of listings.
     */

    public void setFilters(FilterClause filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Specifies the filters for the search of listings.
     * </p>
     * 
     * @return Specifies the filters for the search of listings.
     */

    public FilterClause getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Specifies the filters for the search of listings.
     * </p>
     * 
     * @param filters
     *        Specifies the filters for the search of listings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchListingsRequest withFilters(FilterClause filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchListings</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list the
     * next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call to <code>SearchListings</code>. When the number
     *        of results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *        <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list
     *        the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchListings</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list the
     * next set of results.
     * </p>
     * 
     * @return The maximum number of results to return in a single call to <code>SearchListings</code>. When the number
     *         of results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *         <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list
     *         the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call to <code>SearchListings</code>. When the number of
     * results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list the
     * next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call to <code>SearchListings</code>. When the number
     *        of results to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     *        <code>NextToken</code> value that you can use in a subsequent call to <code>SearchListings</code> to list
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchListingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or if you
     * explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the response
     * includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     * subsequent call to <code>SearchListings</code> to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or
     *        if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>SearchListings</code> to list the next set of
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
     * subsequent call to <code>SearchListings</code> to list the next set of results.
     * </p>
     * 
     * @return When the number of results is greater than the default value for the <code>MaxResults</code> parameter,
     *         or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results,
     *         the response includes a pagination token named <code>NextToken</code>. You can specify this
     *         <code>NextToken</code> value in a subsequent call to <code>SearchListings</code> to list the next set of
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
     * subsequent call to <code>SearchListings</code> to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        When the number of results is greater than the default value for the <code>MaxResults</code> parameter, or
     *        if you explicitly specify a value for <code>MaxResults</code> that is less than the number of results, the
     *        response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>SearchListings</code> to list the next set of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchListingsRequest withNextToken(String nextToken) {
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

    public SearchListingsRequest withSearchIn(SearchInItem... searchIn) {
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

    public SearchListingsRequest withSearchIn(java.util.Collection<SearchInItem> searchIn) {
        setSearchIn(searchIn);
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

    public SearchListingsRequest withSearchText(String searchText) {
        setSearchText(searchText);
        return this;
    }

    /**
     * <p>
     * Specifies the way for sorting the search results.
     * </p>
     * 
     * @param sort
     *        Specifies the way for sorting the search results.
     */

    public void setSort(SearchSort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * Specifies the way for sorting the search results.
     * </p>
     * 
     * @return Specifies the way for sorting the search results.
     */

    public SearchSort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * Specifies the way for sorting the search results.
     * </p>
     * 
     * @param sort
     *        Specifies the way for sorting the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchListingsRequest withSort(SearchSort sort) {
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
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSearchIn() != null)
            sb.append("SearchIn: ").append(getSearchIn()).append(",");
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

        if (obj instanceof SearchListingsRequest == false)
            return false;
        SearchListingsRequest other = (SearchListingsRequest) obj;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
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
        if (other.getSearchIn() == null ^ this.getSearchIn() == null)
            return false;
        if (other.getSearchIn() != null && other.getSearchIn().equals(this.getSearchIn()) == false)
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

        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSearchIn() == null) ? 0 : getSearchIn().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public SearchListingsRequest clone() {
        return (SearchListingsRequest) super.clone();
    }

}
