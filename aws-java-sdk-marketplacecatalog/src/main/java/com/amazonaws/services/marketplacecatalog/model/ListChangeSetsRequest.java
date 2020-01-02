/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListChangeSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChangeSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * An array of filter objects.
     * </p>
     */
    private java.util.List<Filter> filterList;
    /**
     * <p>
     * An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     * </p>
     */
    private Sort sort;
    /**
     * <p>
     * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve
     * the next set of results. By default, this value is 20.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @return The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     * 
     * @return An array of filter objects.
     */

    public java.util.List<Filter> getFilterList() {
        return filterList;
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     * 
     * @param filterList
     *        An array of filter objects.
     */

    public void setFilterList(java.util.Collection<Filter> filterList) {
        if (filterList == null) {
            this.filterList = null;
            return;
        }

        this.filterList = new java.util.ArrayList<Filter>(filterList);
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterList(java.util.Collection)} or {@link #withFilterList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterList
     *        An array of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withFilterList(Filter... filterList) {
        if (this.filterList == null) {
            setFilterList(new java.util.ArrayList<Filter>(filterList.length));
        }
        for (Filter ele : filterList) {
            this.filterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of filter objects.
     * </p>
     * 
     * @param filterList
     *        An array of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withFilterList(java.util.Collection<Filter> filterList) {
        setFilterList(filterList);
        return this;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     * </p>
     * 
     * @param sort
     *        An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     */

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     * </p>
     * 
     * @return An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     */

    public Sort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     * </p>
     * 
     * @param sort
     *        An object that contains two attributes, <code>sortBy</code> and <code>sortOrder</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withSort(Sort sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve
     * the next set of results. By default, this value is 20.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by a single call. This value must be provided in the next call to
     *        retrieve the next set of results. By default, this value is 20.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve
     * the next set of results. By default, this value is 20.
     * </p>
     * 
     * @return The maximum number of results returned by a single call. This value must be provided in the next call to
     *         retrieve the next set of results. By default, this value is 20.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve
     * the next set of results. By default, this value is 20.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by a single call. This value must be provided in the next call to
     *        retrieve the next set of results. By default, this value is 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withNextToken(String nextToken) {
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getFilterList() != null)
            sb.append("FilterList: ").append(getFilterList()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
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

        if (obj instanceof ListChangeSetsRequest == false)
            return false;
        ListChangeSetsRequest other = (ListChangeSetsRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getFilterList() == null ^ this.getFilterList() == null)
            return false;
        if (other.getFilterList() != null && other.getFilterList().equals(this.getFilterList()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
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

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getFilterList() == null) ? 0 : getFilterList().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChangeSetsRequest clone() {
        return (ListChangeSetsRequest) super.clone();
    }

}
