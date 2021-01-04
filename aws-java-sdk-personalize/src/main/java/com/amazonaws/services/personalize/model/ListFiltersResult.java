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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFiltersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of returned filters.
     * </p>
     */
    private java.util.List<FilterSummary> filters;
    /**
     * <p>
     * A token for getting the next set of filters (if they exist).
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of returned filters.
     * </p>
     * 
     * @return A list of returned filters.
     */

    public java.util.List<FilterSummary> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of returned filters.
     * </p>
     * 
     * @param filters
     *        A list of returned filters.
     */

    public void setFilters(java.util.Collection<FilterSummary> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<FilterSummary>(filters);
    }

    /**
     * <p>
     * A list of returned filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of returned filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersResult withFilters(FilterSummary... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<FilterSummary>(filters.length));
        }
        for (FilterSummary ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of returned filters.
     * </p>
     * 
     * @param filters
     *        A list of returned filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersResult withFilters(java.util.Collection<FilterSummary> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of filters (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of filters (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of filters (if they exist).
     * </p>
     * 
     * @return A token for getting the next set of filters (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of filters (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of filters (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersResult withNextToken(String nextToken) {
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

        if (obj instanceof ListFiltersResult == false)
            return false;
        ListFiltersResult other = (ListFiltersResult) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFiltersResult clone() {
        try {
            return (ListFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
