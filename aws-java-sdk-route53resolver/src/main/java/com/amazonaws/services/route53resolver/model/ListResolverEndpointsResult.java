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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     * <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
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
     * The resolver endpoints that were created by using the current AWS account, and that match the specified filters,
     * if any.
     * </p>
     */
    private java.util.List<ResolverEndpoint> resolverEndpoints;

    /**
     * <p>
     * If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     * <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     *        <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify
     *        the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     * <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     *         <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify
     *         the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     * <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify the
     * value of <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        If more than <code>MaxResults</code> IP addresses match the specified criteria, you can submit another
     *        <code>ListResolverEndpoint</code> request to get the next group of results. In the next request, specify
     *        the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsResult withNextToken(String nextToken) {
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

    public ListResolverEndpointsResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The resolver endpoints that were created by using the current AWS account, and that match the specified filters,
     * if any.
     * </p>
     * 
     * @return The resolver endpoints that were created by using the current AWS account, and that match the specified
     *         filters, if any.
     */

    public java.util.List<ResolverEndpoint> getResolverEndpoints() {
        return resolverEndpoints;
    }

    /**
     * <p>
     * The resolver endpoints that were created by using the current AWS account, and that match the specified filters,
     * if any.
     * </p>
     * 
     * @param resolverEndpoints
     *        The resolver endpoints that were created by using the current AWS account, and that match the specified
     *        filters, if any.
     */

    public void setResolverEndpoints(java.util.Collection<ResolverEndpoint> resolverEndpoints) {
        if (resolverEndpoints == null) {
            this.resolverEndpoints = null;
            return;
        }

        this.resolverEndpoints = new java.util.ArrayList<ResolverEndpoint>(resolverEndpoints);
    }

    /**
     * <p>
     * The resolver endpoints that were created by using the current AWS account, and that match the specified filters,
     * if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolverEndpoints(java.util.Collection)} or {@link #withResolverEndpoints(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resolverEndpoints
     *        The resolver endpoints that were created by using the current AWS account, and that match the specified
     *        filters, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsResult withResolverEndpoints(ResolverEndpoint... resolverEndpoints) {
        if (this.resolverEndpoints == null) {
            setResolverEndpoints(new java.util.ArrayList<ResolverEndpoint>(resolverEndpoints.length));
        }
        for (ResolverEndpoint ele : resolverEndpoints) {
            this.resolverEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resolver endpoints that were created by using the current AWS account, and that match the specified filters,
     * if any.
     * </p>
     * 
     * @param resolverEndpoints
     *        The resolver endpoints that were created by using the current AWS account, and that match the specified
     *        filters, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverEndpointsResult withResolverEndpoints(java.util.Collection<ResolverEndpoint> resolverEndpoints) {
        setResolverEndpoints(resolverEndpoints);
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
        if (getResolverEndpoints() != null)
            sb.append("ResolverEndpoints: ").append(getResolverEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverEndpointsResult == false)
            return false;
        ListResolverEndpointsResult other = (ListResolverEndpointsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResolverEndpoints() == null ^ this.getResolverEndpoints() == null)
            return false;
        if (other.getResolverEndpoints() != null && other.getResolverEndpoints().equals(this.getResolverEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResolverEndpoints() == null) ? 0 : getResolverEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverEndpointsResult clone() {
        try {
            return (ListResolverEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
