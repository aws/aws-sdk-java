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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>DescribeOutboundConnections</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOutboundConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of filter names and values that you can use for requests.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code> operations,
     * which returns results in the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of filter names and values that you can use for requests.
     * </p>
     * 
     * @return List of filter names and values that you can use for requests.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * List of filter names and values that you can use for requests.
     * </p>
     * 
     * @param filters
     *        List of filter names and values that you can use for requests.
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
     * List of filter names and values that you can use for requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        List of filter names and values that you can use for requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withFilters(Filter... filters) {
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
     * List of filter names and values that you can use for requests.
     * </p>
     * 
     * @param filters
     *        List of filter names and values that you can use for requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code> operations,
     * which returns results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you
     *        can include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code>
     *        operations, which returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code> operations,
     * which returns results in the next page.
     * </p>
     * 
     * @return If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you
     *         can include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code>
     *         operations, which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code> operations,
     * which returns results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>DescribeOutboundConnections</code> operation returns a <code>nextToken</code>, you
     *        can include the returned <code>nextToken</code> in subsequent <code>DescribeOutboundConnections</code>
     *        operations, which returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withNextToken(String nextToken) {
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

        if (obj instanceof DescribeOutboundConnectionsRequest == false)
            return false;
        DescribeOutboundConnectionsRequest other = (DescribeOutboundConnectionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOutboundConnectionsRequest clone() {
        return (DescribeOutboundConnectionsRequest) super.clone();
    }

}
