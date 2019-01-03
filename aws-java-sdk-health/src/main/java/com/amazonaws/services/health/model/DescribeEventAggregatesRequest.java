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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventAggregates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventAggregatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     */
    private EventFilter filter;
    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     */
    private String aggregateField;
    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100, inclusive.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     * 
     * @param filter
     *        Values to narrow the results returned.
     */

    public void setFilter(EventFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     * 
     * @return Values to narrow the results returned.
     */

    public EventFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     * 
     * @param filter
     *        Values to narrow the results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventAggregatesRequest withFilter(EventFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * 
     * @param aggregateField
     *        The only currently supported value is <code>eventTypeCategory</code>.
     * @see EventAggregateField
     */

    public void setAggregateField(String aggregateField) {
        this.aggregateField = aggregateField;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * 
     * @return The only currently supported value is <code>eventTypeCategory</code>.
     * @see EventAggregateField
     */

    public String getAggregateField() {
        return this.aggregateField;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * 
     * @param aggregateField
     *        The only currently supported value is <code>eventTypeCategory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventAggregateField
     */

    public DescribeEventAggregatesRequest withAggregateField(String aggregateField) {
        setAggregateField(aggregateField);
        return this;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * 
     * @param aggregateField
     *        The only currently supported value is <code>eventTypeCategory</code>.
     * @see EventAggregateField
     */

    public void setAggregateField(EventAggregateField aggregateField) {
        withAggregateField(aggregateField);
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * 
     * @param aggregateField
     *        The only currently supported value is <code>eventTypeCategory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventAggregateField
     */

    public DescribeEventAggregatesRequest withAggregateField(EventAggregateField aggregateField) {
        this.aggregateField = aggregateField.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100, inclusive.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in one batch, between 10 and 100, inclusive.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100, inclusive.
     * </p>
     * 
     * @return The maximum number of items to return in one batch, between 10 and 100, inclusive.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100, inclusive.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in one batch, between 10 and 100, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventAggregatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @return If the results of a search are large, only a portion of the results are returned, and a
     *         <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned token. When all results have been returned,
     *         the response does not contain a pagination token value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventAggregatesRequest withNextToken(String nextToken) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getAggregateField() != null)
            sb.append("AggregateField: ").append(getAggregateField()).append(",");
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

        if (obj instanceof DescribeEventAggregatesRequest == false)
            return false;
        DescribeEventAggregatesRequest other = (DescribeEventAggregatesRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getAggregateField() == null ^ this.getAggregateField() == null)
            return false;
        if (other.getAggregateField() != null && other.getAggregateField().equals(this.getAggregateField()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getAggregateField() == null) ? 0 : getAggregateField().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventAggregatesRequest clone() {
        return (DescribeEventAggregatesRequest) super.clone();
    }

}
