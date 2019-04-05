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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpointIpAddresses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverEndpointIpAddressesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to
     * Resolver (inbound endpoint).
     * </p>
     */
    private java.util.List<IpAddressResponse> ipAddresses;

    /**
     * <p>
     * If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     *        <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     *         <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next
     *         request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     * <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next request,
     * specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If the specified endpoint has more than <code>MaxResults</code> IP addresses, you can submit another
     *        <code>ListResolverEndpointIpAddresses</code> request to get the next group of IP addresses. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     * 
     * @param maxResults
     *        The value that you specified for <code>MaxResults</code> in the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     * 
     * @return The value that you specified for <code>MaxResults</code> in the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxResults</code> in the request.
     * </p>
     * 
     * @param maxResults
     *        The value that you specified for <code>MaxResults</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to
     * Resolver (inbound endpoint).
     * </p>
     * 
     * @return The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the
     *         way to Resolver (inbound endpoint).
     */

    public java.util.List<IpAddressResponse> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * <p>
     * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to
     * Resolver (inbound endpoint).
     * </p>
     * 
     * @param ipAddresses
     *        The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the
     *        way to Resolver (inbound endpoint).
     */

    public void setIpAddresses(java.util.Collection<IpAddressResponse> ipAddresses) {
        if (ipAddresses == null) {
            this.ipAddresses = null;
            return;
        }

        this.ipAddresses = new java.util.ArrayList<IpAddressResponse>(ipAddresses);
    }

    /**
     * <p>
     * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to
     * Resolver (inbound endpoint).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddresses(java.util.Collection)} or {@link #withIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipAddresses
     *        The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the
     *        way to Resolver (inbound endpoint).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesResult withIpAddresses(IpAddressResponse... ipAddresses) {
        if (this.ipAddresses == null) {
            setIpAddresses(new java.util.ArrayList<IpAddressResponse>(ipAddresses.length));
        }
        for (IpAddressResponse ele : ipAddresses) {
            this.ipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to
     * Resolver (inbound endpoint).
     * </p>
     * 
     * @param ipAddresses
     *        The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the
     *        way to Resolver (inbound endpoint).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointIpAddressesResult withIpAddresses(java.util.Collection<IpAddressResponse> ipAddresses) {
        setIpAddresses(ipAddresses);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getIpAddresses() != null)
            sb.append("IpAddresses: ").append(getIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverEndpointIpAddressesResult == false)
            return false;
        ListResolverEndpointIpAddressesResult other = (ListResolverEndpointIpAddressesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getIpAddresses() == null ^ this.getIpAddresses() == null)
            return false;
        if (other.getIpAddresses() != null && other.getIpAddresses().equals(this.getIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getIpAddresses() == null) ? 0 : getIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverEndpointIpAddressesResult clone() {
        try {
            return (ListResolverEndpointIpAddressesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
