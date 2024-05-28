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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>ListWorkspaces</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If this is included, it filters the results to only the workspaces with names that start with the value that you
     * specify here.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The maximum number of workspaces to return per request. The default is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. You receive this token from a previous call, and use it to get the
     * next page of results. The other parameters must be the same as the initial call.
     * </p>
     * <p>
     * For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to return,
     * then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a subsequent call
     * will return the remaining 2 workspaces.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * If this is included, it filters the results to only the workspaces with names that start with the value that you
     * specify here.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     * 
     * @param alias
     *        If this is included, it filters the results to only the workspaces with names that start with the value
     *        that you specify here.</p>
     *        <p>
     *        Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end
     *        of the alias that you specify.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * If this is included, it filters the results to only the workspaces with names that start with the value that you
     * specify here.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     * 
     * @return If this is included, it filters the results to only the workspaces with names that start with the value
     *         that you specify here.</p>
     *         <p>
     *         Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and
     *         end of the alias that you specify.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * If this is included, it filters the results to only the workspaces with names that start with the value that you
     * specify here.
     * </p>
     * <p>
     * Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end of the
     * alias that you specify.
     * </p>
     * 
     * @param alias
     *        If this is included, it filters the results to only the workspaces with names that start with the value
     *        that you specify here.</p>
     *        <p>
     *        Amazon Managed Service for Prometheus will automatically strip any blank spaces from the beginning and end
     *        of the alias that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The maximum number of workspaces to return per request. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workspaces to return per request. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of workspaces to return per request. The default is 100.
     * </p>
     * 
     * @return The maximum number of workspaces to return per request. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of workspaces to return per request. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workspaces to return per request. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. You receive this token from a previous call, and use it to get the
     * next page of results. The other parameters must be the same as the initial call.
     * </p>
     * <p>
     * For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to return,
     * then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a subsequent call
     * will return the remaining 2 workspaces.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. You receive this token from a previous call, and use it to
     *        get the next page of results. The other parameters must be the same as the initial call.</p>
     *        <p>
     *        For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to
     *        return, then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a
     *        subsequent call will return the remaining 2 workspaces.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. You receive this token from a previous call, and use it to get the
     * next page of results. The other parameters must be the same as the initial call.
     * </p>
     * <p>
     * For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to return,
     * then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a subsequent call
     * will return the remaining 2 workspaces.
     * </p>
     * 
     * @return The token for the next set of items to return. You receive this token from a previous call, and use it to
     *         get the next page of results. The other parameters must be the same as the initial call.</p>
     *         <p>
     *         For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to
     *         return, then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a
     *         subsequent call will return the remaining 2 workspaces.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. You receive this token from a previous call, and use it to get the
     * next page of results. The other parameters must be the same as the initial call.
     * </p>
     * <p>
     * For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to return,
     * then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a subsequent call
     * will return the remaining 2 workspaces.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. You receive this token from a previous call, and use it to
     *        get the next page of results. The other parameters must be the same as the initial call.</p>
     *        <p>
     *        For example, if your initial request has <code>maxResults</code> of 10, and there are 12 workspaces to
     *        return, then your initial request will return 10 and a <code>nextToken</code>. Using the next token in a
     *        subsequent call will return the remaining 2 workspaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkspacesRequest withNextToken(String nextToken) {
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
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

        if (obj instanceof ListWorkspacesRequest == false)
            return false;
        ListWorkspacesRequest other = (ListWorkspacesRequest) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
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

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkspacesRequest clone() {
        return (ListWorkspacesRequest) super.clone();
    }

}
