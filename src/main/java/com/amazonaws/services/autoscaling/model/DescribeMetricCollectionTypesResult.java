/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

/**
 * <p>
 * The output of the DescribeMetricCollectionTypes action.
 * </p>
 */
public class DescribeMetricCollectionTypesResult {

    /**
     * The list of Metrics collected.
     */
    private java.util.List<MetricCollectionType> metrics;

    /**
     * A list of Granularities for the listed Metrics.
     */
    private java.util.List<MetricGranularityType> granularities;

    /**
     * The list of Metrics collected.
     *
     * @return The list of Metrics collected.
     */
    public java.util.List<MetricCollectionType> getMetrics() {
        
        if (metrics == null) {
            metrics = new java.util.ArrayList<MetricCollectionType>();
        }
        return metrics;
    }
    
    /**
     * The list of Metrics collected.
     *
     * @param metrics The list of Metrics collected.
     */
    public void setMetrics(java.util.Collection<MetricCollectionType> metrics) {
        java.util.List<MetricCollectionType> metricsCopy = new java.util.ArrayList<MetricCollectionType>();
        if (metrics != null) {
            metricsCopy.addAll(metrics);
        }
        this.metrics = metricsCopy;
    }
    
    /**
     * The list of Metrics collected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of Metrics collected.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMetricCollectionTypesResult withMetrics(MetricCollectionType... metrics) {
        if (getMetrics() == null) setMetrics(new java.util.ArrayList<MetricCollectionType>());
        for (MetricCollectionType value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * The list of Metrics collected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of Metrics collected.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMetricCollectionTypesResult withMetrics(java.util.Collection<MetricCollectionType> metrics) {
        java.util.List<MetricCollectionType> metricsCopy = new java.util.ArrayList<MetricCollectionType>();
        if (metrics != null) {
            metricsCopy.addAll(metrics);
        }
        this.metrics = metricsCopy;

        return this;
    }
    
    /**
     * A list of Granularities for the listed Metrics.
     *
     * @return A list of Granularities for the listed Metrics.
     */
    public java.util.List<MetricGranularityType> getGranularities() {
        
        if (granularities == null) {
            granularities = new java.util.ArrayList<MetricGranularityType>();
        }
        return granularities;
    }
    
    /**
     * A list of Granularities for the listed Metrics.
     *
     * @param granularities A list of Granularities for the listed Metrics.
     */
    public void setGranularities(java.util.Collection<MetricGranularityType> granularities) {
        java.util.List<MetricGranularityType> granularitiesCopy = new java.util.ArrayList<MetricGranularityType>();
        if (granularities != null) {
            granularitiesCopy.addAll(granularities);
        }
        this.granularities = granularitiesCopy;
    }
    
    /**
     * A list of Granularities for the listed Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param granularities A list of Granularities for the listed Metrics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMetricCollectionTypesResult withGranularities(MetricGranularityType... granularities) {
        if (getGranularities() == null) setGranularities(new java.util.ArrayList<MetricGranularityType>());
        for (MetricGranularityType value : granularities) {
            getGranularities().add(value);
        }
        return this;
    }
    
    /**
     * A list of Granularities for the listed Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param granularities A list of Granularities for the listed Metrics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeMetricCollectionTypesResult withGranularities(java.util.Collection<MetricGranularityType> granularities) {
        java.util.List<MetricGranularityType> granularitiesCopy = new java.util.ArrayList<MetricGranularityType>();
        if (granularities != null) {
            granularitiesCopy.addAll(granularities);
        }
        this.granularities = granularitiesCopy;

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
        sb.append("Granularities: " + granularities + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    