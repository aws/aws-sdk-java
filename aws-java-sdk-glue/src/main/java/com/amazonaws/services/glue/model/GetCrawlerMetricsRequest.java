/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlerMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCrawlerMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     */
    private java.util.List<String> crawlerNameList;
    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     * 
     * @return A list of the names of crawlers about which to retrieve metrics.
     */

    public java.util.List<String> getCrawlerNameList() {
        return crawlerNameList;
    }

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     * 
     * @param crawlerNameList
     *        A list of the names of crawlers about which to retrieve metrics.
     */

    public void setCrawlerNameList(java.util.Collection<String> crawlerNameList) {
        if (crawlerNameList == null) {
            this.crawlerNameList = null;
            return;
        }

        this.crawlerNameList = new java.util.ArrayList<String>(crawlerNameList);
    }

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawlerNameList(java.util.Collection)} or {@link #withCrawlerNameList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param crawlerNameList
     *        A list of the names of crawlers about which to retrieve metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerMetricsRequest withCrawlerNameList(String... crawlerNameList) {
        if (this.crawlerNameList == null) {
            setCrawlerNameList(new java.util.ArrayList<String>(crawlerNameList.length));
        }
        for (String ele : crawlerNameList) {
            this.crawlerNameList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     * 
     * @param crawlerNameList
     *        A list of the names of crawlers about which to retrieve metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerMetricsRequest withCrawlerNameList(java.util.Collection<String> crawlerNameList) {
        setCrawlerNameList(crawlerNameList);
        return this;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of a list to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @return The maximum size of a list to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of a list to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerMetricsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public GetCrawlerMetricsRequest withNextToken(String nextToken) {
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
        if (getCrawlerNameList() != null)
            sb.append("CrawlerNameList: ").append(getCrawlerNameList()).append(",");
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

        if (obj instanceof GetCrawlerMetricsRequest == false)
            return false;
        GetCrawlerMetricsRequest other = (GetCrawlerMetricsRequest) obj;
        if (other.getCrawlerNameList() == null ^ this.getCrawlerNameList() == null)
            return false;
        if (other.getCrawlerNameList() != null && other.getCrawlerNameList().equals(this.getCrawlerNameList()) == false)
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

        hashCode = prime * hashCode + ((getCrawlerNameList() == null) ? 0 : getCrawlerNameList().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCrawlerMetricsRequest clone() {
        return (GetCrawlerMetricsRequest) super.clone();
    }

}
