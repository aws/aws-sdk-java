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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListOperationEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOperationEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the operation.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value.
     * </p>
     * <p>
     * If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by default.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Optionally specify filters to narrow the returned operation event items.
     * </p>
     * <p>
     * Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>. The valid
     * operator for all three filters is <code>Equals</code>.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * 
     * @param operationId
     *        The ID of the operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * 
     * @return The ID of the operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * 
     * @param operationId
     *        The ID of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsRequest withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value.
     * </p>
     * <p>
     * If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by default.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned nextToken value.</p>
     *        <p>
     *        If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by
     *        default.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value.
     * </p>
     * <p>
     * If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by default.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned nextToken value.</p>
     *         <p>
     *         If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by
     *         default.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned nextToken value.
     * </p>
     * <p>
     * If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by default.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned nextToken value.</p>
     *        <p>
     *        If you do not specify a value for <code>MaxResults</code>, the request returns 50 items per page by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Optionally specify filters to narrow the returned operation event items.
     * </p>
     * <p>
     * Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>. The valid
     * operator for all three filters is <code>Equals</code>.
     * </p>
     * 
     * @return Optionally specify filters to narrow the returned operation event items.</p>
     *         <p>
     *         Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>.
     *         The valid operator for all three filters is <code>Equals</code>.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Optionally specify filters to narrow the returned operation event items.
     * </p>
     * <p>
     * Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>. The valid
     * operator for all three filters is <code>Equals</code>.
     * </p>
     * 
     * @param filters
     *        Optionally specify filters to narrow the returned operation event items.</p>
     *        <p>
     *        Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>.
     *        The valid operator for all three filters is <code>Equals</code>.
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
     * Optionally specify filters to narrow the returned operation event items.
     * </p>
     * <p>
     * Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>. The valid
     * operator for all three filters is <code>Equals</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Optionally specify filters to narrow the returned operation event items.</p>
     *        <p>
     *        Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>.
     *        The valid operator for all three filters is <code>Equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsRequest withFilters(Filter... filters) {
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
     * Optionally specify filters to narrow the returned operation event items.
     * </p>
     * <p>
     * Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>. The valid
     * operator for all three filters is <code>Equals</code>.
     * </p>
     * 
     * @param filters
     *        Optionally specify filters to narrow the returned operation event items.</p>
     *        <p>
     *        Valid filter names include <code>status</code>, <code>resourceID</code>, and <code>resourceType</code>.
     *        The valid operator for all three filters is <code>Equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOperationEventsRequest == false)
            return false;
        ListOperationEventsRequest other = (ListOperationEventsRequest) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListOperationEventsRequest clone() {
        return (ListOperationEventsRequest) super.clone();
    }

}
