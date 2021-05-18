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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListTokens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTokensRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Token IDs.
     * </p>
     */
    private java.util.List<String> tokenIds;
    /**
     * <p>
     * Filters to scope the results. The following filter is supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LicenseArns</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Token IDs.
     * </p>
     * 
     * @return Token IDs.
     */

    public java.util.List<String> getTokenIds() {
        return tokenIds;
    }

    /**
     * <p>
     * Token IDs.
     * </p>
     * 
     * @param tokenIds
     *        Token IDs.
     */

    public void setTokenIds(java.util.Collection<String> tokenIds) {
        if (tokenIds == null) {
            this.tokenIds = null;
            return;
        }

        this.tokenIds = new java.util.ArrayList<String>(tokenIds);
    }

    /**
     * <p>
     * Token IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenIds(java.util.Collection)} or {@link #withTokenIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tokenIds
     *        Token IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokensRequest withTokenIds(String... tokenIds) {
        if (this.tokenIds == null) {
            setTokenIds(new java.util.ArrayList<String>(tokenIds.length));
        }
        for (String ele : tokenIds) {
            this.tokenIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Token IDs.
     * </p>
     * 
     * @param tokenIds
     *        Token IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokensRequest withTokenIds(java.util.Collection<String> tokenIds) {
        setTokenIds(tokenIds);
        return this;
    }

    /**
     * <p>
     * Filters to scope the results. The following filter is supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LicenseArns</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters to scope the results. The following filter is supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LicenseArns</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters to scope the results. The following filter is supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LicenseArns</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filter is supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LicenseArns</code>
     *        </p>
     *        </li>
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
     * Filters to scope the results. The following filter is supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LicenseArns</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters to scope the results. The following filter is supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LicenseArns</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokensRequest withFilters(Filter... filters) {
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
     * Filters to scope the results. The following filter is supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LicenseArns</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filter is supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LicenseArns</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokensRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokensRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @return Maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokensRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getTokenIds() != null)
            sb.append("TokenIds: ").append(getTokenIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTokensRequest == false)
            return false;
        ListTokensRequest other = (ListTokensRequest) obj;
        if (other.getTokenIds() == null ^ this.getTokenIds() == null)
            return false;
        if (other.getTokenIds() != null && other.getTokenIds().equals(this.getTokenIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenIds() == null) ? 0 : getTokenIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTokensRequest clone() {
        return (ListTokensRequest) super.clone();
    }

}
