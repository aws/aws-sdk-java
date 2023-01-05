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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of Resolver configurations that you want to return in the response to a
     * <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to 100
     * Resolver configurations are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     * configurations, use <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of Resolver configurations that you want to return in the response to a
     * <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to 100
     * Resolver configurations are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Resolver configurations that you want to return in the response to a
     *        <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to
     *        100 Resolver configurations are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of Resolver configurations that you want to return in the response to a
     * <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to 100
     * Resolver configurations are returned.
     * </p>
     * 
     * @return The maximum number of Resolver configurations that you want to return in the response to a
     *         <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to
     *         100 Resolver configurations are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of Resolver configurations that you want to return in the response to a
     * <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to 100
     * Resolver configurations are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Resolver configurations that you want to return in the response to a
     *        <code>ListResolverConfigs</code> request. If you don't specify a value for <code>MaxResults</code>, up to
     *        100 Resolver configurations are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverConfigsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     * configurations, use <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     *        configurations, use <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListResolverConfigs</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     * configurations, use <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @return (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     *         configurations, use <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *         <p>
     *         For the first <code>ListResolverConfigs</code> request, omit this value.
     *         </p>
     *         <p>
     *         For the second and subsequent requests, get the value of <code>NextToken</code> from the previous
     *         response and specify that value for <code>NextToken</code> in the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     * configurations, use <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the current Amazon Web Services account has more than <code>MaxResults</code> Resolver
     *        configurations, use <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListResolverConfigs</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverConfigsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListResolverConfigsRequest == false)
            return false;
        ListResolverConfigsRequest other = (ListResolverConfigsRequest) obj;
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
    public ListResolverConfigsRequest clone() {
        return (ListResolverConfigsRequest) super.clone();
    }

}
