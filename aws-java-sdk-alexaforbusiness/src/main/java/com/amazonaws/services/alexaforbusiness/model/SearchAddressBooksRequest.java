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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAddressBooksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
     * </p>
     */
    private java.util.List<Sort> sortCriteria;
    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * </p>
     * 
     * @return The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * </p>
     * 
     * @param filters
     *        The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * </p>
     * 
     * @param filters
     *        The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
     * </p>
     * 
     * @return The sort order to use in listing the specified set of address books. The supported sort key is
     *         AddressBookName.
     */

    public java.util.List<Sort> getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
     * </p>
     * 
     * @param sortCriteria
     *        The sort order to use in listing the specified set of address books. The supported sort key is
     *        AddressBookName.
     */

    public void setSortCriteria(java.util.Collection<Sort> sortCriteria) {
        if (sortCriteria == null) {
            this.sortCriteria = null;
            return;
        }

        this.sortCriteria = new java.util.ArrayList<Sort>(sortCriteria);
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortCriteria(java.util.Collection)} or {@link #withSortCriteria(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sortCriteria
     *        The sort order to use in listing the specified set of address books. The supported sort key is
     *        AddressBookName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksRequest withSortCriteria(Sort... sortCriteria) {
        if (this.sortCriteria == null) {
            setSortCriteria(new java.util.ArrayList<Sort>(sortCriteria.length));
        }
        for (Sort ele : sortCriteria) {
            this.sortCriteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
     * </p>
     * 
     * @param sortCriteria
     *        The sort order to use in listing the specified set of address books. The supported sort key is
     *        AddressBookName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksRequest withSortCriteria(java.util.Collection<Sort> sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response only includes results beyond the token, up to the
     *        value specified by MaxResults.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response only includes results beyond the token, up to the
     *         value specified by MaxResults.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response only includes results beyond the token, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response only includes results beyond the token, up to the
     *        value specified by MaxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria()).append(",");
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

        if (obj instanceof SearchAddressBooksRequest == false)
            return false;
        SearchAddressBooksRequest other = (SearchAddressBooksRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchAddressBooksRequest clone() {
        return (SearchAddressBooksRequest) super.clone();
    }

}
