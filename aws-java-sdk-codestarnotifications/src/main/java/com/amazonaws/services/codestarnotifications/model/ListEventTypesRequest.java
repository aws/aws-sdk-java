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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListEventTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filters to use to return information by service or resource type.
     * </p>
     */
    private java.util.List<ListEventTypesFilter> filters;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number
     * of results that can be returned is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filters to use to return information by service or resource type.
     * </p>
     * 
     * @return The filters to use to return information by service or resource type.
     */

    public java.util.List<ListEventTypesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to use to return information by service or resource type.
     * </p>
     * 
     * @param filters
     *        The filters to use to return information by service or resource type.
     */

    public void setFilters(java.util.Collection<ListEventTypesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ListEventTypesFilter>(filters);
    }

    /**
     * <p>
     * The filters to use to return information by service or resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to use to return information by service or resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesRequest withFilters(ListEventTypesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ListEventTypesFilter>(filters.length));
        }
        for (ListEventTypesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to use to return information by service or resource type.
     * </p>
     * 
     * @param filters
     *        The filters to use to return information by service or resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesRequest withFilters(java.util.Collection<ListEventTypesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number
     * of results that can be returned is 100.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The default number is 50. The maximum
     *        number of results that can be returned is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number
     * of results that can be returned is 100.
     * </p>
     * 
     * @return A non-negative integer used to limit the number of returned results. The default number is 50. The
     *         maximum number of results that can be returned is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number
     * of results that can be returned is 100.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The default number is 50. The maximum
     *        number of results that can be returned is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventTypesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListEventTypesRequest == false)
            return false;
        ListEventTypesRequest other = (ListEventTypesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListEventTypesRequest clone() {
        return (ListEventTypesRequest) super.clone();
    }

}
