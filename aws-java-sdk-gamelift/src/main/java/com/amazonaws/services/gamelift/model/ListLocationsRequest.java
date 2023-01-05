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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * </p>
     */
    private java.util.List<String> filters;
    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * </p>
     * 
     * @return Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * @see LocationFilter
     */

    public java.util.List<String> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * </p>
     * 
     * @param filters
     *        Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * @see LocationFilter
     */

    public void setFilters(java.util.Collection<String> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<String>(filters);
    }

    /**
     * <p>
     * Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationFilter
     */

    public ListLocationsRequest withFilters(String... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<String>(filters.length));
        }
        for (String ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * </p>
     * 
     * @param filters
     *        Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationFilter
     */

    public ListLocationsRequest withFilters(java.util.Collection<String> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * </p>
     * 
     * @param filters
     *        Filters the list for <code>AWS</code> or <code>CUSTOM</code> locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationFilter
     */

    public ListLocationsRequest withFilters(LocationFilter... filters) {
        java.util.ArrayList<String> filtersCopy = new java.util.ArrayList<String>(filters.length);
        for (LocationFilter value : filters) {
            filtersCopy.add(value.toString());
        }
        if (getFilters() == null) {
            setFilters(filtersCopy);
        } else {
            getFilters().addAll(filtersCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @return The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *         a set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set
     * of sequential pages.
     * </p>
     * 
     * @param limit
     *        The maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as
     *        a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the start of the next sequential page of results. Use the token that is returned
     *        with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *        value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @return A token that indicates the start of the next sequential page of results. Use the token that is returned
     *         with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *         value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this operation. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the start of the next sequential page of results. Use the token that is returned
     *        with a previous call to this operation. To start at the beginning of the result set, do not specify a
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLocationsRequest withNextToken(String nextToken) {
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof ListLocationsRequest == false)
            return false;
        ListLocationsRequest other = (ListLocationsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLocationsRequest clone() {
        return (ListLocationsRequest) super.clone();
    }

}
