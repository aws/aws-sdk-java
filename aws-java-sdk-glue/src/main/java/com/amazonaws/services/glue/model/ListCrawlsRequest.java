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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListCrawls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCrawlsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the crawler whose runs you want to retrieve.
     * </p>
     */
    private String crawlerName;
    /**
     * <p>
     * The maximum number of results to return. The default is 20, and maximum is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * </p>
     */
    private java.util.List<CrawlsFilter> filters;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the crawler whose runs you want to retrieve.
     * </p>
     * 
     * @param crawlerName
     *        The name of the crawler whose runs you want to retrieve.
     */

    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler whose runs you want to retrieve.
     * </p>
     * 
     * @return The name of the crawler whose runs you want to retrieve.
     */

    public String getCrawlerName() {
        return this.crawlerName;
    }

    /**
     * <p>
     * The name of the crawler whose runs you want to retrieve.
     * </p>
     * 
     * @param crawlerName
     *        The name of the crawler whose runs you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlsRequest withCrawlerName(String crawlerName) {
        setCrawlerName(crawlerName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return. The default is 20, and maximum is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. The default is 20, and maximum is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. The default is 20, and maximum is 100.
     * </p>
     * 
     * @return The maximum number of results to return. The default is 20, and maximum is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return. The default is 20, and maximum is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return. The default is 20, and maximum is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * </p>
     * 
     * @return Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     */

    public java.util.List<CrawlsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * </p>
     * 
     * @param filters
     *        Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     */

    public void setFilters(java.util.Collection<CrawlsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<CrawlsFilter>(filters);
    }

    /**
     * <p>
     * Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlsRequest withFilters(CrawlsFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<CrawlsFilter>(filters.length));
        }
        for (CrawlsFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * </p>
     * 
     * @param filters
     *        Filters the crawls by the criteria you specify in a list of <code>CrawlsFilter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlsRequest withFilters(java.util.Collection<CrawlsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrawlsRequest withNextToken(String nextToken) {
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
        if (getCrawlerName() != null)
            sb.append("CrawlerName: ").append(getCrawlerName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof ListCrawlsRequest == false)
            return false;
        ListCrawlsRequest other = (ListCrawlsRequest) obj;
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCrawlsRequest clone() {
        return (ListCrawlsRequest) super.clone();
    }

}
