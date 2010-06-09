/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * List Metrics Result
 */
public class ListMetricsResult {

    private java.util.List<Metric> metrics;

    private String nextToken;

    /**
     * Returns the value of the Metrics property for this object.
     *
     * @return The value of the Metrics property for this object.
     */
    public java.util.List<Metric> getMetrics() {
        if (metrics == null) {
            metrics = new java.util.ArrayList<Metric>();
        }
        return metrics;
    }
    
    /**
     * Sets the value of the Metrics property for this object.
     *
     * @param metrics The new value for the Metrics property for this object.
     */
    public void setMetrics(java.util.Collection<Metric> metrics) {
        java.util.List<Metric> metricsCopy = new java.util.ArrayList<Metric>();
        if (metrics != null) {
            metricsCopy.addAll(metrics);
        }
        this.metrics = metricsCopy;
    }
    
    /**
     * Sets the value of the Metrics property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The new value for the Metrics property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsResult withMetrics(Metric... metrics) {
        for (Metric value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Metrics property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The new value for the Metrics property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMetricsResult withMetrics(java.util.Collection<Metric> metrics) {
        java.util.List<Metric> metricsCopy = new java.util.ArrayList<Metric>();
        if (metrics != null) {
            metricsCopy.addAll(metrics);
        }
        this.metrics = metricsCopy;

        return this;
    }
    
    /**
     * Returns the value of the NextToken property for this object.
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The new value for the NextToken property for this object.
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
        
        sb.append("Metrics: " + metrics + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    