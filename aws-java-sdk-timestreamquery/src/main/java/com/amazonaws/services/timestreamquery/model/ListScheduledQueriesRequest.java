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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListScheduledQueries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScheduledQueriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of items to return in the output. If the total number of items available is more than the
     * value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide the
     * <code>NextToken</code> value as the argument to the subsequent call to <code>ListScheduledQueriesRequest</code>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token to resume pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return in the output. If the total number of items available is more than the
     * value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide the
     * <code>NextToken</code> value as the argument to the subsequent call to <code>ListScheduledQueriesRequest</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the output. If the total number of items available is more than
     *        the value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide the
     *        <code>NextToken</code> value as the argument to the subsequent call to
     *        <code>ListScheduledQueriesRequest</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the output. If the total number of items available is more than the
     * value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide the
     * <code>NextToken</code> value as the argument to the subsequent call to <code>ListScheduledQueriesRequest</code>.
     * </p>
     * 
     * @return The maximum number of items to return in the output. If the total number of items available is more than
     *         the value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide
     *         the <code>NextToken</code> value as the argument to the subsequent call to
     *         <code>ListScheduledQueriesRequest</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the output. If the total number of items available is more than the
     * value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide the
     * <code>NextToken</code> value as the argument to the subsequent call to <code>ListScheduledQueriesRequest</code>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the output. If the total number of items available is more than
     *        the value specified, a <code>NextToken</code> is provided in the output. To resume pagination, provide the
     *        <code>NextToken</code> value as the argument to the subsequent call to
     *        <code>ListScheduledQueriesRequest</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledQueriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to resume pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to resume pagination.
     * </p>
     * 
     * @return A pagination token to resume pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to resume pagination.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to resume pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledQueriesRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListScheduledQueriesRequest == false)
            return false;
        ListScheduledQueriesRequest other = (ListScheduledQueriesRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScheduledQueriesRequest clone() {
        return (ListScheduledQueriesRequest) super.clone();
    }

}
