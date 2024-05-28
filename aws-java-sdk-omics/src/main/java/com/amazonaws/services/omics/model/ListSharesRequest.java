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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account that owns the resource shares.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * Attributes that you use to filter for a specific subset of resource shares.
     * </p>
     */
    private Filter filter;
    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of shares to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The account that owns the resource shares.
     * </p>
     * 
     * @param resourceOwner
     *        The account that owns the resource shares.
     * @see ResourceOwner
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The account that owns the resource shares.
     * </p>
     * 
     * @return The account that owns the resource shares.
     * @see ResourceOwner
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The account that owns the resource shares.
     * </p>
     * 
     * @param resourceOwner
     *        The account that owns the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListSharesRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The account that owns the resource shares.
     * </p>
     * 
     * @param resourceOwner
     *        The account that owns the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListSharesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * Attributes that you use to filter for a specific subset of resource shares.
     * </p>
     * 
     * @param filter
     *        Attributes that you use to filter for a specific subset of resource shares.
     */

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Attributes that you use to filter for a specific subset of resource shares.
     * </p>
     * 
     * @return Attributes that you use to filter for a specific subset of resource shares.
     */

    public Filter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Attributes that you use to filter for a specific subset of resource shares.
     * </p>
     * 
     * @param filter
     *        Attributes that you use to filter for a specific subset of resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharesRequest withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     * 
     * @return Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the
     *         next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of shares to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of shares to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of shares to return in one page of results.
     * </p>
     * 
     * @return The maximum number of shares to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of shares to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of shares to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSharesRequest withMaxResults(Integer maxResults) {
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
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof ListSharesRequest == false)
            return false;
        ListSharesRequest other = (ListSharesRequest) obj;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSharesRequest clone() {
        return (ListSharesRequest) super.clone();
    }

}
