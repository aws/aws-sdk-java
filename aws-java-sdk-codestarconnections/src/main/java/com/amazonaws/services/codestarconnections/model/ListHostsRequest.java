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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListHosts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token that was returned from the previous <code>ListHosts</code> call, which can be used to return the next
     * set of hosts in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListHosts</code> call, which can be used to return the next
     * set of hosts in the list.
     * </p>
     * 
     * @param nextToken
     *        The token that was returned from the previous <code>ListHosts</code> call, which can be used to return the
     *        next set of hosts in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListHosts</code> call, which can be used to return the next
     * set of hosts in the list.
     * </p>
     * 
     * @return The token that was returned from the previous <code>ListHosts</code> call, which can be used to return
     *         the next set of hosts in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that was returned from the previous <code>ListHosts</code> call, which can be used to return the next
     * set of hosts in the list.
     * </p>
     * 
     * @param nextToken
     *        The token that was returned from the previous <code>ListHosts</code> call, which can be used to return the
     *        next set of hosts in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListHostsRequest == false)
            return false;
        ListHostsRequest other = (ListHostsRequest) obj;
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
    public ListHostsRequest clone() {
        return (ListHostsRequest) super.clone();
    }

}
