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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawlerMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCrawlerMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     */
    private java.util.List<CrawlerMetrics> crawlerMetricsList;
    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     * 
     * @return A list of metrics for the specified crawler.
     */

    public java.util.List<CrawlerMetrics> getCrawlerMetricsList() {
        return crawlerMetricsList;
    }

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     * 
     * @param crawlerMetricsList
     *        A list of metrics for the specified crawler.
     */

    public void setCrawlerMetricsList(java.util.Collection<CrawlerMetrics> crawlerMetricsList) {
        if (crawlerMetricsList == null) {
            this.crawlerMetricsList = null;
            return;
        }

        this.crawlerMetricsList = new java.util.ArrayList<CrawlerMetrics>(crawlerMetricsList);
    }

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrawlerMetricsList(java.util.Collection)} or {@link #withCrawlerMetricsList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param crawlerMetricsList
     *        A list of metrics for the specified crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerMetricsResult withCrawlerMetricsList(CrawlerMetrics... crawlerMetricsList) {
        if (this.crawlerMetricsList == null) {
            setCrawlerMetricsList(new java.util.ArrayList<CrawlerMetrics>(crawlerMetricsList.length));
        }
        for (CrawlerMetrics ele : crawlerMetricsList) {
            this.crawlerMetricsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     * 
     * @param crawlerMetricsList
     *        A list of metrics for the specified crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerMetricsResult withCrawlerMetricsList(java.util.Collection<CrawlerMetrics> crawlerMetricsList) {
        setCrawlerMetricsList(crawlerMetricsList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list does not contain the last metric available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     * 
     * @return A continuation token, if the returned list does not contain the last metric available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last metric available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list does not contain the last metric available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerMetricsResult withNextToken(String nextToken) {
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
        if (getCrawlerMetricsList() != null)
            sb.append("CrawlerMetricsList: ").append(getCrawlerMetricsList()).append(",");
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

        if (obj instanceof GetCrawlerMetricsResult == false)
            return false;
        GetCrawlerMetricsResult other = (GetCrawlerMetricsResult) obj;
        if (other.getCrawlerMetricsList() == null ^ this.getCrawlerMetricsList() == null)
            return false;
        if (other.getCrawlerMetricsList() != null && other.getCrawlerMetricsList().equals(this.getCrawlerMetricsList()) == false)
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

        hashCode = prime * hashCode + ((getCrawlerMetricsList() == null) ? 0 : getCrawlerMetricsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCrawlerMetricsResult clone() {
        try {
            return (GetCrawlerMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
