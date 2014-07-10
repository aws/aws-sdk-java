/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Describe Metric Filters Result
 */
public class DescribeMetricFiltersResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricFilter> metricFilters;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     */
    private String nextToken;

    /**
     * Returns the value of the MetricFilters property for this object.
     *
     * @return The value of the MetricFilters property for this object.
     */
    public java.util.List<MetricFilter> getMetricFilters() {
        if (metricFilters == null) {
              metricFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricFilter>();
              metricFilters.setAutoConstruct(true);
        }
        return metricFilters;
    }
    
    /**
     * Sets the value of the MetricFilters property for this object.
     *
     * @param metricFilters The new value for the MetricFilters property for this object.
     */
    public void setMetricFilters(java.util.Collection<MetricFilter> metricFilters) {
        if (metricFilters == null) {
            this.metricFilters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricFilter> metricFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricFilter>(metricFilters.size());
        metricFiltersCopy.addAll(metricFilters);
        this.metricFilters = metricFiltersCopy;
    }
    
    /**
     * Sets the value of the MetricFilters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricFilters The new value for the MetricFilters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricFiltersResult withMetricFilters(MetricFilter... metricFilters) {
        if (getMetricFilters() == null) setMetricFilters(new java.util.ArrayList<MetricFilter>(metricFilters.length));
        for (MetricFilter value : metricFilters) {
            getMetricFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the MetricFilters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricFilters The new value for the MetricFilters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricFiltersResult withMetricFilters(java.util.Collection<MetricFilter> metricFilters) {
        if (metricFilters == null) {
            this.metricFilters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricFilter> metricFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricFilter>(metricFilters.size());
            metricFiltersCopy.addAll(metricFilters);
            this.metricFilters = metricFiltersCopy;
        }

        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMetricFiltersResult withNextToken(String nextToken) {
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
        if (getMetricFilters() != null) sb.append("MetricFilters: " + getMetricFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMetricFilters() == null) ? 0 : getMetricFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMetricFiltersResult == false) return false;
        DescribeMetricFiltersResult other = (DescribeMetricFiltersResult)obj;
        
        if (other.getMetricFilters() == null ^ this.getMetricFilters() == null) return false;
        if (other.getMetricFilters() != null && other.getMetricFilters().equals(this.getMetricFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    