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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * The output of the DescribeMetricCollectionTypes action.
 * </p>
 */
public class DescribeMetricCollectionTypesResult implements Serializable {

    /**
     * The list of Metrics collected.The following metrics are supported:
     * <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType> metrics;

    /**
     * A list of granularities for the listed Metrics.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType> granularities;

    /**
     * The list of Metrics collected.The following metrics are supported:
     * <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     *
     * @return The list of Metrics collected.The following metrics are supported:
     *         <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     */
    public java.util.List<MetricCollectionType> getMetrics() {
        if (metrics == null) {
              metrics = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType>();
              metrics.setAutoConstruct(true);
        }
        return metrics;
    }
    
    /**
     * The list of Metrics collected.The following metrics are supported:
     * <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     *
     * @param metrics The list of Metrics collected.The following metrics are supported:
     *         <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     */
    public void setMetrics(java.util.Collection<MetricCollectionType> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType>(metrics.size());
        metricsCopy.addAll(metrics);
        this.metrics = metricsCopy;
    }
    
    /**
     * The list of Metrics collected.The following metrics are supported:
     * <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of Metrics collected.The following metrics are supported:
     *         <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMetricCollectionTypesResult withMetrics(MetricCollectionType... metrics) {
        if (getMetrics() == null) setMetrics(new java.util.ArrayList<MetricCollectionType>(metrics.length));
        for (MetricCollectionType value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * The list of Metrics collected.The following metrics are supported:
     * <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of Metrics collected.The following metrics are supported:
     *         <ul> <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMetricCollectionTypesResult withMetrics(java.util.Collection<MetricCollectionType> metrics) {
        if (metrics == null) {
            this.metrics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricCollectionType>(metrics.size());
            metricsCopy.addAll(metrics);
            this.metrics = metricsCopy;
        }

        return this;
    }

    /**
     * A list of granularities for the listed Metrics.
     *
     * @return A list of granularities for the listed Metrics.
     */
    public java.util.List<MetricGranularityType> getGranularities() {
        if (granularities == null) {
              granularities = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType>();
              granularities.setAutoConstruct(true);
        }
        return granularities;
    }
    
    /**
     * A list of granularities for the listed Metrics.
     *
     * @param granularities A list of granularities for the listed Metrics.
     */
    public void setGranularities(java.util.Collection<MetricGranularityType> granularities) {
        if (granularities == null) {
            this.granularities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType> granularitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType>(granularities.size());
        granularitiesCopy.addAll(granularities);
        this.granularities = granularitiesCopy;
    }
    
    /**
     * A list of granularities for the listed Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param granularities A list of granularities for the listed Metrics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMetricCollectionTypesResult withGranularities(MetricGranularityType... granularities) {
        if (getGranularities() == null) setGranularities(new java.util.ArrayList<MetricGranularityType>(granularities.length));
        for (MetricGranularityType value : granularities) {
            getGranularities().add(value);
        }
        return this;
    }
    
    /**
     * A list of granularities for the listed Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param granularities A list of granularities for the listed Metrics.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeMetricCollectionTypesResult withGranularities(java.util.Collection<MetricGranularityType> granularities) {
        if (granularities == null) {
            this.granularities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType> granularitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricGranularityType>(granularities.size());
            granularitiesCopy.addAll(granularities);
            this.granularities = granularitiesCopy;
        }

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
        if (getGranularities() != null) sb.append("Granularities: " + getGranularities() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode()); 
        hashCode = prime * hashCode + ((getGranularities() == null) ? 0 : getGranularities().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMetricCollectionTypesResult == false) return false;
        DescribeMetricCollectionTypesResult other = (DescribeMetricCollectionTypesResult)obj;
        
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false; 
        if (other.getGranularities() == null ^ this.getGranularities() == null) return false;
        if (other.getGranularities() != null && other.getGranularities().equals(this.getGranularities()) == false) return false; 
        return true;
    }
    
}
    