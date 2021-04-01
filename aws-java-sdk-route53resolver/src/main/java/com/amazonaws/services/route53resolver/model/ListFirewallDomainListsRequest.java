/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListFirewallDomainLists"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFirewallDomainListsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Resolver to return for this request. If more objects are
     *        available, in the response, Resolver provides a <code>NextToken</code> value that you can use in a
     *        subsequent call to get the next batch of objects.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     * 
     * @return The maximum number of objects that you want Resolver to return for this request. If more objects are
     *         available, in the response, Resolver provides a <code>NextToken</code> value that you can use in a
     *         subsequent call to get the next batch of objects.</p>
     *         <p>
     *         If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects that you want Resolver to return for this request. If more objects are available,
     * in the response, Resolver provides a <code>NextToken</code> value that you can use in a subsequent call to get
     * the next batch of objects.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects that you want Resolver to return for this request. If more objects are
     *        available, in the response, Resolver provides a <code>NextToken</code> value that you can use in a
     *        subsequent call to get the next batch of objects.</p>
     *        <p>
     *        If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallDomainListsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     * 
     * @param nextToken
     *        For the first call to this list request, omit this value.</p>
     *        <p>
     *        When you request a list of objects, Resolver returns at most the number of objects specified in
     *        <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token that
     *        was returned for the prior request in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     * 
     * @return For the first call to this list request, omit this value.</p>
     *         <p>
     *         When you request a list of objects, Resolver returns at most the number of objects specified in
     *         <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a
     *         <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token that
     *         was returned for the prior request in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first call to this list request, omit this value.
     * </p>
     * <p>
     * When you request a list of objects, Resolver returns at most the number of objects specified in
     * <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a <code>NextToken</code>
     * value in the response. To retrieve the next batch of objects, use the token that was returned for the prior
     * request in your next request.
     * </p>
     * 
     * @param nextToken
     *        For the first call to this list request, omit this value.</p>
     *        <p>
     *        When you request a list of objects, Resolver returns at most the number of objects specified in
     *        <code>MaxResults</code>. If more objects are available for retrieval, Resolver returns a
     *        <code>NextToken</code> value in the response. To retrieve the next batch of objects, use the token that
     *        was returned for the prior request in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFirewallDomainListsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListFirewallDomainListsRequest == false)
            return false;
        ListFirewallDomainListsRequest other = (ListFirewallDomainListsRequest) obj;
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
    public ListFirewallDomainListsRequest clone() {
        return (ListFirewallDomainListsRequest) super.clone();
    }

}
