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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpointIpAddresses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverEndpointIpAddressesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resolver endpoint that you want to get IP addresses for.
     * </p>
     */
    private String resolverEndpointId;
    /**
     * <p>
     * The maximum number of IP addresses that you want to return in the response to a
     * <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 IP addresses.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.
     * </p>
     * <p>
     * If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the resolver endpoint that you want to get IP addresses for.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the resolver endpoint that you want to get IP addresses for.
     */

    public void setResolverEndpointId(String resolverEndpointId) {
        this.resolverEndpointId = resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the resolver endpoint that you want to get IP addresses for.
     * </p>
     * 
     * @return The ID of the resolver endpoint that you want to get IP addresses for.
     */

    public String getResolverEndpointId() {
        return this.resolverEndpointId;
    }

    /**
     * <p>
     * The ID of the resolver endpoint that you want to get IP addresses for.
     * </p>
     * 
     * @param resolverEndpointId
     *        The ID of the resolver endpoint that you want to get IP addresses for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesRequest withResolverEndpointId(String resolverEndpointId) {
        setResolverEndpointId(resolverEndpointId);
        return this;
    }

    /**
     * <p>
     * The maximum number of IP addresses that you want to return in the response to a
     * <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 IP addresses.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of IP addresses that you want to return in the response to a
     *        <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for
     *        <code>MaxResults</code>, Resolver returns up to 100 IP addresses.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of IP addresses that you want to return in the response to a
     * <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 IP addresses.
     * </p>
     * 
     * @return The maximum number of IP addresses that you want to return in the response to a
     *         <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for
     *         <code>MaxResults</code>, Resolver returns up to 100 IP addresses.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of IP addresses that you want to return in the response to a
     * <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for <code>MaxResults</code>,
     * Resolver returns up to 100 IP addresses.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of IP addresses that you want to return in the response to a
     *        <code>ListResolverEndpointIpAddresses</code> request. If you don't specify a value for
     *        <code>MaxResults</code>, Resolver returns up to 100 IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.
     * </p>
     * <p>
     * If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.</p>
     *        <p>
     *        If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit
     *        another <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the
     *        next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.
     * </p>
     * <p>
     * If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.</p>
     *         <p>
     *         If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit
     *         another <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In
     *         the next request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.
     * </p>
     * <p>
     * If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListResolverEndpointIpAddresses</code> request, omit this value.</p>
     *        <p>
     *        If the specified resolver endpoint has more than <code>MaxResults</code> IP addresses, you can submit
     *        another <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the
     *        next request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesRequest withNextToken(String nextToken) {
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
        if (getResolverEndpointId() != null)
            sb.append("ResolverEndpointId: ").append(getResolverEndpointId()).append(",");
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

        if (obj instanceof ListResolverEndpointIpAddressesRequest == false)
            return false;
        ListResolverEndpointIpAddressesRequest other = (ListResolverEndpointIpAddressesRequest) obj;
        if (other.getResolverEndpointId() == null ^ this.getResolverEndpointId() == null)
            return false;
        if (other.getResolverEndpointId() != null && other.getResolverEndpointId().equals(this.getResolverEndpointId()) == false)
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

        hashCode = prime * hashCode + ((getResolverEndpointId() == null) ? 0 : getResolverEndpointId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverEndpointIpAddressesRequest clone() {
        return (ListResolverEndpointIpAddressesRequest) super.clone();
    }

}
