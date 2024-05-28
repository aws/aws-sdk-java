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
package com.amazonaws.services.freetier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/GetFreeTierUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFreeTierUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     * </p>
     */
    private Expression filter;
    /**
     * <p>
     * The maximum number of results to return in the response. <code>MaxResults</code> means that there can be up to
     * the specified number of values, but there might be fewer results based on your filters.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     * </p>
     * 
     * @param filter
     *        An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     * </p>
     * 
     * @return An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     * </p>
     * 
     * @param filter
     *        An expression that specifies the conditions that you want each <code>FreeTierUsage</code> object to meet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFreeTierUsageRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. <code>MaxResults</code> means that there can be up to
     * the specified number of values, but there might be fewer results based on your filters.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. <code>MaxResults</code> means that there can be
     *        up to the specified number of values, but there might be fewer results based on your filters.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. <code>MaxResults</code> means that there can be up to
     * the specified number of values, but there might be fewer results based on your filters.
     * </p>
     * 
     * @return The maximum number of results to return in the response. <code>MaxResults</code> means that there can be
     *         up to the specified number of values, but there might be fewer results based on your filters.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. <code>MaxResults</code> means that there can be up to
     * the specified number of values, but there might be fewer results based on your filters.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. <code>MaxResults</code> means that there can be
     *        up to the specified number of values, but there might be fewer results based on your filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFreeTierUsageRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFreeTierUsageRequest withNextToken(String nextToken) {
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

        if (obj instanceof GetFreeTierUsageRequest == false)
            return false;
        GetFreeTierUsageRequest other = (GetFreeTierUsageRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFreeTierUsageRequest clone() {
        return (GetFreeTierUsageRequest) super.clone();
    }

}
