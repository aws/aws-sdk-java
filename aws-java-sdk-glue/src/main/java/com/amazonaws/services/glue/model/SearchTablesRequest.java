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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SearchTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the
     * predicate.
     * </p>
     */
    private java.util.List<PropertyPredicate> filters;
    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the value.
     * </p>
     */
    private String searchText;
    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * </p>
     */
    private java.util.List<SortCriterion> sortCriteria;
    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     * </p>
     * 
     * @param catalogId
     *        A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     * </p>
     * 
     * @return A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     * </p>
     * 
     * @param catalogId
     *        A unique identifier, consisting of <code> <i>account_id</i>/datalake</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, included if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, included if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, included if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, included if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the
     * predicate.
     * </p>
     * 
     * @return A list of key-value pairs, and a comparator used to filter the search results. Returns all entities
     *         matching the predicate.
     */

    public java.util.List<PropertyPredicate> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the
     * predicate.
     * </p>
     * 
     * @param filters
     *        A list of key-value pairs, and a comparator used to filter the search results. Returns all entities
     *        matching the predicate.
     */

    public void setFilters(java.util.Collection<PropertyPredicate> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<PropertyPredicate>(filters);
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the
     * predicate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of key-value pairs, and a comparator used to filter the search results. Returns all entities
     *        matching the predicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withFilters(PropertyPredicate... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<PropertyPredicate>(filters.length));
        }
        for (PropertyPredicate ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the
     * predicate.
     * </p>
     * 
     * @param filters
     *        A list of key-value pairs, and a comparator used to filter the search results. Returns all entities
     *        matching the predicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withFilters(java.util.Collection<PropertyPredicate> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the value.
     * </p>
     * 
     * @param searchText
     *        A string used for a text search.</p>
     *        <p>
     *        Specifying a value in quotes filters based on an exact match to the value.
     */

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the value.
     * </p>
     * 
     * @return A string used for a text search.</p>
     *         <p>
     *         Specifying a value in quotes filters based on an exact match to the value.
     */

    public String getSearchText() {
        return this.searchText;
    }

    /**
     * <p>
     * A string used for a text search.
     * </p>
     * <p>
     * Specifying a value in quotes filters based on an exact match to the value.
     * </p>
     * 
     * @param searchText
     *        A string used for a text search.</p>
     *        <p>
     *        Specifying a value in quotes filters based on an exact match to the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withSearchText(String searchText) {
        setSearchText(searchText);
        return this;
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * </p>
     * 
     * @return A list of criteria for sorting the results by a field name, in an ascending or descending order.
     */

    public java.util.List<SortCriterion> getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * </p>
     * 
     * @param sortCriteria
     *        A list of criteria for sorting the results by a field name, in an ascending or descending order.
     */

    public void setSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        if (sortCriteria == null) {
            this.sortCriteria = null;
            return;
        }

        this.sortCriteria = new java.util.ArrayList<SortCriterion>(sortCriteria);
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortCriteria(java.util.Collection)} or {@link #withSortCriteria(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sortCriteria
     *        A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withSortCriteria(SortCriterion... sortCriteria) {
        if (this.sortCriteria == null) {
            setSortCriteria(new java.util.ArrayList<SortCriterion>(sortCriteria.length));
        }
        for (SortCriterion ele : sortCriteria) {
            this.sortCriteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * </p>
     * 
     * @param sortCriteria
     *        A list of criteria for sorting the results by a field name, in an ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tables to return in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * 
     * @return The maximum number of tables to return in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tables to return in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tables to return in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesRequest withMaxResults(Integer maxResults) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSearchText() != null)
            sb.append("SearchText: ").append(getSearchText()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria()).append(",");
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

        if (obj instanceof SearchTablesRequest == false)
            return false;
        SearchTablesRequest other = (SearchTablesRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSearchText() == null ^ this.getSearchText() == null)
            return false;
        if (other.getSearchText() != null && other.getSearchText().equals(this.getSearchText()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
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

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchTablesRequest clone() {
        return (SearchTablesRequest) super.clone();
    }

}
