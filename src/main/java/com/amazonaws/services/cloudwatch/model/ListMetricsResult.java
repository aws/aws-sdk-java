/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;


/**
 * <p>
 * The output for the ListMetrics action.
 * </p>
 */
public class ListMetricsResult implements Serializable {

    /**
     * A list of metrics used to generate statistics for an AWS account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Metric> metrics;

    /**
     * A string that marks the start of the next batch of returned results.
     */
    private String nextToken;

    /**
     * A list of metrics used to generate statistics for an AWS account.
     *
     * @return A list of metrics used to generate statistics for an AWS account.
     */
    public java.util.List<Metric> getMetrics() {
        if (metrics == null) {
              metrics = new com.amazonaws.internal.ListWithAutoConstructFlag<Metric>();
              metrics.setAutoConstruct(true);
        }
        return metrics;
    }
    
    /**
     * A list of metrics used to generate statistics for an AWS account.
     *
     * @param metrics A list of metrics used to generate statistics for an AWS account.
     */
    public void setMetrics(java.util.Collection<Metric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Metric> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Metric>(metrics.size());
        metricsCopy.addAll(metrics);
        this.metrics = metricsCopy;
    }
    
    /**
     * A list of metrics used to generate statistics for an AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics A list of metrics used to generate statistics for an AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMetricsResult withMetrics(Metric... metrics) {
        if (getMetrics() == null) setMetrics(new java.util.ArrayList<Metric>(metrics.length));
        for (Metric value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * A list of metrics used to generate statistics for an AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics A list of metrics used to generate statistics for an AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMetricsResult withMetrics(java.util.Collection<Metric> metrics) {
        if (metrics == null) {
            this.metrics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Metric> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Metric>(metrics.size());
            metricsCopy.addAll(metrics);
            this.metrics = metricsCopy;
        }

        return this;
    }

    /**
     * A string that marks the start of the next batch of returned results.
     *
     * @return A string that marks the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMetricsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetrics() != null) sb.append("Metrics: " + getMetrics() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListMetricsResult == false) return false;
        ListMetricsResult other = (ListMetricsResult)obj;
        
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    