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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ListFraudsters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFraudstersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain more pages
     * of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not provided, all
     * fraudsters in the domain are listed.
     * </p>
     */
    private String watchlistId;

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     * 
     * @return The identifier of the domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain more pages
     * of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain
     *        more pages of results. The default is 100; the maximum allowed page size is also 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain more pages
     * of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain
     *         more pages of results. The default is 100; the maximum allowed page size is also 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain more pages
     * of results. The default is 100; the maximum allowed page size is also 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>NextToken</code> to obtain
     *        more pages of results. The default is 100; the maximum allowed page size is also 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return If <code>NextToken</code> is returned, there are more results available. The value of
     *         <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is returned, there are more results available. The value of <code>NextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is returned, there are more results available. The value of
     *        <code>NextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not provided, all
     * fraudsters in the domain are listed.
     * </p>
     * 
     * @param watchlistId
     *        The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not provided,
     *        all fraudsters in the domain are listed.
     */

    public void setWatchlistId(String watchlistId) {
        this.watchlistId = watchlistId;
    }

    /**
     * <p>
     * The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not provided, all
     * fraudsters in the domain are listed.
     * </p>
     * 
     * @return The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not
     *         provided, all fraudsters in the domain are listed.
     */

    public String getWatchlistId() {
        return this.watchlistId;
    }

    /**
     * <p>
     * The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not provided, all
     * fraudsters in the domain are listed.
     * </p>
     * 
     * @param watchlistId
     *        The identifier of the watchlist. If provided, all fraudsters in the watchlist are listed. If not provided,
     *        all fraudsters in the domain are listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFraudstersRequest withWatchlistId(String watchlistId) {
        setWatchlistId(watchlistId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWatchlistId() != null)
            sb.append("WatchlistId: ").append(getWatchlistId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFraudstersRequest == false)
            return false;
        ListFraudstersRequest other = (ListFraudstersRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWatchlistId() == null ^ this.getWatchlistId() == null)
            return false;
        if (other.getWatchlistId() != null && other.getWatchlistId().equals(this.getWatchlistId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWatchlistId() == null) ? 0 : getWatchlistId().hashCode());
        return hashCode;
    }

    @Override
    public ListFraudstersRequest clone() {
        return (ListFraudstersRequest) super.clone();
    }

}
