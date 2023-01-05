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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributionMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricAttributionMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     * </p>
     */
    private String metricAttributionArn;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of metrics to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     * </p>
     * 
     * @param metricAttributionArn
     *        The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     */

    public void setMetricAttributionArn(String metricAttributionArn) {
        this.metricAttributionArn = metricAttributionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     */

    public String getMetricAttributionArn() {
        return this.metricAttributionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     * </p>
     * 
     * @param metricAttributionArn
     *        The Amazon Resource Name (ARN) of the metric attribution to retrieve attributes for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricAttributionMetricsRequest withMetricAttributionArn(String metricAttributionArn) {
        setMetricAttributionArn(metricAttributionArn);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricAttributionMetricsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of metrics to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of metrics to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of metrics to return in one page of results.
     * </p>
     * 
     * @return The maximum number of metrics to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of metrics to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of metrics to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricAttributionMetricsRequest withMaxResults(Integer maxResults) {
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
        if (getMetricAttributionArn() != null)
            sb.append("MetricAttributionArn: ").append(getMetricAttributionArn()).append(",");
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

        if (obj instanceof ListMetricAttributionMetricsRequest == false)
            return false;
        ListMetricAttributionMetricsRequest other = (ListMetricAttributionMetricsRequest) obj;
        if (other.getMetricAttributionArn() == null ^ this.getMetricAttributionArn() == null)
            return false;
        if (other.getMetricAttributionArn() != null && other.getMetricAttributionArn().equals(this.getMetricAttributionArn()) == false)
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

        hashCode = prime * hashCode + ((getMetricAttributionArn() == null) ? 0 : getMetricAttributionArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricAttributionMetricsRequest clone() {
        return (ListMetricAttributionMetricsRequest) super.clone();
    }

}
