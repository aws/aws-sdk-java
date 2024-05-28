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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ListAccountLinks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountLinksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the account based on their link status.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> linkStatusFilter;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of accounts to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters the account based on their link status.
     * </p>
     * 
     * @return Filters the account based on their link status.
     * @see AccountLinkStatusEnum
     */

    public java.util.List<String> getLinkStatusFilter() {
        if (linkStatusFilter == null) {
            linkStatusFilter = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return linkStatusFilter;
    }

    /**
     * <p>
     * Filters the account based on their link status.
     * </p>
     * 
     * @param linkStatusFilter
     *        Filters the account based on their link status.
     * @see AccountLinkStatusEnum
     */

    public void setLinkStatusFilter(java.util.Collection<String> linkStatusFilter) {
        if (linkStatusFilter == null) {
            this.linkStatusFilter = null;
            return;
        }

        this.linkStatusFilter = new com.amazonaws.internal.SdkInternalList<String>(linkStatusFilter);
    }

    /**
     * <p>
     * Filters the account based on their link status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinkStatusFilter(java.util.Collection)} or {@link #withLinkStatusFilter(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param linkStatusFilter
     *        Filters the account based on their link status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLinkStatusEnum
     */

    public ListAccountLinksRequest withLinkStatusFilter(String... linkStatusFilter) {
        if (this.linkStatusFilter == null) {
            setLinkStatusFilter(new com.amazonaws.internal.SdkInternalList<String>(linkStatusFilter.length));
        }
        for (String ele : linkStatusFilter) {
            this.linkStatusFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the account based on their link status.
     * </p>
     * 
     * @param linkStatusFilter
     *        Filters the account based on their link status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLinkStatusEnum
     */

    public ListAccountLinksRequest withLinkStatusFilter(java.util.Collection<String> linkStatusFilter) {
        setLinkStatusFilter(linkStatusFilter);
        return this;
    }

    /**
     * <p>
     * Filters the account based on their link status.
     * </p>
     * 
     * @param linkStatusFilter
     *        Filters the account based on their link status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLinkStatusEnum
     */

    public ListAccountLinksRequest withLinkStatusFilter(AccountLinkStatusEnum... linkStatusFilter) {
        com.amazonaws.internal.SdkInternalList<String> linkStatusFilterCopy = new com.amazonaws.internal.SdkInternalList<String>(linkStatusFilter.length);
        for (AccountLinkStatusEnum value : linkStatusFilter) {
            linkStatusFilterCopy.add(value.toString());
        }
        if (getLinkStatusFilter() == null) {
            setLinkStatusFilter(linkStatusFilterCopy);
        } else {
            getLinkStatusFilter().addAll(linkStatusFilterCopy);
        }
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountLinksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accounts to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of accounts to return.
     * </p>
     * 
     * @return The maximum number of accounts to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of accounts to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accounts to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountLinksRequest withMaxResults(Integer maxResults) {
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
        if (getLinkStatusFilter() != null)
            sb.append("LinkStatusFilter: ").append(getLinkStatusFilter()).append(",");
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

        if (obj instanceof ListAccountLinksRequest == false)
            return false;
        ListAccountLinksRequest other = (ListAccountLinksRequest) obj;
        if (other.getLinkStatusFilter() == null ^ this.getLinkStatusFilter() == null)
            return false;
        if (other.getLinkStatusFilter() != null && other.getLinkStatusFilter().equals(this.getLinkStatusFilter()) == false)
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

        hashCode = prime * hashCode + ((getLinkStatusFilter() == null) ? 0 : getLinkStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountLinksRequest clone() {
        return (ListAccountLinksRequest) super.clone();
    }

}
