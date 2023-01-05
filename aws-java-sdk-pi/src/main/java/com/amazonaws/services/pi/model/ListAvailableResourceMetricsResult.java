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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableResourceMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of metrics available to query. Each array element contains the full name, description, and unit of the
     * metric.
     * </p>
     */
    private java.util.List<ResponseResourceMetric> metrics;
    /**
     * <p>
     * A pagination token that indicates the response didn’t return all available records because
     * <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     * <code>NextToken</code> in a separate request with this value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of metrics available to query. Each array element contains the full name, description, and unit of the
     * metric.
     * </p>
     * 
     * @return An array of metrics available to query. Each array element contains the full name, description, and unit
     *         of the metric.
     */

    public java.util.List<ResponseResourceMetric> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * An array of metrics available to query. Each array element contains the full name, description, and unit of the
     * metric.
     * </p>
     * 
     * @param metrics
     *        An array of metrics available to query. Each array element contains the full name, description, and unit
     *        of the metric.
     */

    public void setMetrics(java.util.Collection<ResponseResourceMetric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<ResponseResourceMetric>(metrics);
    }

    /**
     * <p>
     * An array of metrics available to query. Each array element contains the full name, description, and unit of the
     * metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        An array of metrics available to query. Each array element contains the full name, description, and unit
     *        of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceMetricsResult withMetrics(ResponseResourceMetric... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<ResponseResourceMetric>(metrics.length));
        }
        for (ResponseResourceMetric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of metrics available to query. Each array element contains the full name, description, and unit of the
     * metric.
     * </p>
     * 
     * @param metrics
     *        An array of metrics available to query. Each array element contains the full name, description, and unit
     *        of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceMetricsResult withMetrics(java.util.Collection<ResponseResourceMetric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * A pagination token that indicates the response didn’t return all available records because
     * <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     * <code>NextToken</code> in a separate request with this value.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that indicates the response didn’t return all available records because
     *        <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     *        <code>NextToken</code> in a separate request with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that indicates the response didn’t return all available records because
     * <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     * <code>NextToken</code> in a separate request with this value.
     * </p>
     * 
     * @return A pagination token that indicates the response didn’t return all available records because
     *         <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     *         <code>NextToken</code> in a separate request with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that indicates the response didn’t return all available records because
     * <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     * <code>NextToken</code> in a separate request with this value.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that indicates the response didn’t return all available records because
     *        <code>MaxRecords</code> was specified in the previous request. To get the remaining records, specify
     *        <code>NextToken</code> in a separate request with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceMetricsResult withNextToken(String nextToken) {
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
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
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

        if (obj instanceof ListAvailableResourceMetricsResult == false)
            return false;
        ListAvailableResourceMetricsResult other = (ListAvailableResourceMetricsResult) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
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

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableResourceMetricsResult clone() {
        try {
            return (ListAvailableResourceMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
