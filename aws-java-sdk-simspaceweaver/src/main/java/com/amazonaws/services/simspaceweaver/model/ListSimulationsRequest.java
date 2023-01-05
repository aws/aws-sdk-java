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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListSimulations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSimulationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of simulations to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of simulations to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of simulations to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of simulations to list.
     * </p>
     * 
     * @return The maximum number of simulations to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of simulations to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of simulations to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @param nextToken
     *        If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @return If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @param nextToken
     *        If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListSimulationsRequest == false)
            return false;
        ListSimulationsRequest other = (ListSimulationsRequest) obj;
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
    public ListSimulationsRequest clone() {
        return (ListSimulationsRequest) super.clone();
    }

}
