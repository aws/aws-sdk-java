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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of resolver endpoints that you want to return in the response to a
     * <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>, Resolver
     * returns up to 100 resolver endpoints.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>ListResolverEndpoints</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     * <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum number of resolver endpoints that you want to return in the response to a
     * <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>, Resolver
     * returns up to 100 resolver endpoints.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resolver endpoints that you want to return in the response to a
     *        <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>,
     *        Resolver returns up to 100 resolver endpoints.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resolver endpoints that you want to return in the response to a
     * <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>, Resolver
     * returns up to 100 resolver endpoints.
     * </p>
     * 
     * @return The maximum number of resolver endpoints that you want to return in the response to a
     *         <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>,
     *         Resolver returns up to 100 resolver endpoints.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resolver endpoints that you want to return in the response to a
     * <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>, Resolver
     * returns up to 100 resolver endpoints.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resolver endpoints that you want to return in the response to a
     *        <code>ListResolverEndpoints</code> request. If you don't specify a value for <code>MaxResults</code>,
     *        Resolver returns up to 100 resolver endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>ListResolverEndpoints</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     * <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverEndpoints</code> request, omit this value.</p>
     *        <p>
     *        If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     *        <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverEndpoints</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     * <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return For the first <code>ListResolverEndpoints</code> request, omit this value.</p>
     *         <p>
     *         If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     *         <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next
     *         request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverEndpoints</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     * <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverEndpoints</code> request, omit this value.</p>
     *        <p>
     *        If you have more than <code>MaxResults</code> resolver endpoints, you can submit another
     *        <code>ListResolverEndpoints</code> request to get the next group of resolver endpoints. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @return An optional specification to return a subset of resolver endpoints, such as all inbound resolver
     *         endpoints.</p> <note>
     *         <p>
     *         If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     *         <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in
     *         the previous request.
     *         </p>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param filters
     *        An optional specification to return a subset of resolver endpoints, such as all inbound resolver
     *        endpoints.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     *        previous request.
     *        </p>
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
     * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An optional specification to return a subset of resolver endpoints, such as all inbound resolver
     *        endpoints.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     *        previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsRequest withFilters(Filter... filters) {
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
     * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.
     * </p>
     * <note>
     * <p>
     * If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     * <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     * previous request.
     * </p>
     * </note>
     * 
     * @param filters
     *        An optional specification to return a subset of resolver endpoints, such as all inbound resolver
     *        endpoints.</p> <note>
     *        <p>
     *        If you submit a second or subsequent <code>ListResolverEndpoints</code> request and specify the
     *        <code>NextToken</code> parameter, you must use the same values for <code>Filters</code>, if any, as in the
     *        previous request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsRequest withFilters(java.util.Collection<Filter> filters) {
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

        if (obj instanceof ListResolverEndpointsRequest == false)
            return false;
        ListResolverEndpointsRequest other = (ListResolverEndpointsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverEndpointsRequest clone() {
        return (ListResolverEndpointsRequest) super.clone();
    }

}
